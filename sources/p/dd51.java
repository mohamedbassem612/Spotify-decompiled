package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dd51 extends hd51 {
    public final String b;
    public final String c;
    public final tv80 d;
    public final w951 e;

    public dd51(String str, String str2, tv80 tv80Var, w951 w951Var) {
        this.b = str;
        this.c = str2;
        this.d = tv80Var;
        this.e = w951Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd51)) {
            return false;
        }
        dd51 dd51Var = (dd51) obj;
        return u890.j(this.b, dd51Var.b) && u890.j(this.c, dd51Var.c) && u890.j(this.d, dd51Var.d) && u890.j(this.e, dd51Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.d;
        return this.e.hashCode() + ((iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0)) * 31);
    }
}
