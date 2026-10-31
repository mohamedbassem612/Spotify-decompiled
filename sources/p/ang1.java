package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ang1 {
    public final String a;
    public final String b;
    public final String c;

    public ang1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ang1)) {
            return false;
        }
        ang1 ang1Var = (ang1) obj;
        return u890.j(this.a, ang1Var.a) && u890.j(this.b, ang1Var.b) && u890.j(this.c, ang1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
