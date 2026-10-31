package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fom1 implements kom1 {
    public final String a;
    public final String b;
    public final jom1 c;
    public final boolean d;

    public fom1(String str, String str2, jom1 jom1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = jom1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fom1)) {
            return false;
        }
        fom1 fom1Var = (fom1) obj;
        return u890.j(this.a, fom1Var.a) && u890.j(this.b, fom1Var.b) && this.c.equals(fom1Var.c) && this.d == fom1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
