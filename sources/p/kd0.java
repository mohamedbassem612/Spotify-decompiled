package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kd0 implements md0 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public kd0(long j, long j2, String str, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // p.md0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd0)) {
            return false;
        }
        kd0 kd0Var = (kd0) obj;
        return u890.j(this.a, kd0Var.a) && tve1.b(this.b, kd0Var.b) && tve1.b(this.c, kd0Var.c) && this.d == kd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
