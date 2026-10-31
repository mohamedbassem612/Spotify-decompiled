package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g7s0 implements j7s0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final e7s0 e;
    public final long f;

    public g7s0(String str, String str2, String str3, String str4, e7s0 e7s0Var, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = e7s0Var;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7s0)) {
            return false;
        }
        g7s0 g7s0Var = (g7s0) obj;
        return this.a.equals(g7s0Var.a) && this.b.equals(g7s0Var.b) && this.c.equals(g7s0Var.c) && u890.j(this.d, g7s0Var.d) && u890.j(this.e, g7s0Var.e) && this.f == g7s0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        e7s0 e7s0Var = this.e;
        return Long.hashCode(this.f) + ((iHashCode + (e7s0Var != null ? e7s0Var.hashCode() : 0)) * 31);
    }
}
