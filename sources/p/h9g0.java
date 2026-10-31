package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9g0(b9g0 b9g0Var, byte b) {
        super(2);
        this.a = b;
        this.b = b9g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b9g0 b9g0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = j2g0.O0;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
                    String strN0 = cwl1.n0(2131952324, new Object[]{b9g0Var.b}, x340Var2);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strN0, qim0VarB, cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bzn1.e(null, apo.r(-26989473, new h9g0(b9g0Var, b2), x340Var4), false, null, null, null, null, null, x340Var4, 48, 253);
                }
                break;
        }
        return rih1Var;
    }
}
