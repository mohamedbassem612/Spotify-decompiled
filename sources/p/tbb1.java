package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tbb1 {
    public final int a;
    public final Integer b;

    public /* synthetic */ tbb1() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbb1)) {
            return false;
        }
        tbb1 tbb1Var = (tbb1) obj;
        return this.a == tbb1Var.a && u890.j(this.b, tbb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public tbb1(Integer num, int i) {
        this.a = i;
        this.b = num;
    }
}
