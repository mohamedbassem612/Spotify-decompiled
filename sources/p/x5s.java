package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters2;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
import spotify.your_library_tags_esperanto.proto.DecoratedClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x5s implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ x5s(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:159:0x0237  */
    /* JADX WARN: Code duplicated, block: B:176:0x0272  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:244:0x0368  */
    /* JADX WARN: Code duplicated, block: B:267:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:285:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:302:0x0439  */
    /* JADX WARN: Code duplicated, block: B:317:0x0474  */
    /* JADX WARN: Code duplicated, block: B:332:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:349:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:364:0x052c  */
    /* JADX WARN: Code duplicated, block: B:382:0x0572  */
    /* JADX WARN: Code duplicated, block: B:404:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:421:0x0627  */
    /* JADX WARN: Code duplicated, block: B:436:0x0668  */
    /* JADX WARN: Code duplicated, block: B:453:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:468:0x0701  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:491:0x079d  */
    /* JADX WARN: Code duplicated, block: B:516:0x081d  */
    /* JADX WARN: Code duplicated, block: B:540:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:572:0x0953  */
    /* JADX WARN: Code duplicated, block: B:592:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        w5s w5sVar;
        y5s y5sVar;
        d6s d6sVar;
        ee21 ee21Var;
        otl q5c0Var;
        String lowerCase;
        i6s i6sVar;
        j6s j6sVar;
        p6s p6sVar;
        h7s h7sVar;
        i7s i7sVar;
        las lasVar;
        cbs cbsVar;
        pes pesVar;
        yhs yhsVar;
        bis bisVar;
        cis cisVar;
        iks iksVar;
        bls blsVar;
        drs drsVar;
        r2t r2tVar;
        ets etsVar;
        Object ne61Var;
        gts gtsVar;
        Object af61Var;
        Object obj2;
        mxs mxsVar;
        vzs vzsVar;
        wzs wzsVar;
        xzs xzsVar;
        s0t s0tVar;
        u2t u2tVar;
        x2t x2tVar;
        o3t o3tVar;
        q3t q3tVar;
        r3t r3tVar;
        z8t z8tVar;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof w5s) {
                    w5sVar = (w5s) lnmVar;
                    int i2 = w5sVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        w5sVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        w5sVar = new w5s(this, lnmVar);
                    }
                } else {
                    w5sVar = new w5s(this, lnmVar);
                }
                Object obj3 = w5sVar.a;
                int i3 = w5sVar.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Collection collectionValues = ((Map) obj).values();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : collectionValues) {
                    tcd0 tcd0Var = ((ucd0) obj4).b;
                    if (tcd0Var != null && tcd0Var.c) {
                        arrayList.add(obj4);
                    }
                }
                List listA1 = o7h.a1(arrayList, new p0d((byte) 27));
                ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
                Iterator it = listA1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ucd0) it.next()).a);
                }
                w5sVar.b = 1;
                return vr20Var.emit(arrayList2, w5sVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof y5s) {
                    y5sVar = (y5s) lnmVar;
                    int i4 = y5sVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        y5sVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        y5sVar = new y5s(this, lnmVar);
                    }
                } else {
                    y5sVar = new y5s(this, lnmVar);
                }
                Object obj5 = y5sVar.a;
                int i5 = y5sVar.b;
                if (i5 == 0) {
                    hm5.M(obj5);
                    y5sVar.d = 0;
                    y5sVar.b = 1;
                    if (vr20Var.emit((List) obj, y5sVar) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = y5sVar.d;
                hm5.M(obj5);
                y5sVar.d = i;
                y5sVar.b = 2;
                if (hap1.i(500L, y5sVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 2:
                if (lnmVar instanceof d6s) {
                    d6sVar = (d6s) lnmVar;
                    int i6 = d6sVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        d6sVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        d6sVar = new d6s(this, lnmVar);
                    }
                } else {
                    d6sVar = new d6s(this, lnmVar);
                }
                Object obj6 = d6sVar.a;
                int i7 = d6sVar.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                h290<YourLibraryConfig$YourLibraryFilters2.AvailableFilter> h290VarN = ((YourLibraryResponse) obj).q().o().n();
                ArrayList arrayList3 = new ArrayList();
                for (YourLibraryConfig$YourLibraryFilters2.AvailableFilter availableFilter : h290VarN) {
                    availableFilter.getClass();
                    if (availableFilter.hasFilter()) {
                        int iOrdinal = availableFilter.o().ordinal();
                        z6x z6xVar = z6x.a;
                        if (iOrdinal != 23) {
                            switch (iOrdinal) {
                                case 1:
                                    q5c0Var = new y5c0(z6xVar);
                                    break;
                                case 2:
                                    q5c0Var = new z5c0(z6xVar);
                                    break;
                                case 3:
                                    q5c0Var = new g5c0(z6xVar);
                                    break;
                                case 4:
                                    q5c0Var = new y4c0(z6xVar);
                                    break;
                                case 5:
                                    q5c0Var = new e5c0(z6xVar);
                                    break;
                                case 6:
                                    q5c0Var = f5c0.b;
                                    break;
                                case 7:
                                    q5c0Var = new r5c0(z6xVar);
                                    break;
                                default:
                                    q5c0Var = null;
                                    break;
                            }
                        } else {
                            q5c0Var = new q5c0(z6xVar);
                        }
                        if (q5c0Var == null) {
                            ee21Var = null;
                        } else {
                            lsm1 lsm1VarO = availableFilter.o();
                            int iOrdinal2 = lsm1VarO.ordinal();
                            if (iOrdinal2 != 23) {
                                switch (iOrdinal2) {
                                    case 1:
                                        lowerCase = "Playlists";
                                        break;
                                    case 2:
                                        lowerCase = "Podcasts";
                                        break;
                                    case 3:
                                        lowerCase = "Audiobooks";
                                        break;
                                    case 4:
                                        lowerCase = "Albums";
                                        break;
                                    case 5:
                                        lowerCase = "Artists";
                                        break;
                                    case 6:
                                        lowerCase = "Authors";
                                        break;
                                    case 7:
                                        lowerCase = "Events";
                                        break;
                                    default:
                                        String strName = lsm1VarO.name();
                                        Locale locale = Locale.ROOT;
                                        lowerCase = strName.toLowerCase(locale);
                                        if (lowerCase.length() > 0) {
                                            lowerCase = ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
                                        }
                                        break;
                                }
                            } else {
                                lowerCase = "Downloaded";
                            }
                            ee21Var = new ee21(q5c0Var, lowerCase, availableFilter.getUri());
                        }
                    } else if (!availableFilter.p() || ihc1.y0(availableFilter.n())) {
                        ee21Var = null;
                    } else {
                        ee21Var = new ee21(new vod1(0, availableFilter.getUri(), availableFilter.n()), availableFilter.n(), availableFilter.getUri());
                    }
                    if (ee21Var != null) {
                        arrayList3.add(ee21Var);
                    }
                }
                d6sVar.b = 1;
                return vr20Var.emit(arrayList3, d6sVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof i6s) {
                    i6sVar = (i6s) lnmVar;
                    int i8 = i6sVar.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        i6sVar.b = i8 - Integer.MIN_VALUE;
                    } else {
                        i6sVar = new i6s(this, lnmVar);
                    }
                } else {
                    i6sVar = new i6s(this, lnmVar);
                }
                Object obj7 = i6sVar.a;
                int i9 = i6sVar.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : (List) obj) {
                    if (((ee21) obj8).a instanceof vod1) {
                        arrayList4.add(obj8);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((ee21) it2.next()).a.getId());
                }
                Set setP1 = o7h.p1(arrayList5);
                i6sVar.b = 1;
                return vr20Var.emit(setP1, i6sVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof j6s) {
                    j6sVar = (j6s) lnmVar;
                    int i10 = j6sVar.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        j6sVar.b = i10 - Integer.MIN_VALUE;
                    } else {
                        j6sVar = new j6s(this, lnmVar);
                    }
                } else {
                    j6sVar = new j6s(this, lnmVar);
                }
                Object obj9 = j6sVar.a;
                int i11 = j6sVar.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                h290<DecoratedClass> h290Var = ((jxm1) obj).a;
                ArrayList arrayList6 = new ArrayList(q7h.U(h290Var, 10));
                for (DecoratedClass decoratedClass : h290Var) {
                    h290<qar> h290VarP = decoratedClass.p();
                    ArrayList arrayList7 = new ArrayList(q7h.U(h290VarP, 10));
                    for (qar qarVar : h290VarP) {
                        arrayList7.add(new q620(qarVar.b(), qarVar.getTagName(), new Integer(qarVar.a())));
                    }
                    arrayList6.add(new yd20(decoratedClass.n(), new sg51(arrayList7)));
                }
                j6sVar.b = 1;
                return vr20Var.emit(arrayList6, j6sVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof p6s) {
                    p6sVar = (p6s) lnmVar;
                    int i12 = p6sVar.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        p6sVar.b = i12 - Integer.MIN_VALUE;
                    } else {
                        p6sVar = new p6s(this, lnmVar);
                    }
                } else {
                    p6sVar = new p6s(this, lnmVar);
                }
                Object obj10 = p6sVar.a;
                int i13 = p6sVar.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                eq3 eq3Var = new eq3(new etc0(new fqq0((as3) null, (dia1) null, (jf20) null, (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, bool, 255)));
                p6sVar.b = 1;
                return vr20Var.emit(eq3Var, p6sVar) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof h7s) {
                    h7sVar = (h7s) lnmVar;
                    int i14 = h7sVar.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        h7sVar.b = i14 - Integer.MIN_VALUE;
                    } else {
                        h7sVar = new h7s(this, lnmVar);
                    }
                } else {
                    h7sVar = new h7s(this, lnmVar);
                }
                Object obj11 = h7sVar.a;
                int i15 = h7sVar.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                Object objInvoke = zy00.g.invoke((iap0) obj);
                if (objInvoke == null) {
                    return rih1Var;
                }
                h7sVar.b = 1;
                return vr20Var.emit(objInvoke, h7sVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof i7s) {
                    i7sVar = (i7s) lnmVar;
                    int i16 = i7sVar.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        i7sVar.b = i16 - Integer.MIN_VALUE;
                    } else {
                        i7sVar = new i7s(this, lnmVar);
                    }
                } else {
                    i7sVar = new i7s(this, lnmVar);
                }
                Object obj12 = i7sVar.a;
                int i17 = i7sVar.b;
                if (i17 == 0) {
                    hm5.M(obj12);
                    List listJ0 = o7h.j0(((Map) obj).values());
                    i7sVar.b = 1;
                    return vr20Var.emit(listJ0, i7sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof las) {
                    lasVar = (las) lnmVar;
                    int i18 = lasVar.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        lasVar.b = i18 - Integer.MIN_VALUE;
                    } else {
                        lasVar = new las(this, lnmVar);
                    }
                } else {
                    lasVar = new las(this, lnmVar);
                }
                Object obj13 = lasVar.a;
                int i19 = lasVar.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (((Number) obj).intValue() == Integer.MAX_VALUE) {
                    return rih1Var;
                }
                lasVar.b = 1;
                return vr20Var.emit(obj, lasVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof cbs) {
                    cbsVar = (cbs) lnmVar;
                    int i20 = cbsVar.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        cbsVar.b = i20 - Integer.MIN_VALUE;
                    } else {
                        cbsVar = new cbs(this, lnmVar);
                    }
                } else {
                    cbsVar = new cbs(this, lnmVar);
                }
                Object obj14 = cbsVar.a;
                int i21 = cbsVar.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                h290<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> h290VarO = ((YourLibraryDecorateResponse) obj).o();
                int iS = zno1.s(q7h.U(h290VarO, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : h290VarO) {
                    linkedHashMap.put(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri(), Boolean.valueOf(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().u()));
                }
                cbsVar.b = 1;
                return vr20Var.emit(linkedHashMap, cbsVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof pes) {
                    pesVar = (pes) lnmVar;
                    int i22 = pesVar.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        pesVar.b = i22 - Integer.MIN_VALUE;
                    } else {
                        pesVar = new pes(this, lnmVar);
                    }
                } else {
                    pesVar = new pes(this, lnmVar);
                }
                Object obj15 = pesVar.a;
                int i23 = pesVar.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                Integer num = (Integer) ((cma1) obj).a;
                Integer num2 = new Integer(num != null ? num.intValue() : 0);
                pesVar.b = 1;
                return vr20Var.emit(num2, pesVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof yhs) {
                    yhsVar = (yhs) lnmVar;
                    int i24 = yhsVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        yhsVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        yhsVar = new yhs(this, lnmVar);
                    }
                } else {
                    yhsVar = new yhs(this, lnmVar);
                }
                Object obj16 = yhsVar.a;
                int i25 = yhsVar.b;
                if (i25 == 0) {
                    hm5.M(obj16);
                    Object objH = ((spq0) obj).h();
                    yhsVar.b = 1;
                    return vr20Var.emit(objH, yhsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof bis) {
                    bisVar = (bis) lnmVar;
                    int i26 = bisVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        bisVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        bisVar = new bis(this, lnmVar);
                    }
                } else {
                    bisVar = new bis(this, lnmVar);
                }
                Object obj17 = bisVar.a;
                int i27 = bisVar.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                if (((pp90) obj).h.b.e) {
                    return rih1Var;
                }
                bisVar.b = 1;
                return vr20Var.emit(obj, bisVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof cis) {
                    cisVar = (cis) lnmVar;
                    int i28 = cisVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        cisVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        cisVar = new cis(this, lnmVar);
                    }
                } else {
                    cisVar = new cis(this, lnmVar);
                }
                Object obj18 = cisVar.a;
                int i29 = cisVar.b;
                if (i29 == 0) {
                    hm5.M(obj18);
                    gp90 gp90Var = new gp90(((pp90) obj).b);
                    cisVar.b = 1;
                    return vr20Var.emit(gp90Var, cisVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof iks) {
                    iksVar = (iks) lnmVar;
                    int i30 = iksVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        iksVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        iksVar = new iks(this, lnmVar);
                    }
                } else {
                    iksVar = new iks(this, lnmVar);
                }
                Object obj19 = iksVar.a;
                int i31 = iksVar.b;
                if (i31 == 0) {
                    hm5.M(obj19);
                    List listB = ((bzc) obj).b();
                    iksVar.b = 1;
                    return vr20Var.emit(listB, iksVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof bls) {
                    blsVar = (bls) lnmVar;
                    int i32 = blsVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        blsVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        blsVar = new bls(this, lnmVar);
                    }
                } else {
                    blsVar = new bls(this, lnmVar);
                }
                Object obj20 = blsVar.a;
                int i33 = blsVar.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                blsVar.b = 1;
                return vr20Var.emit(obj, blsVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof drs) {
                    drsVar = (drs) lnmVar;
                    int i34 = drsVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        drsVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        drsVar = new drs(this, lnmVar);
                    }
                } else {
                    drsVar = new drs(this, lnmVar);
                }
                Object obj21 = drsVar.a;
                int i35 = drsVar.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                htl1 htl1Var = (htl1) obj;
                r2tVar = htl1Var != null ? htl1Var.a : null;
                drsVar.b = 1;
                return vr20Var.emit(r2tVar, drsVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof ets) {
                    etsVar = (ets) lnmVar;
                    int i36 = etsVar.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        etsVar.b = i36 - Integer.MIN_VALUE;
                    } else {
                        etsVar = new ets(this, lnmVar);
                    }
                } else {
                    etsVar = new ets(this, lnmVar);
                }
                Object obj22 = etsVar.a;
                int i37 = etsVar.b;
                if (i37 == 0) {
                    hm5.M(obj22);
                    gfg1 gfg1Var = (hfg1) obj;
                    if (gfg1Var instanceof gfg1) {
                        gfg1 gfg1Var2 = gfg1Var;
                        ne61Var = new qe61(gfg1Var2.b, gfg1Var2.a);
                    } else if (gfg1Var instanceof ffg1) {
                        ne61Var = new ne61(((ffg1) gfg1Var).a);
                    } else {
                        eg.o();
                    }
                    etsVar.b = 1;
                    return vr20Var.emit(ne61Var, etsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof gts) {
                    gtsVar = (gts) lnmVar;
                    int i38 = gtsVar.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        gtsVar.b = i38 - Integer.MIN_VALUE;
                    } else {
                        gtsVar = new gts(this, lnmVar);
                    }
                } else {
                    gtsVar = new gts(this, lnmVar);
                }
                Object obj23 = gtsVar.a;
                int i39 = gtsVar.b;
                if (i39 == 0) {
                    hm5.M(obj23);
                    u2e u2eVar = (w2e) obj;
                    if (u2eVar instanceof r2e) {
                        obj2 = me61.a;
                    } else {
                        if (u2eVar instanceof u2e) {
                            af61Var = new pe61(u2eVar.a);
                        } else if (u2eVar instanceof t2e) {
                            af61Var = new oe61(((t2e) u2eVar).a);
                        } else if (u2eVar instanceof v2e) {
                            af61Var = new bf61(((v2e) u2eVar).a);
                        } else if (u2eVar instanceof s2e) {
                            af61Var = new af61(((s2e) u2eVar).a);
                        } else {
                            eg.o();
                        }
                        obj2 = af61Var;
                    }
                    gtsVar.b = 1;
                    return vr20Var.emit(obj2, gtsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i39 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof mxs) {
                    mxsVar = (mxs) lnmVar;
                    int i40 = mxsVar.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        mxsVar.b = i40 - Integer.MIN_VALUE;
                    } else {
                        mxsVar = new mxs(this, lnmVar);
                    }
                } else {
                    mxsVar = new mxs(this, lnmVar);
                }
                Object obj24 = mxsVar.a;
                int i41 = mxsVar.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (!(obj instanceof re61)) {
                    return rih1Var;
                }
                mxsVar.b = 1;
                return vr20Var.emit(obj, mxsVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof vzs) {
                    vzsVar = (vzs) lnmVar;
                    int i42 = vzsVar.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        vzsVar.b = i42 - Integer.MIN_VALUE;
                    } else {
                        vzsVar = new vzs(this, lnmVar);
                    }
                } else {
                    vzsVar = new vzs(this, lnmVar);
                }
                Object obj25 = vzsVar.a;
                int i43 = vzsVar.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                f6w0 f6w0Var = (f6w0) obj;
                Boolean boolValueOf = Boolean.valueOf(!((f6w0Var != null ? f6w0Var.a : null) instanceof d6w0));
                vzsVar.b = 1;
                return vr20Var.emit(boolValueOf, vzsVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof wzs) {
                    wzsVar = (wzs) lnmVar;
                    int i44 = wzsVar.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        wzsVar.b = i44 - Integer.MIN_VALUE;
                    } else {
                        wzsVar = new wzs(this, lnmVar);
                    }
                } else {
                    wzsVar = new wzs(this, lnmVar);
                }
                Object obj26 = wzsVar.a;
                int i45 = wzsVar.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (((z7l) obj).c == null) {
                    return rih1Var;
                }
                wzsVar.b = 1;
                return vr20Var.emit(obj, wzsVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof xzs) {
                    xzsVar = (xzs) lnmVar;
                    int i46 = xzsVar.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        xzsVar.b = i46 - Integer.MIN_VALUE;
                    } else {
                        xzsVar = new xzs(this, lnmVar);
                    }
                } else {
                    xzsVar = new xzs(this, lnmVar);
                }
                Object obj27 = xzsVar.a;
                int i47 = xzsVar.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Double d = ((z7l) obj).c;
                d.getClass();
                xzsVar.b = 1;
                return vr20Var.emit(d, xzsVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof s0t) {
                    s0tVar = (s0t) lnmVar;
                    int i48 = s0tVar.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        s0tVar.b = i48 - Integer.MIN_VALUE;
                    } else {
                        s0tVar = new s0t(this, lnmVar);
                    }
                } else {
                    s0tVar = new s0t(this, lnmVar);
                }
                Object obj28 = s0tVar.a;
                int i49 = s0tVar.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                Boolean bool2 = (Boolean) ((cma1) obj).a;
                Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                s0tVar.b = 1;
                return vr20Var.emit(boolValueOf2, s0tVar) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof u2t) {
                    u2tVar = (u2t) lnmVar;
                    int i50 = u2tVar.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        u2tVar.b = i50 - Integer.MIN_VALUE;
                    } else {
                        u2tVar = new u2t(this, lnmVar);
                    }
                } else {
                    u2tVar = new u2t(this, lnmVar);
                }
                Object obj29 = u2tVar.a;
                int i51 = u2tVar.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                u2tVar.b = 1;
                return vr20Var.emit(obj, u2tVar) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof x2t) {
                    x2tVar = (x2t) lnmVar;
                    int i52 = x2tVar.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        x2tVar.b = i52 - Integer.MIN_VALUE;
                    } else {
                        x2tVar = new x2t(this, lnmVar);
                    }
                } else {
                    x2tVar = new x2t(this, lnmVar);
                }
                Object obj30 = x2tVar.a;
                int i53 = x2tVar.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                x2tVar.b = 1;
                return vr20Var.emit(obj, x2tVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof o3t) {
                    o3tVar = (o3t) lnmVar;
                    int i54 = o3tVar.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        o3tVar.b = i54 - Integer.MIN_VALUE;
                    } else {
                        o3tVar = new o3t(this, lnmVar);
                    }
                } else {
                    o3tVar = new o3t(this, lnmVar);
                }
                Object obj31 = o3tVar.a;
                int i55 = o3tVar.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                jn41 jn41Var = (ln41) obj;
                jn41 jn41Var2 = jn41Var instanceof jn41 ? jn41Var : null;
                r2tVar = jn41Var2 != null ? (r2t) jn41Var2.a : null;
                if (r2tVar == null) {
                    return rih1Var;
                }
                o3tVar.b = 1;
                return vr20Var.emit(r2tVar, o3tVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof q3t) {
                    q3tVar = (q3t) lnmVar;
                    int i56 = q3tVar.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        q3tVar.b = i56 - Integer.MIN_VALUE;
                    } else {
                        q3tVar = new q3t(this, lnmVar);
                    }
                } else {
                    q3tVar = new q3t(this, lnmVar);
                }
                Object obj32 = q3tVar.a;
                int i57 = q3tVar.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                jn41 jn41Var3 = (ln41) obj;
                jn41 jn41Var4 = jn41Var3 instanceof jn41 ? jn41Var3 : null;
                r2tVar = jn41Var4 != null ? (r2t) jn41Var4.a : null;
                if (r2tVar == null) {
                    return rih1Var;
                }
                q3tVar.b = 1;
                return vr20Var.emit(r2tVar, q3tVar) == d9nVar ? d9nVar : rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof r3t) {
                    r3tVar = (r3t) lnmVar;
                    int i58 = r3tVar.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        r3tVar.b = i58 - Integer.MIN_VALUE;
                    } else {
                        r3tVar = new r3t(this, lnmVar);
                    }
                } else {
                    r3tVar = new r3t(this, lnmVar);
                }
                Object obj33 = r3tVar.a;
                int i59 = r3tVar.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                jn41 jn41Var5 = (ln41) obj;
                jn41 jn41Var6 = jn41Var5 instanceof jn41 ? jn41Var5 : null;
                r2tVar = jn41Var6 != null ? (r2t) jn41Var6.a : null;
                if (r2tVar == null) {
                    return rih1Var;
                }
                r3tVar.b = 1;
                return vr20Var.emit(r2tVar, r3tVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof z8t) {
                    z8tVar = (z8t) lnmVar;
                    int i60 = z8tVar.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        z8tVar.b = i60 - Integer.MIN_VALUE;
                    } else {
                        z8tVar = new z8t(this, lnmVar);
                    }
                } else {
                    z8tVar = new z8t(this, lnmVar);
                }
                Object obj34 = z8tVar.a;
                int i61 = z8tVar.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                z8tVar.b = 1;
                return vr20Var.emit(objG, z8tVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
