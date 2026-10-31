package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class tcg1 {
    public static final scg1 Companion = new scg1();
    public final String a;
    public final qcg1 b;

    public /* synthetic */ tcg1(int i, String str, qcg1 qcg1Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, rcg1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = qcg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcg1)) {
            return false;
        }
        tcg1 tcg1Var = (tcg1) obj;
        return u890.j(this.a, tcg1Var.a) && u890.j(this.b, tcg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
