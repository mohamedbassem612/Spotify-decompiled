package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ftd1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ tsd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftd1(iu30 iu30Var, tsd1 tsd1Var) {
        super(0);
        this.b = iu30Var;
        this.c = tsd1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssd1 ssd1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ssd1 ssd1Var2 = ssd1Var instanceof ssd1 ? ssd1Var : null;
                if (ssd1Var2 != null) {
                    iu30Var.invoke(new nsd1(ssd1Var2.c));
                }
                break;
            default:
                iu30Var.invoke(new msd1(ssd1Var.c));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftd1(tsd1 tsd1Var, iu30 iu30Var) {
        super(0);
        this.c = tsd1Var;
        this.b = iu30Var;
    }
}
