package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class spf extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spf(byte b, boolean z) {
        super(4);
        this.a = b;
        this.b = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    ouo1.b(iIntValue, (iIntValue2 >> 3) & 14, x340Var2, z);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                o6p1.i(z, (b0k) obj3, 0);
                return rih1Var;
            case 2:
                mey0 mey0Var = (mey0) obj;
                return new dsj1(new rsk0(z ? 3 : 4, Integer.valueOf(((Number) obj3).intValue()), mey0Var.c, (r6h1) obj4, (byte) 2));
            default:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                lq01.a(x47.a, z, (qim0) null, (b0k) obj3, 0);
                return rih1Var;
        }
    }
}
