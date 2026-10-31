package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iai extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ lz20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iai(iu30 iu30Var, lz20 lz20Var) {
        super(0);
        this.b = iu30Var;
        this.c = lz20Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lz20 lz20Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                lz20.b(lz20Var);
                iu30Var.invoke(yqc.a);
                break;
            default:
                iu30Var.invoke(uqc.a);
                lz20.b(lz20Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iai(lz20 lz20Var, iu30 iu30Var) {
        super(0);
        this.c = lz20Var;
        this.b = iu30Var;
    }
}
