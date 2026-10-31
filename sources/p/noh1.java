package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class noh1 implements ooh1 {
    public final String a;
    public final String b;
    public final String c;

    public noh1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noh1)) {
            return false;
        }
        noh1 noh1Var = (noh1) obj;
        return u890.j(this.a, noh1Var.a) && this.b.equals(noh1Var.b) && this.c.equals(noh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
