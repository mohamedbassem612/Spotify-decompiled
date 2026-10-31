package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvx0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fvx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvx0(fvx0 fvx0Var, byte b) {
        super(0);
        this.a = b;
        this.b = fvx0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fvx0 fvx0Var = this.b;
        switch (b) {
            case 0:
                fvx0Var.a.a();
                fvx0Var.e.accept(rrx0.a);
                break;
            default:
                fvx0Var.e.accept(msx0.a);
                break;
        }
        return rih1Var;
    }
}
