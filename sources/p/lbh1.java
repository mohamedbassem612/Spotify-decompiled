package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class lbh1 {
    public static final kbh1 Companion = new kbh1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ lbh1(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbh1)) {
            return false;
        }
        lbh1 lbh1Var = (lbh1) obj;
        return u890.j(this.a, lbh1Var.a) && u890.j(this.b, lbh1Var.b) && u890.j(this.c, lbh1Var.c) && u890.j(this.d, lbh1Var.d) && u890.j(this.e, lbh1Var.e) && this.f == lbh1Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
