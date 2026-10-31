package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sy5 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k6a1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy5(k6a1 k6a1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = k6a1Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        b6t b6tVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    if (b6tVar != null) {
                        b6tVar.a();
                    }
                }
                break;
            case 1:
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((iu30) ven0Var.getValue()).invoke(gpe.a);
                break;
            default:
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((iu30) ven0Var.getValue()).invoke(gra0.a);
                break;
        }
        return rih1Var;
    }
}
