package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(ziu ziuVar, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = ziuVar;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        ziu ziuVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2p1.a(czo1.p(i | 1), b0kVar, ziuVar, iu30Var, qim0Var);
                break;
            default:
                aym.b(czo1.p(i | 1), b0kVar, ziuVar, iu30Var, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(ziu ziuVar, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = ziuVar;
        this.d = qim0Var;
        this.c = iu30Var;
        this.e = i;
    }
}
