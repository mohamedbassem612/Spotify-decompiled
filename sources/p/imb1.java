package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class imb1 implements qnb1 {
    public final boolean a;
    public final boolean b;
    public final u2h c;
    public final boolean d;
    public final boolean e;

    public imb1(boolean z, boolean z2, u2h u2hVar, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = u2hVar;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imb1)) {
            return false;
        }
        imb1 imb1Var = (imb1) obj;
        return this.a == imb1Var.a && this.b == imb1Var.b && this.c.equals(imb1Var.c) && this.d == imb1Var.d && this.e == imb1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
