package com.codeclan.example.filesfolders;

import com.codeclan.example.filesfolders.models.File;
import com.codeclan.example.filesfolders.models.Folder;
import com.codeclan.example.filesfolders.models.User;
import com.codeclan.example.filesfolders.repositories.FileRepository;
import com.codeclan.example.filesfolders.repositories.FolderRepository;
import com.codeclan.example.filesfolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesfoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFolderAndUserThenSave() {
		User user = new User("Iain");
		userRepository.save(user);

		Folder folder = new Folder("CodeClan Homework", user);
		folderRepository.save(folder);
	}

	@Test
	public void createFolderAndFileThenSave() {
		User user = new User("Iain");
		userRepository.save(user);

		Folder folder = new Folder("CodeClan Homework", user);
		folderRepository.save(folder);

		File file = new File("Spring", ".md", 30, folder);
		fileRepository.save(file);
	}
}
