package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l8m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j8m b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8m(j8m j8mVar, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j8mVar;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        j8m j8mVar = this.b;
        switch (b) {
            case 0:
                j8mVar.e.invoke(new h8m(((b9m) obj).a));
                Function0 function0 = j8mVar.f;
                if (function0 != null) {
                    function0.invoke();
                }
                ven0Var.setValue(Boolean.TRUE);
                break;
            default:
                j8mVar.e.invoke(new h8m(((b9m) obj).a));
                Function0 function1 = j8mVar.f;
                if (function1 != null) {
                    function1.invoke();
                }
                ven0Var.setValue(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
