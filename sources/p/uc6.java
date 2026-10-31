package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uc6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc6(iu30 iu30Var, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.c = iu30Var;
        this.d = qim0Var;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xfo1.a(czo1.p(1), b0kVar, iu30Var, qim0Var, z);
                break;
            case 1:
                cev0.o(czo1.p(1), b0kVar, iu30Var, qim0Var, z);
                break;
            default:
                mqn1.a(czo1.p(1), b0kVar, iu30Var, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc6(qim0 qim0Var, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.d = qim0Var;
        this.b = z;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc6(boolean z, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = z;
        this.c = iu30Var;
        this.d = qim0Var;
    }
}
