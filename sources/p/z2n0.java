package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2n0 {
    public final mtl a;

    public z2n0(mtl mtlVar) {
        this.a = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2n0) && u890.j(this.a, ((z2n0) obj).a);
    }

    public final int hashCode() {
        mtl mtlVar = this.a;
        if (mtlVar == null) {
            return 0;
        }
        return mtlVar.a.hashCode();
    }
}
