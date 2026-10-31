package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o350 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o350(Function0 function0, Function0 function1, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = function1;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke();
                function0.invoke();
                break;
            case 1:
                function1.invoke();
                function0.invoke();
                break;
            default:
                function1.invoke();
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
