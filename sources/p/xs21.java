package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xs21 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs21(ziu ziuVar, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ziuVar;
        this.c = qim0Var;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        qim0 qim0Var = this.c;
        ziu ziuVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                zod.d(ziuVar, qim0Var, function0, b0kVar, czo1.p(1));
                break;
            default:
                zod.d(ziuVar, qim0Var, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
