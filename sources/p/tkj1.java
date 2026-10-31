package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tkj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vkj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkj1(vkj1 vkj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = vkj1Var;
    }

    public final Object invoke() {
        Function0 function0;
        Function0 function1;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vkj1 vkj1Var = this.b;
        switch (b) {
            case 0:
                if (vkj1Var.a.e != null && (function0 = vkj1Var.d) != null) {
                    function0.invoke();
                }
                break;
            default:
                if (vkj1Var.a.e == null && (function1 = vkj1Var.d) != null) {
                    function1.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
