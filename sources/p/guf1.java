package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class guf1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final i091 f;

    public guf1(String str, String str2, String str3, boolean z, boolean z2, i091 i091Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guf1)) {
            return false;
        }
        guf1 guf1Var = (guf1) obj;
        return this.a.equals(guf1Var.a) && this.b.equals(guf1Var.b) && u890.j(this.c, guf1Var.c) && this.d == guf1Var.d && this.e == guf1Var.e && this.f.equals(guf1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
