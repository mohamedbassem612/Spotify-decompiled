package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lcg1 {
    public static final lcg1 c;
    public final nag1 a;
    public final nag1 b;

    static {
        nag1 nag1Var = nag1.c;
        c = new lcg1(nag1Var, nag1Var);
    }

    public lcg1(nag1 nag1Var, nag1 nag1Var2) {
        this.a = nag1Var;
        this.b = nag1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcg1)) {
            return false;
        }
        lcg1 lcg1Var = (lcg1) obj;
        return this.a.equals(lcg1Var.a) && u890.j(this.b, lcg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
