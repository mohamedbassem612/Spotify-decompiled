package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bl41 {
    public final String a;
    public final String b;
    public final gm41 c;
    public final hm41 d;

    public bl41(String str, String str2, gm41 gm41Var, hm41 hm41Var) {
        this.a = str;
        this.b = str2;
        this.c = gm41Var;
        this.d = hm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl41)) {
            return false;
        }
        bl41 bl41Var = (bl41) obj;
        return u890.j(this.a, bl41Var.a) && this.b.equals(bl41Var.b) && this.c.equals(bl41Var.c) && this.d.equals(bl41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
