package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d3c implements PointerInputEventHandler {
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ drr0 h;

    public d3c(ven0 ven0Var, ven0 ven0Var2, c9n c9nVar, o95 o95Var, float f, float f2, float f3, drr0 drr0Var) {
        this.a = ven0Var;
        this.b = ven0Var2;
        this.c = c9nVar;
        this.d = o95Var;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = drr0Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        tui1 tui1Var = new tui1();
        ven0 ven0Var = this.a;
        ven0 ven0Var2 = this.b;
        oo6 oo6Var = new oo6(tui1Var, ven0Var, ven0Var2, (byte) 21);
        c9n c9nVar = this.c;
        o95 o95Var = this.d;
        float f = this.e;
        float f2 = this.f;
        float f3 = this.g;
        drr0 drr0Var = this.h;
        Object objJ = g5v.j(new z2c(tui1Var, c9nVar, o95Var, f, f2, f3, drr0Var, ven0Var, ven0Var2), new b3c(c9nVar, o95Var, f2, f3, drr0Var, ven0Var, ven0Var2), lnmVar, oo6Var, new c3c(tui1Var, f, f3, drr0Var), nav0Var);
        return objJ == d9n.a ? objJ : rih1.a;
    }
}
