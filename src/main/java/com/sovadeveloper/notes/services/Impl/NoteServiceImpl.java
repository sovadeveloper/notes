package com.sovadeveloper.notes.services.Impl;

import com.sovadeveloper.notes.entities.NoteEntity;
import com.sovadeveloper.notes.repositories.NoteRepo;
import com.sovadeveloper.notes.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepo noteRepo;

    @Override
    public NoteEntity create(NoteEntity noteEntity){
        validate(noteEntity);
        return noteRepo.save(noteEntity);
    }

    @Override
    public NoteEntity getById(Long id){
        return noteRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Такой заметки не найдено"));
    }

    @Override
    public NoteEntity edit(NoteEntity noteEntityUpdated){
        validate(noteEntityUpdated);
        return noteRepo.save(noteEntityUpdated);
    }

    @Override
    public Long delete(Long id){
        NoteEntity noteEntity = noteRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Такой заметки не найдено"));
        noteRepo.delete(noteEntity);
        return id;
    }

    @Override
    public List<NoteEntity> getAll(){
        return noteRepo.findAll();
    }

    private void validate(NoteEntity noteEntity){
        if(noteEntity.getTitle().length() < 1){
            throw new RuntimeException("Название заметки не может быть пустым");
        }
        if(noteEntity.getText().length() < 1){
            throw new RuntimeException("Содержание заметки не может быть пустым");
        }
    }
}
