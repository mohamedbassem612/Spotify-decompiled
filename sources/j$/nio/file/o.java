package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class o implements Closeable {
    public final boolean a;
    public final LinkOption[] b;
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public o(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (k.a[((p) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        this.a = z;
        this.b = z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
    }

    public final BasicFileAttributes a(Path path) throws IOException {
        try {
            return Files.readAttributes(path, BasicFileAttributes.class, this.b);
        } catch (IOException e) {
            if (this.a) {
                return Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final m b() {
        Path path;
        IOException cause;
        m mVarC;
        l lVar = (l) this.c.peek();
        if (lVar == null) {
            return null;
        }
        do {
            if (lVar.e) {
                path = null;
                cause = null;
            } else {
                Iterator it = lVar.d;
                try {
                    path = it.hasNext() ? (Path) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    path = null;
                }
            }
            if (path == null) {
                try {
                    lVar.c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.c.pop();
                return new m(n.END_DIRECTORY, lVar.a, (BasicFileAttributes) null, cause);
            }
            mVarC = c(path, true);
        } while (mVarC == null);
        return mVarC;
    }

    public final m c(Path path, boolean z) {
        try {
            BasicFileAttributes basicFileAttributesA = a(path);
            if (this.c.size() >= Integer.MAX_VALUE || !basicFileAttributesA.isDirectory()) {
                return new m(n.ENTRY, path, basicFileAttributesA, (IOException) null);
            }
            if (this.a) {
                Object objFileKey = basicFileAttributesA.fileKey();
                for (l lVar : this.c) {
                    Object obj = lVar.b;
                    if (objFileKey == null || obj == null) {
                        try {
                            if (Files.c(path).n(path, lVar.a)) {
                                return new m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                            continue;
                        }
                    } else if (objFileKey.equals(obj)) {
                        return new m(n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                    }
                }
            }
            try {
                this.c.push(new l(path, basicFileAttributesA.fileKey(), Files.c(path).r(path, s.a)));
                return new m(n.START_DIRECTORY, path, basicFileAttributesA, (IOException) null);
            } catch (IOException e) {
                return new m(n.ENTRY, path, (BasicFileAttributes) null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new m(n.ENTRY, path, (BasicFileAttributes) null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        while (!this.c.isEmpty()) {
            if (!this.c.isEmpty()) {
                try {
                    ((l) this.c.pop()).c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.d = true;
    }
}
