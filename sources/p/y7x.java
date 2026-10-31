package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y7x extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ a8x b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7x(Function0 function0, a8x a8xVar) {
        super(2);
        this.c = function0;
        this.b = a8xVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        a8x a8xVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var2, 2131955481);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO0), function0), new idx(4), null, null, null, null, null, null, null, null, apo.r(-684490820, new x7x(a8xVar, (byte) 2), x340Var2), x340Var2, 0, 48, 2044);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                rjo1.c(a8xVar, function0, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7x(a8x a8xVar, Function0 function0, int i) {
        super(2);
        this.b = a8xVar;
        this.c = function0;
    }
}
