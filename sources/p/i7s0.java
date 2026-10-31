package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7s0 implements j7s0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final e7s0 e;
    public final long f;
    public final e7s0 g;
    public final String h;
    public final String i;

    public i7s0(String str, String str2, String str3, String str4, e7s0 e7s0Var, long j, e7s0 e7s0Var2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = e7s0Var;
        this.f = j;
        this.g = e7s0Var2;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7s0)) {
            return false;
        }
        i7s0 i7s0Var = (i7s0) obj;
        return this.a.equals(i7s0Var.a) && this.b.equals(i7s0Var.b) && this.c.equals(i7s0Var.c) && u890.j(this.d, i7s0Var.d) && u890.j(this.e, i7s0Var.e) && this.f == i7s0Var.f && u890.j(this.g, i7s0Var.g) && this.h.equals(i7s0Var.h) && this.i.equals(i7s0Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        e7s0 e7s0Var = this.e;
        int iF = cy30.f((iHashCode + (e7s0Var == null ? 0 : e7s0Var.hashCode())) * 31, this.f, 31);
        e7s0 e7s0Var2 = this.g;
        return this.i.hashCode() + cy30.d((iF + (e7s0Var2 != null ? e7s0Var2.hashCode() : 0)) * 31, 31, this.h);
    }
}
