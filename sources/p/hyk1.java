package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hyk1 implements h0r0 {
    public final tsq a;
    public final tsq b;
    public final cik1 c;
    public final iyk1 d;
    public final yuj e;
    public final dyk1 f;
    public final cbr0 g;

    public hyk1(tsq tsqVar, tsq tsqVar2, cik1 cik1Var, iyk1 iyk1Var, yuj yujVar, dyk1 dyk1Var) {
        this.a = tsqVar;
        this.b = tsqVar2;
        this.c = cik1Var;
        this.d = iyk1Var;
        this.e = yujVar;
        this.f = dyk1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.f6(), nik1.K1, (nar0) null), new pu00(true), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.e, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 26)), apo.j(473589517, new fyk1(this, (byte) 1), true), new n7e0(new gyk1(this), olj1.e1, gex0.W0));
    }

    public final void c(vwv0 vwv0Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(969844995);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            otw.c((maa) this.b.get(), new uwk1(2, vwv0Var.getTitle(), vwv0Var.b(), vwv0Var.a(), str), (qim0) null, (ipb1) null, x340Var, 8, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(this, vwv0Var, str, i, (byte) 13);
        }
    }
}
