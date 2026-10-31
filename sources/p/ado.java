package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ado {
    public final zco a;
    public final pxc b;

    public ado(zco zcoVar, pxc pxcVar) {
        this.a = zcoVar;
        this.b = pxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ado)) {
            return false;
        }
        ado adoVar = (ado) obj;
        return u890.j(this.a, adoVar.a) && u890.j(this.b, adoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pxc pxcVar = this.b;
        return iHashCode + (pxcVar == null ? 0 : pxcVar.hashCode());
    }
}
