package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ix6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final qff f;

    public ix6(String str, String str2, String str3, String str4, String str5, qff qffVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = qffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ix6) {
            ix6 ix6Var = (ix6) obj;
            return u890.j(this.a, ix6Var.a) && this.b.equals(ix6Var.b) && this.c.equals(ix6Var.c) && u890.j(this.d, ix6Var.d) && this.e.equals(ix6Var.e) && this.f == ix6Var.f;
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
