package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class crf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ drr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crf(drr0 drr0Var, drr0 drr0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = drr0Var;
        this.c = drr0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.c;
        drr0 drr0Var2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                long jO = ((elb0) obj).O(0L);
                drr0Var2.t(Float.intBitsToFloat((int) (jO >> 32)));
                drr0Var.t(Float.intBitsToFloat((int) (jO & 4294967295L)));
                return rih1Var;
            case 1:
                long jO2 = ((elb0) obj).O(0L);
                drr0Var2.t(Float.intBitsToFloat((int) (jO2 >> 32)));
                drr0Var.t(Float.intBitsToFloat((int) (jO2 & 4294967295L)));
                return rih1Var;
            case 2:
                elb0 elb0Var = (elb0) obj;
                n511 n511VarM = nho1.v(elb0Var).M(elb0Var, true);
                drr0Var2.t(Float.intBitsToFloat((int) (n511VarM.f() & 4294967295L)));
                drr0Var.t(n511VarM.c - n511VarM.a);
                return rih1Var;
            case 3:
                long j = ((yr80) obj).a;
                drr0Var2.t((int) (j >> 32));
                drr0Var.t((int) (j & 4294967295L));
                return rih1Var;
            default:
                return new qr80(((long) ((-jch0.U(drr0Var2.s())) - jch0.U(drr0Var.s()))) << 32);
        }
    }
}
