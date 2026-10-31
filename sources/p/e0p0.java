package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e0p0 extends g0p0 {
    public final boolean a;
    public final int b;
    public final int c;

    public e0p0(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0p0)) {
            return false;
        }
        e0p0 e0p0Var = (e0p0) obj;
        return this.a == e0p0Var.a && this.b == e0p0Var.b && this.c == e0p0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
