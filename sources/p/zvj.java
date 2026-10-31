package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zvj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvj(xu30 xu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = xu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    k2r0.c(6, apo.r(616639104, new yvj((byte) 1, xu30Var, zBooleanValue), x340Var2), x340Var2);
                }
                break;
            default:
                xu30Var.invoke((String) obj, (String) obj2, (tv80) obj3);
                break;
        }
        return rih1Var;
    }
}
