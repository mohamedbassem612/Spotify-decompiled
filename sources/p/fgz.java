package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fgz {
    public final ggz a;
    public final dgz b;

    public fgz(ggz ggzVar, dgz dgzVar, int i) {
        dgzVar = (i & 4) != 0 ? null : dgzVar;
        this.a = ggzVar;
        this.b = dgzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgz)) {
            return false;
        }
        fgz fgzVar = (fgz) obj;
        return this.a == fgzVar.a && u890.j(this.b, fgzVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        dgz dgzVar = this.b;
        return iHashCode + (dgzVar == null ? 0 : dgzVar.hashCode());
    }
}
