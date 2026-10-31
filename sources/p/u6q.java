package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u6q implements hl3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ u6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.hl3
    public final wj3 a(String str, Flowable flowable) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                r7q r7qVar2 = r7qVar;
                daq daqVar = r7qVar2.b;
                xrc0 xrc0Var = (xrc0) daqVar.f5.get();
                s7q s7qVar = (s7q) r7qVar2.d;
                h72 h72VarV2 = s7qVar.v2();
                ip91 ip91Var = (ip91) daqVar.g8.get();
                agc0 agc0Var = (agc0) daqVar.B7.get();
                oj3 oj3Var = (oj3) s7qVar.X2.get();
                jo91 jo91Var = (jo91) daqVar.r7.get();
                cfr cfrVar = (cfr) s7qVar.V2.get();
                Scheduler scheduler = (Scheduler) daqVar.z1.get();
                ljg ljgVar = (ljg) s7qVar.m1.get();
                fl1 fl1Var = new fl1((w4q) s7qVar.w3.get(), (byte) 0);
                daq daqVar2 = s7qVar.b;
                return new wj3(str, xrc0Var, h72VarV2, ip91Var, flowable, agc0Var, oj3Var, jo91Var, cfrVar, scheduler, ljgVar, fl1Var, new a78((kt91) daqVar2.f8.get(), (dg30) s7qVar.t.a, (dto0) daqVar2.eg.get(), (q8n) daqVar2.V2.get()), (pqs) daqVar.ka.get());
            default:
                thq thqVar = (thq) r7qVar;
                teq teqVar = thqVar.c;
                xrc0 xrc0Var2 = (xrc0) teqVar.e1.get();
                h72 h72VarU0 = teqVar.b.u0();
                daq daqVar3 = thqVar.b;
                ip91 ip91Var2 = (ip91) daqVar3.g8.get();
                agc0 agc0Var2 = (agc0) daqVar3.B7.get();
                oj3 oj3Var2 = (oj3) teqVar.k1.get();
                jo91 jo91Var2 = (jo91) daqVar3.r7.get();
                cfr cfrVar2 = (cfr) teqVar.f1.get();
                Scheduler scheduler2 = (Scheduler) daqVar3.z1.get();
                ljg ljgVar2 = (ljg) teqVar.k4.get();
                fl1 fl1VarD = teqVar.d();
                yiq yiqVar = teqVar.b;
                daq daqVar4 = yiqVar.a;
                return new wj3(str, xrc0Var2, h72VarU0, ip91Var2, flowable, agc0Var2, oj3Var2, jo91Var2, cfrVar2, scheduler2, ljgVar2, fl1VarD, new a78((kt91) daqVar4.f8.get(), (dg30) yiqVar.b.f.a, (dto0) daqVar4.eg.get(), (q8n) daqVar4.V2.get()), (pqs) daqVar3.ka.get());
        }
    }
}
