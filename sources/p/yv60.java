package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yv60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv60(Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = function1;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                sto1.g(function1, function0, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                k1u.g(function1, function0, qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                k1u.j(function1, function0, qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                qtg.c(function1, function0, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                grn1.d(function1, function0, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
