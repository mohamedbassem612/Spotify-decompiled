package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r3h1 extends hnw0 {
    public byte[] a;
    public int b;

    @Override // p.hnw0
    public final Object a() {
        return new q3h1(Arrays.copyOf(this.a, this.b));
    }

    @Override // p.hnw0
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p.hnw0
    public final int d() {
        return this.b;
    }
}
