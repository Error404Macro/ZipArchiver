package archiver;

import exception.WrongZipFileException;

public class Archiver {
    public static void main(String[] args) throws Exception {
        /*BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите полный путь файла архива");
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(bF.readLine()));

        System.out.println("Введите полное имя файла");
        zipFileManager.createZip(Paths.get(bF.readLine()));
        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();*/
        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e){
                Console.writeMessage("Выбран неверный файл");
            } catch (Exception e){
                Console.writeMessage("Ошибка. Проверьте введенные данные");
            }
        } while (operation != Operation.EXIT);
    }
    public static Operation askOperation() throws Exception {
        Console.writeMessage("");
        Console.writeMessage("Выберете операцию:");
        Console.writeMessage(String.format("\t %d - упаковать файл(ы) в архив", Operation.CREATE.ordinal()));
        Console.writeMessage(String.format("\t %d - добавить файл(ы) в архив", Operation.ADD.ordinal()));
        Console.writeMessage(String.format("\t %d - удалить файл(ы) из архива", Operation.REMOVE.ordinal()));
        Console.writeMessage(String.format("\t %d - распаковать архив", Operation.EXTRACT.ordinal()));
        Console.writeMessage(String.format("\t %d - просмотреть содержимое", Operation.CONTENT.ordinal()));
        Console.writeMessage(String.format("\t %d - выход", Operation.EXIT.ordinal()));

        return Operation.values()[Console.readInt()];
    }
}