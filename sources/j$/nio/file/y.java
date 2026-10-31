package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class y implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    public /* synthetic */ y(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path p(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof x ? ((x) path).a : new y(path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(j$.desugar.sun.nio.fs.g.f(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.u(x.p(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        this.a.forEach(consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return p(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return g.a(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return p(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return p(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return p(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return p(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        m0[] m0VarArr;
        Path path = this.a;
        o0 o0VarA = o0.a(watchService);
        l0[] l0VarArrR = j$.desugar.sun.nio.fs.g.r(kindArr);
        if (modifierArr == null) {
            m0VarArr = null;
        } else {
            int length = modifierArr.length;
            m0VarArr = new m0[length];
            for (int i = 0; i < length; i++) {
                WatchEvent.Modifier modifier = modifierArr[i];
                m0VarArr[i] = modifier == null ? null : new m0(modifier);
            }
        }
        n0 n0VarM = path.m(o0VarA, l0VarArrR, m0VarArr);
        if (n0VarM == null) {
            return null;
        }
        return n0VarM.a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return p(this.a.y(x.p(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return p(this.a.o(x.p(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return p(this.a.v(x.p(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<java.nio.file.Path> spliterator() {
        return this.a.spliterator();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.t(x.p(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return p(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return p(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return p(this.a.q(j$.desugar.sun.nio.fs.g.q(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(x.p(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return p(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return p(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        n0 n0VarI = this.a.I(o0.a(watchService), j$.desugar.sun.nio.fs.g.r(kindArr));
        if (n0VarI == null) {
            return null;
        }
        return n0VarI.a;
    }
}
