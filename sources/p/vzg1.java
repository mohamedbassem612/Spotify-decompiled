package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vzg1 extends lrn1 {
    public final String c;
    public final pe11 d;
    public final vu30 e;

    public vzg1(String str, pe11 pe11Var, vu30 vu30Var) {
        this.c = str;
        this.d = pe11Var;
        this.e = vu30Var;
    }

    public static vzg1 y(vzg1 vzg1Var, String str, pe11 pe11Var, int i) {
        if ((i & 1) != 0) {
            str = vzg1Var.c;
        }
        return new vzg1(str, pe11Var, vzg1Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzg1)) {
            return false;
        }
        vzg1 vzg1Var = (vzg1) obj;
        return u890.j(this.c, vzg1Var.c) && this.d == vzg1Var.d && this.e.equals(vzg1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
