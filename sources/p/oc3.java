package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oc3 {
    public final ed3 a;
    public final hpe0 b;

    public oc3(ed3 ed3Var, hpe0 hpe0Var) {
        this.a = ed3Var;
        this.b = hpe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3)) {
            return false;
        }
        oc3 oc3Var = (oc3) obj;
        return u890.j(this.a, oc3Var.a) && u890.j(this.b, oc3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hpe0 hpe0Var = this.b;
        return iHashCode + (hpe0Var == null ? 0 : hpe0Var.hashCode());
    }
}
