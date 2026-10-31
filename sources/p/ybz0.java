package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ybz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ccz0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybz0(ccz0 ccz0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = ccz0Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        ccz0 ccz0Var = this.b;
        switch (b) {
            case 0:
                ccz0Var.e1 = null;
                function0.invoke();
                break;
            default:
                ccz0Var.f1 = null;
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
