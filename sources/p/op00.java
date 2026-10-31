package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class op00 {
    public final pnf1 a;
    public final int[] b;

    public op00(int i, pnf1 pnf1Var, int[] iArr) {
        if (iArr.length == 0) {
            oon1.w("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = pnf1Var;
        this.b = iArr;
    }
}
