package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vnh {
    public final lik1 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final njb0 e;

    public vnh(lik1 lik1Var, String str, boolean z, boolean z2, njb0 njb0Var) {
        this.a = lik1Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = njb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnh)) {
            return false;
        }
        vnh vnhVar = (vnh) obj;
        return u890.j(this.a, vnhVar.a) && u890.j(this.b, vnhVar.b) && this.c == vnhVar.c && this.d == vnhVar.d && u890.j(this.e, vnhVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        njb0 njb0Var = this.e;
        return (iG + (njb0Var == null ? 0 : njb0Var.hashCode())) * 31;
    }
}
