package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ff1 implements gf1 {
    public final String a;
    public final String b;
    public final String c;

    public ff1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff1)) {
            return false;
        }
        ff1 ff1Var = (ff1) obj;
        return u890.j(this.a, ff1Var.a) && u890.j(this.b, ff1Var.b) && this.c.equals(ff1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
