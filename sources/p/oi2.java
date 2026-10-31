package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oi2 extends qi2 {
    public final int a;
    public final int b;

    public oi2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi2)) {
            return false;
        }
        oi2 oi2Var = (oi2) obj;
        return this.a == oi2Var.a && this.b == oi2Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
