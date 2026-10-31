package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a110 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a110(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x014c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        y010 y010Var;
        z010 z010Var;
        p0i0 p0i0Var;
        zeo0 zeo0Var;
        long jLongValue;
        ss71 ss71Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof y010) {
                    y010Var = (y010) lnmVar;
                    int i = y010Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y010Var.b = i - Integer.MIN_VALUE;
                    } else {
                        y010Var = new y010(this, lnmVar);
                    }
                } else {
                    y010Var = new y010(this, lnmVar);
                }
                Object obj3 = y010Var.a;
                int i2 = y010Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    y010Var.b = 1;
                    return vr20Var.emit(obj2, y010Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof z010) {
                    z010Var = (z010) lnmVar;
                    int i3 = z010Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z010Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        z010Var = new z010(this, lnmVar);
                    }
                } else {
                    z010Var = new z010(this, lnmVar);
                }
                Object obj4 = z010Var.a;
                int i4 = z010Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    z010Var.b = 1;
                    return vr20Var.emit(obj2, z010Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof p0i0) {
                    p0i0Var = (p0i0) lnmVar;
                    int i5 = p0i0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        p0i0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        p0i0Var = new p0i0(this, lnmVar);
                    }
                } else {
                    p0i0Var = new p0i0(this, lnmVar);
                }
                Object obj5 = p0i0Var.a;
                int i6 = p0i0Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    i1r i1rVar = (k1r) obj;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    k1r k1rVar = i1rVar2 != null ? (k1r) i1rVar2.a : null;
                    if (k1rVar == null || (k1rVar instanceof j1r)) {
                        obj2 = null;
                    } else if (!(k1rVar instanceof h1r)) {
                        if (k1rVar instanceof i1r) {
                            obj2 = ((i1r) k1rVar).a;
                        } else {
                            eg.o();
                        }
                    }
                    if (obj2 == null) {
                        return rih1Var;
                    }
                    p0i0Var.b = 1;
                    return vr20Var.emit(obj2, p0i0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof zeo0) {
                    zeo0Var = (zeo0) lnmVar;
                    int i7 = zeo0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        zeo0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        zeo0Var = new zeo0(this, lnmVar);
                    }
                } else {
                    zeo0Var = new zeo0(this, lnmVar);
                }
                Object obj6 = zeo0Var.a;
                int i8 = zeo0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                long jLongValue2 = ((Number) obj).longValue();
                int i9 = afo0.C1;
                n5f0 n5f0Var = new n5f0(0L, jLongValue2);
                if (obj2 instanceof m231) {
                    obj2 = null;
                }
                Long l = (Long) obj2;
                if (l == null) {
                    Logger.k("Failed to calculate viewable threshold: viewable_threshold_missing", new Object[0]);
                    jLongValue = 3000;
                } else {
                    long jLongValue3 = l.longValue();
                    if (0 > jLongValue3 || jLongValue3 > n5f0Var.b) {
                        long jS = yoi1.s(l.longValue(), n5f0Var);
                        Logger.k("Failed to calculate viewable threshold: viewable_threshold_out_of_bounds", new Object[0]);
                        jLongValue = jS;
                    } else {
                        jLongValue = l.longValue();
                    }
                }
                Long l2 = new Long(jLongValue);
                zeo0Var.b = 1;
                return vr20Var.emit(l2, zeo0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof ss71) {
                    ss71Var = (ss71) lnmVar;
                    int i10 = ss71Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ss71Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        ss71Var = new ss71(this, lnmVar);
                    }
                } else {
                    ss71Var = new ss71(this, lnmVar);
                }
                Object obj7 = ss71Var.a;
                int i11 = ss71Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                i1r i1rVar3 = (k1r) obj;
                if (i1rVar3 instanceof i1r) {
                    obj2 = i1rVar3.a;
                } else if (!(i1rVar3 instanceof h1r)) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    return rih1Var;
                }
                ss71Var.b = 1;
                return vr20Var.emit(obj2, ss71Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ a110(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
        this.c = obj;
    }
}
