package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mvq0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rok0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvq0(rok0 rok0Var, byte b) {
        super(0);
        this.a = b;
        this.b = rok0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rok0 rok0Var = this.b;
        switch (b) {
            case 0:
                ((View) rok0Var.b).setVisibility(4);
                break;
            case 1:
                ((View) rok0Var.b).setVisibility(0);
                break;
            default:
                View view = (View) rok0Var.b;
                an90 an90Var = (an90) rok0Var.c;
                view.removeCallbacks(an90Var);
                view.postDelayed(an90Var, 3500L);
                break;
        }
        return rih1Var;
    }
}
