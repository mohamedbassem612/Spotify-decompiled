package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aix extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aix(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        ven0 ven0Var3 = this.d;
        switch (b) {
            case 0:
                ((Function0) ven0Var2.getValue()).invoke();
                ((iu30) ven0Var.getValue()).invoke(ll10.a((ll10) ven0Var3.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 61));
                break;
            case 1:
                ((Function0) ven0Var2.getValue()).invoke();
                ((iu30) ven0Var.getValue()).invoke(ll10.a((ll10) ven0Var3.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 61));
                break;
            case 2:
                String str = (String) ven0Var2.getValue();
                if (str != null) {
                    ((iu30) ven0Var.getValue()).invoke(new r8g0(str));
                }
                ven0Var3.setValue((Object) null);
                break;
            case 3:
                if (n7h0.b(ven0Var2)) {
                    Boolean bool = Boolean.FALSE;
                    ven0Var2.setValue(bool);
                    ven0Var.setValue(bool);
                }
                break;
            case 4:
                ven0Var2.setValue((Object) null);
                Boolean bool2 = Boolean.FALSE;
                ven0Var.setValue(bool2);
                ven0Var3.setValue(bool2);
                break;
            default:
                ven0Var3.setValue(Boolean.TRUE);
                ((Function0) ven0Var2.getValue()).invoke();
                ((Function0) ven0Var.getValue()).invoke();
                break;
        }
        return rih1Var;
    }
}
