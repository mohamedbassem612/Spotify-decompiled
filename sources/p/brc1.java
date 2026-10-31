package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class brc1 implements drc1 {
    public final String a;
    public final int b;
    public final String c;

    public brc1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brc1)) {
            return false;
        }
        brc1 brc1Var = (brc1) obj;
        return u890.j(this.a, brc1Var.a) && this.b == brc1Var.b && u890.j(this.c, brc1Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
