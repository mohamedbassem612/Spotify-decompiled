package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xb41 {
    public final int a;
    public final float b;

    public xb41(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb41)) {
            return false;
        }
        xb41 xb41Var = (xb41) obj;
        return this.a == xb41Var.a && Float.compare(this.b, xb41Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (l1d.C(this.a) * 31);
    }

    public /* synthetic */ xb41() {
        this(1, 0.0f);
    }
}
