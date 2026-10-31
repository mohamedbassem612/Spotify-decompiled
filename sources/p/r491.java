package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r491 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a4f0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r491(a4f0 a4f0Var, Function0 function0, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = a4f0Var;
        this.c = function0;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Function0 function0 = this.c;
        a4f0 a4f0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                a4f0Var.e(i, czo1.p(1), function0, b0kVar);
                break;
            default:
                a4f0Var.f(i, czo1.p(1), function0, b0kVar);
                break;
        }
        return rih1Var;
    }
}
