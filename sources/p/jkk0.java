package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jkk0 {
    public final boolean A;
    public final rx30 B;
    public final m7f0 C;
    public final boolean D;
    public final vaa0 E;
    public final int F;
    public final boolean a;
    public final fkc1 b;
    public final b8w0 c;
    public final duk1 d;
    public final jez e;
    public final ha20 f;
    public final boolean g;
    public final boolean h;
    public final s69 i;
    public final s69 j;
    public final duk1 k;
    public final boolean l;
    public final boolean m;
    public final gez n;
    public final gez o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jez f6p;
    public final boolean q;
    public final boolean r;
    public final r920 s;
    public final r920 t;
    public final ha20 u;
    public final boolean v;
    public final boolean w;
    public final ox30 x;
    public final ox30 y;
    public final rx30 z;

    public jkk0(boolean z, fkc1 fkc1Var, b8w0 b8w0Var, duk1 duk1Var, jez jezVar, ha20 ha20Var, boolean z2, boolean z3, s69 s69Var, s69 s69Var2, duk1 duk1Var2, boolean z4, boolean z5, gez gezVar, gez gezVar2, jez jezVar2, boolean z6, boolean z7, r920 r920Var, r920 r920Var2, ha20 ha20Var2, boolean z8, boolean z9, ox30 ox30Var, ox30 ox30Var2, rx30 rx30Var, boolean z10, rx30 rx30Var2, m7f0 m7f0Var, boolean z11, vaa0 vaa0Var, int i) {
        this.a = z;
        this.b = fkc1Var;
        this.c = b8w0Var;
        this.d = duk1Var;
        this.e = jezVar;
        this.f = ha20Var;
        this.g = z2;
        this.h = z3;
        this.i = s69Var;
        this.j = s69Var2;
        this.k = duk1Var2;
        this.l = z4;
        this.m = z5;
        this.n = gezVar;
        this.o = gezVar2;
        this.f6p = jezVar2;
        this.q = z6;
        this.r = z7;
        this.s = r920Var;
        this.t = r920Var2;
        this.u = ha20Var2;
        this.v = z8;
        this.w = z9;
        this.x = ox30Var;
        this.y = ox30Var2;
        this.z = rx30Var;
        this.A = z10;
        this.B = rx30Var2;
        this.C = m7f0Var;
        this.D = z11;
        this.E = vaa0Var;
        this.F = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkk0)) {
            return false;
        }
        jkk0 jkk0Var = (jkk0) obj;
        return this.a == jkk0Var.a && this.b == jkk0Var.b && this.c == jkk0Var.c && this.d == jkk0Var.d && this.e == jkk0Var.e && this.f == jkk0Var.f && this.g == jkk0Var.g && this.h == jkk0Var.h && u890.j(this.i, jkk0Var.i) && u890.j(this.j, jkk0Var.j) && this.k == jkk0Var.k && this.l == jkk0Var.l && this.m == jkk0Var.m && u890.j(this.n, jkk0Var.n) && u890.j(this.o, jkk0Var.o) && this.f6p == jkk0Var.f6p && this.q == jkk0Var.q && this.r == jkk0Var.r && u890.j(this.s, jkk0Var.s) && u890.j(this.t, jkk0Var.t) && this.u == jkk0Var.u && this.v == jkk0Var.v && this.w == jkk0Var.w && u890.j(this.x, jkk0Var.x) && u890.j(this.y, jkk0Var.y) && this.z == jkk0Var.z && this.A == jkk0Var.A && this.B == jkk0Var.B && this.C == jkk0Var.C && this.D == jkk0Var.D && this.E == jkk0Var.E && this.F == jkk0Var.F;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        duk1 duk1Var = this.d;
        int iHashCode2 = (iHashCode + (duk1Var == null ? 0 : duk1Var.hashCode())) * 31;
        jez jezVar = this.e;
        int iHashCode3 = (iHashCode2 + (jezVar == null ? 0 : jezVar.hashCode())) * 31;
        ha20 ha20Var = this.f;
        int iG = xcg1.g(xcg1.g((iHashCode3 + (ha20Var == null ? 0 : ha20Var.hashCode())) * 31, 31, this.g), 31, this.h);
        s69 s69Var = this.i;
        int iHashCode4 = (iG + (s69Var == null ? 0 : s69Var.hashCode())) * 31;
        s69 s69Var2 = this.j;
        int iHashCode5 = (iHashCode4 + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        duk1 duk1Var2 = this.k;
        int iG2 = xcg1.g(xcg1.g((iHashCode5 + (duk1Var2 == null ? 0 : duk1Var2.hashCode())) * 31, 31, this.l), 31, this.m);
        gez gezVar = this.n;
        int iHashCode6 = (iG2 + (gezVar == null ? 0 : gezVar.hashCode())) * 31;
        gez gezVar2 = this.o;
        int iHashCode7 = (iHashCode6 + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31;
        jez jezVar2 = this.f6p;
        int iG3 = xcg1.g(xcg1.g((iHashCode7 + (jezVar2 == null ? 0 : jezVar2.hashCode())) * 31, 31, this.q), 31, this.r);
        r920 r920Var = this.s;
        int iHashCode8 = (iG3 + (r920Var == null ? 0 : r920Var.hashCode())) * 31;
        r920 r920Var2 = this.t;
        int iHashCode9 = (iHashCode8 + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31;
        ha20 ha20Var2 = this.u;
        int iG4 = xcg1.g(xcg1.g((iHashCode9 + (ha20Var2 == null ? 0 : ha20Var2.hashCode())) * 31, 31, this.v), 31, this.w);
        ox30 ox30Var = this.x;
        int iHashCode10 = (iG4 + (ox30Var == null ? 0 : ox30Var.hashCode())) * 31;
        ox30 ox30Var2 = this.y;
        int iHashCode11 = (iHashCode10 + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31;
        rx30 rx30Var = this.z;
        int iG5 = xcg1.g((iHashCode11 + (rx30Var == null ? 0 : rx30Var.hashCode())) * 31, 31, this.A);
        rx30 rx30Var2 = this.B;
        int iHashCode12 = (iG5 + (rx30Var2 == null ? 0 : rx30Var2.hashCode())) * 31;
        m7f0 m7f0Var = this.C;
        int iG6 = xcg1.g((iHashCode12 + (m7f0Var == null ? 0 : m7f0Var.hashCode())) * 31, 31, this.D);
        vaa0 vaa0Var = this.E;
        return Integer.hashCode(this.F) + ((iG6 + (vaa0Var != null ? vaa0Var.hashCode() : 0)) * 31);
    }
}
