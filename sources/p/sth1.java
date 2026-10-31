package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sth1 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ tth1 b;
    public final /* synthetic */ Effect.UpdateOnDemandSet c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sth1(tth1 tth1Var, Effect.UpdateOnDemandSet updateOnDemandSet, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tth1Var;
        this.c = updateOnDemandSet;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        sth1 sth1Var = new sth1(this.b, this.c, lnmVar);
        sth1Var.a = obj;
        return sth1Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        sth1 sth1Var = (sth1) create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        sth1Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        Effect.UpdateOnDemandSet updateOnDemandSet = this.c;
        if (updateOnDemandSet.getLoadSource() == x4e0.a && u890.j(updateOnDemandSet.getFilterValue(), "default")) {
            c921.y(c9nVar, (o8n) null, 0, new rth1(this.b, updateOnDemandSet, null), 3);
        }
        return rih1.a;
    }
}
