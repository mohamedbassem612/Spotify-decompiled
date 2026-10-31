package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rl9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl9(h72 h72Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = h72Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        h72 h72Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h72Var.e(b0kVar, czo1.p(i | 1));
                break;
            default:
                h72Var.e(b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
