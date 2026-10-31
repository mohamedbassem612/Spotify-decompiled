package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public class SimpleFileVisitor<T> implements FileVisitor<T> {
    @Override // j$.nio.file.FileVisitor
    public final FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(path);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    public final FileVisitResult b(Path path, IOException iOException) throws IOException {
        Objects.requireNonNull(path);
        if (iOException == null) {
            return FileVisitResult.CONTINUE;
        }
        throw iOException;
    }

    @Override // j$.nio.file.FileVisitor
    public final FileVisitResult c(Path path, IOException iOException) throws IOException {
        Objects.requireNonNull(path);
        throw iOException;
    }

    @Override // j$.nio.file.FileVisitor
    public FileVisitResult visitFile(T t, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(t);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }
}
