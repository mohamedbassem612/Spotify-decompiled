package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mk7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk7(c380 c380Var, int i, boolean z, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = c380Var;
        this.f = i;
        this.c = z;
        this.d = iu30Var;
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
                zqo1.c(this.b, this.f, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                epo1.q(czo1.p(this.f | 1), (b0k) obj, this.d, this.b, this.e, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk7(c380 c380Var, boolean z, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = c380Var;
        this.c = z;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = i;
    }
}
