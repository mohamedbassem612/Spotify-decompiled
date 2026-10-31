package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bie1 {
    public final int a;
    public final aie1 b;

    public bie1(int i, aie1 aie1Var) {
        this.a = i;
        this.b = aie1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bie1)) {
            return false;
        }
        bie1 bie1Var = (bie1) obj;
        return this.a == bie1Var.a && this.b.equals(bie1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
