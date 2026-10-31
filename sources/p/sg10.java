package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sg10 extends w9a {
    public int i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public long n;
    public final zg10 o = zg10.a;

    public sg10(hu7 hu7Var) {
        this.n = yoi1.r(hu7Var.a, 0L, 6000L);
    }

    public final c18 b(c18 c18Var) {
        this.i = c18Var.a;
        this.j = c18Var.b;
        return c18Var;
    }

    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        if (this.n == 0 || this.l >= 1.0f) {
            l(i).put(byteBuffer).flip();
            return;
        }
        ByteBuffer byteBufferL = l((i / ((w9a) this).b.d) * ((w9a) this).c.d);
        while (iPosition < iLimit) {
            int i2 = this.j;
            for (int i3 = 0; i3 < i2; i3++) {
                byteBufferL.putShort((short) jch0.U(byteBuffer.getShort((i3 * 2) + iPosition) * this.l));
            }
            int i4 = this.k + 1;
            this.k = i4;
            if (this.l < 1.0f) {
                int i5 = this.i;
                long j = this.n;
                this.o.getClass();
                this.l = j > 0 ? yoi1.o(((i4 * 1000.0f) / i5) / j, 0.0f, 1.0f) : 1.0f;
            }
            iPosition += this.j * 2;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    public final void k() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0.0f;
        if (this.m) {
            this.n = 0L;
        }
    }
}
