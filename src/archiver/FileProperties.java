package archiver;

public class FileProperties {
    private String name;
    private long size;
    private long compressedSize;
    private int compressionMethod;

    public FileProperties(String name, long size, long compressedSize, int compressionMethod) {
        this.name = name;
        this.size = size;
        this.compressedSize = compressedSize;
        this.compressionMethod = compressionMethod;
    }
    public long getCompressionRatio(){
        return 100 - ((compressedSize * 100)/size);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        if(size > 0){
            builder.append("\t");
            builder.append(size / 100);
            builder.append(" Kb (");
            builder.append(compressedSize / 1024);
            builder.append(" Kb) сжатие:");
            builder.append(getCompressionRatio());
            builder.append("%");
        }
        return builder.toString();
    }
}
