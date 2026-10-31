package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ogi extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ d0n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogi(iu30 iu30Var, d0n d0nVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = d0nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d0n d0nVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new a0n(d0nVar.a));
                break;
            default:
                iu30Var.invoke(new b0n(d0nVar.a));
                break;
        }
        return rih1Var;
    }
}
