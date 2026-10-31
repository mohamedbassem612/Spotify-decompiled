package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bjq implements mxh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ obq b;

    public /* synthetic */ bjq(obq obqVar, byte b) {
        this.a = b;
        this.b = obqVar;
    }

    public final lxh0 a(x610 x610Var, PlayOrigin playOrigin) {
        byte b = this.a;
        obq obqVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = obqVar.b;
                g8q g8qVar = (g8q) daqVar.nf.get();
                qna1 qna1VarB2 = daqVar.b2();
                daq daqVar2 = (daq) ((ojq) obqVar.d).b;
                return new b13(g8qVar, qna1VarB2, new j2e0((a710) daqVar2.ui.get(), (g510) daqVar2.L5.get(), (byte) 4), (r8l) daqVar.ff.get(), (g0l) daqVar.E5.get(), x610Var, playOrigin);
            case 1:
                ojq ojqVar = (ojq) obqVar.d;
                cjq cjqVar = (cjq) ojqVar.R0.get();
                tp7 tp7VarG = ojqVar.g();
                tp7 tp7VarG2 = ojqVar.g();
                daq daqVar3 = obqVar.b;
                return new c77(x610Var, playOrigin, cjqVar, tp7VarG, tp7VarG2, (zle1) daqVar3.a3.get(), daqVar3.Z(), (g510) daqVar3.L5.get(), (d8q) daqVar3.ef.get(), (r8l) daqVar3.ff.get(), daqVar3.Y1(), (dxg1) daqVar3.Pa.get(), daqVar3.Y(), (phl1) daqVar3.gf.get(), (e8q) daqVar3.jf.get(), new uic(false), (f77) daqVar3.Po.get(), pdp1.q(new au4((luk) daqVar3.L1.get())));
            case 2:
                daq daqVar4 = obqVar.b;
                oyr oyrVarZ = daqVar4.Z();
                g510 g510Var = (g510) daqVar4.L5.get();
                d8q d8qVar = (d8q) daqVar4.ef.get();
                daq daqVar5 = (daq) ((ojq) obqVar.d).b;
                return new m741(x610Var, playOrigin, oyrVarZ, g510Var, d8qVar, new rm5((Flowable) daqVar5.D5.get(), (Scheduler) daqVar5.A2.get()), (fnh0) daqVar4.qc.get(), (r8l) daqVar4.ff.get(), daqVar4.Y1(), daqVar4.Y(), (phl1) daqVar4.gf.get(), (e8q) daqVar4.jf.get(), new uic(false), (yqg) daqVar4.J1.get());
            case 3:
                return new pyq0(x610Var, playOrigin, (fjq) ((ojq) obqVar.d).Z0.get(), (g8q) obqVar.b.nf.get());
            default:
                daq daqVar6 = obqVar.b;
                oyr oyrVarZ2 = daqVar6.Z();
                g510 g510Var2 = (g510) daqVar6.L5.get();
                d8q d8qVar2 = (d8q) daqVar6.ef.get();
                daq daqVar7 = (daq) ((ojq) obqVar.d).b;
                return new x43(x610Var, playOrigin, oyrVarZ2, g510Var2, d8qVar2, new rm5((Flowable) daqVar7.D5.get(), (Scheduler) daqVar7.A2.get()), (fnh0) daqVar6.qc.get(), (r8l) daqVar6.ff.get(), daqVar6.Y1(), daqVar6.Y(), (phl1) daqVar6.gf.get(), (e8q) daqVar6.jf.get(), new uic(false));
        }
    }
}
