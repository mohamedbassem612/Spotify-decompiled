package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zf5 {
    public static final LinkedHashMap c;
    public final oi a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wf5 wf5Var : wf5.values()) {
            String str = wf5Var.a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, wf5Var);
            }
        }
        c = linkedHashMap;
    }

    public zf5(oi oiVar) {
        this.a = oiVar;
    }

    public static ArrayList a(Object obj, boolean z) {
        Map mapA = ((pf5) obj).a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            r7h.W((Iterable) ((!z || u890.j((ajn0) entry.getKey(), eia0.b)) ? j((sgl) entry.getValue()) : z6x.a), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    public static r8a0 b(zf5 zf5Var, r8a0 r8a0Var, fg5 fg5Var) {
        boolean z;
        kl21 kl21VarH;
        v7a0 v7a0Var;
        Object objD;
        Object next;
        mmr0 mmr0Var;
        int i;
        oi oiVar = zf5Var.a;
        oi oiVar2 = zf5Var.a;
        boolean z2 = oiVar.b;
        if (!z2) {
            ArrayList<v7a0> arrayList = new ArrayList();
            Iterator it = fg5Var.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                kl21 kl21Var = kl21.a;
                v7a0 v7a0Var2 = null;
                if (z2) {
                    v7a0Var = null;
                } else {
                    pf5 pf5Var = (pf5) next2;
                    v7a0 v7a0Var3 = (v7a0) w7a0.e.get(pf5Var.b());
                    if (v7a0Var3 == null) {
                        v7a0Var = null;
                    } else {
                        kf30 kf30VarB = pf5Var.b();
                        if (kf30VarB == null || !w7a0.c.containsKey(kf30VarB)) {
                            kl21VarH = zf5Var.h(next2);
                            if (kl21VarH == null) {
                                kl21VarH = ((rha0) oiVar2.c).a;
                            }
                        } else {
                            kl21VarH = (kl21) ((p5) oiVar.d).invoke(kf30VarB);
                        }
                        if (kl21VarH == kl21Var) {
                            kl21VarH = null;
                        }
                        if (kl21VarH == null) {
                            v7a0Var = null;
                        } else {
                            v7a0Var = new v7a0(bvl1.a(v7a0Var3.a, null, kl21VarH.a(), 1), v7a0Var3.b, v7a0Var3.c, v7a0Var3.d, v7a0Var3.e);
                        }
                    }
                }
                if (v7a0Var != null) {
                    v7a0Var2 = v7a0Var;
                } else {
                    if (((rha0) oiVar.c).d || (objD = d(next2, fia0.f)) == null) {
                        mmr0Var = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (zf5Var.i(next) == null);
                        if (next == null) {
                            mmr0Var = null;
                        } else {
                            ArrayList arrayListA = a(objD, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                wf5 wf5Var = (wf5) c.get((String) it3.next());
                                if (wf5Var != null) {
                                    linkedHashSet.add(wf5Var);
                                }
                            }
                            if (linkedHashSet.contains(wf5.TYPE_USE)) {
                                linkedHashSet = dm61.y0(dm61.u0(wf5.TYPE_PARAMETER_BOUNDS, f46.S0(wf5.values())), linkedHashSet);
                            }
                            mmr0Var = new mmr0(next, linkedHashSet);
                        }
                    }
                    if (mmr0Var != null) {
                        Object obj = mmr0Var.a;
                        Set set = (Set) mmr0Var.b;
                        kl21 kl21VarH2 = zf5Var.h(next2);
                        if (kl21VarH2 == null && (kl21VarH2 = zf5Var.h(obj)) == null) {
                            kl21VarH2 = ((rha0) oiVar2.c).a;
                        }
                        if (kl21VarH2 != kl21Var) {
                            bvl1 bvl1VarG = zf5Var.g(obj, false);
                            if (bvl1VarG == null) {
                                Object objI = zf5Var.i(obj);
                                if (objI != null) {
                                    kl21 kl21VarH3 = zf5Var.h(obj);
                                    if (kl21VarH3 == null) {
                                        kl21VarH3 = ((rha0) oiVar2.c).a;
                                    }
                                    if (kl21VarH3 != kl21Var) {
                                        bvl1 bvl1VarG2 = zf5Var.g(objI, false);
                                        if (bvl1VarG2 != null) {
                                            boolean zA = kl21VarH3.a();
                                            i = 1;
                                            bvl1VarG = bvl1.a(bvl1VarG2, null, zA, 1);
                                        } else {
                                            i = 1;
                                            bvl1VarG = null;
                                        }
                                    }
                                }
                                bvl1VarG = null;
                                i = 1;
                            } else {
                                i = 1;
                            }
                            if (bvl1VarG != null) {
                                v7a0Var2 = new v7a0(bvl1.a(bvl1VarG, null, kl21VarH2.a(), i), set, 28);
                            }
                        }
                    }
                }
                if (v7a0Var2 != null) {
                    arrayList.add(v7a0Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(wf5.class);
                for (v7a0 v7a0Var4 : arrayList) {
                    for (wf5 wf5Var2 : v7a0Var4.b) {
                        enumMap.containsKey(wf5Var2);
                        enumMap.put(wf5Var2, v7a0Var4);
                    }
                }
                EnumMap enumMap2 = r8a0Var != null ? new EnumMap(r8a0Var.a) : new EnumMap(wf5.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    wf5 wf5Var3 = (wf5) entry.getKey();
                    v7a0 v7a0Var5 = (v7a0) entry.getValue();
                    if (v7a0Var5 != null) {
                        enumMap2.put(wf5Var3, v7a0Var5);
                        z = true;
                    }
                }
                if (z) {
                    return new r8a0(enumMap2);
                }
            }
        }
        return r8a0Var;
    }

    public static bvl1 c(Iterable iterable, iu30 iu30Var) {
        boolean z;
        Iterator it = iterable.iterator();
        bvl1 bvl1Var = null;
        while (it.hasNext()) {
            bvl1 bvl1Var2 = (bvl1) iu30Var.invoke(it.next());
            if (bvl1Var != null) {
                boolean z2 = bvl1Var.b;
                if (bvl1Var2 != null && !bvl1Var2.equals(bvl1Var) && (!(z = bvl1Var2.b) || z2)) {
                    if (z || !z2) {
                        return null;
                    }
                }
            }
            bvl1Var = bvl1Var2;
        }
        return bvl1Var;
    }

    public static Object d(Object obj, kf30 kf30Var) {
        for (Object obj2 : e(obj)) {
            if (u890.j(((pf5) obj2).b(), kf30Var)) {
                return obj2;
            }
        }
        return null;
    }

    public static Iterable e(Object obj) {
        fg5 annotations;
        beg begVarD = kht.d((pf5) obj);
        return (begVarD == null || (annotations = begVarD.getAnnotations()) == null) ? z6x.a : annotations;
    }

    public static boolean f(Object obj, kf30 kf30Var) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (u890.j(((pf5) it.next()).b(), kf30Var)) {
                return true;
            }
        }
        return false;
    }

    public static List j(sgl sglVar) {
        if (!(sglVar instanceof e46)) {
            return sglVar instanceof b1z ? Collections.singletonList(((b1z) sglVar).c.c()) : z6x.a;
        }
        Iterable iterable = (Iterable) ((e46) sglVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            r7h.W(j((sgl) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r8.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r8.equals("UNKNOWN") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r8.equals("NEVER") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r8.equals("MAYBE") == false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.bvl1 g(java.lang.Object r8, boolean r9) {
        /*
            r7 = this;
            r0 = r8
            p.pf5 r0 = (p.pf5) r0
            p.kf30 r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            p.oi r7 = r7.a
            java.lang.Object r7 = r7.d
            p.p5 r7 = (p.p5) r7
            java.lang.Object r7 = r7.invoke(r0)
            p.kl21 r7 = (p.kl21) r7
            r7.getClass()
            p.kl21 r2 = p.kl21.a
            if (r7 != r2) goto L20
            return r1
        L20:
            java.util.Set r2 = p.fia0.k
            boolean r2 = r2.contains(r0)
            r3 = 0
            p.iep0 r4 = p.iep0.c
            if (r2 == 0) goto L2c
            goto L84
        L2c:
            java.util.Set r2 = p.fia0.l
            boolean r2 = r2.contains(r0)
            p.iep0 r5 = p.iep0.b
            if (r2 == 0) goto L38
        L36:
            r4 = r5
            goto L84
        L38:
            java.util.Set r2 = p.fia0.m
            boolean r2 = r2.contains(r0)
            p.iep0 r6 = p.iep0.a
            if (r2 == 0) goto L44
        L42:
            r4 = r6
            goto L84
        L44:
            p.kf30 r2 = p.fia0.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L93
            java.util.ArrayList r8 = a(r8, r3)
            java.lang.Object r8 = p.o7h.r0(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L84
            int r0 = r8.hashCode()
            switch(r0) {
                case 73135176: goto L7b;
                case 74175084: goto L72;
                case 433141802: goto L69;
                case 1933739535: goto L60;
                default: goto L5f;
            }
        L5f:
            goto L93
        L60:
            java.lang.String r0 = "ALWAYS"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L93
            goto L84
        L69:
            java.lang.String r0 = "UNKNOWN"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L42
            goto L93
        L72:
            java.lang.String r0 = "NEVER"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L36
            goto L93
        L7b:
            java.lang.String r0 = "MAYBE"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L36
            goto L93
        L84:
            p.bvl1 r8 = new p.bvl1
            boolean r7 = r7.a()
            if (r7 != 0) goto L8e
            if (r9 == 0) goto L8f
        L8e:
            r3 = 1
        L8f:
            r8.<init>(r4, r3)
            return r8
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zf5.g(java.lang.Object, boolean):p.bvl1");
    }

    public final kl21 h(Object obj) {
        String str;
        rha0 rha0Var = (rha0) this.a.c;
        kl21 kl21Var = (kl21) rha0Var.c.get(((pf5) obj).b());
        if (kl21Var != null) {
            return kl21Var;
        }
        Object objD = d(obj, fia0.q);
        if (objD == null || (str = (String) o7h.r0(a(objD, false))) == null) {
            return null;
        }
        kl21 kl21Var2 = rha0Var.b;
        if (kl21Var2 != null) {
            return kl21Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return kl21.a;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return kl21.c;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return kl21.b;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        if (!((rha0) this.a.c).d) {
            pf5 pf5Var = (pf5) obj;
            if (o7h.i0(fia0.j, pf5Var.b()) || f(obj, fia0.d)) {
                return obj;
            }
            if (f(obj, fia0.e)) {
                beg begVarD = kht.d(pf5Var);
                begVarD.getClass();
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(begVarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(begVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
