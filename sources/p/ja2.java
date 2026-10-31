package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ja2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bab1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja2(bab1 bab1Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = bab1Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ja2(this.b, this.c, lnmVar, (byte) 0);
            case 1:
                return new ja2(this.b, this.c, lnmVar, (byte) 1);
            default:
                return new ja2(this.b, this.c, lnmVar, (byte) 2);
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
        bab1 bab1Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                ven0Var.setValue(bab1Var.d);
                break;
            case 1:
                hm5.M(obj);
                ven0Var.setValue(bab1Var.d);
                break;
            default:
                hm5.M(obj);
                ven0Var.setValue(bab1Var.d);
                break;
        }
        return rih1Var;
    }
}
