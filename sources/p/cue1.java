package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cue1 implements PointerInputEventHandler {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ int b;

    public cue1(int i, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = i;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        iu30 iu30Var = this.a;
        int i = this.b;
        Object objX = dro.x(nav0Var, new ck0(iu30Var, i, (byte) 28), new b1c1(iu30Var, (byte) 13), new ck0(iu30Var, i, (byte) 29), lnmVar);
        return objX == d9n.a ? objX : rih1.a;
    }
}
