package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bak0 {
    public final ijf1 a;
    public final int b;
    public final boolean c;
    public final ssj0 d;

    public bak0(ijf1 ijf1Var, int i, boolean z, ssj0 ssj0Var) {
        this.a = ijf1Var;
        this.b = i;
        this.c = z;
        this.d = ssj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bak0)) {
            return false;
        }
        bak0 bak0Var = (bak0) obj;
        return this.a == bak0Var.a && this.b == bak0Var.b && this.c == bak0Var.c && this.d == bak0Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        ssj0 ssj0Var = this.d;
        return iG + (ssj0Var == null ? 0 : ssj0Var.hashCode());
    }
}
