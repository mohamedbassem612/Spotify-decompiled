package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pw1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xtb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(boolean z, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.b = z;
        this.c = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new pw1(this.b, xtb0Var, lnmVar);
            case 1:
                return new pw1(xtb0Var, lnmVar, (byte) 1);
            case 2:
                return new pw1(xtb0Var, lnmVar, (byte) 2);
            case 3:
                return new pw1(xtb0Var, lnmVar, (byte) 3);
            case 4:
                return new pw1(xtb0Var, lnmVar, (byte) 4);
            case 5:
                return new pw1(xtb0Var, lnmVar, (byte) 5);
            case 6:
                return new pw1(xtb0Var, lnmVar, (byte) 6);
            case 7:
                return new pw1(xtb0Var, lnmVar, (byte) 7);
            default:
                return new pw1(xtb0Var, lnmVar, (byte) 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                if (this.b) {
                    df41 df41Var = xtb0.y;
                    xtb0Var.j(0, 0);
                }
                return rih1Var;
            case 1:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var2 = xtb0.y;
                    if (xtb0Var.k(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var3 = xtb0.y;
                    if (xtb0Var.k(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 3:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    s55 s55Var = new s55(2, (lnm) null, (byte) 15);
                    this.b = true;
                    if (xtb0Var.a(hfn0.a, s55Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 4:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    int i = xtb0Var.h().o;
                    if (i > 0) {
                        this.b = true;
                        if (xtb0Var.f(i - 1, 0, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 5:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var4 = xtb0.y;
                    if (xtb0Var.f(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 6:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var5 = xtb0.y;
                    if (xtb0Var.k(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 7:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var6 = xtb0.y;
                    if (xtb0Var.k(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var7 = xtb0.y;
                    if (xtb0Var.k(0, 0, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw1(xtb0 xtb0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xtb0Var;
    }
}
