package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ik0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik0(jkr0 jkr0Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = jkr0Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                float fT = dm5.T(0.9f, 1.0f, 1.0f - yoi1.o(Math.abs(((drr0) jkr0Var.d.d).s() + (((err0) jkr0Var.d.c).s() - i)), 0.0f, 1.0f));
                kd31Var.r(fT);
                kd31Var.q(fT);
                kd31Var.A(sgc1.u(0.5f, 0.5f));
                break;
            default:
                ((kd31) obj).b((((Number) yoi1.u(Float.valueOf(1.0f - Math.abs(((drr0) jkr0Var.d.d).s() + (((err0) jkr0Var.d.c).s() - i))), new jsg(0.0f, 1.0f))).floatValue() * 0.19999999f) + 0.8f);
                break;
        }
        return rih1Var;
    }
}
