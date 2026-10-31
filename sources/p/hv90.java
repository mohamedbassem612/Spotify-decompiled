package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hv90 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ p811 c;

    public /* synthetic */ hv90(vr20 vr20Var, p811 p811Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = p811Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        zcd0 zcd0Var;
        tpy0 tpy0Var;
        oda1 oda1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                pv90 pv90Var = (pv90) obj;
                ov90 ov90Var = (ov90) p811Var.a;
                if (ov90Var != null) {
                    ov90Var.a();
                }
                ov90 ov90Var2 = pv90Var != null ? new ov90(pv90Var, lnmVar.getContext().A(fkj0.W0)) : null;
                p811Var.a = ov90Var2;
                Object objEmit = vr20Var.emit(ov90Var2 != null ? new rv90(ov90Var2) : qv90.a, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 1:
                if (lnmVar instanceof zcd0) {
                    zcd0Var = (zcd0) lnmVar;
                    int i = zcd0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zcd0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        zcd0Var = new zcd0(this, lnmVar);
                    }
                } else {
                    zcd0Var = new zcd0(this, lnmVar);
                }
                Object obj2 = zcd0Var.a;
                int i2 = zcd0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Object obj3 = p811Var.a;
                    if (obj3 != null) {
                        zcd0Var.b = 1;
                        if (vr20Var.emit(obj3, zcd0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1Var;
            case 2:
                mmr0 mmr0Var = new mmr0(p811Var.a, obj);
                p811Var.a = obj;
                Object objEmit2 = vr20Var.emit(mmr0Var, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 3:
                if (lnmVar instanceof tpy0) {
                    tpy0Var = (tpy0) lnmVar;
                    int i3 = tpy0Var.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tpy0Var.d = i3 - Integer.MIN_VALUE;
                    } else {
                        tpy0Var = new tpy0(this, lnmVar);
                    }
                } else {
                    tpy0Var = new tpy0(this, lnmVar);
                }
                Object obj4 = tpy0Var.b;
                int i4 = tpy0Var.d;
                if (i4 == 0) {
                    hm5.M(obj4);
                    mmr0 mmr0Var2 = new mmr0(p811Var.a, obj);
                    tpy0Var.a = obj;
                    tpy0Var.d = 1;
                    if (vr20Var.emit(mmr0Var2, tpy0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = tpy0Var.a;
                    hm5.M(obj4);
                }
                p811Var.a = obj;
                return rih1Var;
            case 4:
                k1r k1rVar = (k1r) obj;
                if (k1rVar instanceof i1r) {
                    p811Var.a = k1rVar;
                }
                k1r k1rVar2 = (i1r) p811Var.a;
                if (k1rVar2 != null) {
                    k1rVar = k1rVar2;
                }
                Object objEmit3 = vr20Var.emit(k1rVar, lnmVar);
                return objEmit3 == d9nVar ? objEmit3 : rih1Var;
            default:
                if (lnmVar instanceof oda1) {
                    oda1Var = (oda1) lnmVar;
                    int i5 = oda1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        oda1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        oda1Var = new oda1(this, lnmVar);
                    }
                } else {
                    oda1Var = new oda1(this, lnmVar);
                }
                Object obj5 = oda1Var.a;
                int i6 = oda1Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    if (!u890.j((me81) obj, p811Var.a)) {
                        oda1Var.b = 1;
                        if (vr20Var.emit(obj, oda1Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ hv90(p811 p811Var, vr20 vr20Var, byte b) {
        this.a = b;
        this.c = p811Var;
        this.b = vr20Var;
    }
}
