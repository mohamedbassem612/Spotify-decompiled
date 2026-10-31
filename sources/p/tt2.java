package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tt2 {
    public final String a;
    public final ot2 b;

    public tt2(String str, ot2 ot2Var) {
        this.a = str;
        this.b = ot2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2)) {
            return false;
        }
        tt2 tt2Var = (tt2) obj;
        return u890.j(this.a, tt2Var.a) && u890.j(this.b, tt2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ot2 ot2Var = this.b;
        return iHashCode + (ot2Var == null ? 0 : ot2Var.hashCode());
    }
}
