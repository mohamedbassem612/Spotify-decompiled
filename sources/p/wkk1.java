package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wkk1 {
    public static final long f;
    public static final long g;
    public static final long h;
    public static final wkk1 i;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        vex vexVar = (vex) zscVar.b;
        long j = vexVar.c;
        f = j;
        long j2 = ((yex) zscVar.d).c;
        g = j2;
        long j3 = vexVar.b;
        h = j3;
        i = new wkk1(null, null, z4p1.G(j2), z4p1.G(j), z4p1.G(j3));
    }

    public wkk1(String str, String str2, int i2, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkk1)) {
            return false;
        }
        wkk1 wkk1Var = (wkk1) obj;
        return u890.j(this.a, wkk1Var.a) && u890.j(this.b, wkk1Var.b) && this.c == wkk1Var.c && this.d == wkk1Var.d && this.e == wkk1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Integer.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }
}
