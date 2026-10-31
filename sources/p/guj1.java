package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class guj1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final njv0 d;
    public final fiv0 e;
    public final iu30 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public guj1(boolean z, boolean z2, boolean z3, njv0 njv0Var, fiv0 fiv0Var, xaj1 xaj1Var, boolean z4, boolean z5, boolean z6, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        njv0Var = (i & 8) != 0 ? null : njv0Var;
        fiv0Var = (i & 16) != 0 ? null : fiv0Var;
        iu30 iu30Var = (i & 32) != 0 ? fsj1.d : xaj1Var;
        z4 = (i & 64) != 0 ? false : z4;
        z5 = (i & 128) != 0 ? false : z5;
        z6 = (i & 256) != 0 ? false : z6;
        boolean z7 = (i & 512) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = njv0Var;
        this.e = fiv0Var;
        this.f = iu30Var;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guj1)) {
            return false;
        }
        guj1 guj1Var = (guj1) obj;
        return this.a == guj1Var.a && this.b == guj1Var.b && this.c == guj1Var.c && u890.j(this.d, guj1Var.d) && u890.j(this.e, guj1Var.e) && this.f.equals(guj1Var.f) && this.g == guj1Var.g && this.h == guj1Var.h && this.i == guj1Var.i && this.j == guj1Var.j;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        njv0 njv0Var = this.d;
        int iHashCode = (iG + (njv0Var == null ? 0 : njv0Var.hashCode())) * 31;
        fiv0 fiv0Var = this.e;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(xcg1.g(ktd.g(this.f, (iHashCode + (fiv0Var != null ? fiv0Var.hashCode() : 0)) * 31, 31), 31, this.g), 31, this.h), 31, this.i);
    }
}
