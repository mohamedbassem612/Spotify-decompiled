package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t7g0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Integer e;
    public final int f;

    public t7g0(String str, String str2, int i, String str3, Integer num, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = num;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7g0)) {
            return false;
        }
        t7g0 t7g0Var = (t7g0) obj;
        return this.a.equals(t7g0Var.a) && this.b.equals(t7g0Var.b) && this.c == t7g0Var.c && u890.j(this.d, t7g0Var.d) && u890.j(this.e, t7g0Var.e) && this.f == t7g0Var.f;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return Integer.hashCode(this.f) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
