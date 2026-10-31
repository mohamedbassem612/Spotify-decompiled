package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tie extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ cke c;
    public final /* synthetic */ pie d;
    public final /* synthetic */ ahe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tie(cke ckeVar, pie pieVar, ahe aheVar, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = ckeVar;
        this.d = pieVar;
        this.e = aheVar;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new tie(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new tie(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ahe aheVar = this.e;
        pie pieVar = this.d;
        cke ckeVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = aheVar.a;
                this.b = true;
                Object objH = mmo1.H(ckeVar, pieVar, str, this);
                return objH == d9nVar ? d9nVar : objH;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str2 = aheVar.a;
                this.b = true;
                Object objG = mmo1.G(ckeVar, pieVar, str2, this);
                return objG == d9nVar ? d9nVar : objG;
        }
    }
}
