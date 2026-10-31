package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zmp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final uja e;
    public final String f;
    public final String g;
    public final String h;

    public zmp0(String str, String str2, String str3, String str4, uja ujaVar, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ujaVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmp0)) {
            return false;
        }
        zmp0 zmp0Var = (zmp0) obj;
        return this.a.equals(zmp0Var.a) && this.b.equals(zmp0Var.b) && this.c.equals(zmp0Var.c) && this.d.equals(zmp0Var.d) && this.e.equals(zmp0Var.e) && u890.j(this.f, zmp0Var.f) && u890.j(this.g, zmp0Var.g) && u890.j(this.h, zmp0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
