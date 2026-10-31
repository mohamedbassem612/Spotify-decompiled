package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gju0 implements kju0 {
    public final String a;
    public final String b;
    public final int c;
    public final tv80 d;

    public gju0(int i, String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gju0)) {
            return false;
        }
        gju0 gju0Var = (gju0) obj;
        return u890.j(this.a, gju0Var.a) && u890.j(this.b, gju0Var.b) && this.c == gju0Var.c && u890.j(this.d, gju0Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        tv80 tv80Var = this.d;
        return iF + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
