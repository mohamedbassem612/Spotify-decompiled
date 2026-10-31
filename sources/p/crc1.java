package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class crc1 implements erc1 {
    public final String a;
    public final int b;
    public final String c;

    public crc1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crc1)) {
            return false;
        }
        crc1 crc1Var = (crc1) obj;
        return u890.j(this.a, crc1Var.a) && this.b == crc1Var.b && u890.j(this.c, crc1Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
