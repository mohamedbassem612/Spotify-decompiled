package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fbt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbt0(Integer num, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = num;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        Integer num = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                byo1.f(num, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                cyo1.h(num, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                u1p1.e(num, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
