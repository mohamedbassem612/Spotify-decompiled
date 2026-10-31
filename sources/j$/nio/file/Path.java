package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    default n0 I(o0 o0Var, l0... l0VarArr) {
        return m(o0Var, l0VarArr, new m0[0]);
    }

    default boolean endsWith(String str) {
        return u(getFileSystem().b(str, new String[0]));
    }

    boolean equals(Object obj);

    Path getFileName();

    h getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    default Iterator iterator() {
        return new w(this);
    }

    n0 m(o0 o0Var, l0[] l0VarArr, m0... m0VarArr);

    Path normalize();

    Path o(Path path);

    Path q(LinkOption... linkOptionArr);

    default Path resolve(String str) {
        return o(getFileSystem().b(str, new String[0]));
    }

    default Path resolveSibling(String str) {
        return v(getFileSystem().b(str, new String[0]));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    int compareTo(Path path);

    default boolean startsWith(String str) {
        return t(getFileSystem().b(str, new String[0]));
    }

    Path subpath(int i, int i2);

    boolean t(Path path);

    Path toAbsolutePath();

    default File toFile() {
        if (getFileSystem() == j.a) {
            return new File(toString());
        }
        throw new UnsupportedOperationException("Path not associated with default file system.");
    }

    String toString();

    URI toUri();

    boolean u(Path path);

    default Path v(Path path) {
        path.getClass();
        Path parent = getParent();
        return parent == null ? path : parent.o(path);
    }

    Path y(Path path);
}
