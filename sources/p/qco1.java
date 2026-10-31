package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qco1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yln1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qco1(yln1 yln1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = yln1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        yln1 yln1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qco1(yln1Var, lnmVar, (byte) 0);
            default:
                return new qco1(yln1Var, lnmVar, (byte) 1);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws zzhm {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws zzhm {
        byte b = this.a;
        tgo1 tgo1Var = tgo1.c;
        yln1 yln1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                ain1 ain1VarX = yln1Var.D().x();
                ain1 ain1VarY = yln1Var.D().y();
                if (ain1VarX.w()) {
                    throw new zzhm(tgo1Var, ij81.I1, null, null);
                }
                bnn1 bnn1VarZ = cnn1.z();
                bnn1VarZ.d();
                ((cnn1) bnn1VarZ.b).B(ain1VarX);
                bnn1VarZ.d();
                ((cnn1) bnn1VarZ.b).C(ain1VarY);
                return bnn1VarZ.e();
            default:
                hm5.M(obj);
                if (yln1Var.D().z()) {
                    return rih1.a;
                }
                throw new zzhm(tgo1Var, ij81.I1, null, null);
        }
    }
}
