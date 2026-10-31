package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f5h0 implements h5h0 {
    public final String a;
    public final int b;
    public final c380 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final zs2 h;

    public f5h0(String str, int i, c380 c380Var, String str2, String str3, String str4, String str5, zs2 zs2Var) {
        this.a = str;
        this.b = i;
        this.c = c380Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = zs2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5h0)) {
            return false;
        }
        f5h0 f5h0Var = (f5h0) obj;
        return this.a.equals(f5h0Var.a) && this.b == f5h0Var.b && u890.j(this.c, f5h0Var.c) && this.d.equals(f5h0Var.d) && this.e.equals(f5h0Var.e) && u890.j(this.f, f5h0Var.f) && u890.j(this.g, f5h0Var.g) && u890.j(this.h, f5h0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kk0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zs2 zs2Var = this.h;
        return iHashCode2 + (zs2Var != null ? zs2Var.hashCode() : 0);
    }
}
