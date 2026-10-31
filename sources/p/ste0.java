package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ste0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ute0 c;
    public final /* synthetic */ tte0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ste0(ute0 ute0Var, tte0 tte0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ute0Var;
        this.d = tte0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        tte0 tte0Var = this.d;
        ute0 ute0Var = this.c;
        switch (b) {
            case 0:
                return new ste0(ute0Var, tte0Var, lnmVar, (byte) 0);
            default:
                return new ste0(ute0Var, tte0Var, lnmVar, (byte) 1);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tte0 tte0Var = this.d;
        ute0 ute0Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
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
                e4t e4tVar = ute0Var.d;
                ViewGroup viewGroup = tte0Var.a.l;
                this.b = true;
                e4tVar.a(viewGroup, this);
                return d9nVar;
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
                tac0 tac0Var = ((f0i) ute0Var.e).a;
                ste0 ste0Var = new ste0(ute0Var, tte0Var, lnmVar, (byte) 0);
                this.b = true;
                return z8p1.t(tac0Var, w8c0.c, ste0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
