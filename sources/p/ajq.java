package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ajq implements wih0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ obq b;

    public /* synthetic */ ajq(obq obqVar, byte b) {
        this.a = b;
        this.b = obqVar;
    }

    @Override // p.wih0
    public final vih0 a(ruk rukVar, x610 x610Var, lxh0 lxh0Var) {
        byte b = this.a;
        obq obqVar = this.b;
        switch (b) {
            case 0:
                ojq ojqVar = (ojq) obqVar.d;
                daq daqVar = (daq) ojqVar.b;
                yu3 yu3Var = new yu3((aai0) daqVar.D9.get(), ojqVar.f(), (a6h1) daqVar.lf.get(), (Context) daqVar.x1.a, new uic(false));
                daq daqVar2 = obqVar.b;
                return new b74(rukVar, x610Var, lxh0Var, yu3Var, (g510) daqVar2.L5.get(), daqVar2.Z(), ojqVar.d(), (r8l) daqVar2.ff.get(), (yqg) daqVar2.J1.get(), (xgb0) ojqVar.c.get(), daqVar2.Y(), (a6h1) daqVar2.lf.get(), new y6x0((byte) 28), (Scheduler) daqVar2.z1.get(), (oih0) ojqVar.g.get(), new uic(false));
            case 1:
                ojq ojqVar2 = (ojq) obqVar.d;
                return new apg1(rukVar, x610Var, lxh0Var, (kjq) ojqVar2.h.get(), (oih0) ojqVar2.g.get(), ojqVar2.f(), (q8n) obqVar.b.E1.get());
            case 2:
                ojq ojqVar3 = (ojq) obqVar.d;
                kjq kjqVar = (kjq) ojqVar3.h.get();
                oih0 oih0Var = (oih0) ojqVar3.g.get();
                q881 q881VarF = ojqVar3.f();
                daq daqVar3 = obqVar.b;
                return new dkm1(rukVar, x610Var, lxh0Var, kjqVar, oih0Var, q881VarF, (mr20) daqVar3.Xo.get(), (q8n) daqVar3.E1.get());
            case 3:
                ojq ojqVar4 = (ojq) obqVar.d;
                q881 q881VarF2 = ojqVar4.f();
                daq daqVar4 = obqVar.b;
                g510 g510Var = (g510) daqVar4.L5.get();
                xap xapVarB = ojqVar4.b();
                oyr oyrVarZ = daqVar4.Z();
                k811 k811VarD = ojqVar4.d();
                r8l r8lVar = (r8l) daqVar4.ff.get();
                yqg yqgVar = (yqg) daqVar4.J1.get();
                xgb0 xgb0Var = (xgb0) ojqVar4.c.get();
                u210 u210VarY = daqVar4.Y();
                tk00.d((ghp) daqVar4.qa.get());
                return new y9t(rukVar, x610Var, lxh0Var, q881VarF2, g510Var, xapVarB, oyrVarZ, k811VarD, r8lVar, yqgVar, xgb0Var, u210VarY, (oih0) ojqVar4.g.get(), new uic(false));
            case 4:
                ojq ojqVar5 = (ojq) obqVar.d;
                q881 q881VarF3 = ojqVar5.f();
                daq daqVar5 = obqVar.b;
                return new fmk1(rukVar, x610Var, lxh0Var, q881VarF3, (g510) daqVar5.L5.get(), daqVar5.Z(), ojqVar5.d(), (r8l) daqVar5.ff.get(), (yqg) daqVar5.J1.get(), (xgb0) ojqVar5.c.get(), daqVar5.Y(), (oih0) ojqVar5.g.get(), new uic(false));
            case 5:
                ojq ojqVar6 = (ojq) obqVar.d;
                kjq kjqVar2 = (kjq) ojqVar6.h.get();
                zv4 zv4Var = new zv4(false, false, false, (luk) ((daq) ojqVar6.b).L1.get());
                q881 q881VarF4 = ojqVar6.f();
                q8n q8nVar = (q8n) obqVar.b.E1.get();
                oih0 oih0Var2 = (oih0) ojqVar6.g.get();
                daq daqVar6 = (daq) ojqVar6.b;
                return new e841(rukVar, x610Var, lxh0Var, kjqVar2, zv4Var, q881VarF4, q8nVar, new kpw(oih0Var2, (mr20) daqVar6.Wo.get()), new ajq0(ojqVar6.e(), q03.B((dyo) daqVar6.Vo.get()), new myy((Context) daqVar6.x1.a, (aai0) daqVar6.D9.get()), (g510) daqVar6.L5.get(), (q8n) daqVar6.E1.get()));
            default:
                return new rfl1(rukVar, x610Var, lxh0Var, (kjq) ((ojq) obqVar.d).h.get(), obqVar.b.l2());
        }
    }
}
