package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class avp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ avp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final s1 a(d0r d0rVar, y0 y0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                a1r0 a1r0VarA0 = nwpVar.a.A0();
                c8o.l(a1r0VarA0);
                em0 em0Var = nwpVar.a;
                gw70 gw70VarA0 = em0Var.a0();
                c8o.l(gw70VarA0);
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                ftr ftrVar = (ftr) ((daq) em0Var.b).Kp.get();
                c8o.l(ftrVar);
                return new s1(lzn0Var, a1r0VarA0, gw70VarA0, new l6s(context, ftrVar, (yqg) nwpVar.i.get()), (f2p) nwpVar.t0.get(), (gri0) nwpVar.u0.get(), new xf4((luk) nwpVar.g.get()), d0rVar, y0Var);
            case 1:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                lzn0 lzn0Var2 = (lzn0) v5qVar.U0.get();
                a1r0 a1r0Var = (a1r0) v5qVar.k1.get();
                gw70 gw70Var = (gw70) thqVar.b.d8.get();
                daq daqVar = v5qVar.b;
                return new s1(lzn0Var2, a1r0Var, gw70Var, new l6s((Context) daqVar.x1.a, (ftr) daqVar.Kp.get(), (yqg) daqVar.J1.get()), (f2p) v5qVar.j7.get(), (gri0) v5qVar.k7.get(), (xf4) v5qVar.h7.get(), d0rVar, y0Var);
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                lzn0 lzn0Var3 = (lzn0) teqVar.i.get();
                a1r0 a1r0Var2 = (a1r0) teqVar.V0.get();
                gw70 gw70Var2 = (gw70) r7qVar2.b.d8.get();
                daq daqVar2 = teqVar.d;
                return new s1(lzn0Var3, a1r0Var2, gw70Var2, new l6s((Context) daqVar2.x1.a, (ftr) daqVar2.Kp.get(), (yqg) daqVar2.J1.get()), (f2p) teqVar.Ua.get(), (gri0) teqVar.Va.get(), (xf4) teqVar.Wa.get(), d0rVar, y0Var);
        }
    }
}
