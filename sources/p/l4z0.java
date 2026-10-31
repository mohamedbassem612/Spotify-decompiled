package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l4z0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ hdn0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4z0(xtb0 xtb0Var, ven0 ven0Var, hdn0 hdn0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xtb0Var;
        this.d = ven0Var;
        this.e = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new l4z0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new l4z0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.e;
        ven0 ven0Var = this.d;
        xtb0 xtb0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (((o4z0) ven0Var.getValue()).b.size() > err0Var.s()) {
                        int size = ((o4z0) ven0Var.getValue()).b.size();
                        this.b = true;
                        df41 df41Var = xtb0.y;
                        if (xtb0Var.f(size, 0, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                err0Var.t(((o4z0) ven0Var.getValue()).b.size());
                return rih1Var;
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
                m441 m441VarQ = rwq.q(new wt41(xtb0Var, (byte) 15));
                i6e1 i6e1Var = new i6e1(ven0Var, err0Var, (byte) 18);
                this.b = true;
                return m441VarQ.collect(i6e1Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
