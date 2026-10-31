package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qxx implements PointerInputEventHandler {
    public final /* synthetic */ t24 a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ flb0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public qxx(t24 t24Var, c9n c9nVar, flb0 flb0Var, boolean z, boolean z2) {
        this.a = t24Var;
        this.b = c9nVar;
        this.c = flb0Var;
        this.d = z;
        this.e = z2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        Object objD = s9p1.D(nav0Var, new pxx(this.a, this.b, this.c, this.d, this.e, (lnm) null), lnmVar);
        return objD == d9n.a ? objD : rih1.a;
    }
}
