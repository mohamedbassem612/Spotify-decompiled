package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fsd1 {
    public final int a;
    public final int b;

    public fsd1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsd1)) {
            return false;
        }
        fsd1 fsd1Var = (fsd1) obj;
        return this.a == fsd1Var.a && this.b == fsd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
