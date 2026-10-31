package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vo7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo7(wo7 wo7Var, byte b) {
        super(0);
        this.a = b;
        this.b = wo7Var;
    }

    public final Object invoke() {
        x7i1 x7i1Var;
        byte b = this.a;
        wo7 wo7Var = this.b;
        switch (b) {
            case 0:
                hdn1 hdn1Var = wo7Var.h;
                i1r i1rVarN = x2p1.n(wo7Var.b, wo7Var.o, wo7Var.d);
                i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                qxc0 qxc0Var = i1rVar != null ? (qxc0) i1rVar.a : null;
                return new wa8((qxc0Var == null || (x7i1Var = qxc0Var.t) == null || !x7i1Var.b) ? b821.a : new a821(hdn1Var.b), 5);
            default:
                ajq0 ajq0Var = wo7Var.e;
                lik1 lik1Var = wo7Var.a;
                d0r d0rVar = wo7Var.b;
                yzc0 yzc0Var = wo7Var.c;
                tu11 tu11Var = wo7Var.j;
                n5 n5Var = new n5(1, tu11Var, tu11.class, "wrap", "wrap(Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseRowEventsHandler;)Lcom/spotify/creativeworkplatform/releaserowelement/ReleaseRowEventsHandler;", 0, (byte) 20);
                pux0 pux0Var = new pux0(wo7Var.g, tu11Var, (byte) 27);
                boolean zT = bzn1.t(wo7Var.l);
                uxy0 uxy0Var = wo7Var.f;
                return new wqw(new xzq(ajq0.q(ajq0Var, lik1Var, d0rVar, new vo7(wo7Var, (byte) 0), pux0Var, yzc0Var, ((i5y0) uxy0Var.c).f() ? new kpg0((d511) uxy0Var.b, ss11.e1) : null, new qlb(d0rVar, new xzq(wo7Var.i, ge7.N0), hap1.t(wo7Var.k)), n5Var, zT, 1216), new rr6(wo7Var, (byte) 15)));
        }
    }
}
