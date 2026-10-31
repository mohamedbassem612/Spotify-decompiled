package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nwi1 extends vwi1 {
    public final String a;
    public final tv80 b;

    public nwi1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwi1)) {
            return false;
        }
        nwi1 nwi1Var = (nwi1) obj;
        return this.a.equals(nwi1Var.a) && u890.j(this.b, nwi1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
