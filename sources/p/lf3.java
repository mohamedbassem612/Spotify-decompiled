package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lf3 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public lf3(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3Var = (lf3) obj;
        return u890.j(this.a, lf3Var.a) && this.b.equals(lf3Var.b) && u890.j(this.c, lf3Var.c) && this.d == lf3Var.d && this.e == lf3Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
