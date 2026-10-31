package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vu61 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu61(wu61 wu61Var, byte b) {
        super(3);
        this.a = b;
        this.b = wu61Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wu61 wu61Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    wu61Var.a(x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    wu61Var.a(x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
