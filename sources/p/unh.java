package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class unh {
    public final lik1 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final njb0 e;

    public unh(lik1 lik1Var, String str, boolean z, boolean z2, njb0 njb0Var) {
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
        if (!(obj instanceof unh)) {
            return false;
        }
        unh unhVar = (unh) obj;
        return u890.j(this.a, unhVar.a) && u890.j(this.b, unhVar.b) && this.c == unhVar.c && this.d == unhVar.d && u890.j(this.e, unhVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        njb0 njb0Var = this.e;
        return iG + (njb0Var == null ? 0 : njb0Var.hashCode());
    }
}
