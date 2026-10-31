package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class c implements BasicFileAttributeView {
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return f.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.a.a(j$.desugar.sun.nio.fs.g.c(fileTime), j$.desugar.sun.nio.fs.g.c(fileTime2), j$.desugar.sun.nio.fs.g.c(fileTime3));
    }
}
