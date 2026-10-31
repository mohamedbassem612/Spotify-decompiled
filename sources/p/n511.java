package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n511 {
    public static final n511 e = new n511(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public n511(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static n511 b(n511 n511Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = n511Var.a;
        }
        if ((i & 2) != 0) {
            f2 = n511Var.b;
        }
        if ((i & 4) != 0) {
            f3 = n511Var.c;
        }
        float f4 = (i & 8) != 0 ? n511Var.d : Float.POSITIVE_INFINITY;
        n511Var.getClass();
        return new n511(f, f2, f3, f4);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(c13.d(f, f2, 2.0f, f2))) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n511)) {
            return false;
        }
        n511 n511Var = (n511) obj;
        return Float.compare(this.a, n511Var.a) == 0 && Float.compare(this.b, n511Var.b) == 0 && Float.compare(this.c, n511Var.c) == 0 && Float.compare(this.d, n511Var.d) == 0;
    }

    public final long f() {
        float f = this.c;
        float f2 = this.a;
        float fD = c13.d(f, f2, 2.0f, f2);
        float f3 = this.b;
        float fD2 = c13.d(this.d, f3, 2.0f, f3);
        return (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L);
    }

    public final long g() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long h() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final n511 i(float f) {
        return new n511(this.a - f, this.b - f, this.c + f, this.d + f);
    }

    public final n511 j(n511 n511Var) {
        return new n511(Math.max(this.a, n511Var.a), Math.max(this.b, n511Var.b), Math.min(this.c, n511Var.c), Math.min(this.d, n511Var.d));
    }

    public final boolean k() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean l(n511 n511Var) {
        return (this.a < n511Var.c) & (n511Var.a < this.c) & (this.b < n511Var.d) & (n511Var.b < this.d);
    }

    public final n511 m(float f, float f2) {
        return new n511(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final n511 n(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new n511(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strZ = yah0.z(this.a);
        String strZ2 = yah0.z(this.b);
        return rjx.o(gvg.n("Rect.fromLTRB(", strZ, ", ", strZ2, ", "), yah0.z(this.c), ", ", yah0.z(this.d), ")");
    }
}
