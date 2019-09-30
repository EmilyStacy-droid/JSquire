import framework.FileOperationsKihonBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperationsKihon extends FileOperationsKihonBase {
    @Override
    public String getContentsOfThisFile(Path pathOfFile) throws IOException {
        return Files.readString(Path pathOfFile);
    }

    @Override
    public void writeContentsToThisFile(Path pathOfFile, String contents) throws IOException {
        return Files.write(Path pathOfFile) {
            Files.append(contents);
        }
    }
}
