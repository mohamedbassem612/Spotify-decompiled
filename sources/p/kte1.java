package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kte1 {
    public final String a;
    public final uqe1 b;

    public kte1(String str, uqe1 uqe1Var) {
        this.a = str;
        this.b = uqe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kte1)) {
            return false;
        }
        kte1 kte1Var = (kte1) obj;
        return u890.j(this.a, kte1Var.a) && u890.j(this.b, kte1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uqe1 uqe1Var = this.b;
        return iHashCode + (uqe1Var == null ? 0 : uqe1Var.hashCode());
    }
}
