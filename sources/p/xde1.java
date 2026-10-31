package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xde1 {
    public final int a;
    public final wde1 b;

    public xde1(int i, wde1 wde1Var) {
        this.a = i;
        this.b = wde1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xde1)) {
            return false;
        }
        xde1 xde1Var = (xde1) obj;
        return this.a == xde1Var.a && this.b.equals(xde1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
