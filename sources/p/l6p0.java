package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l6p0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final zkt0 e;

    public l6p0(String str, String str2, String str3, String str4, zkt0 zkt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zkt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6p0)) {
            return false;
        }
        l6p0 l6p0Var = (l6p0) obj;
        return u890.j(this.a, l6p0Var.a) && u890.j(this.b, l6p0Var.b) && u890.j(this.c, l6p0Var.c) && u890.j(this.d, l6p0Var.d) && this.e == l6p0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.e.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, true)) * 31);
    }
}
