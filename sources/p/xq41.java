package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xq41 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xq41(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq41)) {
            return false;
        }
        xq41 xq41Var = (xq41) obj;
        return u890.j(this.a, xq41Var.a) && u890.j(this.b, xq41Var.b) && u890.j(this.c, xq41Var.c) && u890.j(this.d, xq41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
