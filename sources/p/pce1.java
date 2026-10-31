package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pce1 {
    public final String a;
    public final boolean b;
    public final String c;

    public pce1(int i, String str, String str2, boolean z) {
        z = (i & 2) != 0 ? false : z;
        str2 = (i & 4) != 0 ? null : str2;
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pce1)) {
            return false;
        }
        pce1 pce1Var = (pce1) obj;
        return this.a.equals(pce1Var.a) && this.b == pce1Var.b && u890.j(this.c, pce1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
