package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d110 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m811 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d110(m811 m811Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = m811Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        m811 m811Var = this.b;
        switch (b) {
            case 0:
                if (m811Var.a > 50.0f) {
                    function0.invoke();
                }
                break;
            case 1:
                m811Var.a = 0.0f;
                function0.invoke();
                break;
            default:
                m811Var.a = 0.0f;
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
