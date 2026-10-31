package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.p(new Object[]{g0.CREATE_NEW, g0.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(copyOption + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().i().g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamW = path.getFileSystem().i().w(path, g0.CREATE_NEW, g0.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                c(path).a(path, new a[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.spi.c c(Path path) {
        return path.getFileSystem().i();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        j$.nio.file.spi.c cVarC = c(path);
        if (c(path2).equals(cVarC)) {
            cVarC.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    r.e("'", copyOption2, "' is not a recognized copy option");
                    return null;
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().i().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            path2.getFileSystem().i().c(path2, new j$.nio.file.attribute.k[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().i().v(path, new v[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.d) path2.getFileSystem().i().h(path2, j$.nio.file.attribute.d.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().i().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().i().f(path);
        return path2;
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) c(path).x(path, cls, linkOptionArr);
    }

    public static Path readSymbolicLink(Path path) {
        return c(path).z(path);
    }

    public static Path walkFileTree(Path path, FileVisitor<? super Path> fileVisitor) {
        FileVisitResult fileVisitResultVisitFile;
        o oVar = new o(EnumSet.noneOf(p.class));
        try {
            if (oVar.d) {
                throw new IllegalStateException("Closed");
            }
            m mVarC = oVar.c(path, false);
            do {
                int[] iArr = q.a;
                n nVar = (n) mVarC.b;
                BasicFileAttributes basicFileAttributes = (BasicFileAttributes) mVarC.d;
                IOException iOException = (IOException) mVarC.e;
                Path path2 = (Path) mVarC.c;
                int i = iArr[nVar.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        fileVisitResultVisitFile = fileVisitor.a(path2, basicFileAttributes);
                        if ((fileVisitResultVisitFile == FileVisitResult.SKIP_SUBTREE || fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) && !oVar.c.isEmpty()) {
                            try {
                                ((l) oVar.c.pop()).c.close();
                            } catch (IOException unused) {
                            }
                        }
                    } else {
                        if (i != 3) {
                            throw new AssertionError("Should not get here");
                        }
                        fileVisitResultVisitFile = fileVisitor.b(path2, iOException);
                        if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) {
                            fileVisitResultVisitFile = FileVisitResult.CONTINUE;
                        }
                    }
                } else {
                    if (iOException != null) {
                        fileVisitor.c(path2, iOException);
                        throw null;
                    }
                    fileVisitResultVisitFile = fileVisitor.visitFile(path2, basicFileAttributes);
                }
                Objects.requireNonNull(fileVisitResultVisitFile);
                if (fileVisitResultVisitFile != FileVisitResult.CONTINUE) {
                    if (fileVisitResultVisitFile == FileVisitResult.TERMINATE) {
                        break;
                    }
                    if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS && !oVar.c.isEmpty()) {
                        ((l) oVar.c.peek()).e = true;
                    }
                    mVarC = oVar.b();
                } else {
                    mVarC = oVar.b();
                }
            } while (mVarC != null);
            oVar.close();
            return path;
        } catch (Throwable th) {
            try {
                oVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
