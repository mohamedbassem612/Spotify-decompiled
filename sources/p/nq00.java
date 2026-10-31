package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nq00 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nq00(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq00)) {
            return false;
        }
        nq00 nq00Var = (nq00) obj;
        return this.a.equals(nq00Var.a) && this.b.equals(nq00Var.b) && this.c.equals(nq00Var.c) && u890.j(this.d, nq00Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
