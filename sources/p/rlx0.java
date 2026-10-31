package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlx0 {
    public final String a;
    public final int b;
    public final d761 c;
    public final d761 d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;

    public rlx0(String str, int i, d761 d761Var, d761 d761Var2, String str2, int i2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = d761Var;
        this.d = d761Var2;
        this.e = str2;
        this.f = i2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlx0)) {
            return false;
        }
        rlx0 rlx0Var = (rlx0) obj;
        return this.a.equals(rlx0Var.a) && this.b == rlx0Var.b && this.c.equals(rlx0Var.c) && this.d.equals(rlx0Var.d) && this.e.equals(rlx0Var.e) && this.f == rlx0Var.f && this.g.equals(rlx0Var.g) && u890.j(this.h, rlx0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(kaa0.f(this.f, cy30.d(ktd.f(ktd.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), this.c.a, 31), this.d.a, 31), 31, this.e), 31), 31, this.g);
    }
}
