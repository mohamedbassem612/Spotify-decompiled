package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cak0 {
    public final ijf1 a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final loi0 g;
    public final pik0 h;

    public cak0(ijf1 ijf1Var, String str, int i, int i2, boolean z, boolean z2, loi0 loi0Var, pik0 pik0Var) {
        this.a = ijf1Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = loi0Var;
        this.h = pik0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cak0) {
            cak0 cak0Var = (cak0) obj;
            return this.a == cak0Var.a && u890.j(this.b, cak0Var.b) && this.c == cak0Var.c && this.d == cak0Var.d && this.e == cak0Var.e && this.f == cak0Var.f && this.g == cak0Var.g && this.h == cak0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f)) * 31);
    }
}
