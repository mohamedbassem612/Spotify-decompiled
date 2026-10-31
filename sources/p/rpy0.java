package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpy0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ upy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpy0(upy0 upy0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = upy0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        upy0 upy0Var = this.c;
        switch (b) {
            case 0:
                return new rpy0(upy0Var, lnmVar, (byte) 0);
            case 1:
                return new rpy0(upy0Var, lnmVar, (byte) 1);
            case 2:
                return new rpy0(upy0Var, lnmVar, (byte) 2);
            case 3:
                return new rpy0(upy0Var, lnmVar, (byte) 3);
            case 4:
                return new rpy0(upy0Var, lnmVar, (byte) 4);
            case 5:
                return new rpy0(upy0Var, lnmVar, (byte) 5);
            default:
                return new rpy0(upy0Var, lnmVar, (byte) 6);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        upy0 upy0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    CompletableOnErrorComplete completableOnErrorCompleteA = upy0.a((Completable) ((zmc1) ((ykq) upy0Var.h).get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA, this) == d9nVar ? d9nVar : rih1Var;
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
                    CompletableOnErrorComplete completableOnErrorCompleteA2 = upy0.a((Completable) ((anc1) ((ykq) upy0Var.i).get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    CompletableOnErrorComplete completableOnErrorCompleteA3 = upy0.a((Completable) ((rr50) upy0Var.d.get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    CompletableOnErrorComplete completableOnErrorCompleteA4 = upy0.a((Completable) ((fk61) ((ykq) upy0Var.c).get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA4, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    CompletableOnErrorComplete completableOnErrorCompleteA5 = upy0.a((Completable) ((g6u) ((ykq) upy0Var.g).get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA5, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    icd1 icd1Var = (icd1) ((ykq) upy0Var.t).get();
                    this.b = true;
                    return icd1Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    CompletableOnErrorComplete completableOnErrorCompleteA6 = upy0.a((Completable) ((d6u) ((ykq) upy0Var.e).get()).invoke());
                    this.b = true;
                    return fc11.i(completableOnErrorCompleteA6, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
