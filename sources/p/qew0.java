package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qew0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gfw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qew0(gfw0 gfw0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gfw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gfw0 gfw0Var = this.c;
        switch (b) {
            case 0:
                return new qew0(gfw0Var, lnmVar, (byte) 0);
            default:
                return new qew0(gfw0Var, lnmVar, (byte) 1);
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
        gfw0 gfw0Var = this.c;
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
                k9k k9kVar = gfw0Var.l;
                lew0 lew0Var = new lew0(gfw0Var, (byte) 2);
                lew0 lew0Var2 = new lew0(gfw0Var, (byte) 3);
                lew0 lew0Var3 = new lew0(gfw0Var, (byte) 4);
                this.b = true;
                Object objP = l4p1.p(o4p1.r(new fu20(rqt0.u(new rjm(o4p1.r(rqt0.u(((clm) k9kVar.d).a), (q8n) k9kVar.b), k9kVar, lew0Var3, lew0Var, lew0Var2, (byte) 0)), new gke(lew0Var, k9kVar, (lnm) null, (byte) 12), (byte) 1), (q8n) k9kVar.c), this);
                if (objP != d9nVar) {
                    objP = rih1Var;
                }
                return objP == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Single singleA = gfw0Var.m.a(new d9u0("audiobrowse-client-native-preview-coordinator", false));
                    this.b = true;
                    return fc11.j(singleA, this) == d9nVar ? d9nVar : rih1Var;
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
