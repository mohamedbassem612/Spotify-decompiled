package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h1q0 implements j1q0 {
    public final String a;
    public final String b;
    public final String c;

    public h1q0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1q0)) {
            return false;
        }
        h1q0 h1q0Var = (h1q0) obj;
        return u890.j(this.a, h1q0Var.a) && u890.j(this.b, h1q0Var.b) && u890.j(this.c, h1q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
