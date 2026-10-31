package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n8y0 {
    public final int a;
    public final int b;

    public /* synthetic */ n8y0(int i) {
        this((i & 1) != 0 ? 1 : 2, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8y0)) {
            return false;
        }
        n8y0 n8y0Var = (n8y0) obj;
        return this.a == n8y0Var.a && this.b == n8y0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    public n8y0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
