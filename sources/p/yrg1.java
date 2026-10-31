package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yrg1 {
    public final int a;
    public final xrg1 b;
    public final Integer c;

    public yrg1(int i, xrg1 xrg1Var, Integer num) {
        this.a = i;
        this.b = xrg1Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrg1)) {
            return false;
        }
        yrg1 yrg1Var = (yrg1) obj;
        return this.a == yrg1Var.a && this.b.equals(yrg1Var.b) && u890.j(this.c, yrg1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
