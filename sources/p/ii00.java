package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ii00 extends l6o1 {
    public final y6b1 b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public ii00(y6b1 y6b1Var, String str, Integer num, Integer num2) {
        this.b = y6b1Var;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii00)) {
            return false;
        }
        ii00 ii00Var = (ii00) obj;
        return u890.j(this.b, ii00Var.b) && u890.j(this.c, ii00Var.c) && this.d.equals(ii00Var.d) && this.e.equals(ii00Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.e.hashCode() + pze0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
