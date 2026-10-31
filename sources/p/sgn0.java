package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sgn0 {
    public final boolean a;
    public final tv80 b;

    public sgn0(tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgn0)) {
            return false;
        }
        sgn0 sgn0Var = (sgn0) obj;
        return this.a == sgn0Var.a && u890.j(this.b, sgn0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public /* synthetic */ sgn0() {
        this(null, true);
    }
}
