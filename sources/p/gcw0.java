package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gcw0 implements pcw0 {
    public final lsm0 a;
    public final tv80 b;

    public gcw0(lsm0 lsm0Var, tv80 tv80Var) {
        this.a = lsm0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcw0)) {
            return false;
        }
        gcw0 gcw0Var = (gcw0) obj;
        return u890.j(this.a, gcw0Var.a) && u890.j(this.b, gcw0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
