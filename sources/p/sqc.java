package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sqc extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqc(Function0 function0, Function0 function1, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = function1;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                } else {
                    function1.invoke();
                }
                break;
            default:
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                } else {
                    function1.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
