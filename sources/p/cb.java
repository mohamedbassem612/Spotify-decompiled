package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb(Function0 function0, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.c = function0;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 1:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                break;
            case 2:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 4:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 6:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 7:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 10:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                break;
            case 11:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 12:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 13:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 14:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 15:
                ven0Var.setValue((Object) null);
                function0.invoke();
                break;
            case 16:
                ven0Var.setValue((Object) null);
                function0.invoke();
                break;
            case 17:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 18:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 19:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 20:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 21:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 22:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 23:
                ven0Var.setValue("");
                function0.invoke();
                break;
            case 24:
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 25:
                ven0Var.setValue("");
                function0.invoke();
                break;
            case 26:
                o3r o3rVar = ezg0.S0;
                ven0Var.setValue(function0);
                break;
            case 27:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 28:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                function0.invoke();
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb(ven0 ven0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = function0;
    }
}
