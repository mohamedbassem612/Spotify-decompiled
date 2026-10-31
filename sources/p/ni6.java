package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ni6 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ ni6(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                Object objD = s9p1.D(nav0Var, new mi6(iu30Var, (lnm) null, (byte) 0), lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                Object objD2 = s9p1.D(nav0Var, new js9(iu30Var, (lnm) null, (byte) 0), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 2:
                Object objD3 = s9p1.D(nav0Var, new js9(iu30Var, (lnm) null, (byte) 1), lnmVar);
                return objD3 == d9nVar ? objD3 : rih1Var;
            case 3:
                Object objD4 = s9p1.D(nav0Var, new ymh0(iu30Var, null, (byte) 0), lnmVar);
                return objD4 == d9nVar ? objD4 : rih1Var;
            case 4:
                Object objD5 = s9p1.D(nav0Var, new ymh0(iu30Var, null, (byte) 1), lnmVar);
                return objD5 == d9nVar ? objD5 : rih1Var;
            case 5:
                Object objD6 = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new b1c1(iu30Var, (byte) 15), lnmVar, 7);
                return objD6 == d9nVar ? objD6 : rih1Var;
            case 6:
                Object objJ = g5v.j(new pwc1(iu30Var, (byte) 24), new pwc1(iu30Var, (byte) 25), lnmVar, new b1c1(iu30Var, (byte) 16), new iuy0(iu30Var, (byte) 23), nav0Var);
                return objJ == d9nVar ? objJ : rih1Var;
            default:
                Object objD7 = rqd1.d(nav0Var, (iu30) null, new otj1(iu30Var, (byte) 1), (xu30) null, new otj1(iu30Var, (byte) 2), lnmVar, 5);
                return objD7 == d9nVar ? objD7 : rih1Var;
        }
    }
}
