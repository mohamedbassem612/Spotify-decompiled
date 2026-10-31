package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jze0 extends kze0 {
    public final String a;
    public final String b;
    public final String c;

    public jze0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jze0)) {
            return false;
        }
        jze0 jze0Var = (jze0) obj;
        return u890.j(this.a, jze0Var.a) && u890.j(this.b, jze0Var.b) && u890.j(this.c, jze0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
