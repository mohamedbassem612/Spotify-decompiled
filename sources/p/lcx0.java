package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lcx0 extends rcx0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public lcx0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcx0)) {
            return false;
        }
        lcx0 lcx0Var = (lcx0) obj;
        return u890.j(this.a, lcx0Var.a) && u890.j(this.b, lcx0Var.b) && this.c == lcx0Var.c && u890.j(this.d, lcx0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = ab80.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        return iK + (str3 != null ? str3.hashCode() : 0);
    }
}
