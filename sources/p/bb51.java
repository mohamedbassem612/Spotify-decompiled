package p;

import androidx.lifecycle.LifecycleDestroyedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bb51 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ db51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb51(db51 db51Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = db51Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        db51 db51Var = this.c;
        switch (b) {
            case 0:
                return new bb51(db51Var, lnmVar, (byte) 0);
            default:
                return new bb51(db51Var, lnmVar, (byte) 1);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    public final Object invokeSuspend(Object obj) throws LifecycleDestroyedException {
        b69 b69Var;
        b69 b69Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w8c0 w8c0Var = w8c0.a;
        w8c0 w8c0Var2 = w8c0.c;
        d9n d9nVar = d9n.a;
        db51 db51Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    tac0 tac0Var = ((ap41) db51Var).b;
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    boolean zJ = bs50Var.J(getContext());
                    if (zJ) {
                        b69Var = new b69((byte) 16);
                        this.b = (byte) 1;
                        if (fn31.W(tac0Var, zJ, bs50Var, b69Var, this) != d9nVar) {
                        }
                    } else {
                        w8c0 w8c0Var3 = tac0Var.i;
                        if (w8c0Var3 == w8c0Var) {
                            throw new LifecycleDestroyedException();
                        }
                        if (w8c0Var3.compareTo(w8c0Var2) < 0) {
                            b69Var = new b69((byte) 16);
                            this.b = (byte) 1;
                            if (fn31.W(tac0Var, zJ, bs50Var, b69Var, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK = r4p1.k(rqt0.u(db51Var.b1), 300L);
                ab51 ab51Var = new ab51(db51Var, (byte) 1);
                this.b = (byte) 2;
                if (mr20VarK.collect(ab51Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    tac0 tac0Var2 = ((ap41) db51Var).b;
                    fns fnsVar2 = igu.a;
                    bs50 bs50Var2 = pyf0.a.f;
                    boolean zJ2 = bs50Var2.J(getContext());
                    if (zJ2) {
                        b69Var2 = new b69((byte) 17);
                        this.b = (byte) 1;
                        if (fn31.W(tac0Var2, zJ2, bs50Var2, b69Var2, this) != d9nVar) {
                        }
                    } else {
                        w8c0 w8c0Var4 = tac0Var2.i;
                        if (w8c0Var4 == w8c0Var) {
                            throw new LifecycleDestroyedException();
                        }
                        if (w8c0Var4.compareTo(w8c0Var2) < 0) {
                            b69Var2 = new b69((byte) 17);
                            this.b = (byte) 1;
                            if (fn31.W(tac0Var2, zJ2, bs50Var2, b69Var2, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(db51Var.c1);
                ab51 ab51Var2 = new ab51(db51Var, (byte) 2);
                this.b = (byte) 2;
                if (mr20VarU.collect(ab51Var2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
