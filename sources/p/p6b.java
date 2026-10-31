package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p6b implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ p6b(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                Object objH1 = ((j8d1) nav0Var).H1(new o6b(ven0Var, null, (byte) 0), lnmVar);
                return objH1 == d9nVar ? objH1 : rih1Var;
            case 1:
                Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new cy7(ven0Var, (byte) 10), lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
            case 2:
                Object objD2 = rqd1.d(nav0Var, (iu30) null, new f4g(ven0Var, (byte) 9), (xu30) null, (iu30) null, lnmVar, 13);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 3:
                Object objD3 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new f4g(ven0Var, (byte) 29), lnmVar, 7);
                return objD3 == d9nVar ? objD3 : rih1Var;
            case 4:
                Object objD4 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new i030(ven0Var, (byte) 10), lnmVar, 7);
                return objD4 == d9nVar ? objD4 : rih1Var;
            case 5:
                Object objD5 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new sqa0(ven0Var, (byte) 1), lnmVar, 7);
                return objD5 == d9nVar ? objD5 : rih1Var;
            default:
                Object objH2 = ((j8d1) nav0Var).H1(new o6b(ven0Var, null, (byte) 1), lnmVar);
                return objH2 == d9nVar ? objH2 : rih1Var;
        }
    }
}
