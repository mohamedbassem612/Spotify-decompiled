package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lek0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pek0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lek0(pek0 pek0Var, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pek0Var;
        this.c = function0;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        pek0 pek0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                pek0Var.a(czo1.p(49), function0, b0kVar, qim0Var);
                break;
            case 1:
                pek0Var.b(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            default:
                pek0Var.i(czo1.p(1), function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}
