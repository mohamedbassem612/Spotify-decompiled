package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ir21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ nr21 c;
    public final /* synthetic */ jkr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir21(iu30 iu30Var, nr21 nr21Var, jkr0 jkr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = nr21Var;
        this.d = jkr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jkr0 jkr0Var = this.d;
        nr21 nr21Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(nr21Var != null ? nr21Var.a(jkr0Var.o(), true) : null);
                break;
            default:
                iu30Var.invoke(nr21Var != null ? nr21Var.a(jkr0Var.o(), false) : null);
                break;
        }
        return rih1Var;
    }
}
