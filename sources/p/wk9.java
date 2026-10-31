package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wk9 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public wk9(String str, String str2, String str3, long j, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk9)) {
            return false;
        }
        wk9 wk9Var = (wk9) obj;
        return u890.j(this.a, wk9Var.a) && u890.j(this.b, wk9Var.b) && u890.j(this.c, wk9Var.c) && this.d == wk9Var.d && this.e == wk9Var.e && this.f == wk9Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(cy30.f((iD + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), 31, this.e);
    }
}
