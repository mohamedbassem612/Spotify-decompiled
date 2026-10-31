package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ut50 extends wt50 implements Serializable {
    public final byte[] b;

    public ut50(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    @Override // p.wt50
    public final byte[] a() {
        return (byte[]) this.b.clone();
    }

    @Override // p.wt50
    public final int b() {
        byte[] bArr = this.b;
        dm5.x("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length, bArr.length >= 4);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // p.wt50
    public final int c() {
        return this.b.length * 8;
    }

    @Override // p.wt50
    public final boolean d(wt50 wt50Var) {
        byte[] bArr = this.b;
        if (bArr.length != wt50Var.e().length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == wt50Var.e()[i];
        }
        return z;
    }

    @Override // p.wt50
    public final byte[] e() {
        return this.b;
    }
}
