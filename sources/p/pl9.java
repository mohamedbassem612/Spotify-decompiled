package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pl9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl9(h72 h72Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = h72Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        h72 h72Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                h72Var.b(qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                h72Var.c(qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                h72Var.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                h72Var.g(qim0Var, b0kVar, czo1.p(1));
                break;
            case 4:
                h72Var.j(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                h72Var.k(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
