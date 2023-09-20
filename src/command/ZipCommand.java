package command;

import archiver.Console;
import archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {
    @Override
    public void execute() throws Exception {

    }
    public ZipFileManager getZipFileManager() throws Exception {
        Console.writeMessage("Введите полный путь файла архива: ");
        Path zipPath = Paths.get(Console.readString());
        return new ZipFileManager(zipPath);
    }
}
