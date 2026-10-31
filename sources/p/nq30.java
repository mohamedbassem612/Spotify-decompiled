package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nq30 {
    public final wa71 a;
    public final jlw0 b;
    public final jlw0 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final s171 h;
    public final z771 i;
    public final ez61 j;

    static {
        zy61 zy61Var = ez61.c;
    }

    public nq30(wa71 wa71Var, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, s171 s171Var, z771 z771Var, ez61 ez61Var) {
        this.a = wa71Var;
        this.b = jlw0Var;
        this.c = jlw0Var2;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = s171Var;
        this.i = z771Var;
        this.j = ez61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq30)) {
            return false;
        }
        nq30 nq30Var = (nq30) obj;
        return u890.j(this.a, nq30Var.a) && u890.j(this.b, nq30Var.b) && u890.j(this.c, nq30Var.c) && this.d == nq30Var.d && this.e == nq30Var.e && u890.j(this.f, nq30Var.f) && u890.j(this.g, nq30Var.g) && u890.j(this.h, nq30Var.h) && u890.j(this.i, nq30Var.i) && u890.j(this.j, nq30Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jlw0 jlw0Var = this.b;
        return this.j.hashCode() + xvj1.j(this.i.a, (this.h.hashCode() + cy30.d(cy30.d(kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((iHashCode + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.f), 31, this.g)) * 31, 31);
    }
}
