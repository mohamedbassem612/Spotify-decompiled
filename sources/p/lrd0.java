package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lrd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrd0 b;
    public final /* synthetic */ yqd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lrd0(mrd0 mrd0Var, yqd0 yqd0Var, byte b) {
        super(0);
        this.a = b;
        this.b = mrd0Var;
        this.c = yqd0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yqd0 yqd0Var = this.c;
        drd0 drd0Var = drd0.a;
        mrd0 mrd0Var = this.b;
        switch (b) {
            case 0:
                mrd0Var.R0.onNext(drd0Var);
                yqd0Var.e();
                break;
            case 1:
                mrd0Var.R0.onNext(drd0Var);
                mrd0Var.U0.onNext(Boolean.FALSE);
                yqd0Var.d();
                break;
            case 2:
                mrd0Var.R0.onNext(drd0Var);
                yqd0Var.e();
                break;
            default:
                mrd0Var.R0.onNext(drd0Var);
                mrd0Var.U0.onNext(Boolean.FALSE);
                yqd0Var.a();
                break;
        }
        return rih1Var;
    }
}
