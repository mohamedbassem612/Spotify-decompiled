package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qeb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeb(af5 af5Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = af5Var;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        af5 af5Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (((ze5) o7h.s0(af5Var.c(iIntValue, iIntValue, "SIGN_UP"))) != null) {
                    function0.invoke();
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                if (((ze5) o7h.s0(af5Var.c(iIntValue2, iIntValue2, "settings_link"))) != null) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
