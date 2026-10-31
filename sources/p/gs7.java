package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gs7 implements is7 {
    public final jlw0 a;
    public final int b;
    public final String c;
    public final String d;
    public final s171 e;

    public gs7(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var) {
        this.a = jlw0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs7)) {
            return false;
        }
        gs7 gs7Var = (gs7) obj;
        return this.a.equals(gs7Var.a) && this.b == gs7Var.b && u890.j(this.c, gs7Var.c) && this.d.equals(gs7Var.d) && this.e.equals(gs7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
