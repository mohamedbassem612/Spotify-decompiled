package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p6d1 implements v6d1 {
    public final int a;
    public final int b;

    public p6d1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6d1)) {
            return false;
        }
        p6d1 p6d1Var = (p6d1) obj;
        return this.a == p6d1Var.a && this.b == p6d1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
