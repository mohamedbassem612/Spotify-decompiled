package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wrf1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ trf1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wrf1(iu30 iu30Var, trf1 trf1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = trf1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        trf1 trf1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new prf1(trf1Var.a));
                break;
            case 1:
                iu30Var.invoke(new orf1(trf1Var.a));
                break;
            default:
                iu30Var.invoke(new nrf1(trf1Var.a));
                break;
        }
        return rih1Var;
    }
}
