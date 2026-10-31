package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rma1 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public rma1(Integer num, Integer num2, Integer num3, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        Integer num4 = (i & 8) != 0 ? null : 2131167033;
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rma1)) {
            return false;
        }
        rma1 rma1Var = (rma1) obj;
        return u890.j(this.a, rma1Var.a) && u890.j(this.b, rma1Var.b) && u890.j(this.c, rma1Var.c) && u890.j(this.d, rma1Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }
}
