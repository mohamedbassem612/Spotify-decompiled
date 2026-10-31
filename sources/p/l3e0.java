package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l3e0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ m3e0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3e0(lnm lnmVar, m3e0 m3e0Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = m3e0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m3e0 m3e0Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                l3e0 l3e0Var = new l3e0(lnmVar, m3e0Var, (byte) 0);
                l3e0Var.c = vr20Var;
                l3e0Var.d = obj2;
                return l3e0Var.invokeSuspend(rih1Var);
            default:
                l3e0 l3e0Var2 = new l3e0(lnmVar, m3e0Var, (byte) 1);
                l3e0Var2.c = vr20Var;
                l3e0Var2.d = obj2;
                return l3e0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
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
                p811 p811Var = new p811();
                m3e0 m3e0Var = this.e;
                jge jgeVarE = hu20.e(m3e0Var.f, new m53(p811Var, m3e0Var, (j3e0) obj2, (lnm) null, (byte) 6));
                hak hakVar = new hak(p811Var, (lnm) null, (byte) 3);
                vv70 vv70Var = new vv70(3, (lnm) null, (byte) 16);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                p811 p811Var2 = new p811();
                p811Var2.a = wqn1.a;
                Object objCollect = jgeVarE.collect(new eu20(new wem(p811Var2, vv70Var, vr20Var, (byte) 21), hakVar, (byte) 1), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
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
                fx30 huzVar = ((Boolean) obj3).booleanValue() ? this.e.g : new huz(e3e0.a, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
