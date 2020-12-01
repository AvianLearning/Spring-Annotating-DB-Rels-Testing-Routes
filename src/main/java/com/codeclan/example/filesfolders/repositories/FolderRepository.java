package com.codeclan.example.filesfolders.repositories;

import com.codeclan.example.filesfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
