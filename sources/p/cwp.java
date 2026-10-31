package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cwp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ cwp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final z72 a(w9u0 w9u0Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) jly0Var).c;
                joe joeVarJ = nwpVar.j();
                a1r0 a1r0VarA0 = nwpVar.a.A0();
                c8o.l(a1r0VarA0);
                Flowable flowable = (Flowable) nwpVar.l.get();
                mr4 mr4VarF = nwpVar.f();
                tra0 tra0Var = (tra0) nwpVar.O0.get();
                ynb0 ynb0VarA = xqu.a(nwpVar.L0);
                pe peVarG = nwpVar.a.g();
                c8o.l(peVarG);
                return new z72(joeVarJ, a1r0VarA0, flowable, mr4VarF, tra0Var, ynb0VarA, peVarG, w9u0Var);
            default:
                thq thqVar = (thq) jly0Var;
                v5q v5qVar = (v5q) thqVar.c;
                joe joeVar = (joe) v5qVar.X8.get();
                a1r0 a1r0Var = (a1r0) v5qVar.k1.get();
                daq daqVar = thqVar.b;
                return new z72(joeVar, a1r0Var, (Flowable) daqVar.D5.get(), (mr4) daqVar.ri.get(), (tra0) v5qVar.a9.get(), xqu.a(daqVar.tq), (pe) daqVar.p9.get(), w9u0Var);
        }
    }
}
