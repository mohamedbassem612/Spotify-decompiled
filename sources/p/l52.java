package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l52 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l52(iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        iu30 iu30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                pap1.g(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 1:
                jzn1.d(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 2:
                zod.c(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 3:
                j82.h(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 4:
                oon1.d(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 5:
                d1u.u(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 6:
                lrn1.l(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 7:
                nko1.i(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            default:
                aq8.l(czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
        }
        return rih1Var;
    }
}
