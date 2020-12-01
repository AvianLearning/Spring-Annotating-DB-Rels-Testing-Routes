package com.codeclan.example.filesfolders.repositories;

import com.codeclan.example.filesfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
