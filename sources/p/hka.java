package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hka extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ gka b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hka(gka gkaVar, Function0 function0) {
        super(2);
        this.b = gkaVar;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        gka gkaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    z8p1.f(0, gkaVar.c, function0, x340Var2);
                }
                break;
            default:
                ((Number) obj2).intValue();
                z8p1.d(gkaVar, function0, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hka(gka gkaVar, Function0 function0, int i) {
        super(2);
        this.b = gkaVar;
        this.c = function0;
    }
}
