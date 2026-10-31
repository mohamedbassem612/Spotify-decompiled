package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class txe1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yzp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ txe1(c9c c9cVar, yzp0 yzp0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yzp0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yzp0 yzp0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return c9c.s(c9c.w(yzp0Var, Math.min(1.0d, (yzp0Var.a + 1.0d) - ((Number) obj).doubleValue())));
            default:
                double dDoubleValue = yzp0Var.a - ((Number) obj).doubleValue();
                if (dDoubleValue < 0.0d) {
                    dDoubleValue = 0.0d;
                }
                return c9c.s(c9c.w(yzp0Var, dDoubleValue));
        }
    }
}
