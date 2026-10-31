package p;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fao implements khg1 {
    public final kmg1 a;
    public final iz70 b;

    public fao(kmg1 kmg1Var, iz70 iz70Var) {
        this.a = kmg1Var;
        this.b = iz70Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.khg1
    public final void a() throws NoWhenBranchMatchedException {
        kmg1 kmg1Var = this.a;
        Drawable drawableG = kmg1Var.g();
        iz70 iz70Var = this.b;
        oq70 oq70VarB = iz70Var.b();
        boolean z = iz70Var instanceof tsc1;
        z8o z8oVar = new z8o(drawableG, oq70VarB != null ? x2p1.g(oq70VarB, kmg1Var.getView().getResources()) : null, iz70Var.getRequest().q, (z && ((tsc1) iz70Var).g) ? false : true);
        if (z) {
            kmg1Var.f(x2p1.h(z8oVar));
        } else if (iz70Var instanceof viz) {
            kmg1Var.b(x2p1.h(z8oVar));
        } else {
            eg.o();
        }
    }
}
