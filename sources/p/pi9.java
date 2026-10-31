package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pi9 implements bj9 {
    public final String a;
    public final be9 b;
    public final String c;
    public final fi9 d;

    public pi9(String str, be9 be9Var, String str2, fi9 fi9Var) {
        this.a = str;
        this.b = be9Var;
        this.c = str2;
        this.d = fi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi9)) {
            return false;
        }
        pi9 pi9Var = (pi9) obj;
        return u890.j(this.a, pi9Var.a) && this.b.equals(pi9Var.b) && this.c.equals(pi9Var.c) && this.d == pi9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
