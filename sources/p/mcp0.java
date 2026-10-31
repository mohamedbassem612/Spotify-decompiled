package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mcp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcp0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new mtt(((vap0) obj).b.m());
            case 1:
                RxRouter rxRouterZ = ((rbp0) obj).b.z();
                mtt mttVar = new mtt();
                mttVar.b = new myq0(new vfs0(new CosmosTransport(new x430(rxRouterZ, (byte) 3))));
                hhp0 hhp0Var = hhp0.a;
                if (hhp0.y()) {
                    myq0 myq0Var = (myq0) mttVar.b;
                    khp0 khp0VarX = hhp0.x();
                    khp0 khp0Var = khp0VarX instanceof khp0 ? khp0VarX : null;
                    if (khp0Var != null) {
                        khp0Var.y = myq0Var;
                    }
                }
                return mttVar;
            case 2:
                return new mtt((j0u0) ((adp0) obj).invoke());
            case 3:
                return new r4u0(new z3u0(new CosmosCoroutineTransport(new ny5((CallbackRouter) ((ycp0) obj).invoke(), (byte) 28))));
            case 4:
                return new mtt((ifs) ((adp0) obj).invoke());
            case 5:
                return new bhv0(new lg4(kg4.b, (ez11) ((hdp0) obj).invoke()));
            case 6:
                return new mtt((lkx0) ((adp0) obj).invoke());
            case 7:
                return new fz11((lw21) ((bbp0) obj).invoke());
            case 8:
                return new qz11((lw21) ((qcp0) obj).invoke());
            case 9:
                return new tz11(new l8r(k8r.b, (xz11) ((hbp0) obj).invoke()));
            case 10:
                return new m841(new aw4(false, true, (feh1) ((kly0) ((hbp0) obj).invoke()).get()));
            case 11:
                return new q((vb41) ((zbp0) obj).invoke());
            case 12:
                return new g651((q8n) ((jdp0) obj).invoke());
            case 13:
                return new h651((g651) ((hdp0) obj).invoke());
            case 14:
                return ((ex01) obj).a;
            case 15:
                return new qt71((dma1) ((mdp0) obj).invoke());
            case 16:
                return new u1b1((v1b1) ((acp0) obj).invoke());
            case 17:
                return new u1b1((xh61) ((acp0) obj).invoke());
            case 18:
                return new ilb1((x8c0) ((bbp0) obj).invoke());
            case 19:
                return new wjc1((vco0) ((y52) obj).invoke());
            case 20:
                return new u1b1((fvc1) ((adp0) obj).invoke(), (byte) 2);
            case 21:
                return new q((vtk1) ((adp0) obj).invoke());
            case 22:
                return new u1b1((xi61) ((cdp0) obj).invoke());
            case 23:
                return new kdj1((vwj1) ((ecp0) obj).b.t3.get());
            case 24:
                return new elj1((kma) ((ldp0) obj).invoke());
            case 25:
                gkp gkpVar = ((ybp0) obj).b.s3;
                voa voaVar = gkpVar.a;
                mrj1 mrj1Var = (mrj1) voaVar.A;
                c8o.l(mrj1Var);
                jly0 jly0Var = gkpVar.u;
                vwp vwpVar = (vwp) gkpVar.L.get();
                yna ynaVar = vwpVar.a;
                hna hnaVar = vwpVar.b;
                oup0 oup0Var = vwpVar.c;
                uu00 uu00Var = vwpVar.d;
                Scheduler scheduler = vwpVar.e;
                kl1 kl1Var = new kl1();
                kl1Var.b = oup0Var;
                kl1Var.c = uu00Var;
                kl1Var.d = scheduler;
                hqp0 hqp0Var = new hqp0(ynaVar, hnaVar, kl1Var, new uqp0(oup0Var), vwpVar.f);
                lvw0 lvw0Var = (lvw0) gkpVar.q.get();
                ynb0 ynb0VarA = xqu.a(gkpVar.b);
                o241 o241VarJ = gkpVar.a.j();
                c8o.l(o241VarJ);
                Single singleB = f580.b(new g931(ynb0VarA, o241VarJ));
                rma rmaVar = (rma) gkpVar.c.get();
                aj4 aj4VarA = gkpVar.a();
                y2g0 y2g0Var = (y2g0) voaVar.s;
                c8o.l(y2g0Var);
                o5n o5nVar = (o5n) gkpVar.d.get();
                RxRouter rxRouter = (RxRouter) voaVar.a;
                c8o.l(rxRouter);
                be beVarY = j9g0.y(rxRouter);
                luk lukVar = (luk) voaVar.d;
                c8o.l(lukVar);
                huh0 huh0Var = new huh0(beVarY, j5.a, new sb4(false, lukVar));
                q8n q8nVar = (q8n) voaVar.q;
                c8o.l(q8nVar);
                return new upy0(mrj1Var, jly0Var, hqp0Var, lvw0Var, singleB, rmaVar, aj4VarA, y2g0Var, o5nVar, huh0Var, q8nVar);
            case 26:
                return new u1b1((ftk1) ((cdp0) obj).invoke());
            case 27:
                return new u1b1((zsk1) ((cdp0) obj).invoke());
            case 28:
                return new u1b1((znl1) ((cdp0) obj).invoke(), (byte) 6);
            default:
                return new u1b1((eol1) ((cdp0) obj).invoke());
        }
    }
}
