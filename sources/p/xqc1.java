package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xqc1 implements drc1 {
    public final hux a;
    public final int b;

    public xqc1(hux huxVar, int i) {
        this.a = huxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc1)) {
            return false;
        }
        xqc1 xqc1Var = (xqc1) obj;
        return u890.j(this.a, xqc1Var.a) && this.b == xqc1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
