package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n060 {
    public final String a;
    public final String b;
    public final rz50 c;
    public final String d;
    public final v17 e;

    public n060(String str, String str2, rz50 rz50Var, String str3, v17 v17Var) {
        this.a = str;
        this.b = str2;
        this.c = rz50Var;
        this.d = str3;
        this.e = v17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n060)) {
            return false;
        }
        n060 n060Var = (n060) obj;
        return u890.j(this.a, n060Var.a) && this.b.equals(n060Var.b) && u890.j(this.c, n060Var.c) && u890.j(this.d, n060Var.d) && u890.j(this.e, n060Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        rz50 rz50Var = this.c;
        int iHashCode = (iD + (rz50Var == null ? 0 : rz50Var.hashCode())) * 31;
        String str = this.d;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.e != null ? Integer.hashCode(2131952446) : 0);
    }
}
