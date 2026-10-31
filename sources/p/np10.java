package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class np10 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gp10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np10(gp10 gp10Var, byte b) {
        super(3);
        this.a = b;
        this.b = gp10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        gp10 gp10Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                wxo1.l(gp10Var.g, gp10Var.c, gp10Var.b, gp10Var.d, u291.r(nim0Var, 48.0f), (b0k) obj2, 0);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("feed-activity-list-row-artist-test-tag", nim0Var);
                String str = gp10Var.f;
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0VarN, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 2, false, new zic0(1), 0, null, b0kVar, 0, 0, 1712);
                break;
            default:
                ((Number) obj3).intValue();
                wxo1.k(gp10Var.h, gp10Var.e, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
