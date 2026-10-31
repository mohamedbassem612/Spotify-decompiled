package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fxe0 {
    public final String a;
    public final String b;
    public final tf8 c;

    public fxe0(String str, String str2, tf8 tf8Var) {
        this.a = str;
        this.b = str2;
        this.c = tf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxe0)) {
            return false;
        }
        fxe0 fxe0Var = (fxe0) obj;
        return u890.j(this.a, fxe0Var.a) && u890.j(this.b, fxe0Var.b) && this.c.equals(fxe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
