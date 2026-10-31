package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cm80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl80 b;
    public final /* synthetic */ ul80 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm80(zl80 zl80Var, ul80 ul80Var, vu30 vu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zl80Var;
        this.c = ul80Var;
        this.d = vu30Var;
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
                x8p1.d(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                x8p1.f(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
