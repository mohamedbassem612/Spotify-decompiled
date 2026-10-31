package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wjp implements mpa1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ wjp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ty60 a(g38 g38Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                ip31 ip31Var = (ip31) ((chp) r7qVar).c;
                chp chpVar = (chp) ip31Var.f;
                b1y b1yVar = (b1y) ((k42) ip31Var.b).f;
                c8o.l(b1yVar);
                d6a1 d6a1Var = b1yVar.a.n() ? ppu.a : (d6a1) chpVar.get();
                k42 k42Var = (k42) ip31Var.b;
                dma1 dma1Var = (dma1) k42Var.r;
                c8o.l(dma1Var);
                String strM = rt71.m(dma1Var);
                azp0 azp0Var = (azp0) k42Var.p;
                c8o.l(azp0Var);
                czp0 czp0Var = (czp0) k42Var.q;
                c8o.l(czp0Var);
                bz81 bz81Var = (bz81) k42Var.o;
                c8o.l(bz81Var);
                t2j0 t2j0Var = (t2j0) k42Var.n;
                c8o.l(t2j0Var);
                yqg yqgVar = (yqg) k42Var.m;
                c8o.l(yqgVar);
                return new ty60(d6a1Var, new ev81(strM, azp0Var, czp0Var, bz81Var, new t8r0(t2j0Var, yqgVar)), ip31Var.t(), g38Var, true);
            case 1:
                zl5 zl5Var = (zl5) ((blp) r7qVar).c;
                h6h0 h6h0Var = (h6h0) zl5Var.b;
                dma1 dma1Var2 = (dma1) h6h0Var.d0.get();
                c8o.l(dma1Var2);
                String strM2 = rt71.m(dma1Var2);
                azp0 azp0Var2 = (azp0) h6h0Var.b0.get();
                c8o.l(azp0Var2);
                czp0 czp0Var2 = (czp0) h6h0Var.c0.get();
                c8o.l(czp0Var2);
                bz81 bz81Var2 = (bz81) h6h0Var.f0.get();
                c8o.l(bz81Var2);
                t2j0 t2j0Var2 = (t2j0) h6h0Var.e0.get();
                c8o.l(t2j0Var2);
                yqg yqgVar2 = (yqg) h6h0Var.P.get();
                c8o.l(yqgVar2);
                ev81 ev81Var = new ev81(strM2, azp0Var2, czp0Var2, bz81Var2, new t8r0(t2j0Var2, yqgVar2));
                q7r0 q7r0Var = (q7r0) zl5Var.d;
                fns fnsVar = igu.a;
                j0d1 j0d1Var = new j0d1(op71.z(zso1.H(q7r0Var.d.c.getLifecycle()).b));
                fnsVar.getClass();
                return new ty60(npa1.a, ev81Var, smo1.e(flo1.l(fnsVar, j0d1Var)), g38Var, true);
            case 2:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                em0 em0Var = nwpVar.a;
                dma1 dma1VarX = em0Var.X();
                c8o.l(dma1VarX);
                String strM3 = rt71.m(dma1VarX);
                daq daqVar = (daq) em0Var.b;
                azp0 azp0Var3 = (azp0) daqVar.sl.get();
                c8o.l(azp0Var3);
                czp0 czp0Var3 = (czp0) daqVar.tl.get();
                c8o.l(czp0Var3);
                bz81 bz81Var3 = (bz81) daqVar.x3.get();
                c8o.l(bz81Var3);
                t2j0 t2j0VarI0 = em0Var.i0();
                c8o.l(t2j0VarI0);
                return new ty60(npa1.a, new ev81(strM3, azp0Var3, czp0Var3, bz81Var3, new t8r0(t2j0VarI0, (yqg) nwpVar.i.get())), wg0.z((dg30) nwpVar.e.get()), g38Var, true);
            case 3:
                v5q v5qVar = ((thq) r7qVar).c;
                daq daqVar2 = v5qVar.b;
                return new ty60(npa1.a, new ev81(rt71.m((dma1) daqVar2.C1.get()), (azp0) daqVar2.sl.get(), (czp0) daqVar2.tl.get(), (bz81) daqVar2.x3.get(), new t8r0((t2j0) daqVar2.f2.get(), (yqg) daqVar2.J1.get())), wg0.z((dg30) v5qVar.i.a), g38Var, true);
            default:
                teq teqVar = r7qVar.d;
                daq daqVar3 = teqVar.d;
                return new ty60(npa1.a, new ev81(rt71.m((dma1) daqVar3.C1.get()), (azp0) daqVar3.sl.get(), (czp0) daqVar3.tl.get(), (bz81) daqVar3.x3.get(), new t8r0((t2j0) daqVar3.f2.get(), (yqg) daqVar3.J1.get())), wg0.z((dg30) teqVar.f.a), g38Var, true);
        }
    }
}
