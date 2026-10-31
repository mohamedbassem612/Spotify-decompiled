package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uqm implements PointerInputEventHandler {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ drr0 c;
    public final /* synthetic */ ven0 d;

    public uqm(iu30 iu30Var, drr0 drr0Var, ven0 ven0Var) {
        this.b = iu30Var;
        this.c = drr0Var;
        this.d = ven0Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        ven0 ven0Var = this.d;
        drr0 drr0Var = this.c;
        iu30 iu30Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Object objD = rqd1.d(nav0Var, new tqm(drr0Var, ven0Var, (byte) 0), new usj(iu30Var, (byte) 26), (xu30) null, (iu30) null, lnmVar, 12);
                return objD == d9nVar ? objD : rih1Var;
            default:
                Object objD2 = s9p1.D(nav0Var, new cs70(new bp50(iu30Var, drr0Var, ven0Var), new xvy(iu30Var, drr0Var, ven0Var, (byte) 17), null, (byte) 1), lnmVar);
                if (objD2 != d9nVar) {
                    objD2 = rih1Var;
                }
                return objD2 == d9nVar ? objD2 : rih1Var;
        }
    }

    public uqm(drr0 drr0Var, ven0 ven0Var, iu30 iu30Var) {
        this.c = drr0Var;
        this.d = ven0Var;
        this.b = iu30Var;
    }
}
