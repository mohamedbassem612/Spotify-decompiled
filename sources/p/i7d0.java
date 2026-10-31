package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i7d0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ wj3 c;

    public /* synthetic */ i7d0(vr20 vr20Var, wj3 wj3Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = wj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        h7d0 h7d0Var;
        g3d0 g3d0VarE;
        j7d0 j7d0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wj3 wj3Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof h7d0) {
                    h7d0Var = (h7d0) lnmVar;
                    int i = h7d0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h7d0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        h7d0Var = new h7d0(this, lnmVar);
                    }
                } else {
                    h7d0Var = new h7d0(this, lnmVar);
                }
                Object obj2 = h7d0Var.a;
                int i2 = h7d0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                k1r k1rVar = (k1r) obj;
                i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                if (i1rVar == null || (g3d0VarE = (g3d0) i1rVar.a) == null) {
                    g3d0VarE = wj3Var.e();
                }
                h7d0Var.b = 1;
                return vr20Var.emit(g3d0VarE, h7d0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof j7d0) {
                    j7d0Var = (j7d0) lnmVar;
                    int i3 = j7d0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j7d0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        j7d0Var = new j7d0(this, lnmVar);
                    }
                } else {
                    j7d0Var = new j7d0(this, lnmVar);
                }
                Object obj3 = j7d0Var.a;
                int i4 = j7d0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf = Boolean.valueOf(!u890.j((g3d0) obj, wj3Var.e()));
                    j7d0Var.b = 1;
                    return vr20Var.emit(boolValueOf, j7d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
