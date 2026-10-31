package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qcf1 {
    public final int a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public qcf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcf1)) {
            return false;
        }
        qcf1 qcf1Var = (qcf1) obj;
        return this.a == qcf1Var.a && this.b == qcf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
