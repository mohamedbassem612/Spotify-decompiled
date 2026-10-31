package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ur80 {
    public static final ur80 e = new ur80(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ur80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean e() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur80)) {
            return false;
        }
        ur80 ur80Var = (ur80) obj;
        return this.a == ur80Var.a && this.b == ur80Var.b && this.c == ur80Var.c && this.d == ur80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = cy30.q(this.a, this.b, "IntRect.fromLTRB(", ", ", ", ");
        sbQ.append(this.c);
        sbQ.append(", ");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
