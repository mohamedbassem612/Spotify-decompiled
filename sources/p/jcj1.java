package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jcj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r0s0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jcj1(r0s0 r0s0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = r0s0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r0s0 r0s0Var = this.c;
        switch (b) {
            case 0:
                return new jcj1(r0s0Var, lnmVar, (byte) 0);
            case 1:
                return new jcj1(r0s0Var, lnmVar, (byte) 1);
            default:
                return new jcj1(r0s0Var, lnmVar, (byte) 2);
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
        r0s0 r0s0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Completable completableA = r0s0Var.A();
                    this.b = true;
                    return fc11.i(completableA, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Completable completableA2 = r0s0Var.A();
                    this.b = true;
                    return fc11.i(completableA2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableJ = ((Flowable) r0s0Var.b).j(mo9.N0);
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge((moy0) flowableJ);
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 21);
                this.b = true;
                Object objJ = b5p1.j(kgeVar, q1c1Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
