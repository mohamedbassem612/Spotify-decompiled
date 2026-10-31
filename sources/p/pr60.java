package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pr60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tr60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr60(tr60 tr60Var, byte b) {
        super(0);
        this.a = b;
        this.b = tr60Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tr60 tr60Var = this.b;
        switch (b) {
            case 0:
                rok0 rok0Var = tr60Var.o1;
                if (rok0Var != null) {
                    rok0Var.i();
                }
                break;
            default:
                rok0 rok0Var2 = tr60Var.o1;
                if (rok0Var2 != null && tr60Var.r1.X0 <= 1.0f) {
                    rok0Var2.v();
                }
                break;
        }
        return rih1Var;
    }
}
