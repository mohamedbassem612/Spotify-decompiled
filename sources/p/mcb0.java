package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mcb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qcb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcb0(qcb0 qcb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = qcb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        qcb0 qcb0Var = this.b;
        switch (b) {
            case 0:
                return new e8x(qcb0Var.P0().getString(2131958990), qcb0Var.P0().getString(2131958991));
            case 1:
                return new e8x(qcb0Var.P0().getString(2131958995), "");
            default:
                hdb0 hdb0Var = qcb0Var.H1;
                if (hdb0Var != null) {
                    return hdb0Var;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
