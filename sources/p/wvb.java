package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wvb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ swb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvb(iu30 iu30Var, swb swbVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = swbVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        swb swbVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new jwb(swbVar));
                break;
            case 1:
                iu30Var.invoke(new kwb(swbVar));
                break;
            default:
                iu30Var.invoke(new jwb(swbVar));
                break;
        }
        return rih1Var;
    }
}
