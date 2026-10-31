package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zqm implements PointerInputEventHandler {
    public final /* synthetic */ drr0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ni7 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ c9n e;
    public final /* synthetic */ o95 f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ iu30 j;
    public final /* synthetic */ float k;

    public zqm(drr0 drr0Var, ven0 ven0Var, ni7 ni7Var, ven0 ven0Var2, c9n c9nVar, o95 o95Var, o95 o95Var2, float f, boolean z, iu30 iu30Var, float f2) {
        this.a = drr0Var;
        this.b = ven0Var;
        this.c = ni7Var;
        this.d = ven0Var2;
        this.e = c9nVar;
        this.f = o95Var;
        this.g = o95Var2;
        this.h = f;
        this.i = z;
        this.j = iu30Var;
        this.k = f2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        drr0 drr0Var = this.a;
        ven0 ven0Var = this.b;
        ni7 ni7Var = this.c;
        ven0 ven0Var2 = this.d;
        n7m n7mVar = new n7m(drr0Var, ven0Var, ni7Var, ven0Var2, (byte) 4);
        c9n c9nVar = this.e;
        o95 o95Var = this.f;
        o95 o95Var2 = this.g;
        Object objB = frm.b(new xqm(drr0Var, c9nVar, o95Var, o95Var2, this.h, this.i, this.j, this.k), new vhm1(drr0Var, c9nVar, o95Var2, o95Var, (byte) 1), lnmVar, new z1(drr0Var, ven0Var, ni7Var, ven0Var2, c9nVar, o95Var, o95Var2, (byte) 4), n7mVar, nav0Var);
        return objB == d9n.a ? objB : rih1.a;
    }
}
