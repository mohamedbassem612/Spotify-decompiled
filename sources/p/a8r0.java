package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a8r0 {
    public final y6r0 a;
    public final String b;
    public final String c;
    public final Integer d;

    public a8r0(y6r0 y6r0Var, String str, String str2, Integer num) {
        this.a = y6r0Var;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8r0)) {
            return false;
        }
        a8r0 a8r0Var = (a8r0) obj;
        return u890.j(this.a, a8r0Var.a) && u890.j(this.b, a8r0Var.b) && u890.j(this.c, a8r0Var.c) && u890.j(this.d, a8r0Var.d);
    }

    public final int hashCode() {
        y6r0 y6r0Var = this.a;
        int iHashCode = (y6r0Var == null ? 0 : y6r0Var.a.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
