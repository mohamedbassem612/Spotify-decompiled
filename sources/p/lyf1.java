package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lyf1 {
    public final String a;
    public final String b;
    public final String c;
    public final rqt0 d;
    public final boolean e;
    public final boolean f;

    public lyf1(String str, String str2, String str3, rqt0 rqt0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rqt0Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyf1)) {
            return false;
        }
        lyf1 lyf1Var = (lyf1) obj;
        return u890.j(this.a, lyf1Var.a) && u890.j(this.b, lyf1Var.b) && u890.j(this.c, lyf1Var.c) && this.d.equals(lyf1Var.d) && this.e == lyf1Var.e && this.f == lyf1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }
}
