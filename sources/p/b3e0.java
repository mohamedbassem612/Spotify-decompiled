package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b3e0 {
    public static final double[] e = {0.01d, 0.02d, 0.05d, 0.1d, 0.2d, 0.5d};
    public static final double[] f = {0.5d, 1.0d, 1.5d, 2.0d, 4.0d, 8.0d};
    public static final double[] g = {0.05d, 0.15d, 0.3d, 0.5d, 0.75d, 1.0d};
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public b3e0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i < 0 || i >= 8) {
            hhg1.f(f4i1.c(i, "mainStall level out of range: "));
            throw null;
        }
        if (i2 < 0 || i2 >= 8) {
            hhg1.f(f4i1.c(i2, "coreStall level out of range: "));
            throw null;
        }
        if (i3 < 0 || i3 >= 8) {
            hhg1.f(f4i1.c(i3, "memoryHeadroom level out of range: "));
            throw null;
        }
        if (i4 < 0 || i4 >= 8) {
            hhg1.f(f4i1.c(i4, "ownCpu level out of range: "));
            throw null;
        }
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3e0)) {
            return false;
        }
        b3e0 b3e0Var = (b3e0) obj;
        return this.a == b3e0Var.a && this.b == b3e0Var.b && this.c == b3e0Var.c && this.d == b3e0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
