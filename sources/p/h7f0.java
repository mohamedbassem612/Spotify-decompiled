package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h7f0 {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    public final float d;
    public final float e;

    public h7f0(float[] fArr, float[] fArr2, float[] fArr3, float f, float f2) {
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr3;
        this.d = f;
        this.e = f2;
        if (fArr.length == 0) {
            hhg1.n("LoopTile arrays must not be empty");
            throw null;
        }
        if (fArr.length != fArr2.length || fArr2.length != fArr3.length) {
            hhg1.n("Failed requirement.");
            throw null;
        }
        if (f2 > 0.0f) {
            return;
        }
        hhg1.n("bucketStride must be positive");
        throw null;
    }

    public final int a(float f) {
        float[] fArr = this.a;
        if (fArr.length != 0) {
            float f2 = this.d;
            if (f2 > 0.0f) {
                float f3 = this.e;
                if (f3 > 0.0f) {
                    return Math.max(0, Math.min((int) ((f % f2) / f3), fArr.length - 1));
                }
            }
        }
        return 0;
    }
}
