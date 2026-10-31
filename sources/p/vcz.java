package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vcz implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ rcz c;

    public /* synthetic */ vcz(vr20 vr20Var, rcz rczVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = rczVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        ucz uczVar;
        xcz xczVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rcz rczVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ucz) {
                    uczVar = (ucz) lnmVar;
                    int i = uczVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        uczVar.b = i - Integer.MIN_VALUE;
                    } else {
                        uczVar = new ucz(this, lnmVar);
                    }
                } else {
                    uczVar = new ucz(this, lnmVar);
                }
                Object obj2 = uczVar.a;
                int i2 = uczVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Object obj3 = ((whx0) obj).a.get(rczVar.a);
                    uczVar.b = 1;
                    return vr20Var.emit(obj3, uczVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xcz) {
                    xczVar = (xcz) lnmVar;
                    int i3 = xczVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xczVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        xczVar = new xcz(this, lnmVar);
                    }
                } else {
                    xczVar = new xcz(this, lnmVar);
                }
                Object obj4 = xczVar.a;
                int i4 = xczVar.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((ijo) obj).a.contains(rczVar.b));
                    xczVar.b = 1;
                    return vr20Var.emit(boolValueOf, xczVar) == d9nVar ? d9nVar : rih1Var;
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
