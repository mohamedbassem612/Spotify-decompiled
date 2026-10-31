package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xw2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ sw2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw2(iu30 iu30Var, sw2 sw2Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = sw2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sw2 sw2Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new lw2(((rw2) sw2Var).b));
                break;
            default:
                iu30Var.invoke(new kw2(((rw2) sw2Var).c));
                break;
        }
        return rih1Var;
    }
}
