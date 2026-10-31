package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w451 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w451(y7e1 y7e1Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = y7e1Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        y7e1 y7e1Var = this.b;
        switch (b) {
            case 0:
                c4p1.q(y7e1Var);
                function0.invoke();
                break;
            default:
                c4p1.q(y7e1Var);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
