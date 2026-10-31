package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u990 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zja1 b;
    public final /* synthetic */ aka1 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u990(zja1 zja1Var, aka1 aka1Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = zja1Var;
        this.c = aka1Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        fw80 fw80Var = fw80.c;
        aka1 aka1Var = this.c;
        zja1 zja1Var = this.b;
        switch (b) {
            case 0:
                bka1.b(zja1Var, aka1Var, fw80Var);
                function0.invoke();
                break;
            case 1:
                bka1.b(zja1Var, aka1Var, fw80Var);
                function0.invoke();
                break;
            default:
                bka1.b(zja1Var, aka1Var, fw80Var);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
