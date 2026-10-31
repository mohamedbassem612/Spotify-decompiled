package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class odg0 {
    public final String a;
    public final v7g0 b;
    public final heg0 c;

    public odg0(String str, v7g0 v7g0Var, heg0 heg0Var) {
        this.a = str;
        this.b = v7g0Var;
        this.c = heg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odg0)) {
            return false;
        }
        odg0 odg0Var = (odg0) obj;
        return this.a.equals(odg0Var.a) && u890.j(this.b, odg0Var.b) && u890.j(this.c, odg0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v7g0 v7g0Var = this.b;
        int iC = (iHashCode + (v7g0Var == null ? 0 : l1d.C(v7g0Var.a))) * 31;
        heg0 heg0Var = this.c;
        return iC + (heg0Var != null ? heg0Var.hashCode() : 0);
    }
}
