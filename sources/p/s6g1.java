package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6g1 {
    public final boolean a;
    public final ktl b;
    public final boolean c;
    public final jo70 d;
    public final jo70 e;
    public final boolean f;
    public final String g;

    public s6g1(boolean z, ktl ktlVar, boolean z2, jo70 jo70Var, jo70 jo70Var2, boolean z3, String str) {
        this.a = z;
        this.b = ktlVar;
        this.c = z2;
        this.d = jo70Var;
        this.e = jo70Var2;
        this.f = z3;
        this.g = str;
    }

    public final ktl a() {
        return this.b;
    }

    public final jo70 b() {
        return this.d;
    }

    public final boolean c() {
        return this.f;
    }

    public final jo70 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6g1)) {
            return false;
        }
        s6g1 s6g1Var = (s6g1) obj;
        return this.a == s6g1Var.a && this.b == s6g1Var.b && this.c == s6g1Var.c && u890.j(this.d, s6g1Var.d) && u890.j(this.e, s6g1Var.e) && this.f == s6g1Var.f && u890.j(this.g, s6g1Var.g);
    }

    public final String f() {
        return this.g;
    }

    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        jo70 jo70Var = this.d;
        int iHashCode = (iG + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        jo70 jo70Var2 = this.e;
        int iG2 = xcg1.g((iHashCode + (jo70Var2 == null ? 0 : jo70Var2.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return iG2 + (str != null ? str.hashCode() : 0);
    }
}
