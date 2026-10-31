package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nuk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ eeo0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nuk1(iu30 iu30Var, eeo0 eeo0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = eeo0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eeo0 eeo0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new xuk1(eeo0Var.a));
                break;
            default:
                iu30Var.invoke(new wuk1(eeo0Var.a));
                break;
        }
        return rih1Var;
    }
}
