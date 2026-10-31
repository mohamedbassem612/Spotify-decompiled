package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xld0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public xld0(String str, String str2, String str3, long j, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xld0)) {
            return false;
        }
        xld0 xld0Var = (xld0) obj;
        return this.a.equals(xld0Var.a) && this.b.equals(xld0Var.b) && u890.j(this.c, xld0Var.c) && this.d == xld0Var.d && u890.j(this.e, xld0Var.e) && this.f.equals(xld0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e);
    }
}
