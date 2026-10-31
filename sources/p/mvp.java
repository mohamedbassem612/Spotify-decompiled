package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mvp implements tra0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ mvp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final mta0 a(w9u0 w9u0Var, Function0 function0) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                a1r0 a1r0VarA0 = nwpVar.a.A0();
                c8o.l(a1r0VarA0);
                yo2 yo2Var = (yo2) nwpVar.L0.get();
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                em0 em0Var = nwpVar.a;
                daq daqVar = (daq) em0Var.b;
                ut71 ut71Var = (ut71) daqVar.g2.get();
                c8o.l(ut71Var);
                mr20 mr20Var = (mr20) daqVar.cc.get();
                c8o.l(mr20Var);
                rqa0 rqa0Var = new rqa0(context, ut71Var, mr20Var);
                mr4 mr4VarF = nwpVar.f();
                kvp kvpVar = (kvp) nwpVar.J0.get();
                mpa1 mpa1Var = (mpa1) nwpVar.K0.get();
                g38 g38Var = (g38) ((daq) em0Var.b).rl.get();
                c8o.l(g38Var);
                dma1 dma1VarZ0 = em0Var.Z0();
                c8o.l(dma1VarZ0);
                exg1 exg1Var = new exg1(dma1VarZ0, nwpVar.f());
                pe peVarG = em0Var.g();
                c8o.l(peVarG);
                return new mta0(a1r0VarA0, yo2Var, rqa0Var, mr4VarF, kvpVar, w9u0Var, mpa1Var, g38Var, exg1Var, peVarG, (g9m) nwpVar.p0.get(), (hfp) nwpVar.N0.get(), (yqg) nwpVar.i.get(), function0);
            case 1:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = thqVar.c;
                a1r0 a1r0Var = (a1r0) v5qVar.k1.get();
                daq daqVar2 = thqVar.b;
                yo2 yo2Var2 = (yo2) daqVar2.tq.get();
                v5qVar.getClass();
                daq daqVar3 = v5qVar.b;
                return new mta0(a1r0Var, yo2Var2, new rqa0((Context) daqVar3.x1.a, (ut71) daqVar3.g2.get(), (mr20) daqVar3.cc.get()), (mr4) daqVar2.ri.get(), (kvp) v5qVar.U4.get(), w9u0Var, (mpa1) v5qVar.W4.get(), (g38) daqVar2.rl.get(), (exg1) v5qVar.S4.get(), (pe) daqVar2.p9.get(), (g9m) v5qVar.Q4.get(), (hfp) v5qVar.Z8.get(), (yqg) daqVar2.J1.get(), function0);
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                a1r0 a1r0Var2 = (a1r0) teqVar.V0.get();
                daq daqVar4 = r7qVar2.b;
                yo2 yo2Var3 = (yo2) daqVar4.tq.get();
                teqVar.getClass();
                daq daqVar5 = teqVar.d;
                return new mta0(a1r0Var2, yo2Var3, new rqa0((Context) daqVar5.x1.a, (ut71) daqVar5.g2.get(), (mr20) daqVar5.cc.get()), (mr4) daqVar4.ri.get(), (kvp) teqVar.Ef.get(), w9u0Var, (mpa1) teqVar.Ff.get(), (g38) daqVar4.rl.get(), (exg1) teqVar.Cf.get(), (pe) daqVar4.p9.get(), (g9m) teqVar.Gf.get(), (hfp) teqVar.If.get(), (yqg) daqVar4.J1.get(), function0);
        }
    }
}
