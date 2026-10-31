package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l8o extends buo1 {
    public final pxd0 b;

    public l8o(pxd0 pxd0Var) {
        this.b = pxd0Var;
    }

    public final int r(int i, int i2, flb0 flb0Var, q5t0 q5t0Var, int i3) {
        int iW = this.b.w(q5t0Var);
        if (iW == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iW;
        return flb0Var == flb0.b ? (i - i2) - i4 : i4;
    }

    public final Integer s(q5t0 q5t0Var) {
        return Integer.valueOf(this.b.w(q5t0Var));
    }
}
