package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dm51 {
    public final long a;
    public final long b;
    public final int c;

    public dm51(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm51)) {
            return false;
        }
        dm51 dm51Var = (dm51) obj;
        return this.a == dm51Var.a && this.b == dm51Var.b && this.c == dm51Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
