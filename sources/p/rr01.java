package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rr01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vr01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr01(vr01 vr01Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vr01Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vr01 vr01Var = this.c;
        switch (b) {
            case 0:
                return new rr01(vr01Var, lnmVar, (byte) 0);
            default:
                return new rr01(vr01Var, lnmVar, (byte) 1);
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
        vr01 vr01Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                Flowable flowable = vr01Var.n;
                vbm[] vbmVarArr = q601.a;
                h801 h801Var = new h801(new kge(flowable), (byte) 1);
                ck01 ck01Var = new ck01(2, (lnm) null, (byte) 2);
                this.b = true;
                Object objJ = b5p1.j(h801Var, ck01Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVarG = vr01Var.g();
                    this.b = true;
                    if (l4p1.p(ezcVarG, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
