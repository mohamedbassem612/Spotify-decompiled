package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nzs implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ stk1 c;

    public /* synthetic */ nzs(vr20 vr20Var, stk1 stk1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = stk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        mzs mzsVar;
        ozs ozsVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        stk1 stk1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof mzs) {
                    mzsVar = (mzs) lnmVar;
                    int i = mzsVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mzsVar.b = i - Integer.MIN_VALUE;
                    } else {
                        mzsVar = new mzs(this, lnmVar);
                    }
                } else {
                    mzsVar = new mzs(this, lnmVar);
                }
                Object obj2 = mzsVar.a;
                int i2 = mzsVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    ttk1 ttk1Var = new ttk1((float) (((Number) obj).doubleValue() * 100.0d), stk1Var.b, stk1Var.d, stk1Var.f, false, false, 48);
                    mzsVar.b = 1;
                    return vr20Var.emit(ttk1Var, mzsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ozs) {
                    ozsVar = (ozs) lnmVar;
                    int i3 = ozsVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ozsVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ozsVar = new ozs(this, lnmVar);
                    }
                } else {
                    ozsVar = new ozs(this, lnmVar);
                }
                Object obj3 = ozsVar.a;
                int i4 = ozsVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    ttk1 ttk1Var2 = new ttk1(((Number) obj).floatValue(), stk1Var.b, stk1Var.d, stk1Var.f, false, false, 48);
                    ozsVar.b = 1;
                    return vr20Var.emit(ttk1Var2, ozsVar) == d9nVar ? d9nVar : rih1Var;
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
