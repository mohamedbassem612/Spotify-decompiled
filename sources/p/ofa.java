package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ofa implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w5f1 b;

    public /* synthetic */ ofa(w5f1 w5f1Var, byte b) {
        this.a = b;
        this.b = w5f1Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        w5f1 w5f1Var = this.b;
        switch (b) {
            case 0:
                Object objS = smo1.s(new nfa(nav0Var, w5f1Var, null, (byte) 0), lnmVar);
                return objS == d9nVar ? objS : rih1Var;
            default:
                Object objS2 = smo1.s(new nfa(nav0Var, w5f1Var, null, (byte) 1), lnmVar);
                return objS2 == d9nVar ? objS2 : rih1Var;
        }
    }
}
