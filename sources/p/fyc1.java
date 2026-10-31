package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fyc1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kkz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyc1(kkz0 kkz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kkz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kkz0 kkz0Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) kkz0Var.b;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1.a;
            default:
                return Integer.valueOf(((mxc1) kkz0Var.d).a.size());
        }
    }
}
