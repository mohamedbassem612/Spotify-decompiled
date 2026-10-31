package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class urg1 {
    public final int a;
    public final Integer b;

    public urg1(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urg1)) {
            return false;
        }
        urg1 urg1Var = (urg1) obj;
        return this.a == urg1Var.a && u890.j(this.b, urg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
