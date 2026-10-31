package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bsz0 implements dsz0 {
    public final boolean a;
    public final int b;
    public final double c;
    public final long d;
    public final boolean e;

    public bsz0(boolean z, int i, double d, long j, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = d;
        this.d = j;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsz0)) {
            return false;
        }
        bsz0 bsz0Var = (bsz0) obj;
        return this.a == bsz0Var.a && this.b == bsz0Var.b && Double.compare(this.c, bsz0Var.c) == 0 && this.d == bsz0Var.d && this.e == bsz0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(xcg1.e(this.c, kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31);
    }
}
