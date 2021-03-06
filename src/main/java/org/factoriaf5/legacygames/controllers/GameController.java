package org.factoriaf5.legacygames.controllers;

import org.factoriaf5.legacygames.models.Category;
import org.factoriaf5.legacygames.models.Game;

import org.factoriaf5.legacygames.services.CategoryService;
import org.factoriaf5.legacygames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller

public class GameController {
    private GameService gameService;
    private CategoryService categoryService;

    @Autowired
    public GameController(GameService gameService, CategoryService categoryService) {
        this.gameService = gameService;
        this.categoryService = categoryService;
    }

    @GetMapping(value = {"/games", "/index", "/"})
    String listGames(Model model, @RequestParam(required = false) Long categoryId) {
        List<Game> games;
        if (categoryId == null) {
            games = gameService.allGames();
        } else {
            Category category = categoryService.getCategory(categoryId);
            games = category.getGames();
        }
        model.addAttribute("games", games);
        model.addAttribute("categories", categoryService.allCategories());
        return "games/all";
    }

    @GetMapping("/games/stock")
    String getForm(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title", "Create new game");
        model.addAttribute("categories", categoryService.allCategories());
        return "games/stock";
    }

    @PostMapping("/games/stock")
    public String addGame(
            @ModelAttribute Game game,
            @RequestParam("image") MultipartFile multipartFile)
            throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        if (!fileName.equals("")) {
            game.setPhoto(fileName);
            gameService.save(game);
            String uploadDir = "game-photo/" + game.getId();
            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        } else {
            gameService.save(game);
        }
        return "redirect:/games";
    }

    @GetMapping("/games/edit/{id}")
    String editGame(Model model, @PathVariable Long id) {
        Game game = gameService.findById(id);
        model.addAttribute("game", game);
        model.addAttribute("title", "Edit game");
        model.addAttribute("categories", categoryService.allCategories());
        return "games/stock";
    }

    @GetMapping("/games/delete/{id}")
    String removeGame(@PathVariable Long id) {
        gameService.delete(id);
        return "redirect:/games";
    }
}
