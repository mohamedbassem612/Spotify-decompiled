package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uwy0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public uwy0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwy0)) {
            return false;
        }
        uwy0 uwy0Var = (uwy0) obj;
        return u890.j(this.a, uwy0Var.a) && u890.j(this.b, uwy0Var.b) && u890.j(this.c, uwy0Var.c) && u890.j(this.d, uwy0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
