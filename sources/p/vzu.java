package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vzu extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzu(p2o0 p2o0Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.b = p2o0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p2o0 p2o0Var = this.b;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                new vzu(p2o0Var, lnmVar, (byte) 0).invokeSuspend(rih1Var);
                break;
            case 1:
                new vzu(p2o0Var, lnmVar, (byte) 1).invokeSuspend(rih1Var);
                break;
            case 2:
                new vzu(p2o0Var, lnmVar, (byte) 2).invokeSuspend(rih1Var);
                break;
            case 3:
                new vzu(p2o0Var, lnmVar, (byte) 3).invokeSuspend(rih1Var);
                break;
            case 4:
                new vzu(p2o0Var, lnmVar, (byte) 4).invokeSuspend(rih1Var);
                break;
            default:
                new vzu(p2o0Var, lnmVar, (byte) 5).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p2o0 p2o0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                wzu.b((lzn0) p2o0Var.b);
                break;
            case 1:
                hm5.M(obj);
                p2o0Var.K(5, ((Context) p2o0Var.f).getString(2131961830));
                break;
            case 2:
                hm5.M(obj);
                p2o0Var.K(5, ((Context) p2o0Var.f).getString(2131961830));
                break;
            case 3:
                hm5.M(obj);
                wzu.b((lzn0) p2o0Var.b);
                break;
            case 4:
                hm5.M(obj);
                p2o0Var.K(6, "Unavailable download 5");
                break;
            default:
                hm5.M(obj);
                p2o0Var.K(6, "Unavailable download 5");
                break;
        }
        return rih1Var;
    }
}
