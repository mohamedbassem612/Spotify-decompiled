package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class og21 implements pg21 {
    public final String a;
    public final String b;
    public final String c;

    public og21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og21)) {
            return false;
        }
        og21 og21Var = (og21) obj;
        return u890.j(this.a, og21Var.a) && u890.j(this.b, og21Var.b) && u890.j(this.c, og21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
