package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xg10 extends w9a {
    public int i;
    public int j;
    public int k;
    public int m;
    public final long o;
    public float l = 1.0f;
    public long n = yoi1.r(0, 0, 6000);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ah10 f81p = ah10.a;

    public xg10(iu7 iu7Var) {
        this.o = iu7Var.a;
    }

    public final c18 b(c18 c18Var) {
        int i = c18Var.a;
        this.i = i;
        this.j = c18Var.b;
        long j = i;
        int i2 = (int) ((this.o * j) / 1000);
        int i3 = (int) ((this.n * j) / 1000);
        if (i3 < 0) {
            i3 = 0;
        }
        this.m = i2 - i3;
        return c18Var;
    }

    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int i2 = i / (this.j * 2);
        if (this.n == 0 || this.k + i2 < this.m) {
            this.k += i2;
            l(i).put(byteBuffer).flip();
            return;
        }
        ByteBuffer byteBufferL = l((i / ((w9a) this).b.d) * ((w9a) this).c.d);
        while (iPosition < iLimit) {
            int i3 = this.k;
            int i4 = this.m;
            if (i3 >= i4) {
                int i5 = i3 - i4;
                int i6 = this.i;
                long j = this.n;
                this.f81p.getClass();
                this.l = j > 0 ? yoi1.o(1.0f - (((i5 * 1000.0f) / i6) / j), 0.0f, 1.0f) : 1.0f;
            }
            int i7 = this.j;
            for (int i8 = 0; i8 < i7; i8++) {
                byteBufferL.putShort((short) jch0.U(byteBuffer.getShort((i8 * 2) + iPosition) * this.l));
            }
            this.k++;
            iPosition += this.j * 2;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    public final void k() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 1.0f;
        this.m = 0;
        this.n = 0L;
    }
}
