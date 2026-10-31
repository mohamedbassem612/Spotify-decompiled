package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tw5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vw5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw5(vw5 vw5Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vw5Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vw5 vw5Var = this.c;
        switch (b) {
            case 0:
                return new tw5(vw5Var, lnmVar, (byte) 0);
            default:
                return new tw5(vw5Var, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        vw5 vw5Var = this.c;
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
                Flowable flowable = vw5Var.g;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                hb0 hb0Var = new hb0(vw5Var, (byte) 10);
                this.b = true;
                Object objCollect = kgeVar.collect(new tv5(hb0Var, (byte) 3), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
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
                ezc ezcVarG = yoi1.g(vw5Var.b.b);
                h06 h06Var = h06.b;
                mr20 mr20VarU = rqt0.u(new qw5(new ipr(new mmr0(h06Var, h06Var), ezcVarG, new l2(3, (lnm) null, (byte) 8), (byte) 16), (byte) 0));
                uw5 uw5Var = new uw5(vw5Var, (lnm) null, (byte) 0);
                this.b = true;
                return l4p1.q(mr20VarU, uw5Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
