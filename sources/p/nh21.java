package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nh21 implements ph21 {
    public final goe a;
    public final x4i1 b;
    public final String c;
    public final t7q0 d;
    public final String e;
    public final String f;
    public final String g;

    public nh21(goe goeVar, x4i1 x4i1Var, String str, t7q0 t7q0Var, String str2, String str3, String str4) {
        this.a = goeVar;
        this.b = x4i1Var;
        this.c = str;
        this.d = t7q0Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public static nh21 a(nh21 nh21Var, t7q0 t7q0Var) {
        return new nh21(nh21Var.a, nh21Var.b, nh21Var.c, t7q0Var, nh21Var.e, nh21Var.f, nh21Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh21)) {
            return false;
        }
        nh21 nh21Var = (nh21) obj;
        return u890.j(this.a, nh21Var.a) && u890.j(this.b, nh21Var.b) && u890.j(this.c, nh21Var.c) && u890.j(this.d, nh21Var.d) && u890.j(this.e, nh21Var.e) && u890.j(this.f, nh21Var.f) && u890.j(this.g, nh21Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        t7q0 t7q0Var = this.d;
        return this.g.hashCode() + cy30.d(cy30.d((iD + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
