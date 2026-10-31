package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bgo extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgo(xwa xwaVar, byte b) {
        super(3);
        this.a = b;
        this.b = xwaVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    und.a(this.b, (qim0) null, 0.0f, vu30Var, x340Var2, (iIntValue << 9) & 7168, 6);
                }
                break;
            case 1:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    und.a(this.b, (qim0) null, 0.0f, apo.r(-1317350727, new k7f((byte) 29, vu30Var2, false), x340Var4), x340Var4, 3072, 6);
                }
                break;
            default:
                vu30 vu30Var3 = (vu30) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var5.i(vu30Var3) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var6.b0();
                } else {
                    und.a(this.b, (qim0) null, 0.0f, apo.r(801700248, new say0(vu30Var3, (byte) 0), x340Var6), x340Var6, 3072, 6);
                }
                break;
        }
        return rih1Var;
    }
}
