package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gbh implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ vr20 c;

    public /* synthetic */ gbh(l811 l811Var, vr20 vr20Var, byte b) {
        this.a = b;
        this.b = l811Var;
        this.c = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object emit(Object obj, lnm lnmVar) {
        Object objEmit;
        it20 it20Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.c;
        l811 l811Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                boolean z = l811Var.a || num != null;
                l811Var.a = z;
                Object objEmit2 = vr20Var.emit(new cc10(num, z), lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 1:
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                boolean z2 = k1rVar instanceof i1r;
                if (z2) {
                    l811Var.a = true;
                }
                return ((z2 || !l811Var.a) && (objEmit = vr20Var.emit(k1rVar, lnmVar)) == d9nVar) ? objEmit : rih1Var;
            default:
                if (lnmVar instanceof it20) {
                    it20Var = (it20) lnmVar;
                    int i = it20Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        it20Var.c = i - Integer.MIN_VALUE;
                    } else {
                        it20Var = new it20(this, lnmVar);
                    }
                } else {
                    it20Var = new it20(this, lnmVar);
                }
                Object obj2 = it20Var.a;
                int i2 = it20Var.c;
                if (i2 == 0) {
                    hm5.M(obj2);
                    l811Var.a = false;
                    it20Var.c = 1;
                    return vr20Var.emit(obj, it20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
