package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qsf0 implements rsf0 {
    public final int a;
    public final int b;

    public qsf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsf0)) {
            return false;
        }
        qsf0 qsf0Var = (qsf0) obj;
        return this.a == qsf0Var.a && this.b == qsf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
