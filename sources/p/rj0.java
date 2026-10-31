package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(iu30 iu30Var, hdn0 hdn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = hdn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        err0 err0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue == 0) {
                    iu30Var.invoke(new dkk1(2));
                } else if (iIntValue == 100) {
                    iu30Var.invoke(new dkk1(5));
                } else if (iIntValue < 50 && err0Var.s() >= 50) {
                    iu30Var.invoke(new dkk1(4));
                } else if (iIntValue >= 50 && err0Var.s() < 50) {
                    iu30Var.invoke(new dkk1(3));
                }
                err0Var.t(iIntValue);
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                err0Var.t(iIntValue2);
                iu30Var.invoke(Integer.valueOf(iIntValue2));
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                err0 err0Var2 = err0Var;
                if (iIntValue3 != err0Var2.s()) {
                    err0Var2.t(iIntValue3);
                    iu30Var.invoke(Integer.valueOf(iIntValue3));
                }
                break;
        }
        return rih1Var;
    }
}
