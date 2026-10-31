package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class df1 {
    public final String a;
    public final String b;
    public final String c;

    public df1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df1)) {
            return false;
        }
        df1 df1Var = (df1) obj;
        return u890.j(this.a, df1Var.a) && u890.j(this.b, df1Var.b) && this.c.equals(df1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
