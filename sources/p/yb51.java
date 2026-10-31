package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yb51 {
    public final ec51 a;
    public final zb51 b;
    public final boolean c;

    public /* synthetic */ yb51(ec51 ec51Var, zb51 zb51Var, int i) {
        this(ec51Var, (i & 2) != 0 ? null : zb51Var, false);
    }

    public static yb51 a(yb51 yb51Var, ec51 ec51Var) {
        return new yb51(ec51Var, yb51Var.b, yb51Var.c);
    }

    public final boolean b() {
        return this.c;
    }

    public final zb51 c() {
        return this.b;
    }

    public final ec51 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb51)) {
            return false;
        }
        yb51 yb51Var = (yb51) obj;
        return u890.j(this.a, yb51Var.a) && u890.j(this.b, yb51Var.b) && this.c == yb51Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zb51 zb51Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (zb51Var == null ? 0 : zb51Var.hashCode())) * 31);
    }

    public yb51(ec51 ec51Var, zb51 zb51Var, boolean z) {
        this.a = ec51Var;
        this.b = zb51Var;
        this.c = z;
    }
}
