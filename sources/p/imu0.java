package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class imu0 implements fg40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final n8y0 g;
    public final boolean h;
    public final nmu0 i;

    public imu0(String str, String str2, String str3, String str4, String str5, boolean z, n8y0 n8y0Var, boolean z2, nmu0 nmu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = n8y0Var;
        this.h = z2;
        this.i = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imu0)) {
            return false;
        }
        imu0 imu0Var = (imu0) obj;
        return u890.j(this.a, imu0Var.a) && u890.j(this.b, imu0Var.b) && u890.j(this.c, imu0Var.c) && u890.j(this.d, imu0Var.d) && u890.j(this.e, imu0Var.e) && this.f == imu0Var.f && this.g.equals(imu0Var.g) && this.h == imu0Var.h && this.i == imu0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iG = xcg1.g((this.g.hashCode() + xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f)) * 31, 31, this.h);
        nmu0 nmu0Var = this.i;
        return iG + (nmu0Var != null ? nmu0Var.hashCode() : 0);
    }
}
