package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class li11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li11(l3 l3Var, byte b) {
        super(0);
        this.a = b;
        this.b = l3Var;
    }

    public final Object invoke() {
        byte b = this.a;
        l3 l3Var = this.b;
        switch (b) {
            case 0:
                return l3Var.b(2131232516, true);
            case 1:
                return l3Var.b(2131232516, false);
            case 2:
                return l3Var.b(2131232519, true);
            default:
                ((rku) l3Var.g).a();
                return rih1.a;
        }
    }
}
