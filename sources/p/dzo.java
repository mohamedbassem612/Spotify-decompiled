package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dzo implements zu70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dzo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.zu70
    public final ug3 b(epb1 epb1Var, kly0 kly0Var, u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, boolean z) {
        byte b = this.a;
        bsp bspVar = this.b;
        switch (b) {
            case 0:
                gw70 gw70VarG = ((hc3) ((ezo) ((fwo) bspVar).c).v).g();
                c8o.l(gw70VarG);
                return new ug3(epb1Var, kly0Var, u0iVar, lzn0Var, vgmVar, z, gw70VarG);
            case 1:
                gw70 gw70VarB = ((i7c) ((s3p) ((b2p) bspVar).c).X0).b();
                c8o.l(gw70VarB);
                return new ug3(epb1Var, kly0Var, u0iVar, lzn0Var, vgmVar, z, gw70VarB);
            case 2:
                gw70 gw70VarE = ((i1o) ((u9p) ((d7p) bspVar).c).C).e();
                c8o.l(gw70VarE);
                return new ug3(epb1Var, kly0Var, u0iVar, lzn0Var, vgmVar, z, gw70VarE);
            default:
                gw70 gw70Var = (gw70) ((z9n0) ((c21) bspVar.c).b).j.get();
                c8o.l(gw70Var);
                return new ug3(epb1Var, kly0Var, u0iVar, lzn0Var, vgmVar, z, gw70Var);
        }
    }
}
