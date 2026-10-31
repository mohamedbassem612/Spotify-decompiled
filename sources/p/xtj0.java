package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xtj0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ xtj0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:166:0x0255  */
    /* JADX WARN: Code duplicated, block: B:181:0x0294  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:211:0x030f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0369  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:263:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:278:0x042a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0472  */
    /* JADX WARN: Code duplicated, block: B:320:0x04be  */
    /* JADX WARN: Code duplicated, block: B:335:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:350:0x0548  */
    /* JADX WARN: Code duplicated, block: B:368:0x058a  */
    /* JADX WARN: Code duplicated, block: B:383:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:398:0x0602  */
    /* JADX WARN: Code duplicated, block: B:413:0x063d  */
    /* JADX WARN: Code duplicated, block: B:442:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:457:0x070b  */
    /* JADX WARN: Code duplicated, block: B:476:0x074d  */
    /* JADX WARN: Code duplicated, block: B:493:0x078a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:510:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:528:0x080c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0849  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x014b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        wtj0 wtj0Var;
        cuj0 cuj0Var;
        euj0 euj0Var;
        juj0 juj0Var;
        nuj0 nuj0Var;
        ruj0 ruj0Var;
        bvj0 bvj0Var;
        cvj0 cvj0Var;
        List list;
        swj0 swj0Var;
        wwj0 wwj0Var;
        xwj0 xwj0Var;
        ywj0 ywj0Var;
        zwj0 zwj0Var;
        axj0 axj0Var;
        bxj0 bxj0Var;
        dxj0 dxj0Var;
        kxj0 kxj0Var;
        mxj0 mxj0Var;
        pxj0 pxj0Var;
        qxj0 qxj0Var;
        t4k0 t4k0Var;
        q6k0 q6k0Var;
        o8k0 o8k0Var;
        s8k0 s8k0Var;
        l0l l0lVar;
        l0l l0lVar2;
        l0l l0lVar3;
        u8k0 u8k0Var;
        j1r i1rVar;
        gak0 gak0Var;
        hak0 hak0Var;
        iak0 iak0Var;
        abk0 abk0Var;
        uao0 uao0Var;
        xek0 xek0Var;
        byte b = this.a;
        ebk0 ebk0Var = ebk0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        eak0 eak0VarC = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof wtj0) {
                    wtj0Var = (wtj0) lnmVar;
                    int i = wtj0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wtj0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        wtj0Var = new wtj0(this, lnmVar);
                    }
                } else {
                    wtj0Var = new wtj0(this, lnmVar);
                }
                Object obj2 = wtj0Var.a;
                int i2 = wtj0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Object obj3 = ((yvg1) obj).c;
                    wtj0Var.b = 1;
                    return vr20Var.emit(obj3, wtj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof cuj0) {
                    cuj0Var = (cuj0) lnmVar;
                    int i3 = cuj0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cuj0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        cuj0Var = new cuj0(this, lnmVar);
                    }
                } else {
                    cuj0Var = new cuj0(this, lnmVar);
                }
                Object obj4 = cuj0Var.a;
                int i4 = cuj0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!((spq0) obj).c()) {
                    return rih1Var;
                }
                cuj0Var.b = 1;
                return vr20Var.emit(obj, cuj0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof euj0) {
                    euj0Var = (euj0) lnmVar;
                    int i5 = euj0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        euj0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        euj0Var = new euj0(this, lnmVar);
                    }
                } else {
                    euj0Var = new euj0(this, lnmVar);
                }
                Object obj5 = euj0Var.a;
                int i6 = euj0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                euj0Var.b = 1;
                return vr20Var.emit(boolValueOf, euj0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof juj0) {
                    juj0Var = (juj0) lnmVar;
                    int i7 = juj0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        juj0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        juj0Var = new juj0(this, lnmVar);
                    }
                } else {
                    juj0Var = new juj0(this, lnmVar);
                }
                Object obj6 = juj0Var.a;
                int i8 = juj0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                juj0Var.b = 1;
                return vr20Var.emit(obj, juj0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof nuj0) {
                    nuj0Var = (nuj0) lnmVar;
                    int i9 = nuj0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nuj0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        nuj0Var = new nuj0(this, lnmVar);
                    }
                } else {
                    nuj0Var = new nuj0(this, lnmVar);
                }
                Object obj7 = nuj0Var.a;
                int i10 = nuj0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                nuj0Var.b = 1;
                return vr20Var.emit(objG, nuj0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof ruj0) {
                    ruj0Var = (ruj0) lnmVar;
                    int i11 = ruj0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ruj0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ruj0Var = new ruj0(this, lnmVar);
                    }
                } else {
                    ruj0Var = new ruj0(this, lnmVar);
                }
                Object obj8 = ruj0Var.a;
                int i12 = ruj0Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    eak0VarC = ((ibk0) obj).b() ? yy1.c() : null;
                    ruj0Var.b = 1;
                    return vr20Var.emit(eak0VarC, ruj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof bvj0) {
                    bvj0Var = (bvj0) lnmVar;
                    int i13 = bvj0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bvj0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        bvj0Var = new bvj0(this, lnmVar);
                    }
                } else {
                    bvj0Var = new bvj0(this, lnmVar);
                }
                Object obj9 = bvj0Var.a;
                int i14 = bvj0Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf2 = Boolean.valueOf(((ibk0) obj).b());
                    bvj0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, bvj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof cvj0) {
                    cvj0Var = (cvj0) lnmVar;
                    int i15 = cvj0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        cvj0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        cvj0Var = new cvj0(this, lnmVar);
                    }
                } else {
                    cvj0Var = new cvj0(this, lnmVar);
                }
                Object obj10 = cvj0Var.a;
                int i16 = cvj0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                if (i1rVar3 != null && (list = (List) i1rVar3.a) != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new p111("", ((pvc0) it.next()).c, false, z6x.a, null, false, false, true, false, crt0.a, false, false));
                    }
                    eak0VarC = new w300(12, arrayList);
                }
                if (eak0VarC == null) {
                    return rih1Var;
                }
                cvj0Var.b = 1;
                return vr20Var.emit(eak0VarC, cvj0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof swj0) {
                    swj0Var = (swj0) lnmVar;
                    int i17 = swj0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        swj0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        swj0Var = new swj0(this, lnmVar);
                    }
                } else {
                    swj0Var = new swj0(this, lnmVar);
                }
                Object obj11 = swj0Var.a;
                int i18 = swj0Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    Map map = ((cxc0) obj).f.q;
                    swj0Var.b = 1;
                    return vr20Var.emit(map, swj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof wwj0) {
                    wwj0Var = (wwj0) lnmVar;
                    int i19 = wwj0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        wwj0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        wwj0Var = new wwj0(this, lnmVar);
                    }
                } else {
                    wwj0Var = new wwj0(this, lnmVar);
                }
                Object obj12 = wwj0Var.a;
                int i20 = wwj0Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    Map map2 = ((cxc0) obj).f.q;
                    wwj0Var.b = 1;
                    return vr20Var.emit(map2, wwj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof xwj0) {
                    xwj0Var = (xwj0) lnmVar;
                    int i21 = xwj0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        xwj0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        xwj0Var = new xwj0(this, lnmVar);
                    }
                } else {
                    xwj0Var = new xwj0(this, lnmVar);
                }
                Object obj13 = xwj0Var.a;
                int i22 = xwj0Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf3 = Boolean.valueOf(((cw8) obj).a);
                    xwj0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, xwj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof ywj0) {
                    ywj0Var = (ywj0) lnmVar;
                    int i23 = ywj0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ywj0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        ywj0Var = new ywj0(this, lnmVar);
                    }
                } else {
                    ywj0Var = new ywj0(this, lnmVar);
                }
                Object obj14 = ywj0Var.a;
                int i24 = ywj0Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf4 = Boolean.valueOf(((sp91) obj).a != rp91.a);
                    ywj0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, ywj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof zwj0) {
                    zwj0Var = (zwj0) lnmVar;
                    int i25 = zwj0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        zwj0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        zwj0Var = new zwj0(this, lnmVar);
                    }
                } else {
                    zwj0Var = new zwj0(this, lnmVar);
                }
                Object obj15 = zwj0Var.a;
                int i26 = zwj0Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                cxc0 cxc0Var = (cxc0) obj;
                mmr0 mmr0Var = new mmr0(new Integer(cxc0Var.b), Boolean.valueOf(cxc0Var.f.j));
                zwj0Var.b = 1;
                return vr20Var.emit(mmr0Var, zwj0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof axj0) {
                    axj0Var = (axj0) lnmVar;
                    int i27 = axj0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        axj0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        axj0Var = new axj0(this, lnmVar);
                    }
                } else {
                    axj0Var = new axj0(this, lnmVar);
                }
                Object obj16 = axj0Var.a;
                int i28 = axj0Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    Boolean boolValueOf5 = Boolean.valueOf(((ibk0) obj).equals(ebk0Var));
                    axj0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, axj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof bxj0) {
                    bxj0Var = (bxj0) lnmVar;
                    int i29 = bxj0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        bxj0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        bxj0Var = new bxj0(this, lnmVar);
                    }
                } else {
                    bxj0Var = new bxj0(this, lnmVar);
                }
                Object obj17 = bxj0Var.a;
                int i30 = bxj0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                eak0 eak0Var = (k1r) obj;
                eak0VarC = eak0Var instanceof i1r ? (i1r) eak0Var : null;
                Boolean boolValueOf6 = Boolean.valueOf(eak0VarC != null ? ((Boolean) ((i1r) eak0VarC).a).booleanValue() : false);
                bxj0Var.b = 1;
                return vr20Var.emit(boolValueOf6, bxj0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof dxj0) {
                    dxj0Var = (dxj0) lnmVar;
                    int i31 = dxj0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        dxj0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        dxj0Var = new dxj0(this, lnmVar);
                    }
                } else {
                    dxj0Var = new dxj0(this, lnmVar);
                }
                Object obj18 = dxj0Var.a;
                int i32 = dxj0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                i1r i1rVar4 = (k1r) obj;
                i1r i1rVar5 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                eak0VarC = i1rVar5 != null ? (g3d0) i1rVar5.a : null;
                if (eak0VarC == null) {
                    return rih1Var;
                }
                dxj0Var.b = 1;
                return vr20Var.emit(eak0VarC, dxj0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof kxj0) {
                    kxj0Var = (kxj0) lnmVar;
                    int i33 = kxj0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        kxj0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        kxj0Var = new kxj0(this, lnmVar);
                    }
                } else {
                    kxj0Var = new kxj0(this, lnmVar);
                }
                Object obj19 = kxj0Var.a;
                int i34 = kxj0Var.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf7 = Boolean.valueOf(((ibk0) obj).b());
                    kxj0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, kxj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof mxj0) {
                    mxj0Var = (mxj0) lnmVar;
                    int i35 = mxj0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        mxj0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        mxj0Var = new mxj0(this, lnmVar);
                    }
                } else {
                    mxj0Var = new mxj0(this, lnmVar);
                }
                Object obj20 = mxj0Var.a;
                int i36 = mxj0Var.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf8 = Boolean.valueOf(z6k0.b(((cxc0) obj).f.q));
                    mxj0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, mxj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof pxj0) {
                    pxj0Var = (pxj0) lnmVar;
                    int i37 = pxj0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        pxj0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        pxj0Var = new pxj0(this, lnmVar);
                    }
                } else {
                    pxj0Var = new pxj0(this, lnmVar);
                }
                Object obj21 = pxj0Var.a;
                int i38 = pxj0Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf9 = Boolean.valueOf(((ibk0) obj).b());
                    pxj0Var.b = 1;
                    return vr20Var.emit(boolValueOf9, pxj0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof qxj0) {
                    qxj0Var = (qxj0) lnmVar;
                    int i39 = qxj0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qxj0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        qxj0Var = new qxj0(this, lnmVar);
                    }
                } else {
                    qxj0Var = new qxj0(this, lnmVar);
                }
                Object obj22 = qxj0Var.a;
                int i40 = qxj0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                kby kbyVar = ((cxc0) obj).f;
                if (z6k0.b(kbyVar.q)) {
                    boolean z2 = kbyVar.j;
                    Map map3 = kbyVar.q;
                    if (!z2 && Boolean.parseBoolean((String) map3.get("has-custom-transitions"))) {
                        z = true;
                    }
                }
                Boolean boolValueOf10 = Boolean.valueOf(z);
                qxj0Var.b = 1;
                return vr20Var.emit(boolValueOf10, qxj0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof t4k0) {
                    t4k0Var = (t4k0) lnmVar;
                    int i41 = t4k0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        t4k0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        t4k0Var = new t4k0(this, lnmVar);
                    }
                } else {
                    t4k0Var = new t4k0(this, lnmVar);
                }
                Object obj23 = t4k0Var.a;
                int i42 = t4k0Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    s4k0 s4k0Var = new s4k0((py21) obj);
                    t4k0Var.b = 1;
                    return vr20Var.emit(s4k0Var, t4k0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof q6k0) {
                    q6k0Var = (q6k0) lnmVar;
                    int i43 = q6k0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        q6k0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        q6k0Var = new q6k0(this, lnmVar);
                    }
                } else {
                    q6k0Var = new q6k0(this, lnmVar);
                }
                Object obj24 = q6k0Var.a;
                int i44 = q6k0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf11 = Boolean.valueOf(((ibk0) obj).equals(ebk0Var));
                    q6k0Var.b = 1;
                    return vr20Var.emit(boolValueOf11, q6k0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof o8k0) {
                    o8k0Var = (o8k0) lnmVar;
                    int i45 = o8k0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        o8k0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        o8k0Var = new o8k0(this, lnmVar);
                    }
                } else {
                    o8k0Var = new o8k0(this, lnmVar);
                }
                Object obj25 = o8k0Var.a;
                int i46 = o8k0Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf12 = Boolean.valueOf(((ibk0) obj).a());
                    o8k0Var.b = 1;
                    return vr20Var.emit(boolValueOf12, o8k0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof s8k0) {
                    s8k0Var = (s8k0) lnmVar;
                    int i47 = s8k0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        s8k0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        s8k0Var = new s8k0(this, lnmVar);
                    }
                } else {
                    s8k0Var = new s8k0(this, lnmVar);
                }
                Object obj26 = s8k0Var.a;
                int i48 = s8k0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c() && (l0lVar = (l0l) spq0Var.h()) != null && l0lVar.isActive() && (l0lVar2 = (l0l) spq0Var.h()) != null && !l0lVar2.l() && (l0lVar3 = (l0l) spq0Var.h()) != null && !l0lVar3.m()) {
                    eak0VarC = hqq0.V((l0l) spq0Var.b());
                }
                s8k0Var.b = 1;
                return vr20Var.emit(eak0VarC, s8k0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof u8k0) {
                    u8k0Var = (u8k0) lnmVar;
                    int i49 = u8k0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        u8k0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        u8k0Var = new u8k0(this, lnmVar);
                    }
                } else {
                    u8k0Var = new u8k0(this, lnmVar);
                }
                Object obj27 = u8k0Var.a;
                int i50 = u8k0Var.b;
                if (i50 == 0) {
                    hm5.M(obj27);
                    h1r h1rVar = (k1r) obj;
                    if (h1rVar instanceof j1r) {
                        i1rVar = j1r.a;
                    } else if (h1rVar instanceof h1r) {
                        i1rVar = new h1r(h1rVar.a);
                    } else if (h1rVar instanceof i1r) {
                        i1rVar = new i1r(rih1Var, (Integer) null);
                    } else {
                        eg.o();
                    }
                    u8k0Var.b = 1;
                    return vr20Var.emit(i1rVar, u8k0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof gak0) {
                    gak0Var = (gak0) lnmVar;
                    int i51 = gak0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        gak0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        gak0Var = new gak0(this, lnmVar);
                    }
                } else {
                    gak0Var = new gak0(this, lnmVar);
                }
                Object obj28 = gak0Var.a;
                int i52 = gak0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                if (k1rVar instanceof j1r) {
                    return rih1Var;
                }
                gak0Var.b = 1;
                return vr20Var.emit(obj, gak0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof hak0) {
                    hak0Var = (hak0) lnmVar;
                    int i53 = hak0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hak0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        hak0Var = new hak0(this, lnmVar);
                    }
                } else {
                    hak0Var = new hak0(this, lnmVar);
                }
                Object obj29 = hak0Var.a;
                int i54 = hak0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                i1r i1rVar6 = (k1r) obj;
                i1r i1rVar7 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                eak0VarC = i1rVar7 != null ? (zge1) i1rVar7.a : null;
                hak0Var.b = 1;
                return vr20Var.emit(eak0VarC, hak0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof iak0) {
                    iak0Var = (iak0) lnmVar;
                    int i55 = iak0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        iak0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        iak0Var = new iak0(this, lnmVar);
                    }
                } else {
                    iak0Var = new iak0(this, lnmVar);
                }
                Object obj30 = iak0Var.a;
                int i56 = iak0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                i1r i1rVar8 = (k1r) obj;
                i1r i1rVar9 = i1rVar8 instanceof i1r ? i1rVar8 : null;
                eak0VarC = i1rVar9 != null ? (eak0) i1rVar9.a : null;
                if (eak0VarC == null) {
                    return rih1Var;
                }
                iak0Var.b = 1;
                return vr20Var.emit(eak0VarC, iak0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof abk0) {
                    abk0Var = (abk0) lnmVar;
                    int i57 = abk0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        abk0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        abk0Var = new abk0(this, lnmVar);
                    }
                } else {
                    abk0Var = new abk0(this, lnmVar);
                }
                Object obj31 = abk0Var.a;
                int i58 = abk0Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    Boolean bool = (Boolean) obj;
                    if (bool == null) {
                        uao0Var = uao0.b;
                    } else if (bool.equals(Boolean.TRUE)) {
                        uao0Var = uao0.c;
                    } else if (bool.equals(Boolean.FALSE)) {
                        uao0Var = uao0.d;
                    } else {
                        eg.o();
                    }
                    abk0Var.b = 1;
                    return vr20Var.emit(uao0Var, abk0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xek0) {
                    xek0Var = (xek0) lnmVar;
                    int i59 = xek0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        xek0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        xek0Var = new xek0(this, lnmVar);
                    }
                } else {
                    xek0Var = new xek0(this, lnmVar);
                }
                Object obj32 = xek0Var.a;
                int i60 = xek0Var.b;
                if (i60 == 0) {
                    hm5.M(obj32);
                    wek0 wek0Var = new wek0((py21) obj);
                    xek0Var.b = 1;
                    return vr20Var.emit(wek0Var, xek0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ xtj0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
