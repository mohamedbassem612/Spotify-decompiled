package p;

import androidx.lifecycle.LifecycleDestroyedException;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nhd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ qhd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhd1(qhd1 qhd1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qhd1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qhd1 qhd1Var = this.c;
        switch (b) {
            case 0:
                return new nhd1(qhd1Var, lnmVar, (byte) 0);
            case 1:
                return new nhd1(qhd1Var, lnmVar, (byte) 1);
            default:
                return new nhd1(qhd1Var, lnmVar, (byte) 2);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    public final Object invokeSuspend(Object obj) throws LifecycleDestroyedException {
        mhd1 mhd1Var;
        mhd1 mhd1Var2;
        mr20 mr20VarI;
        mhd1 mhd1Var3;
        mr20 mr20VarI2;
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        w8c0 w8c0Var = w8c0.a;
        w8c0 w8c0Var2 = w8c0.c;
        d9n d9nVar = d9n.a;
        qhd1 qhd1Var = this.c;
        byte b3 = 2;
        byte b4 = 1;
        switch (b) {
            case 0:
                tac0 tac0Var = ((ap41) qhd1Var).b;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    boolean zJ = bs50Var.J(getContext());
                    if (zJ) {
                        mhd1Var = new mhd1(qhd1Var, b2);
                        this.b = (byte) 1;
                        if (fn31.W(tac0Var, zJ, bs50Var, mhd1Var, this) != d9nVar) {
                        }
                    } else {
                        w8c0 w8c0Var3 = tac0Var.i;
                        if (w8c0Var3 == w8c0Var) {
                            throw new LifecycleDestroyedException();
                        }
                        if (w8c0Var3.compareTo(w8c0Var2) >= 0) {
                            tac0Var.a(qhd1Var);
                        } else {
                            mhd1Var = new mhd1(qhd1Var, b2);
                            this.b = (byte) 1;
                            if (fn31.W(tac0Var, zJ, bs50Var, mhd1Var, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xba1 xba1Var = new xba1(qhd1Var, (lnm) null, (byte) 20);
                this.b = (byte) 2;
                if (z8p1.u(qhd1Var, w8c0.d, xba1Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                tac0 tac0Var2 = ((ap41) qhd1Var).b;
                byte b6 = this.b;
                if (b6 == 0) {
                    hm5.M(obj);
                    fns fnsVar2 = igu.a;
                    bs50 bs50Var2 = pyf0.a.f;
                    boolean zJ2 = bs50Var2.J(getContext());
                    if (zJ2) {
                        mhd1Var2 = new mhd1(qhd1Var, b4);
                        this.b = (byte) 1;
                        if (fn31.W(tac0Var2, zJ2, bs50Var2, mhd1Var2, this) != d9nVar) {
                        }
                    } else {
                        w8c0 w8c0Var4 = tac0Var2.i;
                        if (w8c0Var4 == w8c0Var) {
                            throw new LifecycleDestroyedException();
                        }
                        if (w8c0Var4.compareTo(w8c0Var2) >= 0) {
                            qhd1Var.T0 = qhd1Var.g.a();
                        } else {
                            mhd1Var2 = new mhd1(qhd1Var, b4);
                            this.b = (byte) 1;
                            if (fn31.W(tac0Var2, zJ2, bs50Var2, mhd1Var2, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b6 != 1) {
                    if (b6 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                MobiusLoop mobiusLoop = qhd1Var.T0;
                if (mobiusLoop == null || (mr20VarI = mym.i(mobiusLoop, tac0Var2, 6)) == null) {
                    return rih1Var;
                }
                ohd1 ohd1Var = new ohd1(qhd1Var, b2);
                this.b = (byte) 2;
                if (mr20VarI.collect(ohd1Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                tac0 tac0Var3 = ((ap41) qhd1Var).b;
                byte b7 = this.b;
                if (b7 == 0) {
                    hm5.M(obj);
                    fns fnsVar3 = igu.a;
                    bs50 bs50Var3 = pyf0.a.f;
                    boolean zJ3 = bs50Var3.J(getContext());
                    if (zJ3) {
                        mhd1Var3 = new mhd1(qhd1Var, b3);
                        this.b = (byte) 1;
                        if (fn31.W(tac0Var3, zJ3, bs50Var3, mhd1Var3, this) != d9nVar) {
                        }
                    } else {
                        w8c0 w8c0Var5 = tac0Var3.i;
                        if (w8c0Var5 == w8c0Var) {
                            throw new LifecycleDestroyedException();
                        }
                        if (w8c0Var5.compareTo(w8c0Var2) >= 0) {
                            qhd1Var.V0 = md10.a(qhd1Var.h);
                        } else {
                            mhd1Var3 = new mhd1(qhd1Var, b3);
                            this.b = (byte) 1;
                            if (fn31.W(tac0Var3, zJ3, bs50Var3, mhd1Var3, this) != d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
                if (b7 != 1) {
                    if (b7 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                MobiusLoop mobiusLoop2 = qhd1Var.V0;
                if (mobiusLoop2 == null || (mr20VarI2 = mym.i(mobiusLoop2, tac0Var3, 6)) == null) {
                    return rih1Var;
                }
                ohd1 ohd1Var2 = new ohd1(qhd1Var, b4);
                this.b = (byte) 2;
                if (mr20VarI2.collect(ohd1Var2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
