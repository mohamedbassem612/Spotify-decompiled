package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class axj extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axj(float f, float f2, drr0 drr0Var) {
        super(1);
        this.b = f;
        this.c = f2;
        this.d = drr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        float f2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fS = (f2 + f) - ((drr0) obj2).s();
                if (fS < 0.0f) {
                    fS = 0.0f;
                }
                kd31Var.E(fS);
                break;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.b0(drawScope, u7h.b(u7h.b, f2 * 0.3f, 0.0f, 0.0f, 0.0f, 14), ((m2s) obj2).b ? drawScope.X0(f) / 2.0f : hrt.f(drawScope, 2.0f), 0L, 0.0f, (DrawStyle) null, 124);
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                t5t0 t5t0Var = (t5t0) obj2;
                kd31Var2.C(t5t0Var.d * f2);
                kd31Var2.E(t5t0Var.e * f);
                kd31Var2.p(t5t0Var.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axj(float f, m2s m2sVar, float f2) {
        super(1);
        this.b = f;
        this.d = m2sVar;
        this.c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axj(t5t0 t5t0Var, float f, float f2) {
        super(1);
        this.d = t5t0Var;
        this.b = f;
        this.c = f2;
    }
}
