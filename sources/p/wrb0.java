package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wrb0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wrb0(long j, tob1 tob1Var) {
        this.b = j;
        this.c = tob1Var;
    }

    public final Object invoke(Object obj) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xrb0 xrb0Var = (xrb0) obj2;
                xrb0Var.e(qr80.c(((qr80) ((o95) obj).e()).a, this.b));
                xrb0Var.c.invoke();
                break;
            default:
                DrawScope.d0((DrawScope) obj, this.b, 0L, 0L, yoi1.o(((Number) ((tob1) obj2).getValue()).floatValue(), 0.0f, 1.0f), (phc1) null, (ColorFilter) null, 118);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ wrb0(xrb0 xrb0Var, long j) {
        this.c = xrb0Var;
        this.b = j;
    }
}
