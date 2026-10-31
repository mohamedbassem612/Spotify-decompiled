package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o2e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ y2e0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2e0(y2e0 y2e0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = y2e0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y2e0 y2e0Var = this.c;
        switch (b) {
            case 0:
                return new o2e0(y2e0Var, lnmVar, (byte) 0);
            case 1:
                return new o2e0(y2e0Var, lnmVar, (byte) 1);
            case 2:
                return new o2e0(y2e0Var, lnmVar, (byte) 2);
            default:
                return new o2e0(y2e0Var, lnmVar, (byte) 3);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        y2e0 y2e0Var = this.c;
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
                Observable observableA = y2e0Var.h.a(true);
                this.b = true;
                Object objL = fc11.l(observableA, 1, (Object) null, this);
                return objL == d9nVar ? d9nVar : objL;
            case 1:
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
                Observable observable = y2e0Var.g.a;
                this.b = true;
                Object objL2 = fc11.l(observable, 1, (Object) null, this);
                return objL2 == d9nVar ? d9nVar : objL2;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        rk00 rk00Var = y2e0Var.l;
                        this.b = true;
                        x0r x0rVar = rk00Var.a;
                        obj = x0rVar.e.compareAndSet(false, true) ? x0rVar.d.Q(this) : null;
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
                    return (l2e) obj;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                break;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observable2 = y2e0Var.g.a;
                this.b = true;
                Object objL3 = fc11.l(observable2, 1, (Object) null, this);
                return objL3 == d9nVar ? d9nVar : objL3;
        }
    }
}
