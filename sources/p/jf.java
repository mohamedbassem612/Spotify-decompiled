package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;
    public final /* synthetic */ n8l1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf(jkr0 jkr0Var, n8l1 n8l1Var, byte b) {
        super(0);
        this.a = b;
        this.b = jkr0Var;
        this.c = n8l1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n8l1 n8l1Var = this.c;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case 0:
                if (jkr0Var.o() > 0) {
                    int iO = jkr0Var.o() - 1;
                    n8l1Var.c.a(Integer.valueOf(iO >= 0 ? iO : 0));
                }
                break;
            default:
                if (jkr0Var.o() < jkr0Var.l()) {
                    int iO2 = jkr0Var.o() + 1;
                    n8l1Var.c.a(Integer.valueOf(iO2 >= 0 ? iO2 : 0));
                }
                break;
        }
        return rih1Var;
    }
}
