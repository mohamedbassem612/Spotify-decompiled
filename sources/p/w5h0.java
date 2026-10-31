package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final zs2 i;

    public w5h0(String str, String str2, String str3, c380 c380Var, String str4, String str5, String str6, String str7, zs2 zs2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = zs2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5h0)) {
            return false;
        }
        w5h0 w5h0Var = (w5h0) obj;
        return this.a.equals(w5h0Var.a) && this.b.equals(w5h0Var.b) && this.c.equals(w5h0Var.c) && u890.j(this.d, w5h0Var.d) && this.e.equals(w5h0Var.e) && this.f.equals(w5h0Var.f) && u890.j(this.g, w5h0Var.g) && u890.j(this.h, w5h0Var.h) && u890.j(this.i, w5h0Var.i);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kk0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zs2 zs2Var = this.i;
        return iHashCode2 + (zs2Var != null ? zs2Var.hashCode() : 0);
    }
}
