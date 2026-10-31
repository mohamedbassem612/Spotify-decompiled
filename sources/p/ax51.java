package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ax51 {
    public final yw51 a;
    public final yw51 b;
    public final boolean c;

    public ax51(yw51 yw51Var, yw51 yw51Var2, boolean z) {
        this.a = yw51Var;
        this.b = yw51Var2;
        this.c = z;
    }

    public static ax51 a(ax51 ax51Var, yw51 yw51Var, yw51 yw51Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            yw51Var = ax51Var.a;
        }
        if ((i & 2) != 0) {
            yw51Var2 = ax51Var.b;
        }
        ax51Var.getClass();
        return new ax51(yw51Var, yw51Var2, z);
    }

    public final long b() {
        return e6p1.e(this.a.b, this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax51)) {
            return false;
        }
        ax51 ax51Var = (ax51) obj;
        return u890.j(this.a, ax51Var.a) && u890.j(this.b, ax51Var.b) && this.c == ax51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return l1d.r(sb, this.c, ")");
    }
}
