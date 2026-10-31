package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ups implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    public /* synthetic */ ups(tob1 tob1Var, byte b) {
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                long j = ((u7h) tob1Var.getValue()).a;
                if (!z4h1.b(j, u7h.k)) {
                    DrawScope.d0(drawScope, j, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                }
                break;
            case 1:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                break;
            default:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                break;
        }
        return rih1Var;
    }
}
