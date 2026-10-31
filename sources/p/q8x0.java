package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q8x0 extends w361 {
    public final String c;
    public final tv80 d;

    public q8x0(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8x0)) {
            return false;
        }
        q8x0 q8x0Var = (q8x0) obj;
        return this.c.equals(q8x0Var.c) && u890.j(this.d, q8x0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
