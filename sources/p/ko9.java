package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ko9 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Flowable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko9(Flowable flowable, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = flowable;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Flowable flowable = this.c;
        switch (b) {
            case 0:
                return new ko9(flowable, lnmVar, (byte) 0);
            case 1:
                return new ko9(flowable, lnmVar, (byte) 1);
            case 2:
                return new ko9(flowable, lnmVar, (byte) 2);
            default:
                return new ko9(flowable, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Flowable flowable = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Single singleZ = flowable.z();
                    this.b = true;
                    obj = fc11.j(singleZ, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((th61) obj).Y.a;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Single singleZ2 = flowable.J(u321.b1).z();
                    this.b = true;
                    obj = fc11.j(singleZ2, this);
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
                return obj;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Single singleZ3 = flowable.J(j561.b1).z();
                    this.b = true;
                    obj = fc11.j(singleZ3, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    Single singleZ4 = flowable.J(ta20.S0).z();
                    this.b = true;
                    obj = fc11.j(singleZ4, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
        }
    }
}
