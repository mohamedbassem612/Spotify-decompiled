package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.a0;
import j$.nio.file.attribute.d;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.u;
import j$.nio.file.e;
import j$.nio.file.t;
import j$.nio.file.v;
import j$.nio.file.x;
import j$.nio.file.y;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        j$.nio.file.a aVar;
        c cVar = this.a;
        j$.nio.file.Path pathP = x.p(path);
        j$.nio.file.a[] aVarArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            j$.nio.file.a[] aVarArr2 = new j$.nio.file.a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                if (accessMode == null) {
                    aVar = null;
                } else if (accessMode == AccessMode.READ) {
                    aVar = j$.nio.file.a.READ;
                } else {
                    aVar = accessMode == AccessMode.WRITE ? j$.nio.file.a.WRITE : j$.nio.file.a.EXECUTE;
                }
                aVarArr2[i] = aVar;
            }
            aVarArr = aVarArr2;
        }
        cVar.a(pathP, aVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathP = x.p(path);
        j$.nio.file.Path pathP2 = x.p(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathP, pathP2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(x.p(path), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(x.p(path), x.p(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(x.p(path), x.p(path2), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(x.p(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(x.p(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        o oVarH = this.a.h(x.p(path), g.g(cls), g.q(linkOptionArr));
        if (oVarH == null) {
            return null;
        }
        if (oVarH instanceof m) {
            return ((m) oVarH).a;
        }
        if (oVarH instanceof d) {
            d dVar = (d) oVarH;
            if (dVar instanceof j$.nio.file.attribute.b) {
                return ((j$.nio.file.attribute.b) dVar).a;
            }
            if (dVar instanceof j$.nio.file.attribute.g) {
                return ((j$.nio.file.attribute.g) dVar).a;
            }
            return dVar instanceof u ? ((u) dVar).a : new j$.nio.file.attribute.c(dVar);
        }
        if (!(oVarH instanceof r)) {
            return oVarH instanceof j$.nio.file.attribute.x ? ((j$.nio.file.attribute.x) oVarH).a : new n(oVarH);
        }
        r rVar = (r) oVarH;
        if (rVar instanceof p) {
            return ((p) rVar).a;
        }
        if (rVar instanceof j$.nio.file.attribute.a) {
            return ((j$.nio.file.attribute.a) rVar).a;
        }
        return rVar instanceof u ? ((u) rVar).a : new q(rVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        j$.nio.file.d dVarI = this.a.i(x.p(path));
        int i = e.a;
        if (dVarI == null) {
            return null;
        }
        return dVarI.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return j$.nio.file.g.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return y.p(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(x.p(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(x.p(path), x.p(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathP = x.p(path);
        j$.nio.file.Path pathP2 = x.p(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathP, pathP2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.a.p(x.p(path), g.k(set), executorService, g.s(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(x.p(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new a0(this.a.r(x.p(path), new h(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(x.p(path), g.k(set), g.s(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return j$.nio.file.g.a(this.a.t(x.p(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        v[] vVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathP = x.p(path);
        if (openOptionArr == null) {
            vVarArr = null;
        } else {
            int length = openOptionArr.length;
            v[] vVarArr2 = new v[length];
            for (int i = 0; i < length; i++) {
                vVarArr2[i] = t.a(openOptionArr[i]);
            }
            vVarArr = vVarArr2;
        }
        return cVar.v(pathP, vVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        v[] vVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathP = x.p(path);
        if (openOptionArr == null) {
            vVarArr = null;
        } else {
            int length = openOptionArr.length;
            v[] vVarArr2 = new v[length];
            for (int i = 0; i < length; i++) {
                vVarArr2[i] = t.a(openOptionArr[i]);
            }
            vVarArr = vVarArr2;
        }
        return cVar.w(pathP, vVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return f.a(this.a.x(x.p(path), g.h(cls), g.q(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return y.p(this.a.z(x.p(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(x.p(path), str, g.j(obj), g.q(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return j$.nio.file.g.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return g.i(this.a.y(x.p(path), str, g.q(linkOptionArr)));
    }
}
