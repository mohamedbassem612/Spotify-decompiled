package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5k1 {
    public final String a;
    public final fie1 b;
    public final Integer c;
    public final Integer d;

    public x5k1(String str, fie1 fie1Var, Integer num, Integer num2) {
        this.a = str;
        this.b = fie1Var;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5k1)) {
            return false;
        }
        x5k1 x5k1Var = (x5k1) obj;
        return u890.j(this.a, x5k1Var.a) && u890.j(this.b, x5k1Var.b) && u890.j(this.c, x5k1Var.c) && u890.j(this.d, x5k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fie1 fie1Var = this.b;
        int iHashCode2 = (iHashCode + (fie1Var == null ? 0 : fie1Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
