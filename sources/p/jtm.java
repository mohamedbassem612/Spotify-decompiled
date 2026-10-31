package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jtm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mtm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtm(mtm mtmVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mtmVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mtm mtmVar = this.c;
        switch (b) {
            case 0:
                return new jtm(mtmVar, lnmVar, (byte) 0);
            default:
                return new jtm(mtmVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mtm mtmVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f1n0 f1n0Var = mtmVar.k;
                dwn0 dwn0Var = new dwn0("https://www.spotify.com/platform-rules/plain", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                this.b = true;
                return f1n0Var.c(dwn0Var, null, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f1n0 f1n0Var2 = mtmVar.k;
                dwn0 dwn0Var2 = new dwn0("https://www.spotify.com/legal/end-user-agreement/plain/", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                this.b = true;
                return f1n0Var2.c(dwn0Var2, null, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
