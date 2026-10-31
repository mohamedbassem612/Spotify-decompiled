package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfo0 implements khg1 {
    public final kmg1 a;
    public final iz70 b;

    public cfo0(kmg1 kmg1Var, iz70 iz70Var) {
        this.a = kmg1Var;
        this.b = iz70Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.khg1
    public final void a() throws NoWhenBranchMatchedException {
        iz70 iz70Var = this.b;
        boolean z = iz70Var instanceof tsc1;
        kmg1 kmg1Var = this.a;
        if (z) {
            kmg1Var.f(((tsc1) iz70Var).a);
        } else if (iz70Var instanceof viz) {
            kmg1Var.b(((viz) iz70Var).a);
        } else {
            eg.o();
        }
    }
}
