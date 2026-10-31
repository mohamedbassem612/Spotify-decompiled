package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b301 implements d301 {
    public final String a;
    public final String b;
    public final String c;

    public b301(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b301)) {
            return false;
        }
        b301 b301Var = (b301) obj;
        return u890.j(this.a, b301Var.a) && u890.j(this.b, b301Var.b) && this.c.equals(b301Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
