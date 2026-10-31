package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tyz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss50 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ myz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyz0(ss50 ss50Var, iu30 iu30Var, myz0 myz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ss50Var;
        this.c = iu30Var;
        this.d = myz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        myz0 myz0Var = this.d;
        iu30 iu30Var = this.c;
        sct0 sct0Var = this.b;
        switch (b) {
            case 0:
                sct0Var.a(0);
                iu30Var.invoke(new jyz0(myz0Var));
                break;
            default:
                sct0Var.a(0);
                iu30Var.invoke(new jyz0(myz0Var));
                break;
        }
        return rih1Var;
    }
}
