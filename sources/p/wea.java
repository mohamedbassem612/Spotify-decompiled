package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wea implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7e1 b;

    public /* synthetic */ wea(r7e1 r7e1Var, byte b) {
        this.a = b;
        this.b = r7e1Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        r7e1 r7e1Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Object objS = smo1.s(new ku91(r7e1Var, nav0Var, (lnm) null, (byte) 11), lnmVar);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? objS : rih1Var;
            case 1:
                Object objS2 = smo1.s(new bfb1(r7e1Var, nav0Var, true, (lnm) null), lnmVar);
                if (objS2 != d9nVar) {
                    objS2 = rih1Var;
                }
                return objS2 == d9nVar ? objS2 : rih1Var;
            default:
                Object objS3 = smo1.s(new bfb1(r7e1Var, nav0Var, false, (lnm) null), lnmVar);
                if (objS3 != d9nVar) {
                    objS3 = rih1Var;
                }
                return objS3 == d9nVar ? objS3 : rih1Var;
        }
    }
}
