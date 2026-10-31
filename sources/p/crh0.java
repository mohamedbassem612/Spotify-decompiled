package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class crh0 {
    public final p2i0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public crh0(p2i0 p2i0Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        dm5.m(!z4 || z2);
        dm5.m(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        dm5.m(z5);
        this.a = p2i0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final crh0 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new crh0(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final crh0 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new crh0(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || crh0.class != obj.getClass()) {
            return false;
        }
        crh0 crh0Var = (crh0) obj;
        return this.b == crh0Var.b && this.d == crh0Var.d && this.e == crh0Var.e && this.f == crh0Var.f && this.g == crh0Var.g && this.h == crh0Var.h && this.i == crh0Var.i && this.a.equals(crh0Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
