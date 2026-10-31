package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bif1 implements cif1 {
    public final int a;
    public final int b;

    public bif1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bif1)) {
            return false;
        }
        bif1 bif1Var = (bif1) obj;
        return this.a == bif1Var.a && this.b == bif1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
