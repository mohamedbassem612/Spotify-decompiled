package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pvs0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ovs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvs0(ovs0 ovs0Var, cvx cvxVar, byte b) {
        super(3);
        this.a = b;
        this.b = ovs0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        ovs0 ovs0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                int i = ovs0Var.a;
                String upperCase = cwl1.U(2131820569, i, new Object[]{Integer.valueOf(i)}, b0kVar).toUpperCase(Locale.ROOT);
                uwr uwrVar = cbx.a;
                uwo1.e(upperCase, anm1.N("allboarding_picker_selected_label", uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7)), cbx.d(b0kVar).h, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar, 0, 0, 2024);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strN0 = cwl1.n0(2131952263, new Object[]{Integer.valueOf(ovs0Var.b)}, b0kVar2);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strN0, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(b0kVar2).g, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
                break;
        }
        return rih1Var;
    }
}
