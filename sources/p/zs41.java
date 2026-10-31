package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zs41 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bt41 b;

    public /* synthetic */ zs41(bt41 bt41Var, byte b) {
        this.a = b;
        this.b = bt41Var;
    }

    public final Object invoke() {
        byte b = this.a;
        bt41 bt41Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((pim0) bt41Var).N0);
            default:
                pim0 pim0Var = bt41Var.t1;
                if (!pim0Var.a.N0) {
                    return null;
                }
                wz20 wz20VarL1 = pim0Var.L1();
                if (!wz20VarL1.a()) {
                    return null;
                }
                if (wz20VarL1.b()) {
                    return pim0Var.K1((elb0) null);
                }
                d030 d030VarH = oap1.C(pim0Var).getFocusOwner().h();
                if (d030VarH != null) {
                    return d030VarH.K1(oap1.z(pim0Var));
                }
                return null;
        }
    }
}
