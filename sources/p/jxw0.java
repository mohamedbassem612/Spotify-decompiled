package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxw0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public jxw0(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxw0)) {
            return false;
        }
        jxw0 jxw0Var = (jxw0) obj;
        return this.a == jxw0Var.a && u890.j(this.b, jxw0Var.b) && u890.j(this.c, jxw0Var.c) && u890.j(this.d, jxw0Var.d) && this.e == jxw0Var.e && this.f == jxw0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
