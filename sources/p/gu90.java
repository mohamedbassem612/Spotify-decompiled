package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gu90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu90(dw91 dw91Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = dw91Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        dw91 dw91Var = this.b;
        switch (b) {
            case 0:
                dw91Var.put(Integer.valueOf(i), new Offset(nho1.n((elb0) obj, true).f()));
                break;
            default:
                dw91Var.put(Integer.valueOf(i), (y9e1) obj);
                break;
        }
        return rih1Var;
    }
}
