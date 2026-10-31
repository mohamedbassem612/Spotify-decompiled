package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ia80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ja80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia80(ja80 ja80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ja80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ja80 ja80Var = this.c;
        switch (b) {
            case 0:
                return new ia80(ja80Var, lnmVar, (byte) 0);
            case 1:
                return new ia80(ja80Var, lnmVar, (byte) 1);
            case 2:
                return new ia80(ja80Var, lnmVar, (byte) 2);
            default:
                return new ia80(ja80Var, lnmVar, (byte) 3);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ja80 ja80Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95Var = ja80Var.Y0;
                    if (o95Var == null) {
                        return rih1Var;
                    }
                    j4e1 j4e1VarM = ja80Var.X0;
                    if (j4e1VarM == null) {
                        j4e1VarM = i5x0.m((dah) lcc.z(ja80Var, eah.a), (rce1) lcc.z(ja80Var, sce1.a));
                    }
                    u7h u7hVar = new u7h(j4e1VarM.c(ja80Var.Q0, ja80Var.R0, ja80Var.V0));
                    n8b1 n8b1VarM = ja80Var.Q0 ? t890.m((jnm0) lcc.z(ja80Var, ich0.a), 5) : irn1.j0();
                    this.b = true;
                    obj = o95.b(o95Var, u7hVar, n8b1VarM, (Float) null, (iu30) null, this, 12);
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
                return rih1Var;
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
                o95 o95Var2 = ja80Var.a1;
                p3v p3vVar = new p3v((ja80Var.V0 && ja80Var.Q0) ? ja80Var.T0 : ja80Var.U0);
                n8b1 n8b1VarM2 = ja80Var.Q0 ? t890.m((jnm0) lcc.z(ja80Var, ich0.a), 2) : irn1.j0();
                this.b = true;
                return o95.b(o95Var2, p3vVar, n8b1VarM2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return ja80Var.L1(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    return ja80Var.L1(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
