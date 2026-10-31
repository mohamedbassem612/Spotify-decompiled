package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class li6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li6(o811 o811Var, byte b) {
        super(1);
        this.a = b;
        this.b = o811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o811 o811Var = this.b;
        switch (b) {
            case 0:
                hav0 hav0Var = (hav0) obj;
                o811Var.a = Offset.g(o811Var.a, p8p1.B(hav0Var, false));
                hav0Var.a();
                break;
            default:
                o811Var.a = ((Number) obj).longValue();
                break;
        }
        return rih1Var;
    }
}
