package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j4d extends jca {
    public final gar T0;
    public final izr0 U0;
    public i4d V0;
    public long W0;

    public j4d() {
        super(6);
        this.T0 = new gar(1);
        this.U0 = new izr0();
    }

    @Override // p.jca
    public final void I(long j, long j2) {
        float[] fArr;
        while (!q() && this.W0 < 100000 + j) {
            gar garVar = this.T0;
            garVar.g();
            w2z w2zVar = this.c;
            w2zVar.b();
            if (G(w2zVar, garVar, 0) != -4 || garVar.f(4)) {
                return;
            }
            long j3 = garVar.f;
            this.W0 = j3;
            boolean z = j3 < this.Y;
            if (this.V0 != null && !z) {
                garVar.j();
                ByteBuffer byteBuffer = garVar.d;
                String str = zoi1.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    izr0 izr0Var = this.U0;
                    izr0Var.P(bArrArray, iLimit);
                    izr0Var.R(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(izr0Var.s());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.V0.c(this.W0 - this.X, fArr);
                }
            }
        }
    }

    @Override // p.jca
    public final void b(int i, Object obj) {
        if (i == 8) {
            this.V0 = (i4d) obj;
        }
    }

    @Override // p.jca
    public final void x() {
        i4d i4dVar = this.V0;
        if (i4dVar != null) {
            i4dVar.d();
        }
    }

    @Override // p.jca
    public final void z(long j, boolean z, boolean z2) {
        this.W0 = Long.MIN_VALUE;
        i4d i4dVar = this.V0;
        if (i4dVar != null) {
            i4dVar.d();
        }
    }
}
