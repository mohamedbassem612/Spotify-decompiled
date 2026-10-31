package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gvg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ivg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvg0(ivg0 ivg0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ivg0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ivg0 ivg0Var = this.c;
        switch (b) {
            case 0:
                return new gvg0(ivg0Var, lnmVar, (byte) 0);
            case 1:
                return new gvg0(ivg0Var, lnmVar, (byte) 1);
            default:
                return new gvg0(ivg0Var, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ivg0 ivg0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return ivg0Var.c(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                pug0 pug0Var = ivg0Var.f;
                iug0 iug0Var = ivg0Var.a;
                String str = iug0Var.a;
                String str2 = iug0Var.Y;
                boolean z3 = ivg0Var.f35p.a == qk1.b;
                this.b = true;
                return pug0Var.b(z3, str2, str, null, this) == d9nVar ? d9nVar : rih1Var;
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
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                c78 c78Var = new c78(ivg0Var, ohdVar, (byte) 2);
                ivg0Var.h.a(c78Var);
                ohdVar.n(new j2d0(ivg0Var, c78Var, (byte) 27));
                Object objR = ohdVar.r();
                return objR == d9nVar ? d9nVar : objR;
        }
    }
}
