package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sqj1 {
    public final ljj1 a;
    public final boolean b;
    public final String c;
    public final rqj1 d;
    public final String e;

    public sqj1(ljj1 ljj1Var, boolean z, String str, rqj1 rqj1Var, String str2) {
        this.a = ljj1Var;
        this.b = z;
        this.c = str;
        this.d = rqj1Var;
        this.e = str2;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final ljj1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqj1)) {
            return false;
        }
        sqj1 sqj1Var = (sqj1) obj;
        return u890.j(this.a, sqj1Var.a) && this.b == sqj1Var.b && u890.j(this.c, sqj1Var.c) && u890.j(this.d, sqj1Var.d) && u890.j(this.e, sqj1Var.e);
    }

    public final int hashCode() {
        ljj1 ljj1Var = this.a;
        int iHashCode = (this.d.hashCode() + cy30.d(xcg1.g((ljj1Var == null ? 0 : ljj1Var.hashCode()) * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ sqj1(ljj1 ljj1Var, String str, rqj1 rqj1Var) {
        this(ljj1Var, true, str, rqj1Var, null);
    }
}
