package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class an9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an9(c380 c380Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                l2p1.a(c380Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                l2p1.a(c380Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                rwo1.c(c380Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                mue1.e(c380Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
