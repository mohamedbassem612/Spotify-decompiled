package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z490 extends b590 {
    public final gxy a;

    public z490(gxy gxyVar) {
        this.a = gxyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z490) && this.a.equals(((z490) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
