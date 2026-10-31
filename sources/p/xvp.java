package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ xvp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final hn9 a(d0r d0rVar, int i, boolean z) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) thqVar).c;
                rm9 rm9Var = (rm9) ((daq) nwpVar.a.b).Un.get();
                c8o.l(rm9Var);
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                em0 em0Var = nwpVar.a;
                kt91 kt91VarD1 = em0Var.d1();
                c8o.l(kt91VarD1);
                gbp gbpVar = nwpVar.Z;
                rm9 rm9Var2 = (rm9) ((daq) em0Var.b).Un.get();
                c8o.l(rm9Var2);
                kt91 kt91VarD2 = em0Var.d1();
                c8o.l(kt91VarD2);
                yxb0 yxb0Var = new yxb0(rm9Var2, kt91VarD2, nwpVar.Z);
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                return new hn9(rm9Var, gw70VarA0, lzn0Var, kt91VarD1, gbpVar, yxb0Var, xoi1.b(context), d0rVar, i, z);
            case 1:
                thq thqVar2 = thqVar;
                daq daqVar = thqVar2.b;
                rm9 rm9Var3 = (rm9) daqVar.Un.get();
                gw70 gw70Var = (gw70) daqVar.d8.get();
                v5q v5qVar = thqVar2.c;
                lzn0 lzn0Var2 = (lzn0) v5qVar.U0.get();
                kt91 kt91Var = (kt91) daqVar.f8.get();
                caq caqVar = daqVar.A5;
                daq daqVar2 = v5qVar.b;
                return new hn9(rm9Var3, gw70Var, lzn0Var2, kt91Var, caqVar, new yxb0((rm9) daqVar2.Un.get(), (kt91) daqVar2.f8.get(), daqVar2.A5), xoi1.b((Context) daqVar2.x1.a), d0rVar, i, z);
            default:
                thq thqVar3 = thqVar;
                daq daqVar3 = thqVar3.b;
                rm9 rm9Var4 = (rm9) daqVar3.Un.get();
                gw70 gw70Var2 = (gw70) daqVar3.d8.get();
                teq teqVar = thqVar3.c;
                lzn0 lzn0Var3 = (lzn0) teqVar.i.get();
                kt91 kt91Var2 = (kt91) daqVar3.f8.get();
                caq caqVar2 = daqVar3.A5;
                daq daqVar4 = teqVar.a.a;
                return new hn9(rm9Var4, gw70Var2, lzn0Var3, kt91Var2, caqVar2, new yxb0((rm9) daqVar4.Un.get(), (kt91) daqVar4.f8.get(), daqVar4.A5), x2p1.p((Context) teqVar.d.x1.a), d0rVar, i, z);
        }
    }
}
