package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cbn0 {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public cbn0(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbn0)) {
            return false;
        }
        cbn0 cbn0Var = (cbn0) obj;
        return this.a == cbn0Var.a && this.b == cbn0Var.b && this.c == cbn0Var.c && this.d == cbn0Var.d && this.e == cbn0Var.e && this.f == cbn0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(cy30.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e);
    }
}
