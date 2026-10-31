package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jfb1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public jfb1(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfb1)) {
            return false;
        }
        jfb1 jfb1Var = (jfb1) obj;
        return u890.j(this.a, jfb1Var.a) && u890.j(this.b, jfb1Var.b) && this.c.equals(jfb1Var.c) && u890.j(this.d, jfb1Var.d) && this.e == jfb1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
