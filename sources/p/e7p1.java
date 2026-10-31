package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e7p1 extends g7p1 implements Serializable {
    public final long b;

    public e7p1(long j) {
        this.b = j;
    }

    public final byte[] b() {
        long j = this.b;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    public final int c() {
        return (int) this.b;
    }

    public final long d() {
        return this.b;
    }

    public final boolean f(g7p1 g7p1Var) {
        return this.b == g7p1Var.d();
    }
}
