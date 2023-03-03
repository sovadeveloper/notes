package com.sovadeveloper.notes.services;

import com.sovadeveloper.notes.entities.NoteEntity;

import java.util.List;

public interface NoteService {
    NoteEntity create(NoteEntity noteEntity);
    NoteEntity getById(Long id);
    NoteEntity edit(NoteEntity noteEntityUpdated);
    Long delete(Long id);
    List<NoteEntity> getAll();
}
