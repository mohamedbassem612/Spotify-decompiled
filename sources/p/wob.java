package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wob extends hnw0 {
    public boolean[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // p.hnw0
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
