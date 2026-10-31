package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xk70 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ idn0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk70(Function0 function0, qim0 qim0Var, boolean z, idn0 idn0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = qim0Var;
        this.d = z;
        this.e = idn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                idn0 idn0Var = this.e;
                int iP = czo1.p(1);
                dzo1.b(this.b, this.c, this.d, idn0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                idn0 idn0Var2 = this.e;
                int iP2 = czo1.p(1);
                dzo1.d(this.b, this.c, this.d, idn0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
