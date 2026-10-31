package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a7p1 extends g7p1 implements Serializable {
    public final byte[] b;

    public a7p1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public final int a() {
        return this.b.length * 8;
    }

    public final byte[] b() {
        return (byte[]) this.b.clone();
    }

    public final int c() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (!(length >= 4)) {
            eg.m(jmo1.t("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final long d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (!(length >= 8)) {
            eg.m(jmo1.t("HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0L;
        }
        long j = bArr[0] & 255;
        for (int i = 1; i < Math.min(bArr.length, 8); i++) {
            j |= (((long) bArr[i]) & 255) << (i * 8);
        }
        return j;
    }

    public final byte[] e() {
        return this.b;
    }

    public final boolean f(g7p1 g7p1Var) {
        int length = g7p1Var.e().length;
        byte[] bArr = this.b;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == g7p1Var.e()[i];
        }
        return z;
    }
}
