package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l07 extends o17 {
    public final g07 a;
    public final boolean b;
    public final z5t0 c = new z5t0(j4b1.f1);

    public l07(g07 g07Var, boolean z) {
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
        if (!(obj instanceof l07)) {
            return false;
        }
        l07 l07Var = (l07) obj;
        return u890.j(this.a, l07Var.a) && this.b == l07Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
