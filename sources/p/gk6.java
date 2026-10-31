package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gk6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk6(cj6 cj6Var, byte b) {
        super(1);
        this.a = b;
        this.b = cj6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cj6 cj6Var = this.b;
        switch (b) {
            case 0:
                DrawScope.d0((DrawScope) obj, cj6Var.g, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1.a;
            default:
                return ((eqc) obj).a(new gk6(cj6Var, (byte) 0));
        }
    }
}
