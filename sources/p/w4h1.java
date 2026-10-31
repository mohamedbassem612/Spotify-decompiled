package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w4h1 extends hnw0 {
    public int[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return new v4h1(Arrays.copyOf(this.a, this.b));
    }

    @Override // p.hnw0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
