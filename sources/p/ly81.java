package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ly81 extends hab0 implements iu30 {
    public final /* synthetic */ gb5 a;
    public final /* synthetic */ pmg1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ rlm0 f;
    public final /* synthetic */ tob1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly81(gb5 gb5Var, pmg1 pmg1Var, boolean z, boolean z2, long j, rlm0 rlm0Var, tob1 tob1Var) {
        super(1);
        this.a = gb5Var;
        this.b = pmg1Var;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = rlm0Var;
        this.g = tob1Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        o4w o4wVarA = this.a.a();
        pmg1 pmg1Var = this.b;
        float f = pmg1Var.i;
        rlm0 rlm0Var = this.f;
        ((dg8) drawScope.a1().b).z(f, 0.0f);
        boolean z = this.c;
        long j = this.e;
        tob1 tob1Var = this.g;
        try {
            if (z && o4wVarA != null && !this.d) {
                gxo1.n(drawScope, o4wVarA, j, ((Number) tob1Var.getValue()).floatValue(), drawScope.X0(3.0f), pmg1Var.d, pmg1Var.b);
            } else if (!((Collection) rlm0Var.c.getValue()).isEmpty()) {
                hxo1.w(drawScope, rlm0Var.a(), j, ((Number) tob1Var.getValue()).floatValue(), drawScope.X0(3.0f), pmg1Var.d, pmg1Var.b);
            }
            ((dg8) drawScope.a1().b).z(-f, -0.0f);
            return rih1.a;
        } catch (Throwable th) {
            ((dg8) drawScope.a1().b).z(-f, -0.0f);
            throw th;
        }
    }
}
