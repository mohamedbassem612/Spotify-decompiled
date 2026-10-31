package p;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oh51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh51(uu0 uu0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uu0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                return new thq0((gw70) uu0Var.e, (lzn0) uu0Var.b);
            default:
                return q1o1.u(new ozg1(new sfx(((xfx) uu0Var.c).e, (byte) 3), (lzn0) uu0Var.b, false, (agc0) uu0Var.d), (qim0) null, (FrameLayout.LayoutParams) null, 7);
        }
    }
}
