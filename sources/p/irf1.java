package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class irf1 extends mrf1 {
    public final String a;
    public final int b;
    public final String c;

    public irf1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irf1)) {
            return false;
        }
        irf1 irf1Var = (irf1) obj;
        return this.a.equals(irf1Var.a) && this.b == irf1Var.b && u890.j(this.c, irf1Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
