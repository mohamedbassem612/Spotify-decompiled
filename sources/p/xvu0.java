package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xvu0 {
    public final rhq0 a;
    public final String b;
    public final op80 c;

    public xvu0(rhq0 rhq0Var, String str, op80 op80Var) {
        this.a = rhq0Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvu0)) {
            return false;
        }
        xvu0 xvu0Var = (xvu0) obj;
        return this.a.equals(xvu0Var.a) && this.b.equals(xvu0Var.b) && this.c.equals(xvu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
