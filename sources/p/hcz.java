package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hcz {
    public final vu30 a;
    public final String b;

    public hcz(String str, j2i j2iVar) {
        this.a = j2iVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcz)) {
            return false;
        }
        hcz hczVar = (hcz) obj;
        return u890.j(this.a, hczVar.a) && u890.j(this.b, hczVar.b);
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        int iHashCode = (vu30Var == null ? 0 : vu30Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
