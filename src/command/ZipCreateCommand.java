package command;

import archiver.Console;
import archiver.ZipFileManager;
import exception.PathlsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            Console.writeMessage("...Создание архива...");
            ZipFileManager zipFileManager = getZipFileManager();
            Console.writeMessage("Введите имя файла или папки для активации:");
            Path sourcePath = Paths.get(Console.readString());
            zipFileManager.createZip(sourcePath);
            Console.writeMessage("Ваш архив создан");
        } catch (PathlsNotFoundException e) {
            Console.writeMessage("Неверное имя файла");
        }
    }
}
