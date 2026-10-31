package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ tmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yvp0 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                zfx zfxVar = new zfx(xfxVarC0.c, (byte) 8);
                urk0 urk0Var = new urk0((byte) 4);
                ww41 ww41Var = kopVar.a;
                Flowable flowableF = ww41Var.f();
                c8o.l(flowableF);
                zr00 zr00VarL = ww41Var.L();
                c8o.l(zr00VarL);
                yh2 yh2VarW = ww41Var.w();
                c8o.l(yh2VarW);
                vgm vgmVarL0 = ww41Var.L0();
                c8o.l(vgmVarL0);
                c4n0 c4n0Var = new c4n0(kopVar.c);
                ne neVarR = kopVar.r();
                waz0 waz0VarY = ww41Var.Y();
                c8o.l(waz0VarY);
                return new yvp0(zfxVar, urk0Var, new p410(flowableF, zr00VarL, yh2VarW, vgmVarL0, c4n0Var, neVarR, waz0VarY, (byte) 26), (yqg) kopVar.d.get(), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                zfx zfxVar2 = new zfx(xfxVarC1.c, (byte) 8);
                urk0 urk0Var2 = new urk0((byte) 4);
                v651 v651Var = apqVar.a;
                Flowable flowableF2 = v651Var.f();
                c8o.l(flowableF2);
                zr00 zr00VarL2 = v651Var.L();
                c8o.l(zr00VarL2);
                yh2 yh2VarW2 = v651Var.w();
                c8o.l(yh2VarW2);
                vgm vgmVarL1 = v651Var.L0();
                c8o.l(vgmVarL1);
                c4n0 c4n0Var2 = new c4n0(apqVar.c);
                ne neVarQ = apqVar.q();
                waz0 waz0VarY2 = v651Var.Y();
                c8o.l(waz0VarY2);
                return new yvp0(zfxVar2, urk0Var2, new p410(flowableF2, zr00VarL2, yh2VarW2, vgmVarL1, c4n0Var2, neVarQ, waz0VarY2, (byte) 26), (yqg) apqVar.d.get(), iu30Var);
        }
    }
}
