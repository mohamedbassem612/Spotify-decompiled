package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vix implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vix(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object objD = s9p1.D(nav0Var, new uix((p811) obj, (lnm) null, (byte) 0), lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                Object objD2 = s9p1.D(nav0Var, new uix((p811) obj, (lnm) null, (byte) 2), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
            default:
                tb91 tb91Var = (tb91) obj;
                Object objD3 = rqd1.d(nav0Var, (iu30) null, (iu30) null, new my70(tb91Var, (lnm) null), new nb91(tb91Var, (byte) 2), lnmVar, 3);
                return objD3 == d9nVar ? objD3 : rih1Var;
        }
    }
}
