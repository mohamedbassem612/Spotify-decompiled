package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w7f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f1(float f, Function0 function0) {
        super(1);
        this.c = f;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                kd31Var.C(kd31Var.T0.h() * 6.0f * f * ((float) Math.sin(((Number) function0.invoke()).doubleValue() * 3.141592653589793d)));
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                float fT = dm5.T(f, 1.0f, fFloatValue);
                kd31Var2.q(fT);
                kd31Var2.r(fT);
                kd31Var2.A(sgc1.u(0.0f, 0.0f));
                kd31Var2.b(fFloatValue > 0.4f ? 1.0f - ((fFloatValue - 0.4f) / 0.6f) : 1.0f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f1(Function0 function0, float f) {
        super(1);
        this.b = function0;
        this.c = f;
    }
}
