package p;

import android.util.Base64;
import com.spotify.featuregate.v1.FeatureAccessResponse;
import com.spotify.featuregate.v1.FeatureAccessResult;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class en10 {
    public final jm10 a;
    public final ov20 b;
    public final h2i1 c;
    public final luk d;
    public final v6a e;
    public final c9n f;
    public final kly0 g;
    public final boolean h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final p940 k;

    public en10(jm10 jm10Var, ov20 ov20Var, h2i1 h2i1Var, luk lukVar, v6a v6aVar, c9n c9nVar, kly0 kly0Var, boolean z, boolean z2, t2j0 t2j0Var) {
        this.a = jm10Var;
        this.b = ov20Var;
        this.c = h2i1Var;
        this.d = lukVar;
        this.e = v6aVar;
        this.f = c9nVar;
        this.g = kly0Var;
        this.h = z2;
        this.k = new p940(z, t2j0Var, ((lm10) jm10Var).a, new gi00(this, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    public final LinkedHashMap a(List list, Map map, rmd rmdVar) {
        Object tl10Var;
        Object tl10Var2;
        Iterator it;
        km10 km10Var;
        boolean z;
        km10 km10Var2;
        td tdVar;
        km10 km10Var3;
        km10 km10Var4;
        boolean zJ;
        lm10 lm10Var = this.a;
        lm10 lm10Var2 = lm10Var;
        lm10Var2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = lm10Var2.c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            rd rdVar = rd.a;
            if (!zHasNext) {
                lm10Var2.getClass();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (Map.Entry entry : lm10Var2.c.entrySet()) {
                    bm10 bm10Var = (bm10) entry.getKey();
                    omd omdVar = ((n60) entry.getValue()).e;
                    if (omdVar != null) {
                        Boolean bool = (Boolean) rmdVar.a.get(omdVar);
                        if (bool != null ? bool.booleanValue() : false) {
                            linkedHashSet3.add(bm10Var);
                        }
                    }
                }
                lm10Var2.getClass();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                for (Map.Entry entry2 : lm10Var2.c.entrySet()) {
                    bm10 bm10Var2 = (bm10) entry2.getKey();
                    omd omdVar2 = ((n60) entry2.getValue()).e;
                    if (omdVar2 != null && rmdVar.b.contains(omdVar2)) {
                        linkedHashSet4.add(bm10Var2);
                    }
                }
                f50 f50VarA = lm10Var.a(this.d);
                List list2 = list;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (Object obj : list2) {
                    bm10 bm10Var3 = (bm10) obj;
                    String strA = bm10Var3.a();
                    if (f50VarA.b.contains(bm10Var3)) {
                        tl10Var2 = new tl10(strA, rdVar);
                    } else {
                        if (linkedHashSet2.contains(bm10Var3) || !linkedHashSet.contains(bm10Var3)) {
                            td tdVar2 = (td) linkedHashMap.get(bm10Var3);
                            if (tdVar2 == null) {
                                tdVar2 = rdVar;
                            }
                            tl10Var = new tl10(strA, tdVar2);
                        } else if (linkedHashSet3.contains(bm10Var3)) {
                            tl10Var2 = new tl10(strA, kd.a);
                        } else {
                            tl10Var = new ul10(strA, linkedHashSet4.contains(bm10Var3));
                        }
                        tl10Var2 = tl10Var;
                    }
                    linkedHashMap2.put(obj, tl10Var2);
                }
                return linkedHashMap2;
            }
            Map.Entry entry3 = (Map.Entry) it2.next();
            bm10 bm10Var4 = (bm10) entry3.getKey();
            n60 n60Var = (n60) entry3.getValue();
            String str = n60Var.a;
            boolean z2 = n60Var.d;
            jd jdVar = jd.a;
            if (str == null) {
                it = it2;
                km10Var = null;
            } else {
                String str2 = (String) map.get(str);
                if (str2 == null) {
                    if (z2) {
                        km10Var = new km10(true, null);
                        it = it2;
                    } else {
                        km10Var2 = new km10(false, rdVar);
                        it = it2;
                        km10Var = km10Var2;
                    }
                } else if (n60Var.b) {
                    String str3 = n60Var.c;
                    if (str2.length() == 0) {
                        it = it2;
                    } else {
                        it = it2;
                        try {
                            try {
                                FeatureAccessResult featureAccessResult = (FeatureAccessResult) FeatureAccessResponse.o(Base64.decode(str2, 0)).n().get(str3);
                                if (featureAccessResult == null) {
                                    if (z2) {
                                        km10Var3 = new km10(true, null);
                                    }
                                    z = false;
                                    if (km10Var2 == null) {
                                        km10Var2 = new km10(z, rdVar);
                                    }
                                    km10Var = km10Var2;
                                } else {
                                    if (featureAccessResult.q()) {
                                        km10Var3 = new km10(true, null);
                                    } else if (featureAccessResult.p()) {
                                        xl10 xl10Var = (xl10) o7h.s0(featureAccessResult.o().o());
                                        if (xl10Var != null) {
                                            switch (xl10Var.ordinal()) {
                                                case 1:
                                                    tdVar = ld.a;
                                                    break;
                                                case 2:
                                                    tdVar = rdVar;
                                                    break;
                                                case 3:
                                                    tdVar = nd.a;
                                                    break;
                                                case 4:
                                                    tdVar = id.a;
                                                    break;
                                                case 5:
                                                    tdVar = pd.a;
                                                    break;
                                                case 6:
                                                    tdVar = qd.a;
                                                    break;
                                                case 7:
                                                    tdVar = jdVar;
                                                    break;
                                                case 8:
                                                    tdVar = od.a;
                                                    break;
                                                case 9:
                                                default:
                                                    tdVar = null;
                                                    break;
                                                case 10:
                                                    tdVar = sd.a;
                                                    break;
                                            }
                                        } else {
                                            tdVar = null;
                                        }
                                        z = false;
                                        km10Var2 = new km10(false, tdVar);
                                    } else {
                                        z = false;
                                        km10Var2 = null;
                                    }
                                    if (km10Var2 == null) {
                                        km10Var2 = new km10(z, rdVar);
                                    }
                                    km10Var = km10Var2;
                                }
                                km10Var2 = km10Var3;
                                z = false;
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            z = false;
                        }
                        if (km10Var2 == null) {
                            km10Var2 = new km10(z, rdVar);
                        }
                        km10Var = km10Var2;
                    }
                    km10Var2 = null;
                    z = false;
                    if (km10Var2 == null) {
                        km10Var2 = new km10(z, rdVar);
                    }
                    km10Var = km10Var2;
                } else {
                    it = it2;
                    km10Var = str2.equals(null) ? new km10(true, null) : new km10(false, rdVar);
                }
            }
            m60 m60Var = n60Var.f;
            if (km10Var == null || km10Var.a || u890.j(km10Var.b, jdVar)) {
                if (m60Var != null) {
                    String str4 = (String) map.get(m60Var.a);
                    zzo1 zzo1Var = m60Var.b;
                    if (zzo1Var instanceof k60) {
                        zJ = !u890.j(str4, "1");
                    } else {
                        if (!(zzo1Var instanceof l60)) {
                            eg.o();
                            return null;
                        }
                        zJ = u890.j(str4, "0");
                    }
                    km10Var4 = zJ ? new km10(false, jdVar) : new km10(true, null);
                } else if (km10Var == null) {
                    km10Var4 = new km10(true, null);
                }
                km10Var = km10Var4;
            }
            if (km10Var.a) {
                linkedHashSet.add(bm10Var4);
            } else {
                linkedHashSet2.add(bm10Var4);
                td tdVar3 = km10Var.b;
                if (tdVar3 != null) {
                    linkedHashMap.put(bm10Var4, tdVar3);
                }
            }
            it2 = it;
        }
    }

    public final u601 b(List list) {
        return (u601) this.i.computeIfAbsent(o7h.p1(list), new cn10(this, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(Map map, onm onmVar) {
        dn10 dn10Var;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int i;
        LinkedHashMap linkedHashMap3;
        md mdVar;
        c2i1 c2i1Var;
        mmo1 d1i1Var;
        if (onmVar instanceof dn10) {
            dn10Var = (dn10) onmVar;
            int i2 = dn10Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dn10Var.e = i2 - Integer.MIN_VALUE;
            } else {
                dn10Var = new dn10(this, onmVar);
            }
        } else {
            dn10Var = new dn10(this, onmVar);
        }
        Object obj = dn10Var.c;
        int i3 = dn10Var.e;
        Map map2 = null;
        if (i3 == 0) {
            hm5.M(obj);
            linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                bm10 bm10Var = (bm10) entry.getKey();
                md mdVar2 = (md) entry.getValue();
                String str = this.a.a;
                String strA = bm10Var.a();
                if (mdVar2 instanceof ld) {
                    i = 2;
                } else {
                    if (!(mdVar2 instanceof kd)) {
                        n9v.f(mdVar2, " should not reach upsell fetch");
                        return null;
                    }
                    i = 1;
                }
                linkedHashMap.put(key, new z740(i, str, strA));
            }
            h2i1 h2i1Var = this.c;
            if (h2i1Var != null) {
                List listL1 = o7h.l1(linkedHashMap.values());
                dn10Var.a = map;
                dn10Var.b = linkedHashMap;
                dn10Var.e = 1;
                d9n d9nVarA = h2i1Var.a(listL1, dn10Var);
                d9n d9nVar = d9n.a;
                if (d9nVarA == d9nVar) {
                    return d9nVar;
                }
                obj = d9nVarA;
                linkedHashMap2 = linkedHashMap;
            }
            if (map2 == null) {
                map2 = b7x.a;
            }
            linkedHashMap3 = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                bm10 bm10Var2 = (bm10) entry2.getKey();
                mdVar = (md) entry2.getValue();
                c2i1Var = (d2i1) map2.get(linkedHashMap.get(bm10Var2));
                String strA2 = bm10Var2.a();
                if (c2i1Var instanceof c2i1) {
                    d1i1Var = e1i1.c;
                } else if (c2i1Var.a) {
                    d1i1Var = new d1i1(mdVar);
                } else {
                    d1i1Var = e1i1.d;
                }
                linkedHashMap3.put(key2, new yl10(strA2, mdVar, new f1i1(d1i1Var)));
            }
            return linkedHashMap3;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        linkedHashMap2 = dn10Var.b;
        map = dn10Var.a;
        hm5.M(obj);
        map2 = (Map) obj;
        linkedHashMap = linkedHashMap2;
        if (map2 == null) {
            map2 = b7x.a;
        }
        linkedHashMap3 = new LinkedHashMap(zno1.s(map.size()));
        while (r12.hasNext()) {
            Object key3 = entry2.getKey();
            bm10 bm10Var3 = (bm10) entry2.getKey();
            mdVar = (md) entry2.getValue();
            c2i1Var = (d2i1) map2.get(linkedHashMap.get(bm10Var3));
            String strA3 = bm10Var3.a();
            if (c2i1Var instanceof c2i1) {
                d1i1Var = e1i1.c;
            } else if (c2i1Var.a) {
                d1i1Var = new d1i1(mdVar);
            } else {
                d1i1Var = e1i1.d;
            }
            linkedHashMap3.put(key3, new yl10(strA3, mdVar, new f1i1(d1i1Var)));
        }
        return linkedHashMap3;
    }
}
