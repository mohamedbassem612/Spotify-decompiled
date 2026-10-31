package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kn8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ en8 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn8(en8 en8Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.b = en8Var;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    en8 en8Var = this.b;
                    boolean z = en8Var instanceof dn8;
                    qim0 qim0Var = this.d;
                    if (z) {
                        x340Var2.i0(1409534686);
                        qyo1.d(qim0Var, x340Var2, 0);
                        x340Var2.r(false);
                    } else if (en8Var instanceof cn8) {
                        x340Var2.i0(1409536374);
                        qyo1.c((cn8) en8Var, this.c, qim0Var, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (!(en8Var instanceof bn8)) {
                            throw p3d1.k(x340Var2, 1409533745, false);
                        }
                        x340Var2.i0(1409538792);
                        Function0 function0 = this.e;
                        boolean zG = x340Var2.g(function0);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new to1(function0, (lnm) null, (byte) 2);
                            x340Var2.s0(objT);
                        }
                        qxd0.t(en8Var, x340Var2, (vu30) objT);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                qyo1.e(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn8(en8 en8Var, qim0 qim0Var, iu30 iu30Var, Function0 function0) {
        super(2);
        this.b = en8Var;
        this.d = qim0Var;
        this.c = iu30Var;
        this.e = function0;
    }
}
