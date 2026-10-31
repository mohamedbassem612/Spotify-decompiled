package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rho0 {
    public final xho0 a;
    public final String b;
    public final String c;
    public final String d;

    public rho0(xho0 xho0Var, String str, String str2, String str3) {
        this.a = xho0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rho0)) {
            return false;
        }
        rho0 rho0Var = (rho0) obj;
        return this.a.equals(rho0Var.a) && this.b.equals(rho0Var.b) && this.c.equals(rho0Var.c) && u890.j(this.d, rho0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
