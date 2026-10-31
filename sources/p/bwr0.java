package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bwr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dlg1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bwr0(dlg1 dlg1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = dlg1Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        dlg1 dlg1Var = this.b;
        switch (b) {
            case 0:
                dlg1Var.y();
                iu30Var.invoke(tlg1.b);
                break;
            case 1:
                dlg1Var.y();
                iu30Var.invoke(tlg1.b);
                break;
            default:
                dlg1Var.u(nik1.W1.a);
                iu30Var.invoke(new rlg1(null));
                break;
        }
        return rih1Var;
    }
}
