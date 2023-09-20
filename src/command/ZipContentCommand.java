package command;

import archiver.Console;
import archiver.FileProperties;
import archiver.ZipFileManager;

import java.nio.file.Path;
import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        Console.writeMessage("Просмотр содержимого архива");
        ZipFileManager zipFileManager = getZipFileManager();
        Console.writeMessage("Содержимое архива");
        List<FileProperties> files = zipFileManager.getFilesList();
        for(FileProperties file : files){
            Console.writeMessage(file.toString());
        }
        Console.writeMessage("Архив прочитан");
    }
}
