package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vtg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtg0(xtg0 xtg0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xtg0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xtg0 xtg0Var = this.b;
        switch (b) {
            case 0:
                b261.B((e261) obj, xtg0Var.h);
                return rih1Var;
            case 1:
                b261.n((e261) obj, xtg0Var.b.e);
                return rih1Var;
            case 2:
                b261.n((e261) obj, xtg0Var.c.e);
                return rih1Var;
            default:
                aug0 aug0Var = new aug0((Context) obj);
                aug0Var.setViewConfig(new bug0(xtg0Var.d, xtg0Var.e, xtg0Var.f, xtg0Var.c.d > xtg0Var.b.d ? "user-with-less-listening" : "user-with-more-listening"));
                aug0Var.setContentDescription(xtg0Var.g);
                no80.N(aug0Var);
                return aug0Var;
        }
    }
}
