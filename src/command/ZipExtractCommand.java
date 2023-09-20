package command;
import  archiver.Console;
import archiver.ZipFileManager;
import exception.WrongZipFileException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            Console.writeMessage("Распаковка архива.");

            ZipFileManager zipFileManager = getZipFileManager();

            Console.writeMessage("Введите путь для распаковки:");
            Path destinationPath = Paths.get(Console.readString());
            zipFileManager.extractAll(destinationPath);

            Console.writeMessage("Архив был распакован.");

        } catch (WrongZipFileException e) {
            Console.writeMessage("Архив не существует.");
        }
    }

}
