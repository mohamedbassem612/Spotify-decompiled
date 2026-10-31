package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class su40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ l811 c;
    public final /* synthetic */ tu40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su40(Function0 function0, l811 l811Var, tu40 tu40Var, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = l811Var;
        this.d = tu40Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        tu40 tu40Var = this.d;
        l811 l811Var = this.c;
        switch (b) {
            case 0:
                if (!l811Var.a) {
                    l811Var.a = true;
                    tu40Var.e.setValue((Object) null);
                    function0.invoke();
                }
                break;
            default:
                if (!l811Var.a) {
                    l811Var.a = true;
                    tu40Var.e.setValue((Object) null);
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
