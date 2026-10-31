package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class faf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ vba0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ faf(iu30 iu30Var, vba0 vba0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = vba0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vba0 vba0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new tzz(((tba0) vba0Var).b));
                break;
            case 1:
                iu30Var.invoke(new uzz(((uba0) vba0Var).a));
                break;
            case 2:
                iu30Var.invoke(new iwz(((qba0) vba0Var).a));
                break;
            default:
                iu30Var.invoke(new lyz(((sba0) vba0Var).a));
                break;
        }
        return rih1Var;
    }
}
