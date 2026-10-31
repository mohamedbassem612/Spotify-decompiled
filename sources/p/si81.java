package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class si81 {
    public final boolean a;
    public final boolean b;
    public final hi81 c;
    public final ii81 d;

    public si81(boolean z, boolean z2, hi81 hi81Var, ii81 ii81Var) {
        this.a = z;
        this.b = z2;
        this.c = hi81Var;
        this.d = ii81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si81)) {
            return false;
        }
        si81 si81Var = (si81) obj;
        return this.a == si81Var.a && this.b == si81Var.b && u890.j(this.c, si81Var.c) && u890.j(this.d, si81Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
