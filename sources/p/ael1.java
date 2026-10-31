package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ael1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ael1(yqg yqgVar, Function0 function0, hdn0 hdn0Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yqgVar;
        this.c = function0;
        this.d = hdn0Var;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        yqg yqgVar = this.b;
        ven0 ven0Var = this.e;
        err0 err0Var = this.d;
        switch (b) {
            case 0:
                ydh.m(err0Var, ((Number) obj).intValue());
                ven0Var.setValue(Long.valueOf(yqgVar.b()));
                function0.invoke();
                break;
            default:
                ydh.m(err0Var, ((Number) obj).intValue());
                ven0Var.setValue(Long.valueOf(yqgVar.b()));
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
