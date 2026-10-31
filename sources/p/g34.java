package p;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g34 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i34 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g34(i34 i34Var, byte b) {
        super(0);
        this.a = b;
        this.b = i34Var;
    }

    public final Object invoke() {
        byte b = this.a;
        i34 i34Var = this.b;
        switch (b) {
            case 0:
                return b8k1.n((View) i34Var.e, 2131427573);
            default:
                return (FrameLayout) b8k1.n((View) i34Var.e, 2131429104);
        }
    }
}
