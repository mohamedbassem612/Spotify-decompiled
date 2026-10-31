package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xt6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vy71 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt6(vy71 vy71Var, Function0 function0, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = vy71Var;
        this.c = function0;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        ven0 ven0Var = this.d;
        vy71 vy71Var = this.b;
        switch (b) {
            case 0:
                if (!vy71Var.i()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                function0.invoke();
                break;
            default:
                if (!vy71Var.i()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
