package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vcj0 {
    public final w4i1 a;
    public final int b;

    public vcj0(int i, w4i1 w4i1Var) {
        this.a = w4i1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcj0)) {
            return false;
        }
        vcj0 vcj0Var = (vcj0) obj;
        return this.a.equals(vcj0Var.a) && this.b == vcj0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
