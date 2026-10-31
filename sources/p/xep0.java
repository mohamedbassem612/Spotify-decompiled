package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xep0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tr80 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ hdn0 j;
    public final /* synthetic */ ss50 k;

    public xep0(int i, c9n c9nVar, int i2, tr80 tr80Var, int i3, iu30 iu30Var, o95 o95Var, iu30 iu30Var2, ven0 ven0Var, hdn0 hdn0Var, ss50 ss50Var) {
        this.a = i;
        this.b = c9nVar;
        this.c = i2;
        this.d = tr80Var;
        this.e = i3;
        this.f = iu30Var;
        this.g = o95Var;
        this.h = iu30Var2;
        this.i = ven0Var;
        this.j = hdn0Var;
        this.k = ss50Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        tui1 tui1Var = new tui1();
        gf6 gf6Var = new gf6(nav0Var, this.a, (byte) 8);
        c9n c9nVar = this.b;
        int i = this.c;
        tr80 tr80Var = this.d;
        int i2 = this.e;
        iu30 iu30Var = this.f;
        o95 o95Var = this.g;
        iu30 iu30Var2 = this.h;
        ven0 ven0Var = this.i;
        ovd ovdVar = new ovd(c9nVar, i, tr80Var, i2, iu30Var, o95Var, iu30Var2, ven0Var);
        Object objJ = g5v.j(new odp0(tui1Var, gf6Var, ovdVar, o95Var, (byte) 2), new ocp0(ovdVar, o95Var, (byte) 23), lnmVar, new j9n0(tui1Var, ven0Var, (byte) 24), new vep0(tui1Var, c9nVar, gf6Var, o95Var, i, this.j, this.k, iu30Var, tr80Var, i2, (byte) 0), nav0Var);
        return objJ == d9n.a ? objJ : rih1.a;
    }
}
