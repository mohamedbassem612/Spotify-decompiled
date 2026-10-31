package p;

import com.comscore.streaming.AdvertisementType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ptq0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ idn0 d;
    public final /* synthetic */ j4e1 e;
    public final /* synthetic */ hw61 f;

    public /* synthetic */ ptq0(boolean z, boolean z2, idn0 idn0Var, j4e1 j4e1Var, hw61 hw61Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = idn0Var;
        this.e = j4e1Var;
        this.f = hw61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    as10.U0.b(this.b, this.c, this.d, (qim0) null, this.e, this.f, 0.0f, 0.0f, x340Var2, 100663296, AdvertisementType.OTHER);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    i5x0.Q0.f(this.b, this.c, this.d, this.e, this.f, x340Var4, 114822144);
                }
                break;
        }
        return rih1Var;
    }
}
