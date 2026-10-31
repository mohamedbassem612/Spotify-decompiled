package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kdh0 extends iho1 {
    public final Integer m;
    public final Integer n;
    public final Integer o;

    public kdh0(Integer num, Integer num2, Integer num3) {
        this.m = num;
        this.n = num2;
        this.o = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdh0)) {
            return false;
        }
        kdh0 kdh0Var = (kdh0) obj;
        return u890.j(this.m, kdh0Var.m) && u890.j(this.n, kdh0Var.n) && u890.j(this.o, kdh0Var.o);
    }

    public final int hashCode() {
        Integer num = this.m;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.n;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.o;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }
}
