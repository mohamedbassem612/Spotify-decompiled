package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zl3 extends pxd0 {
    public final ul3 l;

    public zl3(ul3 ul3Var) {
        this.l = ul3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl3) && u890.j(this.l, ((zl3) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.l + ")";
    }

    public final int w(q5t0 q5t0Var) {
        return q5t0Var.U(this.l);
    }
}
