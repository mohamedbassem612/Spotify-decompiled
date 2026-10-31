package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ivy {
    public final mtl a;

    public ivy(mtl mtlVar) {
        this.a = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivy) && u890.j(this.a, ((ivy) obj).a);
    }

    public final int hashCode() {
        mtl mtlVar = this.a;
        if (mtlVar == null) {
            return 0;
        }
        return mtlVar.a.hashCode();
    }
}
