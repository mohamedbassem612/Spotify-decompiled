package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tu0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu0(uu0 uu0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uu0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                uu0Var.s(true);
                break;
            case 1:
                uu0Var.s(true);
                break;
            case 2:
                ((View) uu0Var.f).setVisibility(8);
                uu0Var.u();
                break;
            default:
                uu0Var.s(false);
                uu0Var.u();
                break;
        }
        return rih1Var;
    }
}
