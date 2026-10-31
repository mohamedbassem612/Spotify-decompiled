package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c1 {
    public final String a;
    public final String b;
    public final b1 c;
    public final b1 d;

    public c1(String str, String str2, b1 b1Var, b1 b1Var2) {
        this.a = str;
        this.b = str2;
        this.c = b1Var;
        this.d = b1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return u890.j(this.a, c1Var.a) && u890.j(this.b, c1Var.b) && u890.j(this.c, c1Var.c) && u890.j(this.d, c1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public /* synthetic */ c1(String str, b1 b1Var, b1 b1Var2) {
        this(str, "", b1Var, b1Var2);
    }
}
