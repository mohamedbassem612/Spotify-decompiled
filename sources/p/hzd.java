package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hzd {
    public final String a;
    public final String b;
    public final String c;
    public final ir0 d;
    public final anw0 e;

    public hzd(String str, String str2, String str3, ir0 ir0Var, anw0 anw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ir0Var;
        this.e = anw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzd)) {
            return false;
        }
        hzd hzdVar = (hzd) obj;
        return this.a.equals(hzdVar.a) && this.b.equals(hzdVar.b) && this.c.equals(hzdVar.c) && u890.j(this.d, hzdVar.d) && u890.j(this.e, hzdVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ir0 ir0Var = this.d;
        int iHashCode = (iD + (ir0Var == null ? 0 : ir0Var.hashCode())) * 31;
        anw0 anw0Var = this.e;
        return iHashCode + (anw0Var != null ? anw0Var.hashCode() : 0);
    }
}
