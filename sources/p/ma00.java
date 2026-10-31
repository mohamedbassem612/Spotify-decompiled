package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ma00 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public ma00(String str, int i, String str2, String str3, Integer num, Integer num2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = num2;
    }

    public static ma00 a(ma00 ma00Var, String str, String str2, Integer num, Integer num2) {
        return new ma00(ma00Var.a, ma00Var.b, str, str2, num, num2);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma00)) {
            return false;
        }
        ma00 ma00Var = (ma00) obj;
        return this.a.equals(ma00Var.a) && this.b == ma00Var.b && u890.j(this.c, ma00Var.c) && u890.j(this.d, ma00Var.d) && u890.j(this.e, ma00Var.e) && u890.j(this.f, ma00Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
