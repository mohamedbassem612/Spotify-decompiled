package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jg40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg40(ro30 ro30Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ro30Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ro30 ro30Var = this.b;
        switch (b) {
            case 0:
                nmu0 nmu0Var = nmu0.b;
                if (ro30Var != null) {
                    ro30Var.s(nmu0Var);
                }
                iu30Var.invoke(nmu0Var);
                break;
            default:
                nmu0 nmu0Var2 = nmu0.c;
                if (ro30Var != null) {
                    ro30Var.s(nmu0Var2);
                }
                iu30Var.invoke(nmu0Var2);
                break;
        }
        return rih1Var;
    }
}
