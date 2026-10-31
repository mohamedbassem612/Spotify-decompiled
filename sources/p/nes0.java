package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nes0 {
    public final Integer a;
    public final Integer b;

    public /* synthetic */ nes0(Integer num, int i) {
        this((i & 1) != 0 ? null : num, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nes0)) {
            return false;
        }
        nes0 nes0Var = (nes0) obj;
        return u890.j(this.a, nes0Var.a) && u890.j(this.b, nes0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public nes0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
