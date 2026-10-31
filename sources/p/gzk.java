package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gzk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gmc1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gzk(gmc1 gmc1Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = gmc1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        gmc1 gmc1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                x2g0.f(gmc1Var, function0, b0kVar, czo1.p(1));
                break;
            default:
                voo1.h(gmc1Var, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
