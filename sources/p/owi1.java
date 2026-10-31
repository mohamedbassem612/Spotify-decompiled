package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class owi1 extends vwi1 {
    public final String a;
    public final tv80 b;

    public owi1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owi1)) {
            return false;
        }
        owi1 owi1Var = (owi1) obj;
        return u890.j(this.a, owi1Var.a) && u890.j(this.b, owi1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
