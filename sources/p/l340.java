package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l340 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ c380 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l340(byte b, iu30 iu30Var, c380 c380Var) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = c380Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380 c380Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(c380Var.get(0));
                break;
            case 1:
                iu30Var.invoke(c380Var.get(1));
                break;
            default:
                iu30Var.invoke(c380Var.get(2));
                break;
        }
        return rih1Var;
    }
}
