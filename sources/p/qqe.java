package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qqe extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rqe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqe(rqe rqeVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = rqeVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        rqe rqeVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qqe(rqeVar, lnmVar, (byte) 0);
            case 1:
                return new qqe(rqeVar, lnmVar, (byte) 1);
            case 2:
                return new qqe(rqeVar, lnmVar, (byte) 2);
            case 3:
                return new qqe(rqeVar, lnmVar, (byte) 3);
            default:
                return new qqe(rqeVar, lnmVar, (byte) 4);
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
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
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
        rqe rqeVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                rqeVar.O0.invoke();
                break;
            case 1:
                hm5.M(obj);
                rqeVar.O0.invoke();
                break;
            case 2:
                hm5.M(obj);
                rqeVar.O0.invoke();
                break;
            case 3:
                hm5.M(obj);
                rqeVar.O0.invoke();
                break;
            default:
                hm5.M(obj);
                rqeVar.O0.invoke();
                break;
        }
        return rih1Var;
    }
}
