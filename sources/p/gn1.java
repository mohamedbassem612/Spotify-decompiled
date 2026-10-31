package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gn1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public gn1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn1)) {
            return false;
        }
        gn1 gn1Var = (gn1) obj;
        return u890.j(this.a, gn1Var.a) && this.b == gn1Var.b && this.c.equals(gn1Var.c) && u890.j(this.d, gn1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
