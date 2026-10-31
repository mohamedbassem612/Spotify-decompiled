package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nih extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nih(Function0 function0, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.d;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                if (((Boolean) ven0Var.getValue()).booleanValue() && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                    function0.invoke();
                    ven0Var2.setValue(Boolean.TRUE);
                }
                lslVar.s1();
                break;
            default:
                c8e1 c8e1Var = (c8e1) obj;
                af5 af5Var = c8e1Var.a;
                if (af5Var.b.length() <= 50) {
                    if (!((Boolean) ven0Var.getValue()).booleanValue() && !u890.j(af5Var.b, ((c8e1) ven0Var2.getValue()).a.b)) {
                        ven0Var.setValue(Boolean.TRUE);
                        function0.invoke();
                    }
                    ven0Var2.setValue(c8e1Var);
                }
                break;
        }
        return rih1Var;
    }
}
