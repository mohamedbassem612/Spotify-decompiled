package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l7b0 implements Function0 {
    public final /* synthetic */ byte a;
    public final n7b0 b;

    public /* synthetic */ l7b0(n7b0 n7b0Var, byte b) {
        this.a = b;
        this.b = n7b0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                n7b0 n7b0Var = this.b;
                c4b0 c4b0Var = n7b0Var.t().e.i;
                return c4b0Var != null ? new h7b0(n7b0Var, c4b0Var, n7b0Var.t().f().size(), 4, (c1h1) n7b0Var.t().i.getValue()) : new m7b0(n7b0Var.t());
            default:
                return n3o1.n(this.b, false);
        }
    }
}
