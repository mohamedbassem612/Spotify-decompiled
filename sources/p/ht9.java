package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ht9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht9(iu30 iu30Var, drr0 drr0Var) {
        super(1);
        this.a = (byte) 2;
        this.c = iu30Var;
        this.b = drr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        drr0 drr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float fFloatValue = ((Number) obj).floatValue();
                drr0Var.t(fFloatValue);
                iu30Var.invoke(Float.valueOf(fFloatValue));
                break;
            case 1:
                float fFloatValue2 = ((Number) obj).floatValue();
                drr0Var.t(fFloatValue2);
                iu30Var.invoke(new lu41(fFloatValue2));
                break;
            default:
                float fFloatValue3 = ((Number) obj).floatValue();
                drr0Var.t(fFloatValue3);
                iu30Var.invoke(Float.valueOf(fFloatValue3));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht9(drr0 drr0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = drr0Var;
        this.c = iu30Var;
    }
}
