package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sx0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ay0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx0(ay0 ay0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ay0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ay0 ay0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new sx0(ay0Var, lnmVar, (byte) 0);
            case 1:
                return new sx0(ay0Var, lnmVar, (byte) 1);
            default:
                return new sx0(ay0Var, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        byte b = this.a;
        ay0 ay0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
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
                xr0 xr0Var = new xr0(ay0Var.i, (byte) 1);
                this.b = true;
                Object objI = b5p1.i(xr0Var, this);
                return objI == d9nVar ? d9nVar : objI;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    xr0 xr0Var2 = new xr0(ay0Var.i, (byte) 2);
                    this.b = true;
                    obj = b5p1.i(xr0Var2, this);
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
                return ((mx0) obj).a;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ayh ayhVar = ay0Var.g;
                this.b = true;
                Object objQ = ayhVar.Q(this);
                return objQ == d9nVar ? d9nVar : objQ;
        }
    }
}
