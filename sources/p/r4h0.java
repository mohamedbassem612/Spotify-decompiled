package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r4h0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4h0(ks6 ks6Var, byte b) {
        super(1);
        this.a = b;
        this.b = ks6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                y5h0 y5h0Var = (y5h0) obj;
                c380 c380Var = y5h0Var.b;
                return new ot80(xa4.A(((Resources) ks6Var.b).getString(2131958338), y5h0Var.c, c380Var));
            default:
                q5h0 q5h0Var = (q5h0) obj;
                return new kz71(16, q5h0Var.b, ((mr4) ks6Var.S0).l(), q5h0Var.c, q5h0Var.d);
        }
    }
}
