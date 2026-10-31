package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr0(dg30 dg30Var, byte b) {
        super(0);
        this.a = b;
        this.b = dg30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(dg30Var.getColor(2131101502));
            case 1:
                if (dg30Var != null) {
                    dg30Var.finish();
                }
                return rih1Var;
            case 2:
                if (dg30Var != null) {
                    dg30Var.finish();
                }
                return rih1Var;
            case 3:
                if (!xoi1.b(dg30Var) && !bqn1.z(dg30Var) && !dg30Var.isInMultiWindowMode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (!xoi1.b(dg30Var) && !bqn1.z(dg30Var) && !dg30Var.isInMultiWindowMode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr0(byg0 byg0Var, dg30 dg30Var, byte b) {
        super(0);
        this.a = b;
        this.b = dg30Var;
    }
}
