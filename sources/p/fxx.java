package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fxx implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ksg b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ d7v d;

    public fxx(boolean z, ksg ksgVar, iu30 iu30Var, d7v d7vVar) {
        this.a = z;
        this.b = ksgVar;
        this.c = iu30Var;
        this.d = d7vVar;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            Object objD = s9p1.D(nav0Var, new lhg(this.d, this.b, this.c, (lnm) null), lnmVar);
            d9n d9nVar = d9n.a;
            if (objD != d9nVar) {
                objD = rih1Var;
            }
            if (objD == d9nVar) {
                return objD;
            }
        }
        return rih1Var;
    }
}
