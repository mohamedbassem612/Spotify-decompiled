package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class op50 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Double e;
    public final Integer f;
    public final boolean g;

    public op50(String str, String str2, boolean z, boolean z2, Double d, Integer num, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = d;
        this.f = num;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op50)) {
            return false;
        }
        op50 op50Var = (op50) obj;
        return this.a.equals(op50Var.a) && this.b.equals(op50Var.b) && this.c == op50Var.c && this.d == op50Var.d && u890.j(this.e, op50Var.e) && u890.j(this.f, op50Var.f) && this.g == op50Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Double d = this.e;
        int iHashCode = (iG + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
