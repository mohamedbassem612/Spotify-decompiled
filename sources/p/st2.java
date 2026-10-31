package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class st2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Flowable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st2(Flowable flowable, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = flowable;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Flowable flowable = this.c;
        switch (b) {
            case 0:
                return new st2(flowable, lnmVar, (byte) 0);
            default:
                return new st2(flowable, lnmVar, (byte) 1);
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
        Flowable flowable = this.c;
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
                vbm[] vbmVarArr = q601.a;
                xy0 xy0Var = new xy0(new kge(flowable), (byte) 4);
                s4 s4Var = new s4(2, null, (byte) 6);
                this.b = true;
                Object objJ = b5p1.j(xy0Var, s4Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
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
                vbm[] vbmVarArr2 = q601.a;
                kge kgeVar = new kge(flowable);
                this.b = true;
                Object objI = b5p1.i(kgeVar, this);
                return objI == d9nVar ? d9nVar : objI;
        }
    }
}
