package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface FileVisitor<T> {
    FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes);

    FileVisitResult b(Path path, IOException iOException);

    FileVisitResult c(Path path, IOException iOException);

    FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes);
}
