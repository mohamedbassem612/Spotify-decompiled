package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rsk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsk(ven0 ven0Var, vu30 vu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = vu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) ven0Var.getValue();
                if (mmr0Var != null) {
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    vu30Var.invoke(Integer.valueOf(iIntValue), (upk0) mmr0Var.b);
                }
                break;
            default:
                mmr0 mmr0Var2 = (mmr0) ven0Var.getValue();
                if (mmr0Var2 != null) {
                    int iIntValue2 = ((Number) mmr0Var2.a).intValue();
                    vu30Var.invoke(Integer.valueOf(iIntValue2), (upk0) mmr0Var2.b);
                }
                break;
        }
        return rih1Var;
    }
}
