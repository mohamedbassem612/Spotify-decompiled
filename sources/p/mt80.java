package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mt80 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public mt80(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt80)) {
            return false;
        }
        mt80 mt80Var = (mt80) obj;
        return u890.j(this.a, mt80Var.a) && u890.j(this.b, mt80Var.b) && u890.j(this.c, mt80Var.c) && u890.j(this.d, mt80Var.d) && this.e == mt80Var.e && u890.j(this.f, mt80Var.f) && this.g == mt80Var.g && this.h == mt80Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iF = kaa0.f(this.e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iF + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.g);
    }
}
