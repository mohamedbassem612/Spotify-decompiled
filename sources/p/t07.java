package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t07 extends o17 {
    public final g07 a;
    public final boolean b;
    public final z5t0 c = new z5t0(j4b1.A5);

    public t07(g07 g07Var, boolean z) {
        this.a = g07Var;
        this.b = z;
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t07)) {
            return false;
        }
        t07 t07Var = (t07) obj;
        return u890.j(this.a, t07Var.a) && this.b == t07Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
