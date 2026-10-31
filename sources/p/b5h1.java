package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b5h1 extends hnw0 {
    public long[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return new a5h1(Arrays.copyOf(this.a, this.b));
    }

    @Override // p.hnw0
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
