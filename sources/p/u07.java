package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u07 extends o17 {
    public final g07 a;
    public final m5n1 b = new z5t0(j4b1.I2);

    public u07(g07 g07Var) {
        this.a = g07Var;
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.b;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u07) && this.a.equals(((u07) obj).a);
    }

    public final int hashCode() {
        return xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
