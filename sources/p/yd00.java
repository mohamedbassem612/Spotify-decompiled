package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yd00 implements fe00 {
    public final xa4 a;
    public final String b;

    public yd00(xa4 xa4Var, String str) {
        this.a = xa4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd00)) {
            return false;
        }
        yd00 yd00Var = (yd00) obj;
        return this.a.equals(yd00Var.a) && u890.j(this.b, yd00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
