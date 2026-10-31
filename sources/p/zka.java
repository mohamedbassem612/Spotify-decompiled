package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zka extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ala c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zka(ven0 ven0Var, ala alaVar, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = alaVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ala alaVar = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                xhm1 xhm1Var = (xhm1) ven0Var.getValue();
                if (xhm1Var != null) {
                    alaVar.c.b(xhm1Var, uhd0.c);
                }
                break;
            case 1:
                xhm1 xhm1Var2 = (xhm1) ven0Var.getValue();
                if (xhm1Var2 != null) {
                    alaVar.c.b(xhm1Var2, uhd0.b);
                }
                break;
            default:
                xhm1 xhm1Var3 = (xhm1) ven0Var.getValue();
                if (xhm1Var3 != null) {
                    alaVar.c.b(xhm1Var3, uhd0.a);
                }
                break;
        }
        return rih1Var;
    }
}
