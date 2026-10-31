package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class u implements d, r {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ u(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.e(fileTime), j$.desugar.sun.nio.fs.g.e(fileTime2), j$.desugar.sun.nio.fs.g.e(fileTime3));
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ void b(a0 a0Var) throws IOException {
        this.a.setOwner(z.a(a0Var));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ a0 getOwner() {
        return y.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.a.readAttributes());
    }
}
