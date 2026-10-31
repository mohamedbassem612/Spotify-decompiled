package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vik0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vik0(t4h1 t4h1Var, byte b) {
        super(2);
        this.a = b;
        this.b = t4h1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t4h1 t4h1Var = this.b;
        switch (b) {
            case 0:
                ijf1 ijf1Var = (ijf1) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                if (t4h1Var == null) {
                    return rih1Var;
                }
                int iOrdinal = ijf1Var.ordinal();
                if (iOrdinal == 0) {
                    t4h1Var.h.setValue(bool);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    t4h1Var.i.setValue(bool);
                }
                if (zBooleanValue) {
                    t4h1Var.a(ijf1Var).G(Long.MAX_VALUE);
                    return rih1Var;
                }
                t4h1Var.a(ijf1Var).G(1000L);
                return rih1Var;
            default:
                ijf1 ijf1Var2 = (ijf1) obj;
                Integer num = (Integer) obj2;
                if (t4h1Var != null) {
                    t4h1Var.d(ijf1Var2, num);
                }
                return rih1Var;
        }
    }
}
