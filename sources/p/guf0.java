package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class guf0 {
    public int[] a;
    public int b;
    public float[] c;

    public guf0(int[] iArr) {
        this.a = iArr;
        int iN = bs51.n(iArr);
        this.b = iN;
        this.c = new float[iN];
    }

    public final float[] a() {
        return this.c;
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.a.length;
    }

    public final void d(int[] iArr) {
        this.a = iArr;
        int iN = bs51.n(iArr);
        float[] fArr = new float[iN];
        System.arraycopy(this.c, 0, fArr, 0, Math.min(this.b, iN));
        this.c = fArr;
        this.b = iN;
    }
}
