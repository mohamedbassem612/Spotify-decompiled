package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hy71 {
    public final String a;
    public final String b;
    public final String c;

    public hy71(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy71)) {
            return false;
        }
        hy71 hy71Var = (hy71) obj;
        return u890.j(this.a, hy71Var.a) && u890.j(this.b, hy71Var.b) && u890.j(this.c, hy71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ hy71() {
        this("", "", "");
    }
}
