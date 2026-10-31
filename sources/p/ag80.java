package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ag80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;
    public final /* synthetic */ zau0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag80(cm0 cm0Var, zau0 zau0Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = cm0Var;
        this.c = zau0Var;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zau0 zau0Var = this.c;
        cm0 cm0Var = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                ((abu0) cm0Var.i).a(zau0Var);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                ((abu0) cm0Var.i).b(zau0Var);
                break;
        }
        return rih1Var;
    }
}
