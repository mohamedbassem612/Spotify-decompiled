package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ndl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jti0 b;
    public final /* synthetic */ drr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndl1(jti0 jti0Var, drr0 drr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jti0Var;
        this.c = drr0Var;
    }

    public final Object invoke(Object obj) {
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jti0 jti0Var = this.b;
        drr0 drr0Var = this.c;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) ((o95) obj).e()).floatValue();
                drr0Var.t(fFloatValue);
                jti0Var.e(jch0.U(fFloatValue), true);
                int i = jti0Var.c;
                if (fFloatValue < i) {
                    f = i - fFloatValue;
                } else {
                    int i2 = jti0Var.d;
                    f = fFloatValue > ((float) i2) ? fFloatValue - i2 : 0.0f;
                }
                if (f <= 2500.0f) {
                    return rih1Var;
                }
                throw new CancellationException("Overscroll limit reached");
            default:
                o95 o95Var = (o95) obj;
                drr0Var.t(((Number) o95Var.e()).floatValue());
                jti0Var.e(jch0.U(((Number) o95Var.e()).floatValue()), true);
                return rih1Var;
        }
    }
}
