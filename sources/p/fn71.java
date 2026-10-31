package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fn71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ in71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn71(in71 in71Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = in71Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        in71 in71Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fn71(in71Var, lnmVar, (byte) 0);
            default:
                return new fn71(in71Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        in71 in71Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return in71Var.e(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return in71Var.e(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
