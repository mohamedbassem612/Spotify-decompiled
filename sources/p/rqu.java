package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rqu extends hnw0 {
    public double[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // p.hnw0
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
