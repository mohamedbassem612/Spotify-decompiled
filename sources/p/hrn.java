package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hrn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrn(boolean z, Function0 function0, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        boolean z = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                if (!z) {
                    ven0Var.setValue(Boolean.FALSE);
                    function0.invoke();
                }
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                ven0Var.setValue(Boolean.FALSE);
                if ((z || zBooleanValue) && function0 != null) {
                    function0.invoke();
                }
                break;
            case 2:
                if (!z) {
                    function0.invoke();
                } else {
                    ven0Var.setValue(u8w.c);
                }
                break;
            default:
                if (z && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
