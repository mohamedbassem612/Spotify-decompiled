package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb1(bc1 bc1Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bc1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        bc1 bc1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bc1Var.g(function0, b0kVar, czo1.p(1));
                break;
            default:
                bc1Var.h(function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
