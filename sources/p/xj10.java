package p;

import com.spotify.culturalmoments.faneventredemption.FanEventRedemptionFailureException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xj10 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj10(iu30 iu30Var, aj71 aj71Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 3;
        this.d = iu30Var;
        this.e = aj71Var;
        this.g = ven0Var;
        this.h = ven0Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                xj10 xj10Var = new xj10(this.f, obj6, obj5, (lnm) obj4, (byte) 0);
                xj10Var.d = (lk10) obj;
                xj10Var.e = (vj10) obj2;
                return xj10Var.invokeSuspend(rih1Var);
            case 1:
                xj10 xj10Var2 = new xj10(this.f, obj6, obj5, (lnm) obj4, (byte) 1);
                xj10Var2.c = (wuj0) obj;
                xj10Var2.d = (ibk0) obj2;
                xj10Var2.e = (g3d0) obj3;
                return xj10Var2.invokeSuspend(rih1Var);
            case 2:
                xj10 xj10Var3 = new xj10((iu30) this.e, (ki71) obj6, (ven0) obj5, (lnm) obj4);
                xj10Var3.c = (ii71) obj;
                xj10Var3.d = (di71) obj2;
                return xj10Var3.invokeSuspend(rih1Var);
            default:
                xj10 xj10Var4 = new xj10((iu30) this.d, (aj71) this.e, (ven0) obj6, (ven0) obj5, (lnm) obj4);
                xj10Var4.c = (pi71) obj2;
                return xj10Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x029c  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:112:0x02af  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fd  */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        lk10 lk10VarA;
        Throwable thA;
        FanEventRedemptionFailureException fanEventRedemptionFailureException;
        gk10 gk10Var;
        gk10 gk10Var2;
        kk10 kk10Var;
        int iOrdinal;
        Object objA2;
        Object objA3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        d9n d9nVar = d9n.a;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                pt ptVar = (pt) obj2;
                oj10 oj10Var = (oj10) ptVar.d;
                wj10 wj10Var = (wj10) obj3;
                iu30 iu30Var = (iu30) this.f;
                lk10 lk10VarA2 = (lk10) this.d;
                pj10 pj10Var = (vj10) this.e;
                boolean z = this.b;
                int i = 1;
                if (!z) {
                    hm5.M(obj);
                    if (pj10Var instanceof pj10) {
                        String str = pj10Var.a;
                        if (lk10VarA2.b == 1) {
                            StringBuilder sb = new StringBuilder();
                            int length = str.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                char cCharAt = str.charAt(i2);
                                if ('0' <= cCharAt && cCharAt < ':') {
                                    sb.append(cCharAt);
                                }
                            }
                            lk10VarA2 = lk10.a(lk10VarA2, ihc1.c1(4, sb.toString()), 0, (fk10) null, (gk10) null, (Long) null, 50);
                        }
                        iu30Var.invoke(lk10VarA2);
                        return rih1Var;
                    }
                    if (u890.j(pj10Var, qj10.a)) {
                        return rih1Var;
                    }
                    if (u890.j(pj10Var, tj10.a)) {
                        lk10 lk10VarA3 = !lk10VarA2.b() ? null : lk10.a(lk10VarA2, (String) null, 2, (fk10) null, (gk10) null, (Long) null, 49);
                        if (lk10VarA3 == null) {
                            return rih1Var;
                        }
                        iu30Var.invoke(lk10VarA3);
                        if (wj10Var.b) {
                            oj10Var = (oj10) ((Optional) ptVar.e).orElse(oj10Var);
                        }
                        String str2 = wj10Var.a;
                        String str3 = lk10VarA3.a;
                        this.d = null;
                        this.e = null;
                        this.c = lk10VarA3;
                        this.b = true;
                        objA = oj10Var.a(str2, str3, this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                        lk10VarA = lk10VarA3;
                        thA = e331.a(objA);
                        if (thA == null) {
                            kk10Var = (kk10) objA;
                            if (lk10VarA.b == 2) {
                                iOrdinal = kk10Var.ordinal();
                                if (iOrdinal != 0) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, 3, (fk10) null, (gk10) null, (Long) null, 61);
                                } else if (iOrdinal != 1) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, i, fk10.a, (gk10) null, (Long) null, 49);
                                } else if (iOrdinal == 2) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, 4, (fk10) null, (gk10) null, (Long) null, 61);
                                } else {
                                    eg.o();
                                }
                            }
                        } else {
                            if (thA instanceof FanEventRedemptionFailureException) {
                            }
                            if (fanEventRedemptionFailureException != null) {
                                gk10Var = fanEventRedemptionFailureException.a;
                            } else {
                                gk10Var = gk10.e;
                            }
                            gk10Var2 = gk10Var;
                            if (lk10VarA.b == 2) {
                                lk10VarA = lk10.a(lk10VarA, (String) null, i, fk10.b, gk10Var2, (Long) null, 49);
                            }
                        }
                        iu30Var.invoke(lk10VarA);
                        return rih1Var;
                    }
                    if (u890.j(pj10Var, rj10.a)) {
                        ((lzn0) ptVar.g).e();
                        return rih1Var;
                    }
                    if (u890.j(pj10Var, sj10.a) || (pj10Var instanceof uj10)) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z) {
                        lk10 lk10Var = (lk10) this.c;
                        hm5.M(obj);
                        lk10VarA = lk10Var;
                        objA = ((e331) obj).a;
                        i = 1;
                        thA = e331.a(objA);
                        if (thA == null) {
                            kk10Var = (kk10) objA;
                            if (lk10VarA.b == 2) {
                                iOrdinal = kk10Var.ordinal();
                                if (iOrdinal != 0) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, 3, (fk10) null, (gk10) null, (Long) null, 61);
                                } else if (iOrdinal != 1) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, i, fk10.a, (gk10) null, (Long) null, 49);
                                } else if (iOrdinal == 2) {
                                    lk10VarA = lk10.a(lk10VarA, (String) null, 4, (fk10) null, (gk10) null, (Long) null, 61);
                                } else {
                                    eg.o();
                                }
                            }
                        } else {
                            fanEventRedemptionFailureException = thA instanceof FanEventRedemptionFailureException ? (FanEventRedemptionFailureException) thA : null;
                            if (fanEventRedemptionFailureException != null) {
                                gk10Var = fanEventRedemptionFailureException.a;
                            } else {
                                gk10Var = gk10.e;
                            }
                            gk10Var2 = gk10Var;
                            if (lk10VarA.b == 2) {
                                lk10VarA = lk10.a(lk10VarA, (String) null, i, fk10.b, gk10Var2, (Long) null, 49);
                            }
                        }
                        iu30Var.invoke(lk10VarA);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                wuj0 wuj0Var = (wuj0) this.c;
                ibk0 ibk0Var = (ibk0) this.d;
                g3d0 g3d0Var = (g3d0) this.e;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ro8 ro8Var = new ro8(wuj0Var, (lnm) null, (byte) 16);
                ro8 ro8Var2 = new ro8(g3d0Var, (lnm) null, (byte) 17);
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                Object objG = ((ouj0) this.f).g((qxc0) obj3, (String) obj2, ro8Var, ibk0Var, ro8Var2, this);
                return objG == d9nVar ? d9nVar : objG;
            case 2:
                ven0 ven0Var = (ven0) obj2;
                iu30 iu30Var2 = (iu30) this.e;
                ii71 ii71Var = (ii71) this.c;
                ci71 ci71Var = (di71) this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iu30Var2 = (iu30) this.f;
                    hm5.M(obj);
                    objA2 = obj;
                    iu30Var2.invoke(objA2);
                    return rih1Var;
                }
                hm5.M(obj);
                if (u890.j(ci71Var, bi71.a)) {
                    iu30Var2.invoke(hi71.a);
                    if (((ei71) ven0Var.getValue()).a instanceof fl71) {
                        ki71 ki71Var = (ki71) obj3;
                        ei71 ei71Var = (ei71) ven0Var.getValue();
                        fl71 fl71Var = (fl71) ((ei71) ven0Var.getValue()).a;
                        this.c = null;
                        this.d = null;
                        this.f = iu30Var2;
                        this.b = true;
                        objA2 = ki71Var.h.a("sharing.off_platform_destinations_loading", null, new p651(ki71Var, ei71Var, fl71Var, (lnm) null, (byte) 12), this);
                        if (objA2 == d9nVar) {
                            return d9nVar;
                        }
                        iu30Var2.invoke(objA2);
                        return rih1Var;
                    }
                    hhg1.n("ShareSheetResult must be loaded to load destinations");
                } else {
                    if (u890.j(ci71Var, ai71.a)) {
                        return rih1Var;
                    }
                    if (ci71Var instanceof ci71) {
                        if (!(ii71Var instanceof gi71)) {
                            return rih1Var;
                        }
                        gi71 gi71Var = (gi71) ii71Var;
                        List<p571> list = gi71Var.b;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        for (p571 p571Var : list) {
                            o571 o571Var = p571Var.a;
                            if (o571Var == ci71Var.a) {
                                p571Var = new p571(o571Var, false);
                            }
                            arrayList.add(p571Var);
                        }
                        iu30Var2.invoke(gi71.a(gi71Var, null, arrayList, null, 253));
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            default:
                aj71 aj71Var = (aj71) this.e;
                iu30 iu30Var3 = (iu30) this.d;
                ven0 ven0Var2 = (ven0) obj3;
                pi71 pi71Var = (pi71) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iu30Var3 = (iu30) this.f;
                    hm5.M(obj);
                    objA3 = obj;
                    iu30Var3.invoke(objA3);
                    return rih1Var;
                }
                hm5.M(obj);
                if (u890.j(pi71Var, oi71.a)) {
                    iu30Var3.invoke(vi71.a);
                    if (((ri71) ven0Var2.getValue()).d instanceof fl71) {
                        fl71 fl71Var2 = (fl71) ((ri71) ven0Var2.getValue()).d;
                        ri71 ri71Var = (ri71) ven0Var2.getValue();
                        j7d j7dVar = (j7d) ((ven0) obj2).getValue();
                        j7dVar.getClass();
                        ti71 ti71VarJ = aj71.j(j7dVar);
                        this.c = null;
                        this.f = iu30Var3;
                        this.b = true;
                        objA3 = aj71Var.Z.a("sharing.on_platform_destinations_loading", null, new sew0(aj71Var, ri71Var, fl71Var2, ti71VarJ, (lnm) null, (byte) 27), this);
                        if (objA3 == d9nVar) {
                            return d9nVar;
                        }
                        iu30Var3.invoke(objA3);
                        return rih1Var;
                    }
                    hhg1.n("ShareSheetResult must be loaded to load destinations");
                } else {
                    if (u890.j(pi71Var, ni71.a)) {
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj10(iu30 iu30Var, ki71 ki71Var, ven0 ven0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 2;
        this.e = iu30Var;
        this.g = ki71Var;
        this.h = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj10(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
