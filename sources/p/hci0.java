package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hci0 {
    public final xei0 a;
    public final hei0 b;

    public hci0(xei0 xei0Var, hei0 hei0Var) {
        this.a = xei0Var;
        this.b = hei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hci0)) {
            return false;
        }
        hci0 hci0Var = (hci0) obj;
        return this.a.equals(hci0Var.a) && u890.j(this.b, hci0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hei0 hei0Var = this.b;
        return iHashCode + (hei0Var == null ? 0 : hei0Var.hashCode());
    }
}
