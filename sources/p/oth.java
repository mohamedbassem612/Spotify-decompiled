package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x4a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oth(x4a x4aVar, byte b) {
        super(2);
        this.a = b;
        this.b = x4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x4a x4aVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwo1.e(cwl1.o0(x340Var2, x4aVar.a), null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    foo1.f(new gbx(z50.c, x4aVar.b), uyn1.y(nim0.a, 12.0f, 4.0f), null, yla.s(x340Var4), null, null, null, apo.r(1386827318, new oth(x4aVar, objArr == true ? 1 : 0), x340Var4), x340Var4, 12582912, 116);
                }
                break;
        }
        return rih1Var;
    }
}
