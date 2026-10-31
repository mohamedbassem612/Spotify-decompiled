package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q71 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public final /* synthetic */ boolean c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(boolean z, a680 a680Var, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.c = z;
        this.d = a680Var;
        this.e = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.e;
        boolean z = this.c;
        switch (b) {
            case 0:
                return new q71((eyh0) obj, z, lnmVar);
            default:
                return new q71(z, (a680) this.d, (String) obj, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        h9t0 h9t0Var;
        q71 q71Var;
        ijr ijrVar;
        byte b = this.a;
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                eyh0 eyh0Var = (eyh0) obj2;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h9t0Var = (h9t0) this.d;
                        hm5.M(obj);
                    }
                    th61 th61Var = (th61) obj;
                    return new p71(h9t0Var, th61Var != null ? th61Var.a : null);
                }
                hm5.M(obj);
                Single singleF = ((gj10) eyh0Var.d).f(z);
                this.b = (byte) 1;
                obj = fc11.j(singleF, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                h9t0Var = (h9t0) obj;
                Flowable flowable = (Flowable) eyh0Var.b;
                this.d = h9t0Var;
                this.b = (byte) 2;
                obj = u890.m(flowable, 2, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                th61 th61Var2 = (th61) obj;
                return new p71(h9t0Var, th61Var2 != null ? th61Var2.a : null);
            default:
                String str = (String) obj2;
                a680 a680Var = (a680) this.d;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1.a;
                }
                hm5.M(obj);
                if (z) {
                    ccc0 ccc0Var = (ccc0) a680Var.a;
                    this.b = (byte) 1;
                    q71Var = this;
                    if (ccc0.b(ccc0Var, str, false, (ubc0) null, q71Var, 4) == d9nVar) {
                        return d9nVar;
                    }
                }
                ijrVar = (ijr) a680Var.b;
                q71Var.b = (byte) 2;
                if (ijrVar.e(str, q71Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
                q71Var = this;
                ijrVar = (ijr) a680Var.b;
                q71Var.b = (byte) 2;
                if (ijrVar.e(str, q71Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(eyh0 eyh0Var, boolean z, lnm lnmVar) {
        super(1, lnmVar);
        this.e = eyh0Var;
        this.c = z;
    }
}
