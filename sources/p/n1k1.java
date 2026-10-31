package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1k1 implements PointerInputEventHandler {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ o95 b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ float g;

    public n1k1(c9n c9nVar, o95 o95Var, o95 o95Var2, float f, boolean z, iu30 iu30Var, float f2) {
        this.a = c9nVar;
        this.b = o95Var;
        this.c = o95Var2;
        this.d = f;
        this.e = z;
        this.f = iu30Var;
        this.g = f2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        olj1 olj1Var = olj1.Y;
        c9n c9nVar = this.a;
        o95 o95Var = this.b;
        o95 o95Var2 = this.c;
        Object objB = frm.b(new m1k1(c9nVar, o95Var, o95Var2, this.d, this.e, this.f, this.g), new o8e1(c9nVar, o95Var2, o95Var, (byte) 21), lnmVar, new jyi1(c9nVar, o95Var, o95Var2, (byte) 7), olj1Var, nav0Var);
        return objB == d9n.a ? objB : rih1.a;
    }
}
