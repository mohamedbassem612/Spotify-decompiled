package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gfc implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vu30 d;

    public /* synthetic */ gfc(long j, Object obj, vu30 vu30Var, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    y2o1.h(this.b, ((k2h1) x340Var2.k(o2h1.a)).m, apo.r(417635459, new ek1((vzq0) obj3, this.d, (byte) 4), x340Var2), x340Var2, 384);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    i3p1.g(this.b, (lee1) obj3, this.d, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
