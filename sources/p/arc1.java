package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class arc1 implements erc1 {
    public final yqc1 a;
    public final crc1 b;

    public arc1(yqc1 yqc1Var, crc1 crc1Var) {
        this.a = yqc1Var;
        this.b = crc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arc1)) {
            return false;
        }
        arc1 arc1Var = (arc1) obj;
        return this.a.equals(arc1Var.a) && this.b.equals(arc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
