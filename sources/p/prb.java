package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class prb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zen0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prb(boolean z, zen0 zen0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = z;
        this.b = zen0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new prb(this.b, this.c, lnmVar, (byte) 0);
            case 1:
                return new prb(this.b, this.c, lnmVar, (byte) 1);
            default:
                return new prb(this.c, this.b, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zen0 zen0Var = this.b;
        boolean z = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                zen0Var.w1(Boolean.valueOf(z));
                break;
            case 1:
                hm5.M(obj);
                zen0Var.w1(Boolean.valueOf(z));
                break;
            default:
                hm5.M(obj);
                if (z) {
                    zen0Var.w1(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ prb(zen0 zen0Var, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = zen0Var;
        this.c = z;
    }
}
