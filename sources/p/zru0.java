package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zru0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final yvs0 f;

    public zru0(String str, String str2, String str3, String str4, boolean z, yvs0 yvs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = yvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zru0) {
            zru0 zru0Var = (zru0) obj;
            return u890.j(this.a, zru0Var.a) && u890.j(this.b, zru0Var.b) && u890.j(this.c, zru0Var.c) && u890.j(this.d, zru0Var.d) && this.e == zru0Var.e && this.f == zru0Var.f;
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }
}
