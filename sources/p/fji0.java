package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fji0 {
    public final x4i1 a;
    public final int b;
    public final boolean c;
    public final int d;
    public final cji0 e;
    public final wls0 f;

    public fji0(x4i1 x4i1Var, int i, boolean z, int i2, cji0 cji0Var, wls0 wls0Var) {
        this.a = x4i1Var;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = cji0Var;
        this.f = wls0Var;
    }

    public final x4i1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fji0)) {
            return false;
        }
        fji0 fji0Var = (fji0) obj;
        return this.a.equals(fji0Var.a) && this.b == fji0Var.b && this.c == fji0Var.c && this.d == fji0Var.d && this.e == fji0Var.e && this.f == fji0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + kaa0.f(this.d, xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31);
    }
}
