package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aoc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ coc1 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aoc1(coc1 coc1Var, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = coc1Var;
        this.c = qim0Var;
        this.d = function0;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Function0 function0 = this.d;
        qim0 qim0Var = this.c;
        coc1 coc1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                epo1.w(coc1Var, qim0Var, function0, b0kVar, czo1.p(i | 1));
                break;
            default:
                epo1.x(coc1Var, qim0Var, function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
