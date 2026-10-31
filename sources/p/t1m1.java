package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1m1 {
    public final Integer a;
    public final gzl1 b;
    public final Boolean c;
    public final Boolean d;
    public final Integer e;
    public final Boolean f;

    public /* synthetic */ t1m1(Integer num, gzl1 gzl1Var, Boolean bool, Boolean bool2, Integer num2, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : gzl1Var, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1m1)) {
            return false;
        }
        t1m1 t1m1Var = (t1m1) obj;
        return u890.j(this.a, t1m1Var.a) && this.b == t1m1Var.b && u890.j(this.c, t1m1Var.c) && u890.j(this.d, t1m1Var.d) && u890.j(this.e, t1m1Var.e) && u890.j(this.f, t1m1Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        gzl1 gzl1Var = this.b;
        int iHashCode2 = (iHashCode + (gzl1Var == null ? 0 : gzl1Var.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public t1m1(Integer num, gzl1 gzl1Var, Boolean bool, Boolean bool2, Integer num2, Boolean bool3) {
        this.a = num;
        this.b = gzl1Var;
        this.c = bool;
        this.d = bool2;
        this.e = num2;
        this.f = bool3;
    }
}
