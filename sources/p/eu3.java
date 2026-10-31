package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eu3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a2r0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu3(a2r0 a2r0Var, String str, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = a2r0Var;
        this.c = str;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        String str = this.c;
        a2r0 a2r0Var = this.b;
        switch (b) {
            case 0:
                a2r0Var.c(str);
                function0.invoke();
                break;
            case 1:
                a2r0Var.e(str);
                function0.invoke();
                break;
            default:
                a2r0Var.c(str);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
