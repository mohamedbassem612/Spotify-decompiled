package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vq20 extends hnw0 {
    public float[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // p.hnw0
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
