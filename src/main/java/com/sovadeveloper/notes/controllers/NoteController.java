package com.sovadeveloper.notes.controllers;

import com.sovadeveloper.notes.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @GetMapping("/")
    public String index(Model model) throws Exception {
        model.addAttribute("notes", noteService.getAll());
        return "notesList";
    }

    @GetMapping("/note/{id}")
    public String getOneNote(@PathVariable Long id, Model model) throws Exception {
        model.addAttribute("note", noteService.getById(id));
        return "note";
    }
}
