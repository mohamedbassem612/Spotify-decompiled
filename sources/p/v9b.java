package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v9b {
    public final u9b a;
    public final idd1 b;

    public v9b(q940 q940Var, gts0 gts0Var, u9b u9bVar) {
        this.a = u9bVar;
        this.b = new idd1(new ft0((Object) q940Var, (Object) gts0Var, (byte) 5));
    }

    public final boolean a() {
        u9b u9bVar = this.a;
        if (!u9bVar.a.v() || !u9bVar.a.b()) {
            return false;
        }
        tl10 tl10Var = (vl10) ((u601) this.b.getValue()).getValue();
        tl10 tl10Var2 = tl10Var instanceof tl10 ? tl10Var : null;
        return (tl10Var2 != null ? tl10Var2.a() : null) instanceof kd;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b() throws NoWhenBranchMatchedException {
        if (!this.a.a.v()) {
            return false;
        }
        tl10 tl10Var = (vl10) ((u601) this.b.getValue()).getValue();
        if (tl10Var instanceof ul10) {
            return true;
        }
        if (tl10Var instanceof tl10) {
            return tl10Var.a() instanceof kd;
        }
        eg.o();
        return false;
    }
}
