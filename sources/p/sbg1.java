package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sbg1 {
    public final int a;
    public final int b;

    public sbg1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbg1)) {
            return false;
        }
        sbg1 sbg1Var = (sbg1) obj;
        return this.a == sbg1Var.a && this.b == sbg1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
