package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ilb0 {
    public final int a;
    public final int b;
    public final boolean c;

    public ilb0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilb0)) {
            return false;
        }
        ilb0 ilb0Var = (ilb0) obj;
        return this.a == ilb0Var.a && this.b == ilb0Var.b && this.c == ilb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return l1d.r(cy30.q(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c, ")");
    }
}
