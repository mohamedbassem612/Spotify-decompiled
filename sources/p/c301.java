package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c301 implements d301 {
    public final String a;
    public final String b;
    public final String c;

    public c301(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c301)) {
            return false;
        }
        c301 c301Var = (c301) obj;
        return u890.j(this.a, c301Var.a) && u890.j(this.b, c301Var.b) && u890.j(this.c, c301Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
