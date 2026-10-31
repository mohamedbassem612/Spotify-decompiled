package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gkf1 {
    public final ikf1 a;
    public final hkf1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gkf1(ikf1 ikf1Var, hkf1 hkf1Var, boolean z, boolean z2, boolean z3) {
        this.a = ikf1Var;
        this.b = hkf1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkf1)) {
            return false;
        }
        gkf1 gkf1Var = (gkf1) obj;
        return this.a.equals(gkf1Var.a) && this.b.equals(gkf1Var.b) && this.c == gkf1Var.c && this.d == gkf1Var.d && this.e == gkf1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
