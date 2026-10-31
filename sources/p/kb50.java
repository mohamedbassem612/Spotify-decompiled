package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kb50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb50 b;
    public final /* synthetic */ nb50 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb50(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qb50Var;
        this.c = nb50Var;
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
                don1.a(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                don1.h(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
