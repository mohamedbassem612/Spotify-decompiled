package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ jmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yvp0 a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                urk0 urk0Var = new urk0((byte) 4);
                kop kopVar = (kop) ((blp) ykqVar).c;
                ww41 ww41Var = kopVar.a;
                Flowable flowableF = ww41Var.f();
                c8o.l(flowableF);
                xrc0 xrc0Var = (xrc0) kopVar.q.get();
                iz00 iz00VarI0 = ww41Var.I0();
                c8o.l(iz00VarI0);
                ywc0 ywc0VarU0 = ww41Var.u0();
                c8o.l(ywc0VarU0);
                i4q i4qVarZ0 = ww41Var.z0();
                c8o.l(i4qVarZ0);
                yhm yhmVarA0 = ww41Var.A0();
                c8o.l(yhmVarA0);
                boolean zH0 = ww41Var.h0();
                e8r0 e8r0Var = (e8r0) kopVar.f16p.get();
                Scheduler schedulerU = ww41Var.U();
                c8o.l(schedulerU);
                lgy lgyVar = new lgy(flowableF, xrc0Var, iz00VarI0, ywc0VarU0, i4qVarZ0, yhmVarA0, zH0, e8r0Var, schedulerU);
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                return new yvp0(urk0Var, lgyVar, new r0s0(new zfx(xfxVarC0.c, (byte) 10), (yqg) kopVar.d.get(), kopVar.d(), (byte) 26), j2h1Var, iu30Var);
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                apq apqVar = (apq) ykqVar.c;
                v651 v651Var = apqVar.a;
                Flowable flowableF2 = v651Var.f();
                c8o.l(flowableF2);
                xrc0 xrc0Var2 = (xrc0) apqVar.f1p.get();
                iz00 iz00VarI1 = v651Var.I0();
                c8o.l(iz00VarI1);
                ywc0 ywc0VarU1 = v651Var.u0();
                c8o.l(ywc0VarU1);
                i4q i4qVarZ1 = v651Var.z0();
                c8o.l(i4qVarZ1);
                yhm yhmVarA1 = v651Var.A0();
                c8o.l(yhmVarA1);
                boolean zH1 = v651Var.h0();
                e8r0 e8r0Var2 = (e8r0) apqVar.o.get();
                Scheduler schedulerU2 = v651Var.U();
                c8o.l(schedulerU2);
                lgy lgyVar2 = new lgy(flowableF2, xrc0Var2, iz00VarI1, ywc0VarU1, i4qVarZ1, yhmVarA1, zH1, e8r0Var2, schedulerU2);
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                return new yvp0(urk0Var2, lgyVar2, new r0s0(new zfx(xfxVarC1.c, (byte) 10), (yqg) apqVar.d.get(), apqVar.d(), (byte) 26), j2h1Var, iu30Var);
        }
    }
}
