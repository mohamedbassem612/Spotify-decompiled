package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u62 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ w62 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u62(w62 w62Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = w62Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        w62 w62Var = this.c;
        switch (b) {
            case 0:
                u62 u62Var = new u62(w62Var, lnmVar, (byte) 0);
                u62Var.b = ((Boolean) obj).booleanValue();
                return u62Var;
            default:
                return new u62(w62Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((u62) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((u62) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        xab1 xab1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w62 w62Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                if (z && ((xab1Var = (xab1) w62Var.i) == null || !xab1Var.isActive())) {
                    w62Var.i = fn31.T((llm) w62Var.k, (o8n) null, 0, new mx(w62Var, (lnm) null, (byte) 2), 3);
                } else if (!z) {
                    xab1 xab1Var2 = (xab1) w62Var.i;
                    if (xab1Var2 != null) {
                        xab1Var2.d((CancellationException) null);
                    }
                    w62Var.i = null;
                }
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
                any anyVar = new any(qqn1.f((en70) w62Var.g), (byte) 18);
                k2 k2Var = new k2(w62Var, (lnm) null, (byte) 12);
                this.b = true;
                Object objQ = l4p1.q(anyVar, k2Var, this);
                d9n d9nVar = d9n.a;
                return objQ == d9nVar ? d9nVar : rih1Var;
        }
    }
}
