package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bd51 extends hd51 {
    public final String b;
    public final tv80 c;
    public final boolean d;
    public final boolean e;

    public bd51(String str, tv80 tv80Var, boolean z, boolean z2) {
        this.b = str;
        this.c = tv80Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd51)) {
            return false;
        }
        bd51 bd51Var = (bd51) obj;
        return u890.j(this.b, bd51Var.b) && u890.j(this.c, bd51Var.c) && this.d == bd51Var.d && this.e == bd51Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.d);
    }
}
