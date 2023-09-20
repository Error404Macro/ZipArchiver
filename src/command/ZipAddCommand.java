package command;

import archiver.Console;
import archiver.ZipFileManager;
import exception.PathlsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            Console.writeMessage("Добавление нового файла в архив.");

            ZipFileManager zipFileManager = getZipFileManager();

            Console.writeMessage("Введите полное имя файла для добавления:");
            Path sourcePath = Paths.get(Console.readString());

            zipFileManager.addFile(sourcePath);

            Console.writeMessage("Добавление в архив завершено.");

        } catch (PathlsNotFoundException e) {
            Console.writeMessage("Файл не был найден.");
        }
    }
}
