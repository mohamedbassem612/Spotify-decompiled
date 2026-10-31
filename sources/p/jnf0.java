package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jnf0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ lnf0 c;
    public final /* synthetic */ ang1 d;
    public final /* synthetic */ dhf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jnf0(lnf0 lnf0Var, ang1 ang1Var, dhf0 dhf0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = lnf0Var;
        this.d = ang1Var;
        this.e = dhf0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new jnf0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new jnf0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = smo1.s(new xd1(this.c, this.d, this.e, (lnm) null, (byte) 12), this);
                    return objS == d9nVar ? d9nVar : objS;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                String str = this.d.a;
                lnf0 lnf0Var = this.c;
                Single singleDefer = Single.defer(new inf0(lnf0Var, this.e, str, (byte) 0));
                Scheduler scheduler = lnf0Var.j;
                Single singleOnErrorReturnItem = singleDefer.subscribeOn(scheduler).observeOn(scheduler).onErrorReturnItem(c680.y());
                this.b = true;
                Object objJ = fc11.j(singleOnErrorReturnItem, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
