package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sdf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final fef1 f;
    public final String g;

    public sdf1(String str, String str2, String str3, String str4, long j, fef1 fef1Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = fef1Var;
        this.g = str5;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdf1)) {
            return false;
        }
        sdf1 sdf1Var = (sdf1) obj;
        return this.a.equals(sdf1Var.a) && this.b.equals(sdf1Var.b) && u890.j(this.c, sdf1Var.c) && this.d.equals(sdf1Var.d) && this.e == sdf1Var.e && u890.j(this.f, sdf1Var.f) && u890.j(this.g, sdf1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.f.hashCode() + cy30.f(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), this.e, 31)) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
