package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ho71 {
    public final String a;
    public final String b;
    public final String c;

    public ho71(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho71)) {
            return false;
        }
        ho71 ho71Var = (ho71) obj;
        return u890.j(this.a, ho71Var.a) && u890.j(this.b, ho71Var.b) && u890.j(this.c, ho71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
