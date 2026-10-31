package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class czi0 {
    public final zdz0 a;
    public final int b;

    public czi0(zdz0 zdz0Var, int i) {
        this.a = zdz0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czi0)) {
            return false;
        }
        czi0 czi0Var = (czi0) obj;
        return u890.j(this.a, czi0Var.a) && this.b == czi0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
