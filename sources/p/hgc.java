package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hgc extends hnw0 {
    public byte[] a;
    public int b;

    public hgc(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
        b(10);
    }

    @Override // p.hnw0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
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

    public final void e(byte b) {
        b(d() + 1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }
}
