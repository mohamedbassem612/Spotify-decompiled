package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xfv0 implements vr20 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ oei1 c;

    public xfv0(vr20 vr20Var, oei1 oei1Var) {
        this.b = vr20Var;
        this.c = oei1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        wfv0 wfv0Var;
        long j;
        vei1 vei1Var;
        sei1 rei1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oei1 oei1Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        tfv0 tfv0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof wfv0) {
                    wfv0Var = (wfv0) lnmVar;
                    int i = wfv0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wfv0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        wfv0Var = new wfv0(this, lnmVar);
                    }
                } else {
                    wfv0Var = new wfv0(this, lnmVar);
                }
                Object obj2 = wfv0Var.a;
                int i2 = wfv0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    tei1 tei1Var = (tei1) obj;
                    if (tei1Var != null) {
                        if (!tei1Var.a.equals(oei1Var)) {
                            tei1Var = null;
                        }
                        if (tei1Var != null) {
                            sei1 sei1Var = tei1Var.b;
                            if (sei1Var instanceof qei1) {
                                j = ((qei1) sei1Var).a;
                            } else if (sei1Var instanceof pei1) {
                                j = ((pei1) sei1Var).a;
                            } else if (sei1Var instanceof rei1) {
                                j = ((rei1) sei1Var).a;
                            } else {
                                eg.o();
                            }
                            tfv0Var = new tfv0(j, 3, oei1Var.a);
                        }
                    }
                    if (tfv0Var == null) {
                        return rih1Var;
                    }
                    wfv0Var.b = 1;
                    return vr20Var.emit(tfv0Var, wfv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof vei1) {
                    vei1Var = (vei1) lnmVar;
                    int i3 = vei1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vei1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vei1Var = new vei1(this, lnmVar);
                    }
                } else {
                    vei1Var = new vei1(this, lnmVar);
                }
                Object obj3 = vei1Var.a;
                int i4 = vei1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                uei1 uei1Var = (uei1) obj;
                Long l = uei1Var.c;
                if (l != null) {
                    rei1Var = new pei1(l.longValue());
                } else {
                    boolean z = uei1Var.b;
                    long j2 = uei1Var.a;
                    rei1Var = z ? new rei1(j2) : new qei1(j2);
                }
                tei1 tei1Var2 = new tei1(oei1Var, rei1Var);
                vei1Var.b = 1;
                return vr20Var.emit(tei1Var2, vei1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public xfv0(vr20 vr20Var, wei1 wei1Var, oei1 oei1Var) {
        this.b = vr20Var;
        this.c = oei1Var;
    }
}
