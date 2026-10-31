package p;

import android.content.Context;
import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ lwp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final mr10 a(lik1 lik1Var, boolean z, Mode mode) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                Context applicationContext = ((Context) nwpVar.b.d).getApplicationContext();
                jc9 jc9Var = new jc9((e4c1) nwpVar.g0.get(), (byte) 26);
                v9c v9cVar = new v9c(false);
                nbc nbcVar = new nbc(false);
                em0 em0Var = nwpVar.a;
                t2j0 t2j0VarI0 = em0Var.i0();
                c8o.l(t2j0VarI0);
                i0y0 i0y0Var = new i0y0(t2j0VarI0, (byte) 0);
                iyc0 iyc0Var = (iyc0) ((teq) em0Var.c).g1.get();
                c8o.l(iyc0Var);
                a9m a9mVar = new a9m(new toj0(jc9Var, v9cVar, nbcVar, i0y0Var, new i0y0(iyc0Var, (byte) 1), new i0y0((taa1) nwpVar.h0.get(), (byte) 2), (byte) 12), (ay10) nwpVar.i0.get(), (xw10) nwpVar.j0.get());
                kt91 kt91VarD1 = em0Var.d1();
                c8o.l(kt91VarD1);
                a1r0 a1r0VarA0 = em0Var.A0();
                c8o.l(a1r0VarA0);
                return new mr10(new uq10(applicationContext, a9mVar, kt91VarD1, a1r0VarA0), (xw10) nwpVar.j0.get(), (ay10) nwpVar.i0.get(), (q8n) nwpVar.A.get(), lik1Var, z, mode);
            case 1:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                daq daqVar = v5qVar.b;
                uq10 uq10Var = new uq10((Context) daqVar.x1.a, (a9m) v5qVar.V6.get(), (kt91) daqVar.f8.get(), (a1r0) v5qVar.k1.get());
                daq daqVar2 = thqVar.b;
                return new mr10(uq10Var, (xw10) daqVar2.Yq.get(), (ay10) daqVar2.Xq.get(), (q8n) daqVar2.r2.get(), lik1Var, z, mode);
            case 2:
                r7q r7qVar2 = r7qVar;
                s7q s7qVar = (s7q) r7qVar2.d;
                daq daqVar3 = s7qVar.b;
                uq10 uq10Var2 = new uq10((Context) daqVar3.x1.a, (a9m) s7qVar.P6.get(), (kt91) daqVar3.f8.get(), (a1r0) s7qVar.X0.get());
                daq daqVar4 = r7qVar2.b;
                return new mr10(uq10Var2, (xw10) daqVar4.Yq.get(), (ay10) daqVar4.Xq.get(), (q8n) daqVar4.r2.get(), lik1Var, z, mode);
            default:
                r7q r7qVar3 = r7qVar;
                teq teqVar = r7qVar3.d;
                daq daqVar5 = teqVar.d;
                uq10 uq10Var3 = new uq10((Context) daqVar5.x1.a, (a9m) teqVar.kg.get(), (kt91) daqVar5.f8.get(), (a1r0) teqVar.V0.get());
                daq daqVar6 = r7qVar3.b;
                return new mr10(uq10Var3, (xw10) daqVar6.Yq.get(), (ay10) daqVar6.Xq.get(), (q8n) daqVar6.r2.get(), lik1Var, z, mode);
        }
    }
}
