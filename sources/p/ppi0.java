package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ppi0 {
    public final String a;
    public final String b;
    public final String c;

    public ppi0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppi0)) {
            return false;
        }
        ppi0 ppi0Var = (ppi0) obj;
        return u890.j(this.a, ppi0Var.a) && u890.j(this.b, ppi0Var.b) && this.c.equals(ppi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 961, this.b);
    }
}
