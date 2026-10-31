package p;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lt41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mt41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt41(mt41 mt41Var, byte b) {
        super(0);
        this.a = b;
        this.b = mt41Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mt41 mt41Var = this.b;
        switch (b) {
            case 0:
                mma0[] mma0VarArr = mt41.h;
                mt41Var.f.c(mt41.h[1], mt41Var, (Object) null);
                break;
            default:
                eyh0 eyh0Var = mt41Var.a;
                xfz0 xfz0Var = mt41Var.g;
                ((CoordinatorLayout) eyh0Var.b).removeCallbacks(xfz0Var);
                ((CoordinatorLayout) eyh0Var.b).postDelayed(xfz0Var, 50L);
                break;
        }
        return rih1Var;
    }
}
