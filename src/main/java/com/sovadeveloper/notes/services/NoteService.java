package com.sovadeveloper.notes.services;

import com.sovadeveloper.notes.entities.NoteEntity;

import java.util.List;

public interface NoteService {
    NoteEntity create(NoteEntity noteEntity) throws Exception;
    NoteEntity getById(Long id) throws Exception;
    NoteEntity edit(NoteEntity noteEntityUpdated) throws Exception;
    Long delete(Long id) throws Exception;
    List<NoteEntity> getAll() throws Exception;
}
