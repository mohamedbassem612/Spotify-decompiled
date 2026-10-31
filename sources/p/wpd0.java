package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wpd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final xpd0 e;
    public final nqd0 f;
    public final String g;

    public wpd0(String str, String str2, String str3, String str4, xpd0 xpd0Var, nqd0 nqd0Var, String str5, int i) {
        xpd0Var = (i & 16) != 0 ? null : xpd0Var;
        nqd0Var = (i & 32) != 0 ? null : nqd0Var;
        str5 = (i & 64) != 0 ? null : str5;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xpd0Var;
        this.f = nqd0Var;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpd0)) {
            return false;
        }
        wpd0 wpd0Var = (wpd0) obj;
        return this.a.equals(wpd0Var.a) && this.b.equals(wpd0Var.b) && this.c.equals(wpd0Var.c) && this.d.equals(wpd0Var.d) && u890.j(this.e, wpd0Var.e) && u890.j(this.f, wpd0Var.f) && u890.j(this.g, wpd0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        xpd0 xpd0Var = this.e;
        int iHashCode = (iD + (xpd0Var == null ? 0 : xpd0Var.hashCode())) * 31;
        nqd0 nqd0Var = this.f;
        int iHashCode2 = (iHashCode + (nqd0Var == null ? 0 : nqd0Var.hashCode())) * 31;
        String str = this.g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
