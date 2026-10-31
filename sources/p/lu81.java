package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu81 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vi11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu81(vi11 vi11Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vi11Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vi11 vi11Var = this.c;
        switch (b) {
            case 0:
                return new lu81(vi11Var, lnmVar, (byte) 0);
            case 1:
                return new lu81(vi11Var, lnmVar, (byte) 1);
            default:
                return new lu81(vi11Var, lnmVar, (byte) 2);
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
        vi11 vi11Var = this.c;
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
                tu41 tu41Var = new tu41((mr20) vi11Var.d, (byte) 22);
                this.b = true;
                Object objI = b5p1.i(tu41Var, this);
                return objI == d9nVar ? d9nVar : objI;
            case 1:
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
                this.b = true;
                Flowable flowable = (Flowable) vi11Var.b;
                vbm[] vbmVarArr = q601.a;
                Object objCollect = rqt0.t(new wzv0(new h801(new kge(flowable), (byte) 10), (byte) 24), ibi0.d1).collect(new bw71(new bw71(new vi((wen0) vi11Var.c, (byte) 13), (byte) 16), (byte) 14), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                mr20 mr20Var = (mr20) vi11Var.d;
                Flowable flowable2 = (Flowable) vi11Var.b;
                vbm[] vbmVarArr2 = q601.a;
                Object objCollect2 = hu20.e(rqt0.w(new x010(mr20Var, new h801(new kge(flowable2), (byte) 9), iu81.h, (byte) 1), fft0.e1, rqt0.b), new ekv((lnm) null, vi11Var)).collect(new phr0((wen0) vi11Var.c, (byte) 1), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == d9nVar ? d9nVar : rih1Var;
        }
    }
}
