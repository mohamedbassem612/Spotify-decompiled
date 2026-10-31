package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fb1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p251 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb1(p251 p251Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = p251Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fb1(this.b, lnmVar, (byte) 0);
            default:
                return new fb1(this.b, lnmVar, (byte) 1);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p251 p251Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                lz20.b(p251Var.a);
                break;
            default:
                hm5.M(obj);
                lz20.b(p251Var.a);
                break;
        }
        return rih1Var;
    }
}
