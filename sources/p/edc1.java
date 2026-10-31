package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class edc1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gdc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ edc1(gdc1 gdc1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gdc1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gdc1 gdc1Var = this.c;
        switch (b) {
            case 0:
                return new edc1(gdc1Var, lnmVar, (byte) 0);
            case 1:
                return new edc1(gdc1Var, lnmVar, (byte) 1);
            default:
                return new edc1(gdc1Var, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        gdc1 gdc1Var = this.c;
        lnm lnmVar = null;
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
                mr20 mr20Var = gdc1Var.e.b;
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 3);
                this.b = true;
                Object objJ = b5p1.j(mr20Var, q1c1Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    long jF = gdc1Var.f.f();
                    edc1 edc1Var = new edc1(gdc1Var, lnmVar, (byte) 0);
                    this.b = true;
                    obj = rc2.O(jF, edc1Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                d3x d3xVar = (d3x) obj;
                bpb1 bpb1Var = gdc1Var.n;
                if (d3xVar == null) {
                    d3xVar = d3x.d;
                }
                bpb1Var.getClass();
                bpb1Var.m((Object) null, d3xVar);
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    bpb1 bpb1Var2 = gdc1Var.n;
                    q1c1 q1c1Var2 = new q1c1(2, (lnm) null, (byte) 4);
                    this.b = true;
                    if (b5p1.j(bpb1Var2, q1c1Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Observable observableObserveOn = ((roc0) gdc1Var.b).e().observeOn(gdc1Var.d);
                fdc1 fdc1Var = fdc1.b;
                gdc1Var.j.b(observableObserveOn.distinctUntilChanged(new fjb((byte) 26)).subscribe(new z2a1(gdc1Var, (byte) 9)));
                return rih1Var;
        }
    }
}
