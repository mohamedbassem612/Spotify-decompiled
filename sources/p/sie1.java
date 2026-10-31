package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sie1 implements PointerInputEventHandler {
    public final /* synthetic */ drr0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ drr0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ss50 f;
    public final /* synthetic */ iu30 g;

    public sie1(float f, iu30 iu30Var, ss50 ss50Var, ven0 ven0Var, ven0 ven0Var2, drr0 drr0Var, drr0 drr0Var2) {
        this.a = drr0Var;
        this.b = ven0Var;
        this.c = drr0Var2;
        this.d = ven0Var2;
        this.e = f;
        this.f = ss50Var;
        this.g = iu30Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        drr0 drr0Var = this.a;
        ven0 ven0Var = this.b;
        drr0 drr0Var2 = this.c;
        ven0 ven0Var2 = this.d;
        Object objD = s9p1.D(nav0Var, new cs70(new rl6(nav0Var, drr0Var, ven0Var, drr0Var2, ven0Var2, (byte) 9), new s8s(this.e, this.g, this.f, ven0Var2, ven0Var, drr0Var, drr0Var2), null, (byte) 2), lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
