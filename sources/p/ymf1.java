package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ymf1 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ymf1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymf1)) {
            return false;
        }
        ymf1 ymf1Var = (ymf1) obj;
        return u890.j(this.a, ymf1Var.a) && u890.j(this.b, ymf1Var.b) && this.c.equals(ymf1Var.c) && this.d == ymf1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
