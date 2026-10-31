package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ll10 {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final float d;
    public final int e;
    public final long f;

    public ll10(float f, float f2, int i, long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.f = j;
    }

    public static ll10 a(ll10 ll10Var, boolean z, boolean z2, float f, float f2, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            z = ll10Var.a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = ll10Var.b;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            f = ll10Var.c;
        }
        float f3 = f;
        if ((i2 & 8) != 0) {
            f2 = ll10Var.d;
        }
        float f4 = f2;
        if ((i2 & 16) != 0) {
            i = ll10Var.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            j = ll10Var.f;
        }
        ll10Var.getClass();
        return new ll10(f3, f4, i3, j, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll10)) {
            return false;
        }
        ll10 ll10Var = (ll10) obj;
        return this.a == ll10Var.a && this.b == ll10Var.b && Float.compare(this.c, ll10Var.c) == 0 && Float.compare(this.d, ll10Var.d) == 0 && this.e == ll10Var.e && this.f == ll10Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + kaa0.f(this.e, x0d.f(x0d.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
