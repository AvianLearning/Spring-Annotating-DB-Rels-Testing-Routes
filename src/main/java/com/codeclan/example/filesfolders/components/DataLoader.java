package com.codeclan.example.filesfolders.components;

import com.codeclan.example.filesfolders.models.File;
import com.codeclan.example.filesfolders.models.Folder;
import com.codeclan.example.filesfolders.models.User;
import com.codeclan.example.filesfolders.repositories.FileRepository;
import com.codeclan.example.filesfolders.repositories.FolderRepository;
import com.codeclan.example.filesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User iain = new User("Iain");
        userRepository.save(iain);

        User aileen = new User("Aileen");
        userRepository.save(aileen);

        User isaac = new User("Isaac");
        userRepository.save(isaac);

        Folder folder1 = new Folder("CodeClan Work", iain);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Photos", aileen);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Minecraft", isaac);
        folderRepository.save(folder3);

        File file1 = new File("Encapsulation", ".md", 50, folder1);
        fileRepository.save(file1);

        File file2 = new File("HolidayLandscape", ".jpg", 40, folder2);
        fileRepository.save(file2);

        File file3 = new File("Zombies", ".txt", 100, folder3);
        fileRepository.save(file3);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);

        folder2.addFile(file1);
        folder2.addFile(file2);
        folder2.addFile(file3);
        folderRepository.save(folder2);

        iain.addFolder(folder1);
        iain.addFolder(folder2);
        userRepository.save(iain);
    }
}
