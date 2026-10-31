package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uk21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk21(l811 l811Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = l811Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                l811Var.a = ((Boolean) function0.invoke()).booleanValue();
                break;
            default:
                l811Var.a = false;
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
