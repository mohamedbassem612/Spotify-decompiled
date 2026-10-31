package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pdj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l441 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdj1(l441 l441Var, byte b) {
        super(0);
        this.a = b;
        this.b = l441Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l441 l441Var = this.b;
        switch (b) {
            case 0:
                l441Var.resumeWith(ndj1.c);
                break;
            case 1:
                l441Var.resumeWith(ndj1.b);
                break;
            default:
                l441Var.resumeWith(ndj1.a);
                break;
        }
        return rih1Var;
    }
}
