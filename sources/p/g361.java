package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g361 {
    public final String a;
    public final String b;
    public final s361 c;
    public final String d;

    public g361(String str, String str2, s361 s361Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = s361Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g361)) {
            return false;
        }
        g361 g361Var = (g361) obj;
        return this.a.equals(g361Var.a) && u890.j(this.b, g361Var.b) && this.c.equals(g361Var.c) && u890.j(this.d, g361Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
