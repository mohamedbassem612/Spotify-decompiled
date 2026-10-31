package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h2s0 {
    public final Integer a;
    public final Integer b;

    public h2s0(Integer num, int i) {
        Integer num2 = (i & 4) != 0 ? null : 2131961989;
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2s0)) {
            return false;
        }
        h2s0 h2s0Var = (h2s0) obj;
        return this.a.equals(h2s0Var.a) && u890.j(this.b, h2s0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
