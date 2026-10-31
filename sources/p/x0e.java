package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x0e extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xtb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0e(int i, xtb0 xtb0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
        this.d = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        int i = this.c;
        xtb0 xtb0Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new x0e(xtb0Var, i, lnmVar, (byte) 0);
            case 1:
                return new x0e(i, xtb0Var, lnmVar, (byte) 1);
            case 2:
                return new x0e(xtb0Var, i, lnmVar, (byte) 2);
            case 3:
                return new x0e(i, xtb0Var, lnmVar, (byte) 3);
            default:
                return new x0e(xtb0Var, i, lnmVar, (byte) 4);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        int i = this.c;
        xtb0 xtb0Var = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    df41 df41Var = xtb0.y;
                    if (xtb0Var.f(i, 0, this) == d9nVar) {
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
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (i >= 0) {
                        this.b = true;
                        df41 df41Var2 = xtb0.y;
                        if (xtb0Var.f(i, 0, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    if (pro1.s(xtb0Var, i, this) == d9nVar) {
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
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (i >= 0) {
                        this.b = true;
                        df41 df41Var3 = xtb0.y;
                        if (xtb0Var.f(i, 0, this) == d9nVar) {
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
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objF = xtb0Var.f(i, -((xtb0Var.h().n - xtb0Var.h().m) / 2), this);
                    if (objF != d9nVar) {
                        objF = rih1Var;
                    }
                    if (objF == d9nVar) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0e(xtb0 xtb0Var, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = xtb0Var;
        this.c = i;
    }
}
