package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jqb implements iu30 {
    public final /* synthetic */ ne a;
    public final /* synthetic */ htq0 b;
    public final /* synthetic */ Brush c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ n511 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ u8s0 g;

    public /* synthetic */ jqb(ne neVar, htq0 htq0Var, Brush brush, Function0 function0, n511 n511Var, long j, u8s0 u8s0Var) {
        this.a = neVar;
        this.b = htq0Var;
        this.c = brush;
        this.d = function0;
        this.e = n511Var;
        this.f = j;
        this.g = u8s0Var;
    }

    public final Object invoke(Object obj) {
        long j = this.f;
        u8s0 u8s0Var = this.g;
        DrawScope drawScope = (DrawScope) obj;
        Function0 function0 = (Function0) this.a.b;
        function0.getClass();
        float f = ((p3v) function0.invoke()).a;
        float fMin = Math.min(p3v.c(f, 0.0f) ? 1.0f : (float) Math.ceil(drawScope.X0(f)), (float) Math.ceil(hrt.f(drawScope, 2.0f)));
        float f2 = fMin < 0.0f ? 0.0f : fMin;
        float f3 = 2.0f * f2;
        float fE = Size.e(drawScope.j());
        htq0 htq0Var = this.b;
        Brush brush = this.c;
        if (f3 > fE) {
            DrawScope.j1(drawScope, htq0Var.c, brush, 0.0f, (DrawStyle) null, 60);
        } else {
            be50 be50Var = (be50) this.d.invoke();
            fe50 fe50Var = be50Var.a;
            if (!kbb.w(fe50Var.k(), 1)) {
                fe50Var.N(1);
            }
            n511 n511Var = this.e;
            float f4 = n511Var.a;
            float f5 = n511Var.b;
            ((dg8) drawScope.a1().b).z(f4, f5);
            try {
                drawScope.V(j, new lqb(n511Var, htq0Var, brush, f2, u8s0Var), be50Var);
                m5n1.r(drawScope, be50Var);
            } finally {
                ((dg8) drawScope.a1().b).z(-f4, -f5);
            }
        }
        return rih1.a;
    }
}
