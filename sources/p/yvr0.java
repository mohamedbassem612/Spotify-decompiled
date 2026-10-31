package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yvr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bmg1 b;
    public final /* synthetic */ dlg1 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvr0(iu30 iu30Var, bmg1 bmg1Var, dlg1 dlg1Var, qim0 qim0Var, int i) {
        super(2);
        this.d = iu30Var;
        this.b = bmg1Var;
        this.c = dlg1Var;
        this.e = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                nko1.d(czo1.p(1), (b0k) obj, this.d, qim0Var, this.c, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                nko1.w(czo1.p(1), (b0k) obj, this.d, qim0Var2, this.c, this.b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvr0(bmg1 bmg1Var, dlg1 dlg1Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = bmg1Var;
        this.c = dlg1Var;
        this.d = iu30Var;
        this.e = qim0Var;
    }
}
