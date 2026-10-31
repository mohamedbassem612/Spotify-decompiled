package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wlc1 {
    public final hux a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public wlc1(hux huxVar, String str, String str2, boolean z, String str3) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlc1)) {
            return false;
        }
        wlc1 wlc1Var = (wlc1) obj;
        return u890.j(this.a, wlc1Var.a) && this.b.equals(wlc1Var.b) && u890.j(this.c, wlc1Var.c) && this.d == wlc1Var.d && u890.j(this.e, wlc1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
