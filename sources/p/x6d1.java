package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x6d1 {
    public final ji0 a;
    public final int b;
    public final boolean c;
    public final t7d1 d;

    public x6d1(ji0 ji0Var, int i, boolean z, t7d1 t7d1Var) {
        this.a = ji0Var;
        this.b = i;
        this.c = z;
        this.d = t7d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6d1)) {
            return false;
        }
        x6d1 x6d1Var = (x6d1) obj;
        return u890.j(this.a, x6d1Var.a) && this.b == x6d1Var.b && this.c == x6d1Var.c && u890.j(this.d, x6d1Var.d);
    }

    public final int hashCode() {
        ji0 ji0Var = this.a;
        int iG = xcg1.g(kaa0.f(this.b, (ji0Var == null ? 0 : ji0Var.hashCode()) * 31, 31), 31, this.c);
        t7d1 t7d1Var = this.d;
        return iG + (t7d1Var != null ? t7d1Var.hashCode() : 0);
    }
}
