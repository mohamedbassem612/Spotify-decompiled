package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p23 {
    public final String a;
    public final String b;
    public final String c;

    public p23(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p23)) {
            return false;
        }
        p23 p23Var = (p23) obj;
        return u890.j(this.a, p23Var.a) && this.b.equals(p23Var.b) && u890.j(this.c, p23Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
