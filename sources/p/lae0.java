package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lae0 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public lae0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        if (this.a || this.b) {
            Object objH1 = ((j8d1) nav0Var).H1(new lia(2, (lnm) null, (byte) 7), lnmVar);
            if (objH1 == d9n.a) {
                return objH1;
            }
        }
        return rih1.a;
    }
}
