package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zze0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbx b;
    public final /* synthetic */ jsl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zze0(gbx gbxVar, jsl jslVar, byte b) {
        super(2);
        this.a = b;
        this.b = gbxVar;
        this.c = jslVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jsl jslVar = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wro1.h(this.b, ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(682847895, new yze0(jslVar, (byte) 0), x340Var2), x340Var2, 0, 6, 1020);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    wro1.h(this.b, ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(37932567, new yze0(jslVar, (byte) 1), x340Var4), x340Var4, 0, 6, 1020);
                }
                break;
        }
        return rih1Var;
    }
}
