package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e9i extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ dka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9i(iu30 iu30Var, dka dkaVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = dkaVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dka dkaVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new uym1(dkaVar.b.e));
                break;
            default:
                p60 p60Var = dkaVar.b;
                iu30Var.invoke(new vja(p60Var.l, p60Var.e));
                break;
        }
        return rih1Var;
    }
}
