package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w010 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w010(vr20 vr20Var, iu30 iu30Var, Object obj, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = iu30Var;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        u010 u010Var;
        v010 v010Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        iu30 iu30Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof u010) {
                    u010Var = (u010) lnmVar;
                    int i = u010Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u010Var.b = i - Integer.MIN_VALUE;
                    } else {
                        u010Var = new u010(this, lnmVar);
                    }
                } else {
                    u010Var = new u010(this, lnmVar);
                }
                Object obj3 = u010Var.a;
                int i2 = u010Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!((Boolean) iu30Var.invoke(obj2)).booleanValue()) {
                    return rih1Var;
                }
                u010Var.b = 1;
                return vr20Var.emit(obj, u010Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof v010) {
                    v010Var = (v010) lnmVar;
                    int i3 = v010Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v010Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        v010Var = new v010(this, lnmVar);
                    }
                } else {
                    v010Var = new v010(this, lnmVar);
                }
                Object obj4 = v010Var.a;
                int i4 = v010Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!((Boolean) iu30Var.invoke(obj2)).booleanValue()) {
                    return rih1Var;
                }
                v010Var.b = 1;
                return vr20Var.emit(obj, v010Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
