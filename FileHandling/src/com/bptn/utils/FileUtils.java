package com.bptn.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {

	public boolean isFileExist(Path path) {
		if (Files.exists(path)) {
			System.out.println("File exists!");
			return true;
		} else {
			System.out.println("File doesn't exist!");
			return false;
		}
	}

	public boolean isFileExistsWithExceptionHandling(Path path) {
		File file = new File(path.toUri());
		try (Scanner scanner = new Scanner(file)) { // Using try-with-resources for automatic resource management
			System.out.println("File exists");
			scanner.nextLine(); // Reads a line if file exists
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist!");
			return false;
		}
	}

	public boolean createFileIfNotExist(Path path) {
		if (Files.exists(path)) {
			System.out.println("File already exists.");
			return true;
		} else {
			try {
				Files.createFile(path);
				System.out.println("File created successfully.");
				return true;
			} catch (IOException e) {
				System.out.println("Failed to create the file due to an IOException.");
				return false;
			}
		}
	}

	// define readFile()
	public void readFile(Path path) {
		if (isFileExist(path)) {
			try (Scanner scanner = new Scanner(new File(path.toUri()))) {
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
			}
		}
	}

	// define writeFile()
	public void writeFile(Path path) {
		if (isFileExist(path)) {
			try (FileWriter writer = new FileWriter(path.toFile())) {
				writer.write("text 4 n\n");
				writer.write("text 5 n\n");
				// System.out.println("Content written to file.");
			} catch (IOException e) {
				System.out.println("Failed file.");
			}
		}
	}

	// define deleteFile()
	public void deleteFile(Path path) {
		if (isFileExist(path)) {
			try {
				Files.delete(path);
				System.out.println("File deleted");
			} catch (IOException e) {
				System.out.println("Failed to delete the file.");
			}
		}
	}

	// define updateFile()
	public void updateFile(Path path) {
		if (isFileExist(path)) {
			try (FileWriter writer = new FileWriter(path.toFile(), true)) { // 'true' enables append mode
				writer.write("text 6 n\n");
				writer.write("text 7 n\n");
				System.out.println("Content appended to file.");
			} catch (IOException e) {
				System.out.println("File failed to update.");
			}
		}
	}

	public static void main(String[] args) {
		FileUtils fileUtils = new FileUtils();

		String DIRECTORY_PATH = System.getProperty("user.dir") + "/";

		String filePath = DIRECTORY_PATH + "test.txt";

		System.out.println(filePath);

		fileUtils.writeFile(Paths.get(filePath));
		fileUtils.updateFile(Paths.get(filePath));
		fileUtils.readFile(Paths.get(filePath));
		fileUtils.deleteFile(Paths.get(filePath));
	}

}