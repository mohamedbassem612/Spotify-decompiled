package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2c b;
    public final /* synthetic */ adj1 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xth(g2c g2cVar, adj1 adj1Var, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = g2cVar;
        this.c = adj1Var;
        this.d = qim0Var;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                p9p1.o(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                s9p1.s(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
