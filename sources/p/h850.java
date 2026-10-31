package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h850 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc20 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h850(lc20 lc20Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = lc20Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        lc20 lc20Var = this.b;
        switch (b) {
            case 0:
                lc20Var.l();
                iu30Var.invoke(m000.c);
                break;
            case 1:
                lc20Var.k();
                iu30Var.invoke(m000.b);
                break;
            case 2:
                lc20Var.l();
                iu30Var.invoke(m000.d);
                break;
            default:
                lc20Var.k();
                iu30Var.invoke(m000.b);
                break;
        }
        return rih1Var;
    }
}
