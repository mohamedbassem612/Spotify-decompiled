package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dh41 {
    public final String a;
    public final sg90 b;

    public dh41(String str, sg90 sg90Var) {
        this.a = str;
        this.b = sg90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh41)) {
            return false;
        }
        dh41 dh41Var = (dh41) obj;
        return u890.j(this.a, dh41Var.a) && u890.j(this.b, dh41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sg90 sg90Var = this.b;
        return iHashCode + (sg90Var == null ? 0 : sg90Var.hashCode());
    }
}
