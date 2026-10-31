package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l490 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w9i1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l490(w9i1 w9i1Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = w9i1Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        w9i1 w9i1Var = this.b;
        switch (b) {
            case 0:
                w9i1Var.W(function0);
                break;
            case 1:
                w9i1Var.W(function0);
                break;
            default:
                w9i1Var.f.a();
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
