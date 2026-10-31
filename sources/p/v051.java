package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v051 extends q151 {
    public final q1o1 a;
    public final tv80 b;
    public final long c;

    public v051(q1o1 q1o1Var, tv80 tv80Var, long j) {
        this.a = q1o1Var;
        this.b = tv80Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v051)) {
            return false;
        }
        v051 v051Var = (v051) obj;
        return this.a.equals(v051Var.a) && u890.j(this.b, v051Var.b) && this.c == v051Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return Long.hashCode(this.c) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
