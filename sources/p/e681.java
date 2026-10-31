package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e681 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f681 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e681(f681 f681Var, byte b) {
        super(3);
        this.a = b;
        this.b = f681Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        f681 f681Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                f681Var.c.a((t681) rwq.h((zob1) obj, b0kVar, ((Number) obj3).intValue() & 14).getValue(), b0kVar, 0);
                break;
            default:
                ((Boolean) obj).getClass();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    p6p1.o(f681Var.c, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }
}
