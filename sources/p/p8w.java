package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p8w extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yxa0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8w(Function0 function0, yxa0 yxa0Var) {
        super(2);
        this.c = function0;
        this.b = yxa0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        yxa0 yxa0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new z9t(function0, (byte) 27);
                        x340Var2.s0(objT);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT), new idx(19), null, null, null, null, null, null, null, null, apo.r(531994898, new o8w(yxa0Var, (byte) 0), x340Var2), x340Var2, 0, 48, 2044);
                }
                break;
            default:
                ((Number) obj2).intValue();
                zko1.c(yxa0Var, function0, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8w(yxa0 yxa0Var, Function0 function0, int i) {
        super(2);
        this.b = yxa0Var;
        this.c = function0;
    }
}
