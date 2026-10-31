package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dut extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fut e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dut(lnm lnmVar, fut futVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = futVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fut futVar = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                dut dutVar = new dut(lnmVar, futVar, (byte) 0);
                dutVar.c = vr20Var;
                dutVar.d = obj2;
                return dutVar.invokeSuspend(rih1Var);
            default:
                dut dutVar2 = new dut(lnmVar, futVar, (byte) 1);
                dutVar2.c = vr20Var;
                dutVar2.d = obj2;
                return dutVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fut futVar = this.e;
        d9n d9nVar = d9n.a;
        w7x w7xVar = w7x.a;
        byte b2 = 1;
        lnm lnmVar = null;
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
                jge jgeVarE = ((Boolean) obj2).booleanValue() ? hu20.e(rqt0.u(yoi1.g(futVar.a)), new dut(lnmVar, futVar, b2)) : new huz(w7xVar, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, jgeVarE, this) == d9nVar ? d9nVar : rih1Var;
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
                if (!((Boolean) obj3).booleanValue() || (huzVar = futVar.i) == null) {
                    huzVar = new huz(w7xVar, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
