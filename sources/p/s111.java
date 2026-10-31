package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s111 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g211 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s111(g211 g211Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = g211Var;
        this.c = iu30Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        g211 g211Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vyo1.b(g211Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                vyo1.l(g211Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                vyo1.n(g211Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
