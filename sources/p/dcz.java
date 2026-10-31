package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dcz {
    public final mtl a;

    public dcz(mtl mtlVar) {
        this.a = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcz) && u890.j(this.a, ((dcz) obj).a);
    }

    public final int hashCode() {
        mtl mtlVar = this.a;
        if (mtlVar == null) {
            return 0;
        }
        return mtlVar.a.hashCode();
    }
}
