package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yiz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jlz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiz0(String str, boolean z, jlz0 jlz0Var) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = jlz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jlz0 jlz0Var = this.d;
        boolean z = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                mmo1.m(str, z, jlz0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (str.length() == 0) {
                        str = null;
                    }
                    jlz0 jlz0Var2 = jlz0.i;
                    mmo1.m(str, z, jlz0Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiz0(String str, boolean z, jlz0 jlz0Var, int i) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = jlz0Var;
    }
}
