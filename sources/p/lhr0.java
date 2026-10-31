package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lhr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ xab0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhr0(iu30 iu30Var, xab0 xab0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = xab0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xab0 xab0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new xbb0(xab0Var.a));
                break;
            default:
                iu30Var.invoke(new xbb0(xab0Var.a));
                break;
        }
        return rih1Var;
    }
}
