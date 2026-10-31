package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dkj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hij1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dkj1(hij1 hij1Var, byte b) {
        super(0);
        this.a = b;
        this.b = hij1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hij1 hij1Var = this.b;
        switch (b) {
            case 0:
                hij1Var.invoke(h331.b);
                break;
            case 1:
                hij1Var.invoke(h331.a);
                break;
            default:
                hij1Var.invoke(h331.c);
                break;
        }
        return rih1Var;
    }
}
