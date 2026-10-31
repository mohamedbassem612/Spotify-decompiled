package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fk6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ Brush c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk6(tob1 tob1Var, Brush brush, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
        this.c = brush;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 1.0f;
                if (fFloatValue < 1.0f) {
                    DrawScope.d0(drawScope, rk6.a, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                }
                DrawScope.S0(drawScope, this.c, 0L, 0L, fFloatValue, (DrawStyle) null, (ColorFilter) null, 0, 118);
                return rih1.a;
            default:
                return ((eqc) obj).a(new fk6(tob1Var, this.c, (byte) 0));
        }
    }
}
