package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aej1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cej1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aej1(cej1 cej1Var, byte b) {
        super(0);
        this.a = b;
        this.b = cej1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                cej1 cej1Var = this.b;
                x191 x191Var = cej1Var.a;
                x191Var.g(new sjf1(0, cej1Var, cej1.class, "onActive", "onActive()V", 0, (byte) 9));
                x191Var.d(new sjf1(0, cej1Var, cej1.class, "onActive", "onActive()V", 0, (byte) 10), new sjf1(0, cej1Var, cej1.class, "onInactive", "onInactive()V", 0, (byte) 11));
                break;
            default:
                cej1 cej1Var2 = this.b;
                cej1Var2.a.e();
                cej1Var2.d();
                break;
        }
        return rih1Var;
    }
}
