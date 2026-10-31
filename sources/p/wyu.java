package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wyu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wyu(int i, int i2, Function0 function0, qim0 qim0Var) {
        super(2);
        this.a = (byte) 1;
        this.b = function0;
        this.c = qim0Var;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        Function0 function0 = this.b;
        qim0 qim0Var = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                y7y0.e(czo1.p(1), b2, function0, b0kVar, qim0Var);
                break;
            case 1:
                wm5.i(czo1.p(1), b2, function0, b0kVar, qim0Var);
                break;
            default:
                lmt0.e(czo1.p(1), b2, function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wyu(qim0 qim0Var, Function0 function0, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = function0;
        this.d = i2;
    }
}
