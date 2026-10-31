package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aok0 implements bok0 {
    public final ijf1 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public aok0(ijf1 ijf1Var, int i, boolean z, boolean z2, int i2) {
        this.a = ijf1Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aok0)) {
            return false;
        }
        aok0 aok0Var = (aok0) obj;
        return this.a == aok0Var.a && this.b == aok0Var.b && this.c == aok0Var.c && this.d == aok0Var.d && this.e == aok0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public /* synthetic */ aok0(ijf1 ijf1Var, int i, boolean z) {
        this(ijf1Var, i, z, false, 0);
    }
}
