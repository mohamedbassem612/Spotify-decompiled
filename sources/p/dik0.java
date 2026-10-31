package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dik0 {
    public final lhg1 a;
    public final Float b;

    public dik0(lhg1 lhg1Var, Float f) {
        this.a = lhg1Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dik0)) {
            return false;
        }
        dik0 dik0Var = (dik0) obj;
        return u890.j(this.a, dik0Var.a) && u890.j(this.b, dik0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
