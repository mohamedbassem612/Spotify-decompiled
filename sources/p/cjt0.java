package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cjt0 extends ljt0 {
    public final long a;
    public final tv80 b;

    public cjt0(long j, tv80 tv80Var) {
        this.a = j;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjt0)) {
            return false;
        }
        cjt0 cjt0Var = (cjt0) obj;
        return this.a == cjt0Var.a && u890.j(this.b, cjt0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
