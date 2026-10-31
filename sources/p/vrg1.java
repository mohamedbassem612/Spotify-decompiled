package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vrg1 implements xrg1 {
    public final int a;
    public final int b;

    public vrg1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrg1)) {
            return false;
        }
        vrg1 vrg1Var = (vrg1) obj;
        return this.a == vrg1Var.a && this.b == vrg1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
