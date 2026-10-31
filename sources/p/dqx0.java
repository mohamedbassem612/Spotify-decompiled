package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dqx0 extends frx0 {
    public final String a;
    public final tv80 b;

    public dqx0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqx0)) {
            return false;
        }
        dqx0 dqx0Var = (dqx0) obj;
        return this.a.equals(dqx0Var.a) && u890.j(this.b, dqx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
