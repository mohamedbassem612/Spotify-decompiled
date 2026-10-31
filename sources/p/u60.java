package p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.a;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u60 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public u60(jk0 jk0Var, Set set, iu30 iu30Var, jkr0 jkr0Var) {
        this.a = (byte) 1;
        this.c = jk0Var;
        this.b = set;
        this.d = iu30Var;
        this.e = jkr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    private final Object e(Object obj, lnm lnmVar) {
        ahc0 ahc0Var;
        String string;
        List list;
        String string2;
        w7x w7xVarP1;
        Iterator it;
        w7x w7xVar;
        p811 p811Var = (p811) this.d;
        p811 p811Var2 = (p811) this.e;
        dhc0 dhc0Var = (dhc0) this.b;
        dg30 dg30Var = dhc0Var.a;
        rgc0 rgc0Var = dhc0Var.b;
        if (lnmVar instanceof ahc0) {
            ahc0Var = (ahc0) lnmVar;
            int i = ahc0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahc0Var.b = i - Integer.MIN_VALUE;
            } else {
                ahc0Var = new ahc0(this, lnmVar);
            }
        } else {
            ahc0Var = new ahc0(this, lnmVar);
        }
        Object obj2 = ahc0Var.a;
        int i2 = ahc0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.c;
            List list2 = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (((xgc0) obj3).b.c instanceof sgc0) {
                    arrayList.add(obj3);
                }
            }
            smc0 smc0VarN = k4p1.n();
            w7x w7xVar2 = (List) p811Var2.a;
            w7x w7xVar3 = w7x.a;
            LinkedHashSet linkedHashSetB1 = o7h.b1(arrayList, w7xVar2 != null ? (Iterable) w7xVar2 : w7xVar3);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashSetB1.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                xgc0 xgc0Var = (xgc0) next;
                List list3 = (List) p811Var.a;
                if (list3 != null) {
                    List list4 = list3;
                    it = it2;
                    w7xVar = w7xVar3;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Integer.valueOf(((xgc0) it3.next()).a));
                    }
                    if (o7h.p1(arrayList3).contains(new Integer(xgc0Var.a))) {
                        it2 = it;
                        w7xVar3 = w7xVar;
                    }
                } else {
                    it = it2;
                    w7xVar = w7xVar3;
                }
                arrayList2.add(next);
                it2 = it;
                w7xVar3 = w7xVar;
            }
            w7x w7xVar4 = w7xVar3;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (!((xgc0) obj4).c) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : arrayList4) {
                int i3 = ((xgc0) obj5).a;
                bma1 bma1Var = rgc0.f;
                if (!rgc0Var.a(q3c.r(i3)) && !rgc0Var.a(q3c.s(i3))) {
                    arrayList5.add(obj5);
                }
            }
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Integer.valueOf(((xgc0) it4.next()).a));
            }
            Iterator it5 = o7h.p1(arrayList6).iterator();
            while (it5.hasNext()) {
                int iIntValue = ((Number) it5.next()).intValue();
                bma1 bma1Var2 = rgc0.f;
                l1d.B(rgc0Var.a, rgc0Var.c.edit(), q3c.r(iIntValue));
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                vgc0 vgc0Var = ((xgc0) it6.next()).b;
                String string3 = vgc0Var.a;
                Integer num = vgc0Var.b;
                if (string3 == null) {
                    string3 = num != null ? dg30Var.getString(num.intValue()) : null;
                }
                if (string3 != null) {
                    arrayList7.add(string3);
                }
            }
            smc0VarN.addAll(arrayList7);
            if (((Boolean) dhc0Var.c.get()).booleanValue() && (list = (List) p811Var2.a) != null) {
                LinkedHashSet linkedHashSetB2 = o7h.b1(list, arrayList);
                ArrayList arrayList8 = new ArrayList();
                for (Iterator it7 = linkedHashSetB2.iterator(); it7.hasNext(); it7 = it7) {
                    Object next2 = it7.next();
                    xgc0 xgc0Var2 = (xgc0) next2;
                    if (list2 != null) {
                        List list5 = list2;
                        ArrayList arrayList9 = new ArrayList(q7h.U(list5, 10));
                        Iterator it8 = list5.iterator();
                        while (it8.hasNext()) {
                            arrayList9.add(Integer.valueOf(((xgc0) it8.next()).a));
                        }
                        w7xVarP1 = o7h.p1(arrayList9);
                    } else {
                        w7xVarP1 = w7xVar4;
                    }
                    if (!w7xVarP1.contains(new Integer(xgc0Var2.a))) {
                        arrayList8.add(next2);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayList8) {
                    int i4 = ((xgc0) obj6).a;
                    bma1 bma1Var3 = rgc0.f;
                    if (!rgc0Var.a(q3c.s(i4))) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                Iterator it9 = arrayList10.iterator();
                while (it9.hasNext()) {
                    arrayList11.add(Integer.valueOf(((xgc0) it9.next()).a));
                }
                Iterator it10 = o7h.p1(arrayList11).iterator();
                while (it10.hasNext()) {
                    int iIntValue2 = ((Number) it10.next()).intValue();
                    bma1 bma1Var4 = rgc0.f;
                    l1d.B(rgc0Var.a, rgc0Var.c.edit(), q3c.s(iIntValue2));
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it11 = arrayList10.iterator();
                while (it11.hasNext()) {
                    ugc0 ugc0Var = ((xgc0) it11.next()).b.c;
                    sgc0 sgc0Var = ugc0Var instanceof sgc0 ? (sgc0) ugc0Var : null;
                    if (sgc0Var != null) {
                        string2 = sgc0Var.a;
                        Integer num2 = sgc0Var.b;
                        if (string2 == null) {
                            if (num2 != null) {
                                string2 = dg30Var.getString(num2.intValue());
                            } else {
                                string2 = null;
                            }
                        }
                    } else {
                        string2 = null;
                    }
                    if (string2 != null) {
                        arrayList12.add(string2);
                    }
                }
                smc0VarN.addAll(arrayList12);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            p811Var.a = list2;
            p811Var2.a = arrayList;
            xgc0 xgc0Var3 = (xgc0) o7h.s0(list2);
            if (xgc0Var3 != null) {
                vgc0 vgc0Var2 = xgc0Var3.b;
                String str = vgc0Var2.a;
                Integer num3 = vgc0Var2.b;
                if (str != null) {
                    string = str;
                } else if (num3 != null) {
                    string = dg30Var.getString(num3.intValue());
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            ygc0 ygc0Var = new ygc0(string, (String) o7h.s0(smc0VarK));
            ahc0Var.b = 1;
            Object objEmit = vr20Var.emit(ygc0Var, ahc0Var);
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
        loc0 loc0Var;
        if (lnmVar instanceof loc0) {
            loc0Var = (loc0) lnmVar;
            int i = loc0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                loc0Var.b = i - Integer.MIN_VALUE;
            } else {
                loc0Var = new loc0(this, lnmVar);
            }
        } else {
            loc0Var = new loc0(this, lnmVar);
        }
        Object obj2 = loc0Var.a;
        int i2 = loc0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.c;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            roc0 roc0Var = (roc0) this.d;
            g3d0 g3d0Var = (g3d0) this.e;
            Set set = (Set) this.b;
            boolean zBooleanValue2 = !zBooleanValue;
            z2r z2rVar = roc0Var.m;
            y2r y2rVar = z2rVar.a;
            prc0 prc0Var = y2rVar.d;
            boolean z = z2rVar.b;
            xj61 xj61Var = new xj61();
            xj61Var.addAll(set);
            if (y2rVar.a) {
                xj61Var.add(sqc0.a);
            }
            if (z2rVar.d) {
                xj61Var.add(uqc0.a);
            }
            if (z2rVar.e) {
                xj61Var.add(xqc0.a);
            }
            xj61Var.add(wqc0.a);
            Boolean bool = y2rVar.b;
            if (bool != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            if (zBooleanValue2) {
                xj61Var.add(yqc0.a);
            }
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, g3d0Var, cwl1.j(xj61Var), z, roc0Var.n, hqz0.a, prc0Var, 0, (List) null, 385);
            loc0Var.b = 1;
            Object objEmit = vr20Var.emit(trc0Var, loc0Var);
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
    private final Object g(Object obj, lnm lnmVar) {
        fwc0 fwc0Var;
        if (lnmVar instanceof fwc0) {
            fwc0Var = (fwc0) lnmVar;
            int i = fwc0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwc0Var.b = i - Integer.MIN_VALUE;
            } else {
                fwc0Var = new fwc0(this, lnmVar);
            }
        } else {
            fwc0Var = new fwc0(this, lnmVar);
        }
        Object obj2 = fwc0Var.a;
        int i2 = fwc0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.c;
            z310 z310VarF = ((hwc0) this.d).f((wsc0) this.e, (rp91) this.b, (Map) obj);
            fwc0Var.b = 1;
            Object objEmit = vr20Var.emit(z310VarF, fwc0Var);
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
    private final Object h(Object obj, lnm lnmVar) {
        k2e0 k2e0Var;
        if (lnmVar instanceof k2e0) {
            k2e0Var = (k2e0) lnmVar;
            int i = k2e0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2e0Var.b = i - Integer.MIN_VALUE;
            } else {
                k2e0Var = new k2e0(this, lnmVar);
            }
        } else {
            k2e0Var = new k2e0(this, lnmVar);
        }
        Object obj2 = k2e0Var.a;
        int i2 = k2e0Var.b;
        inm1 jnm1Var = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.c;
            i1r i1rVar = (k1r) obj;
            if (i1rVar instanceof h1r) {
                jnm1Var = new inm1(new RuntimeException("Track metadata loading failed: track=" + i1rVar));
            } else if (i1rVar instanceof i1r) {
                v0e v0eVar = (v0e) i1rVar.a;
                i1e i1eVar = (i1e) this.d;
                String str = i1eVar.b;
                if (str == null) {
                    str = "";
                }
                String str2 = i1eVar.a;
                if (str2 == null) {
                    str2 = (String) this.e;
                }
                Integer num = i1eVar.c;
                String str3 = v0eVar.b;
                jnm1Var = new jnm1(num, str, str2, str3 == null ? "" : str3, ((xom1) this.b).c);
            }
            if (jnm1Var != null) {
                k2e0Var.b = 1;
                Object objEmit = vr20Var.emit(jnm1Var, k2e0Var);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
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
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private final Object i(Object obj, lnm lnmVar) {
        p2e0 p2e0Var;
        y2e0 y2e0Var = (y2e0) this.d;
        if (lnmVar instanceof p2e0) {
            p2e0Var = (p2e0) lnmVar;
            int i = p2e0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p2e0Var.b = i - Integer.MIN_VALUE;
            } else {
                p2e0Var = new p2e0(this, lnmVar);
            }
        } else {
            p2e0Var = new p2e0(this, lnmVar);
        }
        Object obj2 = p2e0Var.a;
        int i2 = p2e0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.c;
            uc91 uc91Var = (uc91) obj;
            Set setB = y2e0Var.d.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = setB.iterator();
            while (it.hasNext()) {
                jn60 jn60Var = (jn60) a.d(uc91Var.a).get((String) it.next());
                DismissedEntity dismissedEntity = jn60Var == null ? null : new DismissedEntity(jn60Var.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
                if (dismissedEntity != null) {
                    arrayList.add(dismissedEntity);
                }
            }
            Set setP1 = o7h.p1(arrayList);
            smc0 smc0VarN = k4p1.n();
            if (((Boolean) this.b).booleanValue()) {
                smc0VarN.add(new mvo(uc91Var.c));
            }
            smc0VarN.addAll(uc91Var.a);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            Set set = (Set) y2e0Var.i.a.getValue();
            x4e0 x4e0Var = uc91Var.f;
            if (x4e0Var == null) {
                x4e0Var = x4e0.c;
            }
            Event.GotSlotBasedHomeContent gotSlotBasedHomeContent = new Event.GotSlotBasedHomeContent(smc0VarK, setP1, set, x4e0Var, uc91Var.b, ((Boolean) this.e).booleanValue(), y2e0Var.f.a, uc91Var.e, uc91Var.d, uc91Var.g, uc91Var.c);
            p2e0Var.b = 1;
            Object objEmit = vr20Var.emit(gotSlotBasedHomeContent, p2e0Var);
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

    private final Object j(Object obj, lnm lnmVar) {
        String str = (String) obj;
        p811 p811Var = (p811) this.c;
        String str2 = (String) p811Var.a;
        p811Var.a = str;
        pqe0 oqe0Var = null;
        if (str2 != null) {
            if (str.length() == 0 && str2.length() > 0) {
                oqe0Var = pqe0.a;
            } else if (str.length() > 0 && !str.equals(str2)) {
                oqe0Var = new oqe0(str);
            }
        }
        rih1 rih1Var = rih1.a;
        if (oqe0Var == null) {
            return rih1Var;
        }
        if (((x8c0) this.d).b().a(w8c0.d)) {
            ((Consumer) this.e).accept(oqe0Var);
            return rih1Var;
        }
        ((p811) this.b).a = oqe0Var;
        return rih1Var;
    }

    private final Object k(Object obj, lnm lnmVar) {
        i091 i091Var = (i091) obj;
        l811 l811Var = (l811) this.e;
        lsm0 lsm0Var = (lsm0) this.d;
        p410 p410Var = (p410) this.c;
        rih1 rih1Var = rih1.a;
        if (i091Var == null) {
            p410Var.D();
            return rih1Var;
        }
        k091 k091Var = i091Var.h;
        lsm0 lsm0Var2 = i091Var.a;
        if (u890.j(lsm0Var2, lsm0Var)) {
            if (u890.j(k091Var, j091.a) || u890.j(k091Var, n091.a)) {
                l811Var.a = true;
            } else if (k091Var instanceof k091) {
                if (l811Var.a && u890.j(lsm0Var2, lsm0Var) && !k091Var.a.equals(f091.a)) {
                    p410Var.D();
                }
            }
            bpb1 bpb1Var = (bpb1) p410Var.g;
            String str = (String) this.b;
            o091 o091Var = i091Var.h;
            long j = i091Var.d;
            long j2 = i091Var.e;
            tah0 tah0Var = new tah0(str, o091Var, j, j2 > 10000 ? 10000L : j2);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, tah0Var);
            return rih1Var;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object b(k1r k1rVar, lnm lnmVar) {
        egh eghVar;
        agh aghVar;
        String str;
        agh aghVar2;
        mq70 mq70Var;
        p811 p811Var = (p811) this.e;
        jd6 jd6Var = (jd6) this.d;
        if (lnmVar instanceof egh) {
            eghVar = (egh) lnmVar;
            int i = eghVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eghVar.d = i - Integer.MIN_VALUE;
            } else {
                eghVar = new egh(this, lnmVar);
            }
        } else {
            eghVar = new egh(this, lnmVar);
        }
        Object obj = eghVar.b;
        int i2 = eghVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (k1rVar instanceof i1r) {
                aghVar = (agh) ((i1r) k1rVar).a;
            } else if (k1rVar instanceof h1r) {
                aghVar = new agh(k1rVar, null);
            } else {
                if (!(k1rVar instanceof j1r)) {
                    eg.o();
                    return null;
                }
                aghVar = new agh(j1r.a, null);
            }
            vr20 vr20Var = (vr20) this.c;
            Boolean boolValueOf = (Boolean) p811Var.a;
            i1r i1rVar = aghVar.a;
            if (i1rVar instanceof i1r) {
                kpm kpmVar = ((nqm) i1rVar.a).c;
                boolValueOf = Boolean.valueOf(kpmVar != null ? kpmVar.a : false);
            } else if (!(i1rVar instanceof j1r)) {
                if (!(i1rVar instanceof h1r)) {
                    eg.o();
                    return null;
                }
                boolValueOf = null;
            }
            xkk1 xkk1Var = aghVar.b;
            if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
                str = null;
            } else {
                up70 up70VarA = mq70Var.a(vp70.b);
                if (up70VarA == null || (str = up70VarA.a.a) == null) {
                    up70 up70VarA2 = mq70Var.a(vp70.c);
                    if (up70VarA2 != null) {
                        str = up70VarA2.a.a;
                    } else {
                        str = null;
                    }
                }
            }
            zfh zfhVar = new zfh(boolValueOf, str, ((vos0) jd6Var.f).b(o6p1.o((yfh) this.b)));
            eghVar.a = aghVar;
            eghVar.d = 1;
            Object objEmit = vr20Var.emit(zfhVar, eghVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
            aghVar2 = aghVar;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aghVar2 = eghVar.a;
            hm5.M(obj);
        }
        if (!(aghVar2.a instanceof j1r)) {
            p811Var.a = null;
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(lnm lnmVar) {
        x87 x87Var;
        Set set;
        AtomicReference atomicReference = (AtomicReference) this.c;
        if (lnmVar instanceof x87) {
            x87Var = (x87) lnmVar;
            int i = x87Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x87Var.d = i - Integer.MIN_VALUE;
            } else {
                x87Var = new x87(this, lnmVar);
            }
        } else {
            x87Var = new x87(this, lnmVar);
        }
        Object objB = x87Var.b;
        int i2 = x87Var.d;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            set = (Set) atomicReference.get();
            set.getClass();
            if (!set.isEmpty()) {
                sx3 sx3Var = ((y87) this.d).e;
                List listL1 = o7h.l1(set);
                x87Var.a = set;
                x87Var.d = 1;
                objB = sx3Var.b(listL1, x87Var);
                if (objB != obj) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set2 = x87Var.a;
            hm5.M(objB);
            return rih1Var;
        }
        set = x87Var.a;
        hm5.M(objB);
        Set set3 = (Set) objB;
        set.getClass();
        Set set4 = set;
        int iS = zno1.s(q7h.U(set4, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : set4) {
            linkedHashMap.put(obj2, Boolean.valueOf(set3.contains((String) obj2)));
        }
        ssw0 ssw0Var = (ssw0) this.e;
        Object objUpdateAndGet = ((AtomicReference) this.b).updateAndGet(new w87(linkedHashMap, atomicReference, (byte) 0));
        x87Var.a = null;
        x87Var.d = 2;
        return ssw0Var.b(objUpdateAndGet, x87Var) == obj ? obj : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0307  */
    /* JADX WARN: Code duplicated, block: B:193:0x0398  */
    /* JADX WARN: Code duplicated, block: B:242:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:262:0x0584  */
    /* JADX WARN: Code duplicated, block: B:299:0x0653  */
    /* JADX WARN: Code duplicated, block: B:336:0x072c  */
    /* JADX WARN: Code duplicated, block: B:373:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:390:0x084a  */
    /* JADX WARN: Code duplicated, block: B:420:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:430:0x0907  */
    /* JADX WARN: Code duplicated, block: B:475:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r1.emit(r0, r3) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07cc, code lost:
    
        if (r8.emit(r2, r5) == r7) goto L362;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r31, p.lnm r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u60.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ u60(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
