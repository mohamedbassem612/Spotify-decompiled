package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ajb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ xib0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajb0(iu30 iu30Var, xib0 xib0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = xib0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xib0 xib0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new sib0(xib0Var));
                break;
            default:
                iu30Var.invoke(new tib0(xib0Var));
                break;
        }
        return rih1Var;
    }
}
