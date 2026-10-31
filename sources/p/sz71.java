package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sz71 extends hnw0 {
    public short[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // p.hnw0
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
