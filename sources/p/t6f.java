package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t6f {
    public final t7q0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final c380 g;
    public final boolean h;
    public final String i;
    public final String j;
    public final bc71 k;

    public t6f(t7q0 t7q0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, c380 c380Var, boolean z5, String str, String str2, bc71 bc71Var) {
        this.a = t7q0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = c380Var;
        this.h = z5;
        this.i = str;
        this.j = str2;
        this.k = bc71Var;
    }

    public static t6f a(t6f t6fVar, t7q0 t7q0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, c380 c380Var, boolean z5, String str, String str2, bc71 bc71Var, int i2) {
        if ((i2 & 1) != 0) {
            t7q0Var = t6fVar.a;
        }
        t7q0 t7q0Var2 = t7q0Var;
        if ((i2 & 2) != 0) {
            z = t6fVar.b;
        }
        boolean z6 = z;
        if ((i2 & 4) != 0) {
            z2 = t6fVar.c;
        }
        return new t6f(t7q0Var2, z6, z2, (i2 & 8) != 0 ? t6fVar.d : z3, (i2 & 16) != 0 ? t6fVar.e : z4, (i2 & 32) != 0 ? t6fVar.f : i, (i2 & 64) != 0 ? t6fVar.g : c380Var, (i2 & 128) != 0 ? t6fVar.h : z5, (i2 & 256) != 0 ? t6fVar.i : str, (i2 & 512) != 0 ? t6fVar.j : str2, (i2 & 1024) != 0 ? t6fVar.k : bc71Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6f)) {
            return false;
        }
        t6f t6fVar = (t6f) obj;
        return u890.j(this.a, t6fVar.a) && this.b == t6fVar.b && this.c == t6fVar.c && this.d == t6fVar.d && this.e == t6fVar.e && this.f == t6fVar.f && u890.j(this.g, t6fVar.g) && this.h == t6fVar.h && u890.j(this.i, t6fVar.i) && u890.j(this.j, t6fVar.j) && u890.j(this.k, t6fVar.k);
    }

    public final int hashCode() {
        t7q0 t7q0Var = this.a;
        int iG = xcg1.g(kk0.f(this.g, ab80.k(this.f, xcg1.g(xcg1.g(xcg1.g(xcg1.g((t7q0Var == null ? 0 : t7q0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bc71 bc71Var = this.k;
        return iHashCode2 + (bc71Var != null ? bc71Var.hashCode() : 0);
    }
}
