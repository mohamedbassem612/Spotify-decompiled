package p;

import java.io.InvalidObjectException;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hkm1 extends dqz0 implements Serializable {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public hkm1(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.c = i;
        this.d = i2;
        this.e = 0;
        this.f = 0;
        this.g = i3;
        this.h = i4;
        l();
        for (int i5 = 0; i5 < 64; i5++) {
            f();
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            l();
            return this;
        } catch (Throwable th) {
            throw new InvalidObjectException(th.getMessage()).initCause(th);
        }
    }

    public final int a(int i) {
        return (f() >>> (32 - i)) & ((-i) >> 31);
    }

    public final int f() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.g;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.g = i4;
        int i5 = this.h + 362437;
        this.h = i5;
        return i4 + i5;
    }

    public final void l() {
        if ((this.g | this.c | this.d | this.e | this.f) != 0) {
            return;
        }
        hhg1.n("Initial state must have at least one non-zero element.");
    }
}
