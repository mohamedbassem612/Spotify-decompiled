package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yx31 implements qm70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public yx31(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx31)) {
            return false;
        }
        yx31 yx31Var = (yx31) obj;
        return u890.j(this.a, yx31Var.a) && u890.j(this.b, yx31Var.b) && u890.j(this.c, yx31Var.c);
    }

    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
