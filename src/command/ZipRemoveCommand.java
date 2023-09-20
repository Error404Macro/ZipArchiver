package command;

import archiver.Console;
import archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        Console.writeMessage("Удаление файла из архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        Console.writeMessage("Введите полный путь файла в архиве:");
        Path sourcePath = Paths.get(Console.readString());
        zipFileManager.removeFile(sourcePath);

        Console.writeMessage("Удаление из архива завершено.");
    }
}
