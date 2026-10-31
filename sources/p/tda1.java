package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tda1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bv30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tda1(bv30 bv30Var, int i, byte b) {
        super(4);
        this.a = b;
        this.c = bv30Var;
        this.b = i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj4).intValue();
                this.c.invoke(obj2, (b0k) obj3, Integer.valueOf(((iIntValue >> 3) & 14) | (i & 8)));
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                float fFloatValue3 = ((Number) obj3).floatValue();
                float fFloatValue4 = ((Number) obj4).floatValue();
                this.c.c1(Integer.valueOf(i), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4));
                break;
        }
        return rih1Var;
    }
}
