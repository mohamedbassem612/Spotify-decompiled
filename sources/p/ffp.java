package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ffp implements mpa1 {
    public final /* synthetic */ lbp a;

    public ffp(lbp lbpVar) {
        this.a = lbpVar;
    }

    public final ty60 a(g38 g38Var) {
        lbp lbpVar = this.a;
        wgp wgpVarA = lbp.a(lbpVar);
        qk00 qk00Var = wgpVarA.a;
        dma1 dma1Var = (dma1) qk00Var.Z1.get();
        c8o.l(dma1Var);
        String strM = rt71.m(dma1Var);
        azp0 azp0Var = (azp0) qk00Var.z1.get();
        c8o.l(azp0Var);
        czp0 czp0Var = (czp0) qk00Var.A1.get();
        c8o.l(czp0Var);
        bz81 bz81Var = (bz81) qk00Var.Y1.get();
        c8o.l(bz81Var);
        t2j0 t2j0VarF = qk00Var.f();
        c8o.l(t2j0VarF);
        ev81 ev81Var = new ev81(strM, azp0Var, czp0Var, bz81Var, new t8r0(t2j0VarF, (yqg) wgpVarA.f.get()));
        gj5 gj5Var = (gj5) lbp.a(lbpVar).a.W.get();
        c8o.l(gj5Var);
        return new ty60(npa1.a, ev81Var, s4a1.A(f7z.h(gj5Var)), g38Var, true);
    }
}
