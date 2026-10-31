package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tjv0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ vho c;
    public final /* synthetic */ yf d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjv0(iu30 iu30Var, vho vhoVar, yf yfVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = vhoVar;
        this.d = yfVar;
        this.e = qim0Var;
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
                fbp1.g(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                fbp1.j(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
