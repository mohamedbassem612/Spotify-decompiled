package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cm51 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public cm51(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public static cm51 a(cm51 cm51Var, int i) {
        return new cm51(cm51Var.a, cm51Var.b, i, cm51Var.d);
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final long d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm51)) {
            return false;
        }
        cm51 cm51Var = (cm51) obj;
        return this.a == cm51Var.a && this.b == cm51Var.b && this.c == cm51Var.c && this.d == cm51Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31);
    }
}
