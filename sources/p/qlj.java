package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qlj extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ coc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlj(iu30 iu30Var, coc1 coc1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = coc1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        coc1 coc1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new vym1(coc1Var.h.e));
                break;
            default:
                p60 p60Var = coc1Var.h;
                iu30Var.invoke(new tnc1(p60Var.l, p60Var.e));
                break;
        }
        return rih1Var;
    }
}
