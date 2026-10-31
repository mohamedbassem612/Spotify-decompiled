package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ef1 implements gf1 {
    public final String a;
    public final String b;
    public final String c;

    public ef1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef1)) {
            return false;
        }
        ef1 ef1Var = (ef1) obj;
        return u890.j(this.a, ef1Var.a) && u890.j(this.b, ef1Var.b) && this.c.equals(ef1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
