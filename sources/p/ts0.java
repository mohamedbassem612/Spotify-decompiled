package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Map;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ts0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ws0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts0(ws0 ws0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ws0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ws0 ws0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ts0(ws0Var, lnmVar, (byte) 0);
            case 1:
                return new ts0(ws0Var, lnmVar, (byte) 1);
            case 2:
                return new ts0(ws0Var, lnmVar, (byte) 2);
            default:
                return new ts0(ws0Var, lnmVar, (byte) 3);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        byte b = this.a;
        ws0 ws0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xob1 xob1Var = ws0Var.d;
                    this.b = true;
                    obj = fn31.Y(xob1Var.b, new xba1(xob1Var, (lnm) null, (byte) 10), this);
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
                cy0 cy0Var = (cy0) ((Map) obj).get("ad_enabled");
                return Boolean.valueOf(cy0Var != null ? Boolean.parseBoolean(cy0Var.a) : false);
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
                vt0 vt0Var = ws0Var.b;
                this.b = true;
                Object objE = vt0Var.e(this);
                return objE == d9nVar ? d9nVar : objE;
            case 2:
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
                mr20 mr20VarC = ws0Var.c.c();
                this.b = true;
                Object objI = b5p1.i(mr20VarC, this);
                return objI == d9nVar ? d9nVar : objI;
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
                vt0 vt0Var2 = ws0Var.b;
                this.b = true;
                Object objE2 = vt0Var2.e(this);
                return objE2 == d9nVar ? d9nVar : objE2;
        }
    }
}
