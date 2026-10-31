package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e6j1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zau0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ sjf1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6j1(zau0 zau0Var, ven0 ven0Var, sjf1 sjf1Var, byte b) {
        super(0);
        this.a = b;
        this.b = zau0Var;
        this.c = ven0Var;
        this.d = sjf1Var;
    }

    public final Object invoke() {
        abu0 abu0Var;
        abu0 abu0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sjf1 sjf1Var = this.d;
        zau0 zau0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                if (zau0Var != null && (abu0Var = (abu0) sjf1Var.invoke()) != null) {
                    abu0Var.a(zau0Var);
                }
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                if (zau0Var != null && (abu0Var2 = (abu0) sjf1Var.invoke()) != null) {
                    abu0Var2.b(zau0Var);
                }
                break;
        }
        return rih1Var;
    }
}
