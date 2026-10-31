package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kvp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ kvp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final wrm0 a(w9u0 w9u0Var, ty60 ty60Var, nrm0 nrm0Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, enk1 enk1Var, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, Function0 function2) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                lvp lvpVar = (lvp) nwpVar.I0.get();
                em0 em0Var = nwpVar.a;
                a1r0 a1r0VarA0 = em0Var.A0();
                c8o.l(a1r0VarA0);
                hrj0 hrj0Var = (hrj0) ((daq) em0Var.b).si.get();
                c8o.l(hrj0Var);
                q8n q8nVarG0 = em0Var.g0();
                c8o.l(q8nVarG0);
                return new wrm0(context, lvpVar, a1r0VarA0, hrj0Var, q8nVarG0, w9u0Var, ty60Var, nrm0Var, iu30Var, iu30Var2, iu30Var3, enk1Var, qim0Var, z, function0, function1, function2);
            case 1:
                thq thqVar = (thq) r7qVar;
                daq daqVar = thqVar.b;
                Context context2 = (Context) daqVar.x1.a;
                v5q v5qVar = (v5q) thqVar.c;
                return new wrm0(context2, (lvp) v5qVar.T4.get(), (a1r0) v5qVar.k1.get(), (hrj0) daqVar.si.get(), (q8n) daqVar.V2.get(), w9u0Var, ty60Var, nrm0Var, iu30Var, iu30Var2, iu30Var3, enk1Var, qim0Var, z, function0, function1, function2);
            case 2:
                r7q r7qVar2 = r7qVar;
                daq daqVar2 = r7qVar2.b;
                Context context3 = (Context) daqVar2.x1.a;
                s7q s7qVar = (s7q) r7qVar2.d;
                return new wrm0(context3, (lvp) s7qVar.d7.get(), (a1r0) s7qVar.X0.get(), (hrj0) daqVar2.si.get(), (q8n) daqVar2.V2.get(), w9u0Var, ty60Var, nrm0Var, iu30Var, iu30Var2, iu30Var3, enk1Var, qim0Var, z, function0, function1, function2);
            default:
                r7q r7qVar3 = r7qVar;
                daq daqVar3 = r7qVar3.b;
                Context context4 = (Context) daqVar3.x1.a;
                teq teqVar = r7qVar3.d;
                return new wrm0(context4, (lvp) teqVar.Df.get(), (a1r0) teqVar.V0.get(), (hrj0) daqVar3.si.get(), (q8n) daqVar3.V2.get(), w9u0Var, ty60Var, nrm0Var, iu30Var, iu30Var2, iu30Var3, enk1Var, qim0Var, z, function0, function1, function2);
        }
    }
}
