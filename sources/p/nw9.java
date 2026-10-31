package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nw9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ Set c;

    public nw9(vr20 vr20Var, Set set, rg31 rg31Var) {
        this.a = (byte) 23;
        this.b = vr20Var;
        this.c = set;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        ntt0 ntt0Var;
        qtt0 qtt0Var;
        if (lnmVar instanceof ntt0) {
            ntt0Var = (ntt0) lnmVar;
            int i = ntt0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ntt0Var.b = i - Integer.MIN_VALUE;
            } else {
                ntt0Var = new ntt0(this, lnmVar);
            }
        } else {
            ntt0Var = new ntt0(this, lnmVar);
        }
        Object obj2 = ntt0Var.a;
        int i2 = ntt0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Map map = (Map) obj;
            Set set = this.c;
            int iS = zno1.s(q7h.U(set, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : set) {
                utt0 utt0Var = (wtt0) map.get((String) obj3);
                if (utt0Var == null) {
                    utt0Var = utt0.a;
                }
                if (utt0Var instanceof utt0) {
                    qtt0Var = qtt0.b;
                } else {
                    if (!(utt0Var instanceof vtt0)) {
                        eg.o();
                        return null;
                    }
                    int iOrdinal = ((vtt0) utt0Var).a.ordinal();
                    if (iOrdinal == 0) {
                        qtt0Var = qtt0.d;
                    } else if (iOrdinal == 1) {
                        qtt0Var = qtt0.h;
                    } else if (iOrdinal == 2) {
                        qtt0Var = qtt0.e;
                    } else if (iOrdinal == 3) {
                        qtt0Var = qtt0.g;
                    } else if (iOrdinal == 4) {
                        qtt0Var = qtt0.h;
                    } else {
                        if (iOrdinal != 5) {
                            eg.o();
                            return null;
                        }
                        qtt0Var = qtt0.a;
                    }
                }
                linkedHashMap.put(obj3, new j3r(qtt0Var));
            }
            ntt0Var.b = 1;
            Object objEmit = this.b.emit(linkedHashMap, ntt0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(Object obj, lnm lnmVar) {
        auw0 auw0Var;
        if (lnmVar instanceof auw0) {
            auw0Var = (auw0) lnmVar;
            int i = auw0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                auw0Var.b = i - Integer.MIN_VALUE;
            } else {
                auw0Var = new auw0(this, lnmVar);
            }
        } else {
            auw0Var = new auw0(this, lnmVar);
        }
        Object obj2 = auw0Var.a;
        int i2 = auw0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Map map = (Map) obj;
            Set set = this.c;
            int iS = zno1.s(q7h.U(set, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : set) {
                String str = (String) obj3;
                String str2 = (String) map.get(str);
                linkedHashMap.put(obj3, str2 != null ? new j3r(str2) : new h3r(new b3r(str)));
            }
            auw0Var.b = 1;
            Object objEmit = this.b.emit(linkedHashMap, auw0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        f731 f731Var;
        if (lnmVar instanceof f731) {
            f731Var = (f731) lnmVar;
            int i = f731Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                f731Var.b = i - Integer.MIN_VALUE;
            } else {
                f731Var = new f731(this, lnmVar);
            }
        } else {
            f731Var = new f731(this, lnmVar);
        }
        Object obj2 = f731Var.a;
        int i2 = f731Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            j731 j731Var = new j731((Map) obj, this.c);
            f731Var.b = 1;
            Object objEmit = this.b.emit(j731Var, f731Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object f(Object obj, lnm lnmVar) {
        qg31 qg31Var;
        Object obj2;
        int i;
        mmr0 mmr0Var;
        wjf wjfVar;
        if (lnmVar instanceof qg31) {
            qg31Var = (qg31) lnmVar;
            int i2 = qg31Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qg31Var.b = i2 - Integer.MIN_VALUE;
            } else {
                qg31Var = new qg31(this, lnmVar);
            }
        } else {
            qg31Var = new qg31(this, lnmVar);
        }
        Object obj3 = qg31Var.a;
        int i3 = qg31Var.b;
        Object obj4 = null;
        if (i3 == 0) {
            hm5.M(obj3);
            ArrayList arrayList = new ArrayList();
            for (tv00 tv00Var : (List) obj) {
                String str = tv00Var.a;
                if (!this.c.contains(str)) {
                    str = null;
                }
                mmr0 mmr0Var2 = (str == null || (wjfVar = tv00Var.b) == null) ? null : new mmr0(str, wjfVar);
                if (mmr0Var2 != null) {
                    arrayList.add(mmr0Var2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mmr0 mmr0Var3 = (mmr0) it.next();
                String str2 = (String) mmr0Var3.a;
                ArrayList arrayList3 = ((wjf) mmr0Var3.b).a;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    vjf vjfVar = (vjf) it2.next();
                    if (vjfVar instanceof tjf) {
                        tjf tjfVar = (tjf) vjfVar;
                        mmr0Var = new mmr0(str2, new lg31(tjfVar.e, tjfVar.f, tjfVar.b, tjfVar.c, tjfVar.g));
                        it = it;
                        obj2 = obj4;
                    } else {
                        if (!(vjfVar instanceof ujf)) {
                            Object obj5 = obj4;
                            eg.o();
                            return obj5;
                        }
                        ujf ujfVar = (ujf) vjfVar;
                        String str3 = ujfVar.a;
                        String str4 = ujfVar.b;
                        int i4 = ujfVar.d;
                        int i5 = ujfVar.e;
                        obj2 = obj4;
                        long j = ujfVar.f;
                        int iC = l1d.C(ujfVar.h);
                        if (iC != 0) {
                            int i6 = 2;
                            if (iC != 1) {
                                if (iC != 2) {
                                    eg.o();
                                    return obj2;
                                }
                                i6 = 3;
                            }
                            i = i6;
                        } else {
                            i = 1;
                        }
                        mmr0Var = new mmr0(str2, new mg31(str3, str4, i4, i5, j, i, ujfVar.g));
                    }
                    arrayList4.add(mmr0Var);
                    it2 = it2;
                    obj4 = obj2;
                    it = it;
                }
                r7h.W(arrayList4, arrayList2);
            }
            Map mapT = sqg0.T(arrayList2);
            qg31Var.b = 1;
            Object objEmit = this.b.emit(mapT, qg31Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        ltd1 ltd1Var;
        upa1 upa1Var;
        if (lnmVar instanceof ltd1) {
            ltd1Var = (ltd1) lnmVar;
            int i = ltd1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltd1Var.b = i - Integer.MIN_VALUE;
            } else {
                ltd1Var = new ltd1(this, lnmVar);
            }
        } else {
            ltd1Var = new ltd1(this, lnmVar);
        }
        Object obj2 = ltd1Var.a;
        int i2 = ltd1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ArrayList arrayList = new ArrayList();
            for (tv00 tv00Var : (List) obj) {
                String str = tv00Var.a;
                if (!this.c.contains(str)) {
                    str = null;
                }
                mmr0 mmr0Var = (str == null || (upa1Var = tv00Var.b) == null) ? null : new mmr0(str, upa1Var);
                if (mmr0Var != null) {
                    arrayList.add(mmr0Var);
                }
            }
            Map mapT = sqg0.T(arrayList);
            ltd1Var.b = 1;
            Object objEmit = this.b.emit(mapT, ltd1Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x022c  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:185:0x0336  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:255:0x046d  */
    /* JADX WARN: Code duplicated, block: B:278:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:304:0x0532  */
    /* JADX WARN: Code duplicated, block: B:364:0x064a  */
    /* JADX WARN: Code duplicated, block: B:379:0x0687  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:424:0x074f  */
    /* JADX WARN: Code duplicated, block: B:447:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:470:0x0824  */
    /* JADX WARN: Code duplicated, block: B:496:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:535:0x095b  */
    /* JADX WARN: Code duplicated, block: B:557:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:559:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:560:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:561:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:572:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:602:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x0193  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v17 java.lang.Object, still in use, count: 2, list:
          (r8v17 java.lang.Object) from 0x09bc: PHI (r8 I:??) = (r8v12 java.lang.Object), (r8v17 java.lang.Object) binds: [B:554:0x09bb, B:695:0x09bc] A[DONT_GENERATE, DONT_INLINE]
          (r8v17 java.lang.Object) from 0x09b0: CHECK_CAST (p.lpm) (r8v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object emit(java.lang.Object r17, p.lnm r18) {
        /*
            Method dump skipped, instruction units count: 2914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nw9.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ nw9(vr20 vr20Var, Set set, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = set;
    }

    public nw9(vr20 vr20Var, ye90 ye90Var, Set set) {
        this.a = (byte) 10;
        this.b = vr20Var;
        this.c = set;
    }
}
