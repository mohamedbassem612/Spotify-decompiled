package p;

import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.Paths;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class abo0 extends gka0 {
    public static Long m(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p.i520
    public final void c(s8s0 s8s0Var, s8s0 s8s0Var2) throws FileNotFoundException {
        try {
            Files.move(Paths.get(s8s0Var.a.r(), new String[0]), Paths.get(s8s0Var2.a.r(), new String[0]), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (UnsupportedOperationException unused) {
            k220.i("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p.i520
    public final q420 g(s8s0 s8s0Var) {
        s8s0 s8s0VarD;
        Path path = Paths.get(s8s0Var.a.r(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = s8s0.b;
                String string = symbolicLink.toString();
                rhc rhcVar = c.a;
                nac nacVar = new nac();
                nacVar.Y(string);
                s8s0VarD = c.d(nacVar, false);
            } else {
                s8s0VarD = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM = fileTimeCreationTime != null ? m(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM2 = fileTimeLastModifiedTime != null ? m(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new q420(zIsRegularFile, zIsDirectory, s8s0VarD, lValueOf, lM, lM2, fileTimeLastAccessTime != null ? m(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p.gka0
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
