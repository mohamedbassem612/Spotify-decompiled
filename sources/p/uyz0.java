package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uyz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss50 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyz0(ss50 ss50Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ss50Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        sct0 sct0Var = this.b;
        switch (b) {
            case 0:
                sct0Var.a(0);
                iu30Var.invoke(iyz0.a);
                break;
            case 1:
                sct0Var.a(0);
                iu30Var.invoke(p071.a);
                break;
            default:
                sct0Var.a(0);
                iu30Var.invoke(q071.a);
                break;
        }
        return rih1Var;
    }
}
