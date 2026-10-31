package p;

import com.spotify.storage.esperanto.proto.EsStorage$DeleteUnlockedItemsParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n6t extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ p6t c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6t(p6t p6tVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = p6tVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p6t p6tVar = this.c;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                return new n6t(p6tVar, lnmVar, (byte) 0).invokeSuspend(rih1Var);
            default:
                return new n6t(p6tVar, lnmVar, (byte) 1).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        p6t p6tVar = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    String str = p6t.e;
                    Object objM = p6tVar.a.m(EsStorage$DeleteUnlockedItemsParams.n(), this);
                    if (objM != d9nVar) {
                        objM = rih1Var;
                    }
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    String str2 = p6t.e;
                    Object objM2 = p6tVar.a.m(EsStorage$DeleteUnlockedItemsParams.n(), this);
                    if (objM2 != d9nVar) {
                        objM2 = rih1Var;
                    }
                    if (objM2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
