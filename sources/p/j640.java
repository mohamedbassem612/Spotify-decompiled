package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j640 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ u740 c;

    public /* synthetic */ j640(vr20 vr20Var, u740 u740Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = u740Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        i640 i640Var;
        l640 l640Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u740 u740Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        boolean z = false;
        switch (b) {
            case 0:
                if (lnmVar instanceof i640) {
                    i640Var = (i640) lnmVar;
                    int i = i640Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i640Var.b = i - Integer.MIN_VALUE;
                    } else {
                        i640Var = new i640(this, lnmVar);
                    }
                } else {
                    i640Var = new i640(this, lnmVar);
                }
                Object obj2 = i640Var.a;
                int i2 = i640Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                g640 g640Var = i1rVar2 != null ? (g640) i1rVar2.a : null;
                String str = g640Var != null ? g640Var.b : null;
                if (g640Var != null && g640Var.a) {
                    z = true;
                }
                q640 q640Var = new q640(u740Var, str, z);
                i640Var.b = 1;
                return vr20Var.emit(q640Var, i640Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof l640) {
                    l640Var = (l640) lnmVar;
                    int i3 = l640Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        l640Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        l640Var = new l640(this, lnmVar);
                    }
                } else {
                    l640Var = new l640(this, lnmVar);
                }
                Object obj3 = l640Var.a;
                int i4 = l640Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                g640 g640Var2 = i1rVar4 != null ? (g640) i1rVar4.a : null;
                if (g640Var2 != null && g640Var2.a) {
                    z = true;
                }
                q640 q640Var2 = new q640(u740Var, (String) null, z);
                l640Var.b = 1;
                return vr20Var.emit(q640Var2, l640Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
