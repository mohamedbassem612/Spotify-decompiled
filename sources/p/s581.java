package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s581 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x581 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s581(x581 x581Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = x581Var;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nim0 nim0Var = nim0.a;
                int iP = czo1.p(1);
                m6p1.i(this.b, this.c, this.d, nim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                nim0 nim0Var2 = nim0.a;
                int iP2 = czo1.p(1);
                m6p1.i(this.b, this.c, this.d, nim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
