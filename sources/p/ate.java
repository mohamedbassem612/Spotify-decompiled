package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ate extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ate(int i, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        super(2);
        this.a = (byte) 4;
        this.b = c380Var;
        this.d = iu30Var;
        this.e = qim0Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        qim0 qim0Var = this.e;
        iu30 iu30Var = this.d;
        c380 c380Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(9);
                yoo1.e(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                dm5.e(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                z1a1.a(czo1.p(i | 1), (b0k) obj, iu30Var, c380Var, qim0Var);
                break;
            case 3:
                ((Number) obj2).intValue();
                sgc1.a(czo1.p(i | 1), (b0k) obj, iu30Var, c380Var, qim0Var);
                break;
            default:
                ((Number) obj2).intValue();
                xio1.f(czo1.p(i | 1), (b0k) obj, iu30Var, c380Var, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ate(byte b, int i, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.e = qim0Var;
        this.d = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ate(c380 c380Var, int i, iu30 iu30Var, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = i;
        this.d = iu30Var;
        this.e = qim0Var;
    }
}
