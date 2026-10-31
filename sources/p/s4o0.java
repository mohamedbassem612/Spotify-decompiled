package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s4o0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ v4o0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4o0(v4o0 v4o0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = v4o0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        v4o0 v4o0Var = this.c;
        switch (b) {
            case 0:
                return new s4o0(v4o0Var, lnmVar, (byte) 0);
            default:
                return new s4o0(v4o0Var, lnmVar, (byte) 1);
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
        Object objJ;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v4o0 v4o0Var = this.c;
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
                kqi0 kqi0Var = v4o0Var.b;
                this.b = true;
                n1o0 n1o0VarA = ((o1o0) kqi0Var.d).a();
                if (n1o0VarA == null || (objJ = fc11.j(n1o0VarA.a(), this)) != d9nVar) {
                    objJ = rih1Var;
                }
                return objJ == d9nVar ? d9nVar : rih1Var;
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
                v1o0 v1o0Var = v4o0Var.d;
                Completable completableIgnoreElement = v1o0Var.a().doOnSuccess(new lrj0(v1o0Var, (byte) 13)).ignoreElement();
                this.b = true;
                return fc11.i(completableIgnoreElement, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
