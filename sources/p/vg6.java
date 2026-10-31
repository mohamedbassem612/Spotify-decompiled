package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vg6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg6(c21 c21Var, byte b) {
        super(1);
        this.a = b;
        this.b = c21Var;
    }

    public final Object invoke(Object obj) {
        tob1 tob1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c21 c21Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = (c21Var == null || (tob1Var = (tob1) c21Var.i) == null) ? 1.0f : ((Number) tob1Var.getValue()).floatValue();
                kd31Var.b(fFloatValue);
                kd31Var.E(kd31Var.T0.h() * yh6.c * (1.0f - fFloatValue));
                kd31Var.i(2);
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.b(c21Var != null ? ((Number) ((tob1) c21Var.t).getValue()).floatValue() : 1.0f);
                kd31Var2.i(2);
                break;
        }
        return rih1Var;
    }
}
