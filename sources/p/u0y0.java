package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u0y0 implements v0y0 {
    public final k0y0 a;
    public final String b;
    public final String c;
    public final String d;

    public u0y0(k0y0 k0y0Var, String str, String str2, String str3) {
        this.a = k0y0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0y0)) {
            return false;
        }
        u0y0 u0y0Var = (u0y0) obj;
        return this.a.equals(u0y0Var.a) && u890.j(this.b, u0y0Var.b) && this.c.equals(u0y0Var.c) && u890.j(this.d, u0y0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
