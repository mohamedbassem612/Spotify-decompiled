package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n3n extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3n(Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = function1;
        this.d = function2;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                ljo1.e(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                lgo1.g(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.e;
                int iP3 = czo1.p(1);
                tho1.i(this.b, this.c, this.d, qim0Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
