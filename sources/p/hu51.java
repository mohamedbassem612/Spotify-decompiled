package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hu51 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ hu51(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018f  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x0274  */
    /* JADX WARN: Code duplicated, block: B:161:0x02af  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:191:0x032c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0367  */
    /* JADX WARN: Code duplicated, block: B:243:0x0418  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:298:0x052c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0565  */
    /* JADX WARN: Code duplicated, block: B:330:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:347:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:362:0x0625  */
    /* JADX WARN: Code duplicated, block: B:379:0x0662  */
    /* JADX WARN: Code duplicated, block: B:394:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06df  */
    /* JADX WARN: Code duplicated, block: B:426:0x071d  */
    /* JADX WARN: Code duplicated, block: B:443:0x075b  */
    /* JADX WARN: Code duplicated, block: B:456:0x0796  */
    /* JADX WARN: Code duplicated, block: B:458:0x079e  */
    /* JADX WARN: Code duplicated, block: B:465:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:491:0x0812  */
    /* JADX WARN: Code duplicated, block: B:505:0x0853  */
    /* JADX WARN: Code duplicated, block: B:512:0x0866  */
    /* JADX WARN: Code duplicated, block: B:538:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:555:0x0906  */
    /* JADX WARN: Code duplicated, block: B:674:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:682:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Object emit(Object obj, lnm lnmVar) {
        gu51 gu51Var;
        ku51 ku51Var;
        su51 su51Var;
        tu51 tu51Var;
        uu51 uu51Var;
        vu51 vu51Var;
        oy51 oy51Var;
        qy51 qy51Var;
        az51 az51Var;
        bz51 bz51Var;
        f161 f161Var;
        g161 g161Var;
        q261 q261Var;
        t261 t261Var;
        u261 u261Var;
        y361 y361Var;
        z361 z361Var;
        p961 p961Var;
        yb61 yb61Var;
        zb61 zb61Var;
        mc61 mc61Var;
        nc61 nc61Var;
        tc61 tc61Var;
        dd61 dd61Var;
        bd61 bd61Var;
        md61 md61Var;
        yd61 yd61Var;
        ff61 ff61Var;
        jh61 jh61Var;
        dh61 dh61Var;
        int i;
        ai61 ai61Var;
        ji61 ji61Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        Object obj3 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof gu51) {
                    gu51Var = (gu51) lnmVar;
                    int i2 = gu51Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gu51Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        gu51Var = new gu51(this, lnmVar);
                    }
                } else {
                    gu51Var = new gu51(this, lnmVar);
                }
                Object obj4 = gu51Var.a;
                int i3 = gu51Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                k1r k1rVar = (k1r) obj;
                i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                Boolean boolValueOf = Boolean.valueOf(i1rVar != null ? ((Boolean) i1rVar.a).booleanValue() : false);
                gu51Var.b = 1;
                return vr20Var.emit(boolValueOf, gu51Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof ku51) {
                    ku51Var = (ku51) lnmVar;
                    int i4 = ku51Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ku51Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        ku51Var = new ku51(this, lnmVar);
                    }
                } else {
                    ku51Var = new ku51(this, lnmVar);
                }
                Object obj5 = ku51Var.a;
                int i5 = ku51Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (((k7l) obj).a() != l7l.a) {
                    return rih1Var;
                }
                ku51Var.b = 1;
                return vr20Var.emit(obj, ku51Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof su51) {
                    su51Var = (su51) lnmVar;
                    int i6 = su51Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        su51Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        su51Var = new su51(this, lnmVar);
                    }
                } else {
                    su51Var = new su51(this, lnmVar);
                }
                Object obj6 = su51Var.a;
                int i7 = su51Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((l0l) it.next()).f()) {
                            return rih1Var;
                        }
                    }
                }
                su51Var.b = 1;
                return vr20Var.emit(obj, su51Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof tu51) {
                    tu51Var = (tu51) lnmVar;
                    int i8 = tu51Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        tu51Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        tu51Var = new tu51(this, lnmVar);
                    }
                } else {
                    tu51Var = new tu51(this, lnmVar);
                }
                Object obj7 = tu51Var.a;
                int i9 = tu51Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                List list3 = (List) obj;
                list3.getClass();
                for (Object obj8 : list3) {
                    if (((l0l) obj8).isActive()) {
                        obj3 = obj8;
                        tu51Var.b = 1;
                        if (vr20Var.emit(obj3, tu51Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                tu51Var.b = 1;
                if (vr20Var.emit(obj3, tu51Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof uu51) {
                    uu51Var = (uu51) lnmVar;
                    int i10 = uu51Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        uu51Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        uu51Var = new uu51(this, lnmVar);
                    }
                } else {
                    uu51Var = new uu51(this, lnmVar);
                }
                Object obj9 = uu51Var.a;
                int i11 = uu51Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                List list4 = (List) obj;
                list4.getClass();
                List list5 = list4;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((l0l) it2.next()).f()) {
                            return rih1Var;
                        }
                    }
                }
                uu51Var.b = 1;
                return vr20Var.emit(obj, uu51Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof vu51) {
                    vu51Var = (vu51) lnmVar;
                    int i12 = vu51Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        vu51Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        vu51Var = new vu51(this, lnmVar);
                    }
                } else {
                    vu51Var = new vu51(this, lnmVar);
                }
                Object obj10 = vu51Var.a;
                int i13 = vu51Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                List list6 = (List) obj;
                list6.getClass();
                for (Object obj11 : list6) {
                    if (((l0l) obj11).isActive()) {
                        obj2 = obj11;
                        if (obj2 != null) {
                            return rih1Var;
                        }
                        vu51Var.b = 1;
                        if (vr20Var.emit(obj2, vu51Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                if (obj2 != null) {
                    return rih1Var;
                }
                vu51Var.b = 1;
                if (vr20Var.emit(obj2, vu51Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof oy51) {
                    oy51Var = (oy51) lnmVar;
                    int i14 = oy51Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        oy51Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        oy51Var = new oy51(this, lnmVar);
                    }
                } else {
                    oy51Var = new oy51(this, lnmVar);
                }
                Object obj12 = oy51Var.a;
                int i15 = oy51Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                k1r k1rVar2 = (k1r) obj;
                k1rVar2.getClass();
                if (k1rVar2 instanceof j1r) {
                    return rih1Var;
                }
                oy51Var.b = 1;
                return vr20Var.emit(obj, oy51Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof qy51) {
                    qy51Var = (qy51) lnmVar;
                    int i16 = qy51Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qy51Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        qy51Var = new qy51(this, lnmVar);
                    }
                } else {
                    qy51Var = new qy51(this, lnmVar);
                }
                Object obj13 = qy51Var.a;
                int i17 = qy51Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                k1r k1rVar3 = (k1r) obj;
                k1rVar3.getClass();
                if (k1rVar3 instanceof j1r) {
                    return rih1Var;
                }
                qy51Var.b = 1;
                return vr20Var.emit(obj, qy51Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof az51) {
                    az51Var = (az51) lnmVar;
                    int i18 = az51Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        az51Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        az51Var = new az51(this, lnmVar);
                    }
                } else {
                    az51Var = new az51(this, lnmVar);
                }
                Object obj14 = az51Var.a;
                int i19 = az51Var.b;
                if (i19 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf2 = Boolean.valueOf(((gz51) obj).a);
                    az51Var.b = 1;
                    return vr20Var.emit(boolValueOf2, az51Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof bz51) {
                    bz51Var = (bz51) lnmVar;
                    int i20 = bz51Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        bz51Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        bz51Var = new bz51(this, lnmVar);
                    }
                } else {
                    bz51Var = new bz51(this, lnmVar);
                }
                Object obj15 = bz51Var.a;
                int i21 = bz51Var.b;
                if (i21 == 0) {
                    hm5.M(obj15);
                    xq3 xq3Var = new xq3(((Boolean) obj).booleanValue());
                    bz51Var.b = 1;
                    return vr20Var.emit(xq3Var, bz51Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof f161) {
                    f161Var = (f161) lnmVar;
                    int i22 = f161Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        f161Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        f161Var = new f161(this, lnmVar);
                    }
                } else {
                    f161Var = new f161(this, lnmVar);
                }
                Object obj16 = f161Var.a;
                int i23 = f161Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                if (((py21) obj).c() == null) {
                    return rih1Var;
                }
                f161Var.b = 1;
                return vr20Var.emit(obj, f161Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof g161) {
                    g161Var = (g161) lnmVar;
                    int i24 = g161Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        g161Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        g161Var = new g161(this, lnmVar);
                    }
                } else {
                    g161Var = new g161(this, lnmVar);
                }
                Object obj17 = g161Var.a;
                int i25 = g161Var.b;
                if (i25 == 0) {
                    hm5.M(obj17);
                    e161 e161Var = new e161(pvc.i(((zuc0) ((py21) obj).c()).g));
                    g161Var.b = 1;
                    return vr20Var.emit(e161Var, g161Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof q261) {
                    q261Var = (q261) lnmVar;
                    int i26 = q261Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        q261Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        q261Var = new q261(this, lnmVar);
                    }
                } else {
                    q261Var = new q261(this, lnmVar);
                }
                Object obj18 = q261Var.a;
                int i27 = q261Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                q261Var.b = 1;
                return vr20Var.emit(obj, q261Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof t261) {
                    t261Var = (t261) lnmVar;
                    int i28 = t261Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        t261Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        t261Var = new t261(this, lnmVar);
                    }
                } else {
                    t261Var = new t261(this, lnmVar);
                }
                Object obj19 = t261Var.a;
                int i29 = t261Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                t261Var.b = 1;
                return vr20Var.emit(obj, t261Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof u261) {
                    u261Var = (u261) lnmVar;
                    int i30 = u261Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        u261Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        u261Var = new u261(this, lnmVar);
                    }
                } else {
                    u261Var = new u261(this, lnmVar);
                }
                Object obj20 = u261Var.a;
                int i31 = u261Var.b;
                if (i31 == 0) {
                    hm5.M(obj20);
                    String str = ((th61) obj).a;
                    u261Var.b = 1;
                    return vr20Var.emit(str, u261Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof y361) {
                    y361Var = (y361) lnmVar;
                    int i32 = y361Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        y361Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        y361Var = new y361(this, lnmVar);
                    }
                } else {
                    y361Var = new y361(this, lnmVar);
                }
                Object obj21 = y361Var.a;
                int i33 = y361Var.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                y361Var.b = 1;
                return vr20Var.emit(obj, y361Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof z361) {
                    z361Var = (z361) lnmVar;
                    int i34 = z361Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        z361Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        z361Var = new z361(this, lnmVar);
                    }
                } else {
                    z361Var = new z361(this, lnmVar);
                }
                Object obj22 = z361Var.a;
                int i35 = z361Var.b;
                if (i35 == 0) {
                    hm5.M(obj22);
                    String str2 = ((th61) obj).a;
                    z361Var.b = 1;
                    return vr20Var.emit(str2, z361Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i35 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof p961) {
                    p961Var = (p961) lnmVar;
                    int i36 = p961Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        p961Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        p961Var = new p961(this, lnmVar);
                    }
                } else {
                    p961Var = new p961(this, lnmVar);
                }
                Object obj23 = p961Var.a;
                int i37 = p961Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(new jh5(hvm.b, entry.getKey()), entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), (k3r) entry2.getValue());
                }
                p961Var.b = 1;
                return vr20Var.emit(linkedHashMap2, p961Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof yb61) {
                    yb61Var = (yb61) lnmVar;
                    int i38 = yb61Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        yb61Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        yb61Var = new yb61(this, lnmVar);
                    }
                } else {
                    yb61Var = new yb61(this, lnmVar);
                }
                Object obj24 = yb61Var.a;
                int i39 = yb61Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                List list7 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj25 : list7) {
                    if (((vb61) obj25).c == rb61.b) {
                        arrayList.add(obj25);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((vb61) it3.next()).a);
                }
                Set setP1 = o7h.p1(arrayList2);
                vb61 vb61Var = (vb61) o7h.s0(arrayList);
                String str3 = vb61Var != null ? vb61Var.d : null;
                String str4 = str3 != null ? str3 : "";
                ArrayList arrayList3 = new ArrayList(q7h.U(list7, 10));
                Iterator it4 = list7.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(vb61.a((vb61) it4.next(), setP1, str4, 159));
                }
                yb61Var.b = 1;
                return vr20Var.emit(arrayList3, yb61Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof zb61) {
                    zb61Var = (zb61) lnmVar;
                    int i40 = zb61Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        zb61Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        zb61Var = new zb61(this, lnmVar);
                    }
                } else {
                    zb61Var = new zb61(this, lnmVar);
                }
                Object obj26 = zb61Var.a;
                int i41 = zb61Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                kby kbyVar = ((cxc0) obj).f;
                if (kbyVar == null) {
                    return rih1Var;
                }
                zb61Var.b = 1;
                return vr20Var.emit(kbyVar, zb61Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof mc61) {
                    mc61Var = (mc61) lnmVar;
                    int i42 = mc61Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        mc61Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        mc61Var = new mc61(this, lnmVar);
                    }
                } else {
                    mc61Var = new mc61(this, lnmVar);
                }
                Object obj27 = mc61Var.a;
                int i43 = mc61Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                kby kbyVar2 = (kby) obj;
                yc61 yc61Var = new yc61(ioo1.P(kbyVar2.z, kbyVar2.q));
                mc61Var.b = 1;
                return vr20Var.emit(yc61Var, mc61Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof nc61) {
                    nc61Var = (nc61) lnmVar;
                    int i44 = nc61Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        nc61Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        nc61Var = new nc61(this, lnmVar);
                    }
                } else {
                    nc61Var = new nc61(this, lnmVar);
                }
                Object obj28 = nc61Var.a;
                int i45 = nc61Var.b;
                if (i45 == 0) {
                    hm5.M(obj28);
                    List list8 = ((yc61) obj).a;
                    nc61Var.b = 1;
                    return vr20Var.emit(list8, nc61Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof tc61) {
                    tc61Var = (tc61) lnmVar;
                    int i46 = tc61Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        tc61Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        tc61Var = new tc61(this, lnmVar);
                    }
                } else {
                    tc61Var = new tc61(this, lnmVar);
                }
                Object obj29 = tc61Var.a;
                int i47 = tc61Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                kby kbyVar3 = ((cxc0) obj).f;
                if (kbyVar3 == null) {
                    return rih1Var;
                }
                tc61Var.b = 1;
                return vr20Var.emit(kbyVar3, tc61Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof dd61) {
                    dd61Var = (dd61) lnmVar;
                    int i48 = dd61Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        dd61Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        dd61Var = new dd61(this, lnmVar);
                    }
                } else {
                    dd61Var = new dd61(this, lnmVar);
                }
                Object obj30 = dd61Var.a;
                int i49 = dd61Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                kby kbyVar4 = ((cxc0) obj).f;
                Map map2 = kbyVar4.q;
                fd61 fd61VarD = poo1.D(kbyVar4.z, map2);
                if (fd61VarD == null) {
                    bd61Var = new bd61((String) null, 63, (String) null, (String) null, false, (String) null);
                } else {
                    String str5 = fd61VarD.b;
                    String str6 = fd61VarD.a;
                    boolean z = fd61VarD.c;
                    String strY0 = o7h.y0(o7h.Z0(foo1.E(map2)), ",", (String) null, (String) null, (iu30) null, 62);
                    String str7 = (String) map2.get("correlation-id");
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = foo1.E(map2).isEmpty() ? null : str7;
                    bd61Var = new bd61(str5, 32, str6, strY0, z, str8 == null ? "" : str8);
                }
                dd61Var.b = 1;
                return vr20Var.emit(bd61Var, dd61Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof md61) {
                    md61Var = (md61) lnmVar;
                    int i50 = md61Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        md61Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        md61Var = new md61(this, lnmVar);
                    }
                } else {
                    md61Var = new md61(this, lnmVar);
                }
                Object obj31 = md61Var.a;
                int i51 = md61Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                kd61 kd61Var = nd61.e;
                sj20 sj20Var = new sj20((String) ((cen0) obj).a.get(ld61.a));
                md61Var.b = 1;
                return vr20Var.emit(sj20Var, md61Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof yd61) {
                    yd61Var = (yd61) lnmVar;
                    int i52 = yd61Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        yd61Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        yd61Var = new yd61(this, lnmVar);
                    }
                } else {
                    yd61Var = new yd61(this, lnmVar);
                }
                Object obj32 = yd61Var.a;
                int i53 = yd61Var.b;
                if (i53 == 0) {
                    hm5.M(obj32);
                    yd61Var.b = 1;
                    return vr20Var.emit(ouf.a, yd61Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof ff61) {
                    ff61Var = (ff61) lnmVar;
                    int i54 = ff61Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ff61Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        ff61Var = new ff61(this, lnmVar);
                    }
                } else {
                    ff61Var = new ff61(this, lnmVar);
                }
                Object obj33 = ff61Var.a;
                int i55 = ff61Var.b;
                if (i55 == 0) {
                    hm5.M(obj33);
                    pcu pcuVar = (pcu) obj;
                    if (pcuVar != null) {
                        tmi1 tmi1Var = new tmi1(pcuVar.a);
                        ff61Var.b = 1;
                        return vr20Var.emit(tmi1Var, ff61Var) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (i55 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 27:
                if (lnmVar instanceof jh61) {
                    jh61Var = (jh61) lnmVar;
                    int i56 = jh61Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        jh61Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        jh61Var = new jh61(this, lnmVar);
                    }
                } else {
                    jh61Var = new jh61(this, lnmVar);
                }
                Object obj34 = jh61Var.a;
                int i57 = jh61Var.b;
                if (i57 == 0) {
                    hm5.M(obj34);
                    jn41 jn41Var = (ln41) obj;
                    if (jn41Var instanceof jn41) {
                        int iOrdinal = ((kb61) jn41Var.a).O().a.a().ordinal();
                        if (iOrdinal != 0) {
                            i = 2;
                            if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    i = 3;
                                } else {
                                    eg.o();
                                }
                            }
                        } else {
                            i = 1;
                        }
                        dh61Var = new dh61(new ahv0(i));
                    } else {
                        dh61Var = gtv0.f;
                    }
                    jh61Var.b = 1;
                    return vr20Var.emit(dh61Var, jh61Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj34);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof ai61) {
                    ai61Var = (ai61) lnmVar;
                    int i58 = ai61Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        ai61Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        ai61Var = new ai61(this, lnmVar);
                    }
                } else {
                    ai61Var = new ai61(this, lnmVar);
                }
                Object obj35 = ai61Var.a;
                int i59 = ai61Var.b;
                if (i59 == 0) {
                    hm5.M(obj35);
                    Boolean boolValueOf3 = Boolean.valueOf(((th61) obj).b);
                    ai61Var.b = 1;
                    return vr20Var.emit(boolValueOf3, ai61Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i59 == 1) {
                    hm5.M(obj35);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ji61) {
                    ji61Var = (ji61) lnmVar;
                    int i60 = ji61Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        ji61Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        ji61Var = new ji61(this, lnmVar);
                    }
                } else {
                    ji61Var = new ji61(this, lnmVar);
                }
                Object obj36 = ji61Var.a;
                int i61 = ji61Var.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj36);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj36);
                ii61 ii61Var = (ii61) obj;
                ddu dduVar = new ddu(ii61Var.b, ii61Var.a);
                ji61Var.b = 1;
                return vr20Var.emit(dduVar, ji61Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ hu51(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
