package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g2w0 extends h2w0 {
    public final String a;
    public final int b;
    public final String c;
    public final tv80 d;

    public g2w0(int i, String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2w0)) {
            return false;
        }
        g2w0 g2w0Var = (g2w0) obj;
        return u890.j(this.a, g2w0Var.a) && this.b == g2w0Var.b && this.c.equals(g2w0Var.c) && u890.j(this.d, g2w0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
