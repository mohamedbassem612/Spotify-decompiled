package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class x implements Path {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ x(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path p(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof y ? ((y) path).a : new x(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ n0 I(o0 o0Var, l0[] l0VarArr) {
        return n0.a(this.a.register(o0Var == null ? null : o0Var.a, j$.desugar.sun.nio.fs.g.v(l0VarArr)));
    }

    @Override // j$.nio.file.Path, java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return p(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ h getFileSystem() {
        return f.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return p(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return p(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return p(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ n0 m(o0 o0Var, l0[] l0VarArr, m0[] m0VarArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = o0Var == null ? null : o0Var.a;
        WatchEvent.Kind<?>[] kindArrV = j$.desugar.sun.nio.fs.g.v(l0VarArr);
        if (m0VarArr != null) {
            int length = m0VarArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                m0 m0Var = m0VarArr[i];
                modifierArr2[i] = m0Var == null ? null : m0Var.a;
            }
            modifierArr = modifierArr2;
        }
        return n0.a(path.register(watchService, kindArrV, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return p(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path o(Path path) {
        return p(this.a.resolve(y.p(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path q(LinkOption[] linkOptionArr) {
        return p(this.a.toRealPath(j$.desugar.sun.nio.fs.g.u(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return p(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return p(this.a.resolveSibling(str));
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(y.p(path));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return this.a.spliterator();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return p(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean t(Path path) {
        return this.a.startsWith(y.p(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return p(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean u(Path path) {
        return this.a.endsWith(y.p(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path v(Path path) {
        return p(this.a.resolveSibling(y.p(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path y(Path path) {
        return p(this.a.relativize(y.p(path)));
    }
}
