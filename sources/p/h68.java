package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h68 extends kuo1 {
    public final ne2 b;
    public final boolean c;
    public final int d;

    public h68(ne2 ne2Var, boolean z, int i) {
        this.b = ne2Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h68)) {
            return false;
        }
        h68 h68Var = (h68) obj;
        return this.b.equals(h68Var.b) && this.c == h68Var.c && this.d == h68Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.b.hashCode() * 31, 31, this.c);
        int i = this.d;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
