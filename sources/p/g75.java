package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g75 extends jme {
    public final /* synthetic */ k75 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g75(k75 k75Var) {
        super(1);
        this.c = k75Var;
    }

    @Override // p.jme
    public final hsl1 t0(hsl1 hsl1Var, List list) {
        return this.c.h(hsl1Var);
    }

    @Override // p.jme
    public final frl1 u0(mrl1 mrl1Var, frl1 frl1Var) {
        sh80 sh80Var = (sh80) this.c.c1.e1.d;
        if (((pim0) sh80Var.E1).N0) {
            long jC0 = dm5.c0(sh80Var.O(0L));
            int i = (int) (jC0 >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (jC0 & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long jB = nho1.v(sh80Var).b();
            int i3 = (int) (jB >> 32);
            int i4 = (int) (jB & 4294967295L);
            long j = ((q5t0) sh80Var).c;
            long jC1 = dm5.c0(sh80Var.O((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
            int i5 = i3 - ((int) (jC1 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (jC1 & 4294967295L));
            if (i6 < 0) {
                i6 = 0;
            }
            if (i != 0 || i2 != 0 || i5 != 0 || i6 != 0) {
                return new frl1(k75.f((nk80) frl1Var.b, i, i2, i5, i6), k75.f((nk80) frl1Var.c, i, i2, i5, i6), (byte) 0);
            }
        }
        return frl1Var;
    }
}
