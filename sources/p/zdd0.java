package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zdd0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ LinkedHashMap c;

    public /* synthetic */ zdd0(vr20 vr20Var, LinkedHashMap linkedHashMap, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:106:0x023f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:111:0x024a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0253  */
    /* JADX WARN: Code duplicated, block: B:117:0x0256  */
    /* JADX WARN: Code duplicated, block: B:119:0x025d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0261  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x026a  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:196:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:248:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0253, please report this as an issue */
    public final Object emit(Object obj, lnm lnmVar) {
        ydd0 ydd0Var;
        bex0 bex0Var;
        Iterator it;
        w4i1 w4i1Var;
        mmr0 mmr0Var;
        Object obj2;
        hc71 hc71Var;
        rih1 rih1Var;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        rih1 rih1Var2;
        Map map;
        LinkedHashMap linkedHashMap2;
        List listSingletonList;
        Iterator it3;
        rih1 rih1Var3;
        Iterator it4;
        LinkedHashMap linkedHashMap3;
        wb71 wb71VarB;
        String str;
        String str2;
        qz61 qz61Var;
        qb71 qb71Var;
        zb71 zb71Var;
        rb71 rb71Var;
        rb71 rb71Var2;
        pfi1 pfi1Var;
        zei1 zei1Var;
        byte b = this.a;
        rih1 rih1Var4 = rih1.a;
        LinkedHashMap linkedHashMap4 = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ydd0) {
                    ydd0Var = (ydd0) lnmVar;
                    int i = ydd0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ydd0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ydd0Var = new ydd0(this, lnmVar);
                    }
                } else {
                    ydd0Var = new ydd0(this, lnmVar);
                }
                Object obj3 = ydd0Var.a;
                int i2 = ydd0Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    Object obj4 = ((e331) obj).a;
                    Throwable thA = e331.a(obj4);
                    if (thA != null) {
                        Logger.e(thA, "Failed to load listening activity", new Object[0]);
                        obj4 = z6x.a;
                    }
                    ArrayList<ucd0> arrayList = new ArrayList();
                    for (Object obj5 : (Iterable) obj4) {
                        ucd0 ucd0Var = (ucd0) obj5;
                        tcd0 tcd0Var = ucd0Var.b;
                        if (tcd0Var != null && tcd0Var.c && linkedHashMap4.containsKey(ucd0Var.a)) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList<mmr0> arrayList2 = new ArrayList();
                    for (ucd0 ucd0Var2 : arrayList) {
                        w4i1 w4i1Var2 = (w4i1) sqg0.G(ucd0Var2.a, linkedHashMap4);
                        tcd0 tcd0Var2 = ucd0Var2.b;
                        tcd0Var2.getClass();
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.add(new mmr0(nzy.k(tcd0Var2.a), w4i1Var2));
                        String str3 = tcd0Var2.b;
                        if (str3 != null) {
                            smc0VarN.add(new mmr0(nzy.k(str3), w4i1Var2));
                        }
                        r7h.W(k4p1.k(smc0VarN), arrayList2);
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    for (mmr0 mmr0Var2 : arrayList2) {
                        String str4 = (String) mmr0Var2.a;
                        Object objH = linkedHashMap5.get(str4);
                        if (objH == null) {
                            objH = cfm0.h(str4, linkedHashMap5);
                        }
                        ((List) objH).add((w4i1) mmr0Var2.b);
                    }
                    ydd0Var.b = 1;
                    if (vr20Var.emit(linkedHashMap5, ydd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                return rih1Var4;
            case 1:
                mmr0 mmr0Var3 = null;
                if (lnmVar instanceof bex0) {
                    bex0Var = (bex0) lnmVar;
                    int i3 = bex0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bex0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        bex0Var = new bex0(this, lnmVar);
                    }
                } else {
                    bex0Var = new bex0(this, lnmVar);
                }
                Object obj6 = bex0Var.a;
                int i4 = bex0Var.b;
                if (i4 == 0) {
                    hm5.M(obj6);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it5 = ((List) obj).iterator();
                    while (it5.hasNext()) {
                        tv00 tv00Var = (tv00) it5.next();
                        String str5 = (String) linkedHashMap4.get(tv00Var.a);
                        if (str5 == null) {
                            it = it5;
                            mmr0Var = mmr0Var3;
                        } else {
                            zei1 zei1Var2 = tv00Var.b;
                            if (zei1Var2 != null) {
                                String str6 = zei1Var2.a;
                                String str7 = zei1Var2.b;
                                Iterator it6 = zei1Var2.e.iterator();
                                if (it6.hasNext()) {
                                    Object next = it6.next();
                                    if (it6.hasNext()) {
                                        yp70 yp70Var = (yp70) next;
                                        int i5 = yp70Var.c * yp70Var.b;
                                        while (true) {
                                            Object next2 = it6.next();
                                            yp70 yp70Var2 = (yp70) next2;
                                            it = it5;
                                            int i6 = yp70Var2.c * yp70Var2.b;
                                            if (i5 < i6) {
                                                i5 = i6;
                                                next = next2;
                                            }
                                            if (it6.hasNext()) {
                                                it5 = it;
                                            }
                                        }
                                    } else {
                                        it = it5;
                                    }
                                    obj2 = next;
                                } else {
                                    it = it5;
                                    obj2 = mmr0Var3;
                                }
                                yp70 yp70Var3 = (yp70) obj2;
                                w4i1Var = new w4i1(str6, str7, zei1Var2.f, yp70Var3 != null ? yp70Var3.a : null);
                            } else {
                                it = it5;
                                w4i1Var = null;
                            }
                            mmr0Var = w4i1Var == null ? null : new mmr0(str5, w4i1Var);
                        }
                        if (mmr0Var != null) {
                            arrayList3.add(mmr0Var);
                        }
                        it5 = it;
                        mmr0Var3 = null;
                    }
                    Map mapT = sqg0.T(arrayList3);
                    bex0Var.b = 1;
                    if (vr20Var.emit(mapT, bex0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var4;
            case 2:
                if (lnmVar instanceof hc71) {
                    hc71Var = (hc71) lnmVar;
                    int i7 = hc71Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hc71Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        hc71Var = new hc71(this, lnmVar);
                    }
                } else {
                    hc71Var = new hc71(this, lnmVar);
                }
                Object obj7 = hc71Var.a;
                int i8 = hc71Var.b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                    rih1Var = rih1Var4;
                    return rih1Var;
                }
                hm5.M(obj7);
                fc71 fc71Var = (fc71) obj;
                List list = fc71Var.a;
                List<tv00> list2 = fc71Var.b;
                int i9 = 10;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(iS);
                for (tv00 tv00Var2 : list2) {
                    linkedHashMap6.put(tv00Var2.a, tv00Var2.b);
                }
                Map map2 = fc71Var.c;
                LinkedHashMap linkedHashMap7 = fc71Var.d;
                LinkedHashMap linkedHashMap8 = fc71Var.e;
                List list3 = list;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it7 = list3.iterator();
                while (it7.hasNext()) {
                    tv00 tv00Var3 = (tv00) it7.next();
                    String str8 = tv00Var3.a;
                    opa1 opa1Var = tv00Var3.b;
                    Set set = (Set) linkedHashMap4.get(str8);
                    vb71 vb71Var = (vb71) linkedHashMap8.get(str8);
                    ib71 ib71Var = (ib71) linkedHashMap7.get(str8);
                    Set set2 = set;
                    wb71 wb71VarC = jb71.a;
                    if (set2 == null || set2.isEmpty()) {
                        linkedHashMap = linkedHashMap8;
                        it2 = it7;
                        rih1Var2 = rih1Var4;
                        map = map2;
                        linkedHashMap2 = linkedHashMap7;
                        ec71 ec71Var = new ec71(6, tv00Var3.a, (String) null);
                        opa1 opa1Var2 = opa1Var;
                        if (opa1Var2 != null) {
                            wb71VarC = lc71.c(opa1Var2, (rb71) null, vb71Var, ib71Var, "");
                        }
                        listSingletonList = Collections.singletonList(new mmr0(ec71Var, wb71VarC));
                    } else {
                        opa1 opa1Var3 = opa1Var;
                        Set set3 = set;
                        ArrayList arrayList5 = new ArrayList(q7h.U(set3, i9));
                        Iterator it8 = set3.iterator();
                        while (it8.hasNext()) {
                            ec71 ec71Var2 = (ec71) it8.next();
                            String str9 = ec71Var2.b;
                            bpf bpfVar = str9 != null ? (bpf) linkedHashMap6.get(str9) : null;
                            LinkedHashMap linkedHashMap9 = linkedHashMap8;
                            if (bpfVar == null) {
                                it3 = it7;
                                rih1Var3 = rih1Var4;
                            } else {
                                String str10 = bpfVar.c;
                                apf apfVar = bpfVar.a;
                                it3 = it7;
                                xof xofVar = apfVar.b;
                                float f = apfVar.a;
                                rih1Var3 = rih1Var4;
                                if (xofVar instanceof wof) {
                                    String str11 = bpfVar.b;
                                    if (str11 != null && str11.length() != 0) {
                                        it4 = it8;
                                        wof wofVar = (wof) xofVar;
                                        linkedHashMap3 = linkedHashMap7;
                                        wb71VarB = lc71.b(opa1Var3, new rb71(f, new mb71(wofVar.b, wofVar.c)), bpfVar.b, str10, vb71Var, ib71Var);
                                    }
                                } else {
                                    it4 = it8;
                                    linkedHashMap3 = linkedHashMap7;
                                    if (xofVar instanceof xof) {
                                        wb71VarB = lc71.b(opa1Var3, new rb71(f, new nb71(xofVar.b)), bpfVar.b, str10, vb71Var, ib71Var);
                                    } else if (xofVar instanceof zof) {
                                        wb71VarB = lc71.b(opa1Var3, new rb71(f, new pb71(((zof) xofVar).b)), bpfVar.b, str10, vb71Var, ib71Var);
                                    } else {
                                        if (!xofVar.equals(yof.b)) {
                                            eg.o();
                                            return null;
                                        }
                                        wb71VarB = null;
                                        if (bpfVar != null) {
                                            str = bpfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str = "";
                                        }
                                        str2 = ec71Var2.c;
                                        if (str2 != null) {
                                            qz61Var = (qz61) map2.get(str2);
                                        } else {
                                            qz61Var = null;
                                        }
                                        Map map3 = map2;
                                        if (wb71VarB != null || (rb71Var2 = wb71VarB.c) == null) {
                                            qb71Var = null;
                                        } else {
                                            qb71Var = rb71Var2.b;
                                        }
                                        if (qb71Var instanceof mb71) {
                                            if (opa1Var3 != null) {
                                                rb71Var = wb71VarB.c;
                                                if (rb71Var != null || !(rb71Var.b instanceof mb71)) {
                                                    rb71Var = null;
                                                }
                                                wb71VarB = lc71.c(opa1Var3, rb71Var, vb71Var, ib71Var, str);
                                            }
                                        } else if (wb71VarB == null) {
                                            wb71VarB = opa1Var3 != null ? lc71.c(opa1Var3, (rb71) null, vb71Var, ib71Var, str) : null;
                                            if (wb71VarB == null) {
                                                wb71VarB = wb71VarC;
                                            }
                                        }
                                        if (qz61Var != null) {
                                            if (wb71VarB instanceof zb71) {
                                                zb71Var = (zb71) wb71VarB;
                                            } else {
                                                zb71Var = null;
                                            }
                                            wb71VarB = new sb71(qz61Var, zb71Var);
                                        }
                                        arrayList5.add(new mmr0(ec71Var2, wb71VarB));
                                        it7 = it3;
                                        vb71Var = vb71Var;
                                        ib71Var = ib71Var;
                                        linkedHashMap8 = linkedHashMap9;
                                        map2 = map3;
                                        rih1Var4 = rih1Var3;
                                        linkedHashMap7 = linkedHashMap3;
                                        opa1Var3 = opa1Var3;
                                        it8 = it4;
                                    }
                                }
                                opa1Var3 = opa1Var3;
                                vb71Var = vb71Var;
                                ib71Var = ib71Var;
                                if (bpfVar != null) {
                                    str = bpfVar.c;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                str2 = ec71Var2.c;
                                if (str2 != null) {
                                    qz61Var = (qz61) map2.get(str2);
                                } else {
                                    qz61Var = null;
                                }
                                Map map4 = map2;
                                if (wb71VarB != null) {
                                    qb71Var = null;
                                } else {
                                    qb71Var = null;
                                }
                                if (qb71Var instanceof mb71) {
                                    if (opa1Var3 != null) {
                                        rb71Var = wb71VarB.c;
                                        if (rb71Var != null) {
                                            rb71Var = null;
                                        } else {
                                            rb71Var = null;
                                        }
                                        wb71VarB = lc71.c(opa1Var3, rb71Var, vb71Var, ib71Var, str);
                                    }
                                } else if (wb71VarB == null) {
                                    if (opa1Var3 != null) {
                                    }
                                    if (wb71VarB == null) {
                                        wb71VarB = wb71VarC;
                                    }
                                }
                                if (qz61Var != null) {
                                    if (wb71VarB instanceof zb71) {
                                        zb71Var = (zb71) wb71VarB;
                                    } else {
                                        zb71Var = null;
                                    }
                                    wb71VarB = new sb71(qz61Var, zb71Var);
                                }
                                arrayList5.add(new mmr0(ec71Var2, wb71VarB));
                                it7 = it3;
                                vb71Var = vb71Var;
                                ib71Var = ib71Var;
                                linkedHashMap8 = linkedHashMap9;
                                map2 = map4;
                                rih1Var4 = rih1Var3;
                                linkedHashMap7 = linkedHashMap3;
                                opa1Var3 = opa1Var3;
                                it8 = it4;
                            }
                            it4 = it8;
                            linkedHashMap3 = linkedHashMap7;
                            wb71VarB = null;
                            if (bpfVar != null) {
                                str = bpfVar.c;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            str2 = ec71Var2.c;
                            if (str2 != null) {
                                qz61Var = (qz61) map2.get(str2);
                            } else {
                                qz61Var = null;
                            }
                            Map map5 = map2;
                            if (wb71VarB != null) {
                                qb71Var = null;
                            } else {
                                qb71Var = null;
                            }
                            if (qb71Var instanceof mb71) {
                                if (opa1Var3 != null) {
                                    rb71Var = wb71VarB.c;
                                    if (rb71Var != null) {
                                        rb71Var = null;
                                    } else {
                                        rb71Var = null;
                                    }
                                    wb71VarB = lc71.c(opa1Var3, rb71Var, vb71Var, ib71Var, str);
                                }
                            } else if (wb71VarB == null) {
                                if (opa1Var3 != null) {
                                }
                                if (wb71VarB == null) {
                                    wb71VarB = wb71VarC;
                                }
                            }
                            if (qz61Var != null) {
                                if (wb71VarB instanceof zb71) {
                                    zb71Var = (zb71) wb71VarB;
                                } else {
                                    zb71Var = null;
                                }
                                wb71VarB = new sb71(qz61Var, zb71Var);
                            }
                            arrayList5.add(new mmr0(ec71Var2, wb71VarB));
                            it7 = it3;
                            vb71Var = vb71Var;
                            ib71Var = ib71Var;
                            linkedHashMap8 = linkedHashMap9;
                            map2 = map5;
                            rih1Var4 = rih1Var3;
                            linkedHashMap7 = linkedHashMap3;
                            opa1Var3 = opa1Var3;
                            it8 = it4;
                        }
                        linkedHashMap = linkedHashMap8;
                        it2 = it7;
                        rih1Var2 = rih1Var4;
                        map = map2;
                        linkedHashMap2 = linkedHashMap7;
                        listSingletonList = arrayList5;
                    }
                    arrayList4.add(listSingletonList);
                    it7 = it2;
                    linkedHashMap8 = linkedHashMap;
                    map2 = map;
                    rih1Var4 = rih1Var2;
                    linkedHashMap7 = linkedHashMap2;
                    i9 = 10;
                }
                rih1Var = rih1Var4;
                Map mapT2 = sqg0.T(q7h.V(arrayList4));
                hc71Var.b = 1;
                if (vr20Var.emit(mapT2, hc71Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                if (lnmVar instanceof pfi1) {
                    pfi1Var = (pfi1) lnmVar;
                    int i10 = pfi1Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pfi1Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        pfi1Var = new pfi1(this, lnmVar);
                    }
                } else {
                    pfi1Var = new pfi1(this, lnmVar);
                }
                Object obj8 = pfi1Var.a;
                int i11 = pfi1Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj8);
                        return rih1Var4;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                ArrayList arrayList6 = new ArrayList();
                for (tv00 tv00Var4 : (List) obj) {
                    String str12 = (String) linkedHashMap4.get(tv00Var4.a);
                    mmr0 mmr0Var4 = (str12 == null || (zei1Var = tv00Var4.b) == null) ? null : new mmr0(str12, zei1Var);
                    if (mmr0Var4 != null) {
                        arrayList6.add(mmr0Var4);
                    }
                }
                Map mapT3 = sqg0.T(arrayList6);
                pfi1Var.b = 1;
                return vr20Var.emit(mapT3, pfi1Var) == d9nVar ? d9nVar : rih1Var4;
        }
    }

    public /* synthetic */ zdd0(vr20 vr20Var, LinkedHashMap linkedHashMap, f961 f961Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = linkedHashMap;
    }
}
