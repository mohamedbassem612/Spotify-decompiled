package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.IsCuratedItem;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lpl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public lpl1(vr20 vr20Var, vbe1 vbe1Var) {
        this.a = (byte) 12;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        vsm1 vsm1Var;
        if (lnmVar instanceof vsm1) {
            vsm1Var = (vsm1) lnmVar;
            int i = vsm1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vsm1Var.b = i - Integer.MIN_VALUE;
            } else {
                vsm1Var = new vsm1(this, lnmVar);
            }
        } else {
            vsm1Var = new vsm1(this, lnmVar);
        }
        Object obj2 = vsm1Var.a;
        int i2 = vsm1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            h290<IsCuratedItem> h290VarQ = ((IsCuratedResponse) obj).q();
            int iS = zno1.s(q7h.U(h290VarQ, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (IsCuratedItem isCuratedItem : h290VarQ) {
                linkedHashMap.put(isCuratedItem.getUri(), Boolean.valueOf(isCuratedItem.getIsInCollection() | isCuratedItem.getIsCurated()));
            }
            vsm1Var.b = 1;
            Object objEmit = this.b.emit(linkedHashMap, vsm1Var);
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

    /* JADX WARN: Code duplicated, block: B:102:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x023d  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:187:0x033f  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:242:0x0405  */
    /* JADX WARN: Code duplicated, block: B:263:0x0451  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:287:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04df  */
    /* JADX WARN: Code duplicated, block: B:334:0x057e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0641  */
    /* JADX WARN: Code duplicated, block: B:401:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:449:0x0783  */
    /* JADX WARN: Code duplicated, block: B:468:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:483:0x080b  */
    /* JADX WARN: Code duplicated, block: B:498:0x0849  */
    /* JADX WARN: Code duplicated, block: B:517:0x088a  */
    /* JADX WARN: Code duplicated, block: B:532:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:547:0x0907  */
    /* JADX WARN: Code duplicated, block: B:563:0x0954  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:578:0x0992  */
    /* JADX WARN: Code duplicated, block: B:597:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:612:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object emit(Object obj, lnm lnmVar) {
        kpl1 kpl1Var;
        utl1 utl1Var;
        ywl1 ywl1Var;
        myl1 myl1Var;
        vyl1 vyl1Var;
        a2m1 a2m1Var;
        h2m1 h2m1Var;
        r4m1 r4m1Var;
        z4m1 z4m1Var;
        a5m1 a5m1Var;
        f5m1 f5m1Var;
        h3c h3cVar;
        Integer numValueOf;
        ro7 ro7Var;
        g5m1 g5m1Var;
        h5m1 h5m1Var;
        b5m1 b5m1Var;
        String str;
        z6x z6xVar;
        t5m1 t5m1Var;
        c6m1 c6m1Var;
        v7m1 v7m1Var;
        y7m1 y7m1Var;
        a8m1 a8m1Var;
        String str2;
        int i;
        zuc0 zuc0Var;
        g8m1 g8m1Var;
        j8m1 j8m1Var;
        cbm1 cbm1Var;
        dbm1 dbm1Var;
        ygm1 ygm1Var;
        hlm1 hlm1Var;
        jmm1 jmm1Var;
        dpm1 dpm1Var;
        epm1 epm1Var;
        gpm1 gpm1Var;
        wsm1 wsm1Var;
        byte b = this.a;
        i9d0 i9d0Var = i9d0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        wsc0 wsc0VarA = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof kpl1) {
                    kpl1Var = (kpl1) lnmVar;
                    int i2 = kpl1Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kpl1Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        kpl1Var = new kpl1(this, lnmVar);
                    }
                } else {
                    kpl1Var = new kpl1(this, lnmVar);
                }
                Object obj2 = kpl1Var.a;
                int i3 = kpl1Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().c() || l4o1.E((ContextTrack) playerState.track().b())) {
                    return rih1Var;
                }
                kpl1Var.b = 1;
                return vr20Var.emit(obj, kpl1Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof utl1) {
                    utl1Var = (utl1) lnmVar;
                    int i4 = utl1Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        utl1Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        utl1Var = new utl1(this, lnmVar);
                    }
                } else {
                    utl1Var = new utl1(this, lnmVar);
                }
                Object obj3 = utl1Var.a;
                int i5 = utl1Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    py21 py21VarA = ((py21) obj).a(lcl1.S0);
                    utl1Var.b = 1;
                    return vr20Var.emit(py21VarA, utl1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof ywl1) {
                    ywl1Var = (ywl1) lnmVar;
                    int i6 = ywl1Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ywl1Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        ywl1Var = new ywl1(this, lnmVar);
                    }
                } else {
                    ywl1Var = new ywl1(this, lnmVar);
                }
                Object obj4 = ywl1Var.a;
                int i7 = ywl1Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                uwl1 uwl1Var = (uwl1) o7h.s0((List) obj);
                wsc0VarA = uwl1Var != null ? uwl1Var.a() : null;
                ywl1Var.b = 1;
                return vr20Var.emit(wsc0VarA, ywl1Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof myl1) {
                    myl1Var = (myl1) lnmVar;
                    int i8 = myl1Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        myl1Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        myl1Var = new myl1(this, lnmVar);
                    }
                } else {
                    myl1Var = new myl1(this, lnmVar);
                }
                Object obj5 = myl1Var.a;
                int i9 = myl1Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf = Boolean.valueOf(((czl1) obj).a);
                    myl1Var.b = 1;
                    return vr20Var.emit(boolValueOf, myl1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof vyl1) {
                    vyl1Var = (vyl1) lnmVar;
                    int i10 = vyl1Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        vyl1Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        vyl1Var = new vyl1(this, lnmVar);
                    }
                } else {
                    vyl1Var = new vyl1(this, lnmVar);
                }
                Object obj6 = vyl1Var.a;
                int i11 = vyl1Var.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    Boolean boolValueOf2 = Boolean.valueOf(u890.j(((cxc0) obj).f.q.get("workout.open_settings"), "true"));
                    vyl1Var.b = 1;
                    return vr20Var.emit(boolValueOf2, vyl1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof a2m1) {
                    a2m1Var = (a2m1) lnmVar;
                    int i12 = a2m1Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        a2m1Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        a2m1Var = new a2m1(this, lnmVar);
                    }
                } else {
                    a2m1Var = new a2m1(this, lnmVar);
                }
                Object obj7 = a2m1Var.a;
                int i13 = a2m1Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    o4m1 o4m1VarC = j1e1.C((d4m1) obj);
                    a2m1Var.b = 1;
                    return vr20Var.emit(o4m1VarC, a2m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof h2m1) {
                    h2m1Var = (h2m1) lnmVar;
                    int i14 = h2m1Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        h2m1Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        h2m1Var = new h2m1(this, lnmVar);
                    }
                } else {
                    h2m1Var = new h2m1(this, lnmVar);
                }
                Object obj8 = h2m1Var.a;
                int i15 = h2m1Var.b;
                if (i15 == 0) {
                    hm5.M(obj8);
                    n3m1 n3m1Var = new n3m1(((Boolean) obj).booleanValue());
                    h2m1Var.b = 1;
                    return vr20Var.emit(n3m1Var, h2m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof r4m1) {
                    r4m1Var = (r4m1) lnmVar;
                    int i16 = r4m1Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        r4m1Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        r4m1Var = new r4m1(this, lnmVar);
                    }
                } else {
                    r4m1Var = new r4m1(this, lnmVar);
                }
                Object obj9 = r4m1Var.a;
                int i17 = r4m1Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                w7x w7xVar = (Set) ((cma1) obj).a;
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                r4m1Var.b = 1;
                return vr20Var.emit(w7xVar, r4m1Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof z4m1) {
                    z4m1Var = (z4m1) lnmVar;
                    int i18 = z4m1Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        z4m1Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        z4m1Var = new z4m1(this, lnmVar);
                    }
                } else {
                    z4m1Var = new z4m1(this, lnmVar);
                }
                Object obj10 = z4m1Var.a;
                int i19 = z4m1Var.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf3 = Boolean.valueOf(((czl1) obj).a);
                    z4m1Var.b = 1;
                    return vr20Var.emit(boolValueOf3, z4m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof a5m1) {
                    a5m1Var = (a5m1) lnmVar;
                    int i20 = a5m1Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        a5m1Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        a5m1Var = new a5m1(this, lnmVar);
                    }
                } else {
                    a5m1Var = new a5m1(this, lnmVar);
                }
                Object obj11 = a5m1Var.a;
                int i21 = a5m1Var.b;
                if (i21 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf4 = Boolean.valueOf(((czl1) obj).a);
                    a5m1Var.b = 1;
                    return vr20Var.emit(boolValueOf4, a5m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof f5m1) {
                    f5m1Var = (f5m1) lnmVar;
                    int i22 = f5m1Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        f5m1Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        f5m1Var = new f5m1(this, lnmVar);
                    }
                } else {
                    f5m1Var = new f5m1(this, lnmVar);
                }
                Object obj12 = f5m1Var.a;
                int i23 = f5m1Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                ArrayList<i1r> arrayList = new ArrayList();
                for (i1r i1rVar : (List) obj) {
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    k1r k1rVar = i1rVar2 != null ? (k1r) i1rVar2.a : null;
                    if (k1rVar != null) {
                        arrayList.add(k1rVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    h3cVar = i3c.a;
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            h1r h1rVar = (k1r) it.next();
                            if ((h1rVar instanceof i1r) || ((h1rVar instanceof h1r) && !(h1rVar.a instanceof vyq))) {
                                ArrayList arrayList2 = new ArrayList();
                                for (i1r i1rVar3 : arrayList) {
                                    i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                                    if (i1rVar4 == null || (ro7Var = (ro7) i1rVar4.a) == null) {
                                        numValueOf = null;
                                    } else {
                                        double d = ro7Var.a;
                                        if (Math.abs(d) <= Double.MAX_VALUE) {
                                            int iS = jch0.S(d);
                                            numValueOf = Integer.valueOf(iS);
                                            if (1 > iS || iS >= 1000) {
                                                numValueOf = null;
                                            }
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (numValueOf != null) {
                                        arrayList2.add(numValueOf);
                                    }
                                }
                                h3cVar = new h3c(arrayList2.isEmpty() ? null : new s2c(((Number) o7h.I0(arrayList2)).intValue(), ((Number) o7h.F0(arrayList2)).intValue()));
                            }
                        } else {
                            h3cVar = i3c.a;
                        }
                    }
                }
                f5m1Var.b = 1;
                return vr20Var.emit(h3cVar, f5m1Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof g5m1) {
                    g5m1Var = (g5m1) lnmVar;
                    int i24 = g5m1Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        g5m1Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        g5m1Var = new g5m1(this, lnmVar);
                    }
                } else {
                    g5m1Var = new g5m1(this, lnmVar);
                }
                Object obj13 = g5m1Var.a;
                int i25 = g5m1Var.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                List list = ((m7e0) obj).b;
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((l7e0) it2.next()).getUri());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj14 : arrayList3) {
                    Set set = s4b1.f;
                    if (uic.x((String) obj14).c == blc0.ti) {
                        arrayList4.add(obj14);
                    }
                }
                List listJ0 = o7h.j0(arrayList4);
                g5m1Var.b = 1;
                return vr20Var.emit(listJ0, g5m1Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof h5m1) {
                    h5m1Var = (h5m1) lnmVar;
                    int i26 = h5m1Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        h5m1Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        h5m1Var = new h5m1(this, lnmVar);
                    }
                } else {
                    h5m1Var = new h5m1(this, lnmVar);
                }
                Object obj15 = h5m1Var.a;
                int i27 = h5m1Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                Map map = ((cxc0) obj).f.q;
                String str3 = (String) map.get("prompt_with_markup");
                if (str3 == null) {
                    str3 = (String) map.get("prompt");
                }
                if (str3 == null || ihc1.y0(str3)) {
                    b5m1Var = new b5m1(15, (Integer) null, (String) null, (List) null);
                } else {
                    smc0 smc0VarH = xpv0.h(str3);
                    int iS2 = zno1.s(q7h.U(smc0VarH, 10));
                    if (iS2 < 16) {
                        iS2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS2);
                    rmc0 rmc0VarListIterator = smc0VarH.listIterator(0);
                    while (true) {
                        rmc0 rmc0Var = rmc0VarListIterator;
                        if (rmc0Var.hasNext()) {
                            Object next = rmc0Var.next();
                            linkedHashMap.put(((wwx0) next).a, next);
                        } else {
                            wwx0 wwx0Var = (wwx0) linkedHashMap.get("intensity");
                            if (wwx0Var == null) {
                                wwx0Var = (wwx0) linkedHashMap.get("target_bpm");
                            }
                            wwx0 wwx0Var2 = (wwx0) linkedHashMap.get("duration");
                            Integer numC0 = wwx0Var2 != null ? nhc1.c0(wwx0Var2.b) : null;
                            if (wwx0Var != null) {
                                str = wwx0Var.f;
                                if (ihc1.y0(str)) {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            wwx0 wwx0Var3 = (wwx0) linkedHashMap.get("genre");
                            if (wwx0Var3 == null) {
                                z6xVar = z6x.a;
                            } else {
                                String str4 = wwx0Var3.d;
                                wsc0VarA = str4 != null ? nju.d(str4) : null;
                                if (wsc0VarA == null) {
                                    wsc0VarA = b7x.a;
                                }
                                List listQ0 = ihc1.Q0(wwx0Var3.b, new String[]{","}, 0, 6);
                                ArrayList arrayList5 = new ArrayList(q7h.U(listQ0, 10));
                                Iterator it3 = listQ0.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(ihc1.e1((String) it3.next()).toString());
                                }
                                ArrayList<String> arrayList6 = new ArrayList();
                                for (Object obj16 : arrayList5) {
                                    if (((String) obj16).length() > 0) {
                                        arrayList6.add(obj16);
                                    }
                                }
                                z6x arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                                for (String str5 : arrayList6) {
                                    String str6 = (String) wsc0VarA.get(str5);
                                    if (str6 != null) {
                                        str5 = str6;
                                    }
                                    arrayList7.add(str5);
                                }
                                z6xVar = arrayList7;
                            }
                            b5m1Var = new b5m1(4, numC0, str, (List) z6xVar);
                        }
                    }
                }
                h5m1Var.b = 1;
                return vr20Var.emit(b5m1Var, h5m1Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof t5m1) {
                    t5m1Var = (t5m1) lnmVar;
                    int i28 = t5m1Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        t5m1Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        t5m1Var = new t5m1(this, lnmVar);
                    }
                } else {
                    t5m1Var = new t5m1(this, lnmVar);
                }
                Object obj17 = t5m1Var.a;
                int i29 = t5m1Var.b;
                if (i29 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf5 = Boolean.valueOf(((czl1) obj).a);
                    t5m1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, t5m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof c6m1) {
                    c6m1Var = (c6m1) lnmVar;
                    int i30 = c6m1Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        c6m1Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        c6m1Var = new c6m1(this, lnmVar);
                    }
                } else {
                    c6m1Var = new c6m1(this, lnmVar);
                }
                Object obj18 = c6m1Var.a;
                int i31 = c6m1Var.b;
                if (i31 == 0) {
                    hm5.M(obj18);
                    oy21 oy21Var = (py21) obj;
                    if (oy21Var instanceof oy21) {
                        wsc0VarA = (wsc0) oy21Var.a;
                    } else if (!(oy21Var instanceof ly21)) {
                        eg.o();
                    }
                    if (wsc0VarA == null) {
                        return rih1Var;
                    }
                    c6m1Var.b = 1;
                    return vr20Var.emit(wsc0VarA, c6m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof v7m1) {
                    v7m1Var = (v7m1) lnmVar;
                    int i32 = v7m1Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        v7m1Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        v7m1Var = new v7m1(this, lnmVar);
                    }
                } else {
                    v7m1Var = new v7m1(this, lnmVar);
                }
                Object obj19 = v7m1Var.a;
                int i33 = v7m1Var.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                x7m1 x7m1Var = (x7m1) obj;
                Boolean boolValueOf6 = Boolean.valueOf(x7m1Var.a || !x7m1Var.b.isEmpty());
                v7m1Var.b = 1;
                return vr20Var.emit(boolValueOf6, v7m1Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof y7m1) {
                    y7m1Var = (y7m1) lnmVar;
                    int i34 = y7m1Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        y7m1Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        y7m1Var = new y7m1(this, lnmVar);
                    }
                } else {
                    y7m1Var = new y7m1(this, lnmVar);
                }
                Object obj20 = y7m1Var.a;
                int i35 = y7m1Var.b;
                if (i35 == 0) {
                    hm5.M(obj20);
                    Map map2 = ((cxc0) obj).f.q;
                    y7m1Var.b = 1;
                    return vr20Var.emit(map2, y7m1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i35 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof a8m1) {
                    a8m1Var = (a8m1) lnmVar;
                    int i36 = a8m1Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        a8m1Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        a8m1Var = new a8m1(this, lnmVar);
                    }
                } else {
                    a8m1Var = new a8m1(this, lnmVar);
                }
                Object obj21 = a8m1Var.a;
                int i37 = a8m1Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                List list2 = ((m7e0) obj).b;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    i = 1;
                } else {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            j7e0 j7e0Var = (l7e0) it4.next();
                            j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                            Map map3 = (j7e0Var2 == null || (zuc0Var = j7e0Var2.a) == null) ? null : zuc0Var.g;
                            if (map3 != null && (str2 = (String) map3.get("recsplanation")) != null) {
                                i = 1;
                                if (!ihc1.y0(str2)) {
                                    z = true;
                                }
                            }
                        } else {
                            i = 1;
                        }
                    }
                }
                Boolean boolValueOf7 = Boolean.valueOf(z);
                a8m1Var.b = i;
                return vr20Var.emit(boolValueOf7, a8m1Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof g8m1) {
                    g8m1Var = (g8m1) lnmVar;
                    int i38 = g8m1Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        g8m1Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        g8m1Var = new g8m1(this, lnmVar);
                    }
                } else {
                    g8m1Var = new g8m1(this, lnmVar);
                }
                Object obj22 = g8m1Var.a;
                int i39 = g8m1Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (!u890.j((p9l1) obj, o9l1.a)) {
                    return rih1Var;
                }
                g8m1Var.b = 1;
                return vr20Var.emit(obj, g8m1Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof j8m1) {
                    j8m1Var = (j8m1) lnmVar;
                    int i40 = j8m1Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        j8m1Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        j8m1Var = new j8m1(this, lnmVar);
                    }
                } else {
                    j8m1Var = new j8m1(this, lnmVar);
                }
                Object obj23 = j8m1Var.a;
                int i41 = j8m1Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                k8m1 k8m1Var = (k8m1) obj;
                n1i n1iVar = k8m1Var.b;
                n1i n1iVar2 = k8m1Var.a;
                n1i n1iVar3 = n1i.d;
                if ((n1iVar != n1iVar3 || n1iVar == n1iVar2) && (n1iVar2 != n1iVar3 || n1iVar2 == n1iVar)) {
                    return rih1Var;
                }
                j8m1Var.b = 1;
                return vr20Var.emit(obj, j8m1Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof cbm1) {
                    cbm1Var = (cbm1) lnmVar;
                    int i42 = cbm1Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        cbm1Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        cbm1Var = new cbm1(this, lnmVar);
                    }
                } else {
                    cbm1Var = new cbm1(this, lnmVar);
                }
                Object obj24 = cbm1Var.a;
                int i43 = cbm1Var.b;
                if (i43 == 0) {
                    hm5.M(obj24);
                    Object objB = ((spq0) obj).b();
                    cbm1Var.b = 1;
                    return vr20Var.emit(objB, cbm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof dbm1) {
                    dbm1Var = (dbm1) lnmVar;
                    int i44 = dbm1Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        dbm1Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        dbm1Var = new dbm1(this, lnmVar);
                    }
                } else {
                    dbm1Var = new dbm1(this, lnmVar);
                }
                Object obj25 = dbm1Var.a;
                int i45 = dbm1Var.b;
                if (i45 == 0) {
                    hm5.M(obj25);
                    zam1 zam1Var = new zam1((eww0) obj);
                    dbm1Var.b = 1;
                    return vr20Var.emit(zam1Var, dbm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof ygm1) {
                    ygm1Var = (ygm1) lnmVar;
                    int i46 = ygm1Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        ygm1Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        ygm1Var = new ygm1(this, lnmVar);
                    }
                } else {
                    ygm1Var = new ygm1(this, lnmVar);
                }
                Object obj26 = ygm1Var.a;
                int i47 = ygm1Var.b;
                if (i47 == 0) {
                    hm5.M(obj26);
                    ygm1Var.b = 1;
                    return vr20Var.emit(iam1.a, ygm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof hlm1) {
                    hlm1Var = (hlm1) lnmVar;
                    int i48 = hlm1Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hlm1Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        hlm1Var = new hlm1(this, lnmVar);
                    }
                } else {
                    hlm1Var = new hlm1(this, lnmVar);
                }
                Object obj27 = hlm1Var.a;
                int i49 = hlm1Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                kmm1 kmm1Var = (kmm1) obj;
                blm1 blm1Var = new blm1(kmm1Var.n, kmm1Var.o, kmm1Var.f26p, kmm1Var.c, kmm1Var.a, kmm1Var.b, kmm1Var.d, kmm1Var.e, kmm1Var.f, kmm1Var.g);
                hlm1Var.b = 1;
                return vr20Var.emit(blm1Var, hlm1Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof jmm1) {
                    jmm1Var = (jmm1) lnmVar;
                    int i50 = jmm1Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        jmm1Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        jmm1Var = new jmm1(this, lnmVar);
                    }
                } else {
                    jmm1Var = new jmm1(this, lnmVar);
                }
                Object obj28 = jmm1Var.a;
                int i51 = jmm1Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                kmm1 kmm1Var2 = (kmm1) obj;
                xlm1 xlm1Var = new xlm1(kmm1Var2.n, kmm1Var2.a, kmm1Var2.b, kmm1Var2.h, kmm1Var2.c, kmm1Var2.i, kmm1Var2.j, kmm1Var2.d, kmm1Var2.e, kmm1Var2.f, kmm1Var2.g, kmm1Var2.k, kmm1Var2.l, kmm1Var2.m, kmm1Var2.f26p);
                jmm1Var.b = 1;
                return vr20Var.emit(xlm1Var, jmm1Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof dpm1) {
                    dpm1Var = (dpm1) lnmVar;
                    int i52 = dpm1Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        dpm1Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        dpm1Var = new dpm1(this, lnmVar);
                    }
                } else {
                    dpm1Var = new dpm1(this, lnmVar);
                }
                Object obj29 = dpm1Var.a;
                int i53 = dpm1Var.b;
                if (i53 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf8 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    dpm1Var.b = 1;
                    return vr20Var.emit(boolValueOf8, dpm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof epm1) {
                    epm1Var = (epm1) lnmVar;
                    int i54 = epm1Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        epm1Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        epm1Var = new epm1(this, lnmVar);
                    }
                } else {
                    epm1Var = new epm1(this, lnmVar);
                }
                Object obj30 = epm1Var.a;
                int i55 = epm1Var.b;
                if (i55 == 0) {
                    hm5.M(obj30);
                    Boolean boolValueOf9 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    epm1Var.b = 1;
                    return vr20Var.emit(boolValueOf9, epm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof gpm1) {
                    gpm1Var = (gpm1) lnmVar;
                    int i56 = gpm1Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        gpm1Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        gpm1Var = new gpm1(this, lnmVar);
                    }
                } else {
                    gpm1Var = new gpm1(this, lnmVar);
                }
                Object obj31 = gpm1Var.a;
                int i57 = gpm1Var.b;
                if (i57 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf10 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    gpm1Var.b = 1;
                    return vr20Var.emit(boolValueOf10, gpm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof wsm1) {
                    wsm1Var = (wsm1) lnmVar;
                    int i58 = wsm1Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        wsm1Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        wsm1Var = new wsm1(this, lnmVar);
                    }
                } else {
                    wsm1Var = new wsm1(this, lnmVar);
                }
                Object obj32 = wsm1Var.a;
                int i59 = wsm1Var.b;
                if (i59 == 0) {
                    hm5.M(obj32);
                    fio fioVar = new fio((Map) obj);
                    wsm1Var.b = 1;
                    return vr20Var.emit(fioVar, wsm1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i59 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ lpl1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
