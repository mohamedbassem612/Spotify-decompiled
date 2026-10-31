package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cwi1 extends nyo1 {
    public final String c;
    public final tv80 d;

    public cwi1(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwi1)) {
            return false;
        }
        cwi1 cwi1Var = (cwi1) obj;
        return u890.j(this.c, cwi1Var.c) && u890.j(this.d, cwi1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
    }
}
