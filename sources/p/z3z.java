package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z3z extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a4z b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3z(a4z a4zVar, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = a4zVar;
        this.c = function0;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        a4z a4zVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                oon1.c(a4zVar, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                oon1.f(a4zVar, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
