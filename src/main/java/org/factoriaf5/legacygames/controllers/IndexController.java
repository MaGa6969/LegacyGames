package org.factoriaf5.legacygames.controllers;

import org.factoriaf5.legacygames.models.Game;
import org.factoriaf5.legacygames.services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private GameService gameService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/games")
    String listGames(Model model) {
        List<Game> games = gameService.allGames();
        model.addAttribute("title", "Book list");
        model.addAttribute("books", games);
        return "books/all";
    }
}