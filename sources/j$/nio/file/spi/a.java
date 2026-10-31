package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.CopyOption;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.a0;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.x;
import j$.nio.file.d;
import j$.nio.file.f;
import j$.nio.file.h;
import j$.nio.file.v;
import j$.nio.file.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.b.setAttribute(y.p(path), str, g.j(obj), g.u(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, j$.nio.file.a[] aVarArr) throws IOException {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathP = y.p(path);
        AccessMode[] accessModeArr = null;
        if (aVarArr != null) {
            int length = aVarArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                j$.nio.file.a aVar = aVarArr[i];
                if (aVar == null) {
                    accessMode = null;
                } else if (aVar == j$.nio.file.a.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = aVar == j$.nio.file.a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathP, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(y.p(path), y.p(path2), g.t(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, k[] kVarArr) throws IOException {
        this.b.createDirectory(y.p(path), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(y.p(path), y.p(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, k[] kVarArr) throws IOException {
        this.b.createSymbolicLink(y.p(path), y.p(path2), g.w(kVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof a) {
            obj = ((a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(y.p(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(y.p(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ o h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(y.p(path), g.g(cls), g.u(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof n) {
            return ((n) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof j$.nio.file.attribute.c) {
                return ((j$.nio.file.attribute.c) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                return new j$.nio.file.attribute.g((DosFileAttributeView) basicFileAttributeView);
            }
            return basicFileAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) basicFileAttributeView) : new j$.nio.file.attribute.b(basicFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new x((UserDefinedFileAttributeView) fileAttributeView) : new m(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof q) {
            return ((q) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return new j$.nio.file.attribute.a((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) fileOwnerAttributeView) : new p(fileOwnerAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ d i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(y.p(path));
        if (fileStore == null) {
            return null;
        }
        return new d(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ h j(URI uri) {
        return f.k(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return j$.nio.file.x.p(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(y.p(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(y.p(path), y.p(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(y.p(path), y.p(path2), g.t(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, k[] kVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(y.p(path), g.k(set), executorService, g.w(kVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, k[] kVarArr) {
        return this.b.newByteChannel(y.p(path), g.k(set), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        return new a0(this.b.newDirectoryStream(y.p(path), new j$.desugar.sun.nio.fs.h(filter)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, k[] kVarArr) {
        return this.b.newFileChannel(y.p(path), g.k(set), g.w(kVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ h t(Path path, Map map) {
        return f.k(this.b.newFileSystem(y.p(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ h u(URI uri, Map map) {
        return f.k(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, v[] vVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathP = y.p(path);
        if (vVarArr == null) {
            openOptionArr = null;
        } else {
            int length = vVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.u.a(vVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathP, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, v[] vVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathP = y.p(path);
        if (vVarArr == null) {
            openOptionArr = null;
        } else {
            int length = vVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.u.a(vVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathP, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return e.a(this.b.readAttributes(y.p(path), g.h(cls), g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return g.i(this.b.readAttributes(y.p(path), str, g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return j$.nio.file.x.p(this.b.readSymbolicLink(y.p(path)));
    }
}
