package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z1p implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ z1p(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w88 w88Var = ((a2p) obj).a;
                return new l78((uu00) w88Var.a.get(), (krh) w88Var.b.get(), (o241) w88Var.c.get());
            case 1:
                return new c2p(this);
            case 2:
                ej8 ej8Var = (ej8) ((ham) obj).b;
                Context context = (Context) ej8Var.h.get();
                c8o.l(context);
                Activity activity = (Activity) ej8Var.a.get();
                c8o.l(activity);
                g1f0 g1f0Var = (g1f0) ej8Var.j.get();
                c8o.l(g1f0Var);
                g7h1 g7h1Var = (g7h1) ej8Var.o.get();
                c8o.l(g7h1Var);
                w5o w5oVar = new w5o(activity, g1f0Var, g7h1Var);
                q8n q8nVarX = brt.x();
                ohv0 ohv0Var = (ohv0) ej8Var.i.get();
                c8o.l(ohv0Var);
                r5o r5oVar = new r5o(gp41.h, ohv0Var);
                g1f0 g1f0Var2 = (g1f0) ej8Var.j.get();
                c8o.l(g1f0Var2);
                v4s0 v4s0Var = (v4s0) ej8Var.p.get();
                c8o.l(v4s0Var);
                jqt jqtVar = (jqt) ej8Var.q.get();
                c8o.l(jqtVar);
                nfa0 nfa0Var = (nfa0) ej8Var.r.get();
                c8o.l(nfa0Var);
                tzr0 tzr0Var = new tzr0(g1f0Var2, v4s0Var, jqtVar, new yrg0(nfa0Var, (byte) 5), (byte) 2);
                g1f0 g1f0Var3 = (g1f0) ej8Var.j.get();
                c8o.l(g1f0Var3);
                return new q5o(context, w5oVar, q8nVarX, r5oVar, tzr0Var, g1f0Var3);
            case 3:
                return new e2p(this);
            case 4:
                return new mt8(new CosmosTransport(new sn0((RxRouter) ((g2p) obj).a.b.get(), (byte) 5)));
            case 5:
                return u1n0.z((q7r0) ((gal) obj).b);
            case 6:
                return u1n0.z((q7r0) ((ham) obj).b);
            case 7:
                return u1n0.z((q7r0) ((oql) obj).b);
            case 8:
                return new u2p(this);
            case 9:
                lzn0 lzn0Var = (lzn0) ((l0q) ((gal) obj).b).a.i.get();
                c8o.l(lzn0Var);
                return new na9(lzn0Var, (byte) 1);
            case 10:
                return new v2p(this);
            case 11:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((z2b) ((oql) obj).b).a.get();
                c8o.l(retrofitMaker);
                return (i4b) retrofitMaker.createWebgateService(i4b.class, "android-blend-socialprompting-network");
            case 12:
                return new w2p(this);
            case 13:
                return new y2p(this);
            case 14:
                return new b3p(this);
            case 15:
                return pzm.h((mos) ((zwb) ((d3p) obj).a).a.get());
            case 16:
                return pzm.h((mos) ((ogd) ((z2p) obj).b).c.get());
            case 17:
                return u1n0.z((q7r0) ((ham) obj).b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                cwe cweVar = (cwe) ((zve) ((d3p) obj).a).c.get();
                c8o.l(cweVar);
                return cweVar;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                loo0 loo0Var = (loo0) ((z9f) ((z2p) obj).b).f.get();
                c8o.l(loo0Var);
                return loo0Var;
            case 20:
                x2p x2pVar = (x2p) obj;
                return new qtf(u1n0.z((q7r0) x2pVar.d), (vtf) x2pVar.c);
            case 21:
                return u1n0.z((q7r0) ((b6p) obj).b);
            case 22:
                return u1n0.z((q7r0) ((x2p) obj).d);
            case 23:
                return ((qop) ((d3p) obj).a).f();
            case 24:
                x2p x2pVar2 = (x2p) obj;
                return new res(((jbt) x2pVar2.c).b, ((qop) x2pVar2.d).d(), new gqg());
            case 25:
                wzn wznVar = (wzn) obj;
                pqg pqgVar = (pqg) wznVar.a;
                nqg nqgVar = (nqg) wznVar.b;
                uu00 uu00Var = (uu00) nqgVar.c.get();
                c8o.l(uu00Var);
                w6e0 w6e0Var = new w6e0(new lim0("clips-grid", uu00Var));
                q7r0 q7r0Var = (q7r0) wznVar.c;
                iac0 iac0Var = q7r0Var.d.c;
                c8o.m(iac0Var);
                luk lukVar = (luk) nqgVar.d.get();
                c8o.l(lukVar);
                xf4 xf4Var = new xf4(lukVar);
                luk lukVar2 = (luk) nqgVar.d.get();
                c8o.l(lukVar2);
                oqg oqgVar = new oqg(new xf4(lukVar2), q7r0Var, (byte) 0);
                heq heqVar = (heq) nqgVar.e.get();
                c8o.l(heqVar);
                lag lagVar = new lag((Object) iac0Var, (Object) xf4Var, (Object) oqgVar, (Object) heqVar, (byte) 6);
                q8n q8nVar = (q8n) nqgVar.a.get();
                c8o.l(q8nVar);
                return new lqg(pqgVar, w6e0Var, q7r0Var, lagVar, q8nVar);
            case 26:
                return new br0(((z0q) ((z2p) obj).b).a.F1());
            case 27:
                return new j6p(this);
            case 28:
                e390 e390Var = new e390();
                vi2 vi2Var = ((b7p) obj).a;
                return new bxh(e390Var, (uu00) vi2Var.a.get(), (xrc0) vi2Var.b.get(), (q8n) vi2Var.c.get());
            default:
                return new f7p(this);
        }
    }
}
