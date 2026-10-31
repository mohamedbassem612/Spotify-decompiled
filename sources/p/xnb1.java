package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xnb1 {
    public final String a;
    public final String b;
    public final c380 c;
    public final lrn1 d;

    public xnb1(String str, String str2, c380 c380Var, lrn1 lrn1Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = lrn1Var;
    }

    public static xnb1 a(xnb1 xnb1Var, vzg1 vzg1Var) {
        return new xnb1(xnb1Var.a, xnb1Var.b, xnb1Var.c, vzg1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnb1)) {
            return false;
        }
        xnb1 xnb1Var = (xnb1) obj;
        return u890.j(this.a, xnb1Var.a) && u890.j(this.b, xnb1Var.b) && u890.j(this.c, xnb1Var.c) && this.d.equals(xnb1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
