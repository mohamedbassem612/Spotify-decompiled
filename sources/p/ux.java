package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ux implements wx {
    public final int a;
    public final int b;

    public ux(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 1) {
            return;
        }
        hhg1.f(f4i1.c(i2, "tapCount must be at least 1, was "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return this.a == uxVar.a && this.b == uxVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
