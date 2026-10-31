package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zqf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ frr0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqf(yqg yqgVar, frr0 frr0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = yqgVar;
        this.c = frr0Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        frr0 frr0Var = this.c;
        yqg yqgVar = this.b;
        switch (b) {
            case 0:
                long jC = yqgVar.c();
                if (jC - frr0Var.s() > 300) {
                    function0.invoke();
                }
                frr0Var.t(jC);
                break;
            default:
                long jC2 = yqgVar.c();
                if (jC2 - frr0Var.s() > 300) {
                    function0.invoke();
                }
                frr0Var.t(jC2);
                break;
        }
        return rih1Var;
    }
}
