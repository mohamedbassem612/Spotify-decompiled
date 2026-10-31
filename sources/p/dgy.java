package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgy {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public dgy(int i, Integer num, Integer num2) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        Integer num3 = (i & 4) != 0 ? null : 16;
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgy)) {
            return false;
        }
        dgy dgyVar = (dgy) obj;
        return u890.j(this.a, dgyVar.a) && u890.j(this.b, dgyVar.b) && u890.j(this.c, dgyVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }
}
