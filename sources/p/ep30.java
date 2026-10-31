package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ep30 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ ep30(drr0 drr0Var, ven0 ven0Var, byte b) {
        this.a = b;
        this.b = drr0Var;
        this.c = ven0Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ven0 ven0Var = this.c;
        drr0 drr0Var = this.b;
        switch (b) {
            case 0:
                Object objD = rqd1.d(nav0Var, new tqm(drr0Var, ven0Var, (byte) 1), (iu30) null, (xu30) null, (iu30) null, lnmVar, 14);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                Object objD2 = s9p1.D(nav0Var, new cs70(new jj50(drr0Var, ven0Var, (byte) 15), new as70(drr0Var, ven0Var, (byte) 0), null, (byte) 0), lnmVar);
                if (objD2 != d9nVar) {
                    objD2 = rih1Var;
                }
                return objD2 == d9nVar ? objD2 : rih1Var;
            default:
                Object objD3 = rqd1.d(nav0Var, new tqm(drr0Var, ven0Var, (byte) 3), (iu30) null, (xu30) null, (iu30) null, lnmVar, 14);
                return objD3 == d9nVar ? objD3 : rih1Var;
        }
    }
}
