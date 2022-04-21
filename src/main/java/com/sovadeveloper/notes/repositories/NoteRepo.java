package com.sovadeveloper.notes.repositories;

import com.sovadeveloper.notes.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<NoteEntity, Long> {

}
