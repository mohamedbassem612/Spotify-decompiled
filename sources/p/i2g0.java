package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i2g0 implements b2g0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public i2g0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2g0)) {
            return false;
        }
        i2g0 i2g0Var = (i2g0) obj;
        return this.a == i2g0Var.a && this.b == i2g0Var.b && this.c == i2g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
