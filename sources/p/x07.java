package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x07 extends o17 {
    public final g07 a;
    public final boolean b;

    public x07(g07 g07Var, boolean z) {
        this.a = g07Var;
        this.b = z;
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return null;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x07)) {
            return false;
        }
        x07 x07Var = (x07) obj;
        return u890.j(this.a, x07Var.a) && this.b == x07Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
