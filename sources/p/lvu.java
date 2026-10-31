package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lvu implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ gvu c;

    public /* synthetic */ lvu(vr20 vr20Var, gvu gvuVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = gvuVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        kvu kvuVar;
        nvu nvuVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gvu gvuVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof kvu) {
                    kvuVar = (kvu) lnmVar;
                    int i = kvuVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kvuVar.b = i - Integer.MIN_VALUE;
                    } else {
                        kvuVar = new kvu(this, lnmVar);
                    }
                } else {
                    kvuVar = new kvu(this, lnmVar);
                }
                Object obj2 = kvuVar.a;
                int i2 = kvuVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Object obj3 = ((k2v) obj).a.get(gvuVar.a);
                    kvuVar.b = 1;
                    return vr20Var.emit(obj3, kvuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof nvu) {
                    nvuVar = (nvu) lnmVar;
                    int i3 = nvuVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nvuVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        nvuVar = new nvu(this, lnmVar);
                    }
                } else {
                    nvuVar = new nvu(this, lnmVar);
                }
                Object obj4 = nvuVar.a;
                int i4 = nvuVar.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    Object obj5 = ((rlq0) obj).a.get(gvuVar.a);
                    nvuVar.b = 1;
                    return vr20Var.emit(obj5, nvuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
