package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class g extends FileSystem {
    public final /* synthetic */ h a;

    public /* synthetic */ g(h hVar) {
        this.a = hVar;
    }

    public static /* synthetic */ FileSystem a(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof f ? ((f) hVar).a : new g(hVar);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        h hVar = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return hVar.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return y.p(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        f0 f0VarC = this.a.c(str);
        if (f0VarC == null) {
            return null;
        }
        return f0VarC instanceof d0 ? ((d0) f0VarC).a : new e0(f0VarC);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new b0(this.a.d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.b0 b0VarF = this.a.f();
        int i = j$.nio.file.attribute.c0.a;
        if (b0VarF == null) {
            return null;
        }
        return b0VarF.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        o0 o0VarH = this.a.h();
        if (o0VarH == null) {
            return null;
        }
        return o0VarH.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarI = this.a.i();
        int i = j$.nio.file.spi.b.b;
        if (cVarI == null) {
            return null;
        }
        return cVarI instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarI).b : new j$.nio.file.spi.b(cVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.j();
    }
}
