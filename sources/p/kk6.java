package p;

import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk6(long j, String str, float f) {
        super(2);
        this.d = str;
        this.b = f;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = ((cj6) obj3).c;
                    FontWeight fontWeight = rk6.b;
                    boolean zD = x340Var2.d(f);
                    Object objT = x340Var2.T();
                    if (zD || objT == fkj0.X) {
                        objT = new jk6((byte) 2, f);
                        x340Var2.s0(objT);
                    }
                    rk6.e(str, this.c, fontWeight, (iu30) objT, x340Var2, 384);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    w0h1.a(tjx.c, new jsl((String) obj3), eqr0.C(u291.r(nim0.a, 16.0f), f, f), this.c, 0L, false, x340Var4, tjx.d, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk6(cj6 cj6Var, long j, float f) {
        super(2);
        this.d = cj6Var;
        this.c = j;
        this.b = f;
    }
}
