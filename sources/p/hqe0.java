package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hqe0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqe0(kbh kbhVar, byte b) {
        super(2);
        this.a = b;
        this.b = kbhVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kbh kbhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwo1.e(kbhVar.e.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(kbhVar.f.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2046);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    uwo1.e(kbhVar.g.a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2046);
                }
                break;
        }
        return rih1Var;
    }
}
