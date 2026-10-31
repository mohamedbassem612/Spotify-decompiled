package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hvx0 extends qvx0 {
    public final String a;
    public final tv80 b;

    public hvx0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvx0)) {
            return false;
        }
        hvx0 hvx0Var = (hvx0) obj;
        return this.a.equals(hvx0Var.a) && u890.j(this.b, hvx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
