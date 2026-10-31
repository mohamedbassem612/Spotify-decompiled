package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iz81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hz81 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz81(hz81 hz81Var, Object obj) {
        super(2);
        this.b = hz81Var;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        hz81 hz81Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object obj4 = hz81Var.b.get(obj3.getClass());
                    obj4.getClass();
                    otw.c((maa) obj4, this.c, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                ((Number) obj2).intValue();
                xap1.i(hz81Var, obj3, (b0k) obj, czo1.p(9));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz81(hz81 hz81Var, Object obj, int i) {
        super(2);
        this.b = hz81Var;
        this.c = obj;
    }
}
