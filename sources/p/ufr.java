package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ufr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uu0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufr(uu0 uu0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = uu0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        uu0 uu0Var = this.d;
        switch (b) {
            case 0:
                ufr ufrVar = new ufr(uu0Var, lnmVar, (byte) 0);
                ufrVar.c = obj;
                return ufrVar;
            default:
                ufr ufrVar2 = new ufr(uu0Var, lnmVar, (byte) 1);
                ufrVar2.c = obj;
                return ufrVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uu0 uu0Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                List listI = ((g0l) uu0Var.b).i();
                this.c = null;
                this.b = true;
                return vr20Var.emit(listI, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
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
                List listI2 = ((g0l) uu0Var.b).i();
                this.c = null;
                this.b = true;
                return vr20Var2.emit(listI2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
