package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class or7 {
    public final String a;
    public final String b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final u771 g;

    public or7(String str, String str2, jlw0 jlw0Var, int i, int i2, String str3, u771 u771Var) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = i;
        this.e = i2;
        this.f = str3;
        this.g = u771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or7)) {
            return false;
        }
        or7 or7Var = (or7) obj;
        return u890.j(this.a, or7Var.a) && u890.j(this.b, or7Var.b) && u890.j(this.c, or7Var.c) && this.d == or7Var.d && this.e == or7Var.e && u890.j(this.f, or7Var.f) && u890.j(this.g, or7Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31, this.f);
    }
}
