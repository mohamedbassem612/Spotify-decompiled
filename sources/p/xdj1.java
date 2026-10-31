package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xdj1 {
    public final String a;
    public final int b;

    public xdj1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdj1)) {
            return false;
        }
        xdj1 xdj1Var = (xdj1) obj;
        return this.a.equals(xdj1Var.a) && this.b == xdj1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
