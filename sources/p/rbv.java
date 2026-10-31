package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rbv {
    public final ak3 a;
    public final String b;
    public final tv80 c;

    public rbv(ak3 ak3Var, String str, tv80 tv80Var) {
        this.a = ak3Var;
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbv)) {
            return false;
        }
        rbv rbvVar = (rbv) obj;
        return this.a == rbvVar.a && u890.j(this.b, rbvVar.b) && u890.j(this.c, rbvVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
