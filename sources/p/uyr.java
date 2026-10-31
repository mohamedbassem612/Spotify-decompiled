package p;

import app.p000rive.semantics.SemanticState;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uyr implements fc10 {
    public final z0r b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[SemanticState.Obscured];

    static {
        hph0.a("media3.extractor");
    }

    public uyr(z0r z0rVar, long j, long j2) {
        this.b = z0rVar;
        this.d = j;
        this.c = j2;
    }

    public final boolean b(int i, boolean z) throws InterruptedIOException {
        int iMin = Math.min(this.g, i);
        l(iMin);
        int i2 = iMin;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = i(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += (long) i2;
        }
        return i2 != -1;
    }

    public final void c(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, zoi1.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!v(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final void f() {
        this.f = 0;
    }

    public final boolean g(byte[] bArr, int i, int i2, boolean z) throws InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            l(iMin);
        }
        int i4 = iMin;
        while (i4 < i2 && i4 != -1) {
            i4 = i(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += (long) i4;
        }
        return i4 != -1;
    }

    public final long getLength() {
        return this.c;
    }

    public final long getPosition() {
        return this.d;
    }

    public final void h(int i, byte[] bArr, int i2) {
        d(bArr, i, i2, false);
    }

    public final int i(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        eg.l();
        return 0;
    }

    public final long j() {
        return this.d + ((long) this.f);
    }

    public final void k(int i) throws InterruptedIOException {
        v(i, false);
    }

    public final void l(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    public final int q(int i, byte[] bArr, int i2) throws InterruptedIOException {
        uyr uyrVar;
        int iMin;
        c(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            uyrVar = this;
            iMin = uyrVar.i(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            uyrVar.g += iMin;
        } else {
            uyrVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(uyrVar.e, uyrVar.f, bArr, i, iMin);
        uyrVar.f += iMin;
        return iMin;
    }

    public final int r(int i) throws InterruptedIOException {
        uyr uyrVar;
        int iMin = Math.min(this.g, i);
        l(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            uyrVar = this;
            iMin = uyrVar.i(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            uyrVar = this;
        }
        if (iMin != -1) {
            uyrVar.d += (long) iMin;
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) throws InterruptedIOException {
        uyr uyrVar;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            l(iMin);
            i4 = iMin;
        }
        if (i4 == 0) {
            uyrVar = this;
            i4 = uyrVar.i(bArr, i, i2, 0, true);
        } else {
            uyrVar = this;
        }
        if (i4 != -1) {
            uyrVar.d += (long) i4;
        }
        return i4;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws InterruptedIOException {
        g(bArr, i, i2, false);
    }

    public final void u(int i) throws InterruptedIOException {
        b(i, false);
    }

    public final boolean v(int i, boolean z) throws InterruptedIOException {
        c(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            uyr uyrVar = this;
            int i3 = i;
            boolean z2 = z;
            i2 = uyrVar.i(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            uyrVar.g = uyrVar.f + i2;
            this = uyrVar;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }
}
