package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nk11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nk11(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk11)) {
            return false;
        }
        nk11 nk11Var = (nk11) obj;
        return u890.j(this.a, nk11Var.a) && u890.j(this.b, nk11Var.b) && this.c.equals(nk11Var.c) && u890.j(this.d, nk11Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
