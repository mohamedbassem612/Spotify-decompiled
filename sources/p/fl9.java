package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fl9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xtb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl9(int i, int i2, xtb0 xtb0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = i2;
        this.e = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fl9(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new fl9(this.c, this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new fl9(this.e, this.c, this.d, lnmVar, (byte) 2);
            case 3:
                return new fl9(this.e, this.c, this.d, lnmVar, (byte) 3);
            default:
                return new fl9(this.e, this.c, this.d, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        qtb0 qtb0Var;
        int i;
        int i2;
        int i3;
        int i4;
        Object objL;
        byte b = this.a;
        int i5 = 0;
        rih1 rih1Var = rih1.a;
        int i6 = this.d;
        d9n d9nVar = d9n.a;
        xtb0 xtb0Var = this.e;
        int i7 = this.c;
        Object obj2 = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
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
                if (i7 < 0 || i7 >= i6) {
                    return rih1Var;
                }
                zv8 zv8Var = zv8.Z0;
                this.b = true;
                return y9g1.u(xtb0Var, i7, i6, zv8Var, this) == d9nVar ? d9nVar : rih1Var;
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
                if (i7 < 0 || i7 >= i6) {
                    return rih1Var;
                }
                mr20 mr20VarU = rqt0.u(rwq.q(new ih1(xtb0Var, (byte) 7)));
                gl9 gl9Var = new gl9(xtb0Var, i7, i6, (byte) 0);
                this.b = true;
                return mr20VarU.collect(gl9Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
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
                for (Object obj3 : xtb0Var.h().l) {
                    if (((qtb0) obj3).a == i7) {
                        obj2 = obj3;
                        qtb0Var = (qtb0) obj2;
                        if (qtb0Var == null) {
                            objL = xtb0Var.f(i7, 0, this);
                            if (objL != d9nVar) {
                                objL = rih1Var;
                            }
                        } else {
                            i = xtb0Var.h().m + i6;
                            i2 = xtb0Var.h().n - i6;
                            i3 = qtb0Var.p;
                            if (i3 < i) {
                                i5 = i3 - i;
                            } else {
                                i4 = i3 + qtb0Var.q;
                                if (i4 > i2) {
                                    i5 = i4 - i2;
                                }
                            }
                            if (i5 != 0 || (objL = kqn1.l(xtb0Var, i5, irn1.l0(0.0f, 0.0f, null, 7), this)) != d9nVar) {
                                objL = rih1Var;
                            }
                        }
                        if (objL == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                qtb0Var = (qtb0) obj2;
                if (qtb0Var == null) {
                    objL = xtb0Var.f(i7, 0, this);
                    if (objL != d9nVar) {
                        objL = rih1Var;
                    }
                } else {
                    i = xtb0Var.h().m + i6;
                    i2 = xtb0Var.h().n - i6;
                    i3 = qtb0Var.p;
                    if (i3 < i) {
                        i5 = i3 - i;
                    } else {
                        i4 = i3 + qtb0Var.q;
                        if (i4 > i2) {
                            i5 = i4 - i2;
                        }
                    }
                    if (i5 != 0) {
                        objL = rih1Var;
                    } else {
                        objL = rih1Var;
                    }
                }
                if (objL == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wt20 wt20VarF = z4p1.F(new ht20(rwq.q(new nxb0(xtb0Var, (byte) 28)), new jd41(i7, (lnm) null, (byte) 0), (byte) 2), 1);
                gl9 gl9Var2 = new gl9(xtb0Var, i7, i6, (byte) 1);
                this.b = true;
                return wt20VarF.collect(gl9Var2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wt20 wt20VarF2 = z4p1.F(new ht20(rwq.q(new l5v0(xtb0Var, (byte) 27)), new jd41(i7, (lnm) null, (byte) 1), (byte) 2), 1);
                gl9 gl9Var3 = new gl9(xtb0Var, i7, i6, (byte) 2);
                this.b = true;
                return wt20VarF2.collect(gl9Var3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl9(xtb0 xtb0Var, int i, int i2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = xtb0Var;
        this.c = i;
        this.d = i2;
    }
}
