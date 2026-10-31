package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yjf extends a8d1 implements xu30 {
    public byte a;
    public /* synthetic */ Intent b;
    public /* synthetic */ th61 c;
    public final /* synthetic */ b72 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjf(b72 b72Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = b72Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yjf yjfVar = new yjf(this.d, (lnm) obj3);
        yjfVar.b = (Intent) obj;
        yjfVar.c = (th61) obj2;
        return yjfVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Intent intent = this.b;
        th61 th61Var = this.c;
        byte b = this.a;
        b72 b72Var = this.d;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            mr20 mr20VarB = ((kbd) b72.d(b72Var).get()).b();
            this.b = intent;
            this.c = th61Var;
            this.a = (byte) 1;
            obj = b5p1.i(mr20VarB, this);
            if (obj != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!((Boolean) obj).booleanValue()) {
            return crn0.a;
        }
        irn0 irn0VarB = b72.b(b72Var, intent, th61Var);
        fta ftaVarC = b72.c(b72Var);
        this.b = null;
        this.c = null;
        this.a = (byte) 2;
        Object objU = ftaVarC.u(intent, irn0VarB, this);
        return objU == d9nVar ? d9nVar : objU;
    }
}
