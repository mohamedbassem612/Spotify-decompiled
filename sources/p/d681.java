package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d681 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d681(byte b, int i, int i2) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                o6p1.e(i2, i, czo1.p(1), (b0k) obj);
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eqr0.a((gt40) null, 0, 1, apo.r(-1436954253, new vxx((byte) 1, i2, i), x340Var2), x340Var2, 3072, 3);
                }
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    o1p1.f(pox.c, cwl1.o0(x340Var4, 2131963129), cwl1.n0(2131963128, new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, x340Var4), null, x340Var4, pox.d);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                o1p1.t(i2, i, czo1.p(1), (b0k) obj);
                break;
            default:
                ((Number) obj2).intValue();
                vby0.h(i2, i, czo1.p(1), (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d681(int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
    }
}
