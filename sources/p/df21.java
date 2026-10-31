package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class df21 implements ni20 {
    public final int a;
    public final pxg1 b;
    public final int c;
    public final long d;

    public df21(int i, pxg1 pxg1Var, int i2, long j) {
        this.a = i;
        this.b = pxg1Var;
        this.c = i2;
        this.d = j;
    }

    public final fui1 a(tzg1 tzg1Var) {
        return new bq51(this.a, this.b.a(tzg1Var), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof df21)) {
            return false;
        }
        df21 df21Var = (df21) obj;
        return df21Var.a == this.a && df21Var.b.equals(this.b) && df21Var.c == this.c && f0o1.h(df21Var.d, this.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ab80.k(this.c, (this.b.hashCode() + (this.a * 31)) * 31, 31);
    }
}
