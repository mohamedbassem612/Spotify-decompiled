package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xh6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh6(hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case 0:
                ydh.m(err0Var, 1);
                return rih1Var;
            case 1:
                return Integer.valueOf(err0Var.s());
            case 2:
                return Integer.valueOf(err0Var.s() * 2);
            case 3:
                err0Var.t(-1);
                return rih1Var;
            case 4:
                ydh.m(err0Var, 1);
                return rih1Var;
            case 5:
                ydh.m(err0Var, -1);
                return rih1Var;
            case 6:
                ydh.m(err0Var, 1);
                return rih1Var;
            default:
                return Integer.valueOf(err0Var.s());
        }
    }
}
