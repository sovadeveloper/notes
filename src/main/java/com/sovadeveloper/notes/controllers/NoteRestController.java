package com.sovadeveloper.notes.controllers;

import com.sovadeveloper.notes.entities.NoteEntity;
import com.sovadeveloper.notes.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/notes")
public class NoteRestController {
    private final NoteService noteService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.ok(noteService.getAll());
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        try {
            return ResponseEntity.ok(noteService.getById(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody NoteEntity noteEntity){
        try {
            return ResponseEntity.ok(noteService.create(noteEntity));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping
    public ResponseEntity<?> edit(@RequestBody NoteEntity noteEntity){
        try {
            return ResponseEntity.ok(noteService.edit(noteEntity));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.ok(noteService.delete(id));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e);
        }
    }
}
