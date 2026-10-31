package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vnb implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ vnb(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0225  */
    /* JADX WARN: Code duplicated, block: B:158:0x0289  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:192:0x030b  */
    /* JADX WARN: Code duplicated, block: B:226:0x038d  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x0409  */
    /* JADX WARN: Code duplicated, block: B:271:0x044b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0490  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:326:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:369:0x0570  */
    /* JADX WARN: Code duplicated, block: B:407:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:409:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:416:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:439:0x0634  */
    /* JADX WARN: Code duplicated, block: B:463:0x068d  */
    /* JADX WARN: Code duplicated, block: B:478:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:493:0x0708  */
    /* JADX WARN: Code duplicated, block: B:513:0x0756  */
    /* JADX WARN: Code duplicated, block: B:528:0x0796  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:545:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:571:0x083a  */
    /* JADX WARN: Code duplicated, block: B:588:0x0877  */
    /* JADX WARN: Code duplicated, block: B:605:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:620:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:638:0x0931  */
    /* JADX WARN: Code duplicated, block: B:653:0x096c  */
    /* JADX WARN: Code duplicated, block: B:739:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object emit(Object obj, lnm lnmVar) {
        unb unbVar;
        tnb tnbVar;
        w281 w281Var;
        j281 j281Var;
        xrb xrbVar;
        isb isbVar;
        ksb ksbVar;
        e4c e4cVar;
        i4c i4cVar;
        y4c y4cVar;
        c7c c7cVar;
        lec lecVar;
        nec necVar;
        umc umcVar;
        soc socVar;
        cuc cucVar;
        duc ducVar;
        fuc fucVarB;
        s8d s8dVar;
        t8d t8dVar;
        y8d y8dVar;
        ibd ibdVar;
        jbd jbdVar;
        qed qedVar;
        red redVar;
        bkd bkdVar;
        jkd jkdVar;
        rpd rpdVar;
        List listSingletonList;
        upd updVar;
        vpd vpdVar;
        xpd xpdVar;
        nud nudVar;
        aud ytdVar;
        mwd mwdVar;
        u3e u3eVar;
        byte b = this.a;
        zpd zpdVar = zpd.e;
        int i = 0;
        i = 0;
        int i2 = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        p1fVar = null;
        p1fVar = null;
        p1fVar = null;
        p1fVar = null;
        p1fVar = null;
        p1fVar = null;
        p1f p1fVar = null;
        lueVar = null;
        lueVar = null;
        lueVar = null;
        Object lueVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof unb) {
                    unbVar = (unb) lnmVar;
                    int i3 = unbVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        unbVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        unbVar = new unb(this, lnmVar);
                    }
                } else {
                    unbVar = new unb(this, lnmVar);
                }
                Object obj2 = unbVar.a;
                int i4 = unbVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                i1r i1rVar = (k1r) obj;
                if (!(i1rVar instanceof i1r) || (w281Var = (w281) i1rVar.a) == null || (j281Var = w281Var.f) == null) {
                    tnbVar = new tnb();
                } else {
                    s281 s281Var = j281Var.b;
                    String str = s281Var.c;
                    double d = s281Var.a;
                    s281 s281Var2 = j281Var.a;
                    tnbVar = new tnb(s281Var2.c, d > s281Var2.a ? str : null, true);
                }
                unbVar.b = 1;
                return vr20Var.emit(tnbVar, unbVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof xrb) {
                    xrbVar = (xrb) lnmVar;
                    int i5 = xrbVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        xrbVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        xrbVar = new xrb(this, lnmVar);
                    }
                } else {
                    xrbVar = new xrb(this, lnmVar);
                }
                Object obj3 = xrbVar.a;
                int i6 = xrbVar.b;
                if (i6 == 0) {
                    hm5.M(obj3);
                    LinkedHashMap linkedHashMapA = msb.a((List) obj);
                    xrbVar.b = 1;
                    return vr20Var.emit(linkedHashMapA, xrbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof isb) {
                    isbVar = (isb) lnmVar;
                    int i7 = isbVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        isbVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        isbVar = new isb(this, lnmVar);
                    }
                } else {
                    isbVar = new isb(this, lnmVar);
                }
                Object obj4 = isbVar.a;
                int i8 = isbVar.b;
                if (i8 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((qsb) obj).a() != null);
                    isbVar.b = 1;
                    return vr20Var.emit(boolValueOf, isbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof ksb) {
                    ksbVar = (ksb) lnmVar;
                    int i9 = ksbVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ksbVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        ksbVar = new ksb(this, lnmVar);
                    }
                } else {
                    ksbVar = new ksb(this, lnmVar);
                }
                Object obj5 = ksbVar.a;
                int i10 = ksbVar.b;
                if (i10 == 0) {
                    hm5.M(obj5);
                    LinkedHashMap linkedHashMapA2 = msb.a((List) obj);
                    ksbVar.b = 1;
                    return vr20Var.emit(linkedHashMapA2, ksbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof e4c) {
                    e4cVar = (e4c) lnmVar;
                    int i11 = e4cVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        e4cVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        e4cVar = new e4c(this, lnmVar);
                    }
                } else {
                    e4cVar = new e4c(this, lnmVar);
                }
                Object obj6 = e4cVar.a;
                int i12 = e4cVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                e4cVar.b = 1;
                return vr20Var.emit(obj, e4cVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof i4c) {
                    i4cVar = (i4c) lnmVar;
                    int i13 = i4cVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i4cVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        i4cVar = new i4c(this, lnmVar);
                    }
                } else {
                    i4cVar = new i4c(this, lnmVar);
                }
                Object obj7 = i4cVar.a;
                int i14 = i4cVar.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                i4cVar.b = 1;
                return vr20Var.emit(obj, i4cVar) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof y4c) {
                    y4cVar = (y4c) lnmVar;
                    int i15 = y4cVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        y4cVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        y4cVar = new y4c(this, lnmVar);
                    }
                } else {
                    y4cVar = new y4c(this, lnmVar);
                }
                Object obj8 = y4cVar.a;
                int i16 = y4cVar.b;
                if (i16 == 0) {
                    hm5.M(obj8);
                    oy21 oy21Var = (py21) obj;
                    if (!(oy21Var instanceof ly21)) {
                        if (oy21Var instanceof oy21) {
                            wsc0 wsc0Var = (wsc0) oy21Var.a;
                            if (!u890.j(wsc0Var.f.q.get("status_code"), "204") && wsc0Var.e.isEmpty()) {
                                return rih1Var;
                            }
                        } else {
                            eg.o();
                        }
                    }
                    y4cVar.b = 1;
                    return vr20Var.emit(obj, y4cVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof c7c) {
                    c7cVar = (c7c) lnmVar;
                    int i17 = c7cVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c7cVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        c7cVar = new c7c(this, lnmVar);
                    }
                } else {
                    c7cVar = new c7c(this, lnmVar);
                }
                Object obj9 = c7cVar.a;
                int i18 = c7cVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                c7cVar.b = 1;
                return vr20Var.emit(obj, c7cVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof lec) {
                    lecVar = (lec) lnmVar;
                    int i19 = lecVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        lecVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        lecVar = new lec(this, lnmVar);
                    }
                } else {
                    lecVar = new lec(this, lnmVar);
                }
                Object obj10 = lecVar.a;
                int i20 = lecVar.b;
                if (i20 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    lecVar.b = 1;
                    return vr20Var.emit(boolValueOf2, lecVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof nec) {
                    necVar = (nec) lnmVar;
                    int i21 = necVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        necVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        necVar = new nec(this, lnmVar);
                    }
                } else {
                    necVar = new nec(this, lnmVar);
                }
                Object obj11 = necVar.a;
                int i22 = necVar.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity = (YourLibraryContainsResponseEntity) o7h.s0(((YourLibraryContainsResponse) obj).o());
                if (yourLibraryContainsResponseEntity != null && !yourLibraryContainsResponseEntity.o()) {
                    z2 = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                necVar.b = 1;
                return vr20Var.emit(boolValueOf3, necVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof umc) {
                    umcVar = (umc) lnmVar;
                    int i23 = umcVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        umcVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        umcVar = new umc(this, lnmVar);
                    }
                } else {
                    umcVar = new umc(this, lnmVar);
                }
                Object obj12 = umcVar.a;
                int i24 = umcVar.b;
                if (i24 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf4 = Boolean.valueOf(y7y0.L((Map) obj));
                    umcVar.b = 1;
                    return vr20Var.emit(boolValueOf4, umcVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof soc) {
                    socVar = (soc) lnmVar;
                    int i25 = socVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        socVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        socVar = new soc(this, lnmVar);
                    }
                } else {
                    socVar = new soc(this, lnmVar);
                }
                Object obj13 = socVar.a;
                int i26 = socVar.b;
                if (i26 == 0) {
                    hm5.M(obj13);
                    moc mocVar = new moc((List) obj);
                    socVar.b = 1;
                    return vr20Var.emit(mocVar, socVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof cuc) {
                    cucVar = (cuc) lnmVar;
                    int i27 = cucVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        cucVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        cucVar = new cuc(this, lnmVar);
                    }
                } else {
                    cucVar = new cuc(this, lnmVar);
                }
                Object obj14 = cucVar.a;
                int i28 = cucVar.b;
                if (i28 == 0) {
                    hm5.M(obj14);
                    oy21 oy21Var2 = (py21) obj;
                    if (oy21Var2 instanceof oy21) {
                        if (((wsc0) oy21Var2.a).e.size() >= 5) {
                            z = true;
                        }
                    } else if (!(oy21Var2 instanceof ly21)) {
                        eg.o();
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    cucVar.b = 1;
                    return vr20Var.emit(boolValueOf5, cucVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof duc) {
                    ducVar = (duc) lnmVar;
                    int i29 = ducVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ducVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        ducVar = new duc(this, lnmVar);
                    }
                } else {
                    ducVar = new duc(this, lnmVar);
                }
                Object obj15 = ducVar.a;
                int i30 = ducVar.b;
                if (i30 == 0) {
                    hm5.M(obj15);
                    oy21 oy21Var3 = (py21) obj;
                    if (oy21Var3 instanceof oy21) {
                        fucVarB = kln1.B((wsc0) oy21Var3.a);
                    } else if (oy21Var3 instanceof ly21) {
                        fucVarB = fuc.f;
                    } else {
                        eg.o();
                    }
                    ducVar.b = 1;
                    return vr20Var.emit(fucVarB, ducVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof s8d) {
                    s8dVar = (s8d) lnmVar;
                    int i31 = s8dVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        s8dVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        s8dVar = new s8d(this, lnmVar);
                    }
                } else {
                    s8dVar = new s8d(this, lnmVar);
                }
                Object obj16 = s8dVar.a;
                int i32 = s8dVar.b;
                if (i32 == 0) {
                    hm5.M(obj16);
                    v7d v7dVar = (v7d) obj;
                    int iOrdinal = v7dVar.getStatus().ordinal();
                    if (iOrdinal == 0) {
                        if (!(v7dVar instanceof s7d)) {
                            if ((v7dVar instanceof r7d) || (v7dVar instanceof u7d) || (v7dVar instanceof m7d) || (v7dVar instanceof n7d) || (v7dVar instanceof q7d) || (v7dVar instanceof p7d) || (v7dVar instanceof o7d)) {
                                lueVar = que.a;
                            } else {
                                eg.o();
                            }
                        }
                        if (lueVar == null) {
                            return rih1Var;
                        }
                        s8dVar.b = 1;
                        if (vr20Var.emit(lueVar, s8dVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    if (iOrdinal == 1) {
                        if (v7dVar instanceof r7d) {
                            lueVar = rue.a;
                        } else if (v7dVar instanceof u7d) {
                            lueVar = uue.a;
                        } else {
                            boolean z3 = v7dVar instanceof m7d;
                            kue kueVar = kue.a;
                            if (z3) {
                                lueVar = kueVar;
                            } else if (v7dVar instanceof q7d) {
                                lueVar = nue.a;
                            } else if (v7dVar instanceof n7d) {
                                lueVar = kueVar;
                            } else if (v7dVar instanceof p7d) {
                                lueVar = mue.a;
                            } else if (v7dVar instanceof s7d) {
                                lueVar = new lue(((s7d) v7dVar).c);
                            } else if (!(v7dVar instanceof o7d)) {
                                eg.o();
                            }
                        }
                        if (lueVar == null) {
                            return rih1Var;
                        }
                        s8dVar.b = 1;
                        if (vr20Var.emit(lueVar, s8dVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    if (iOrdinal == 2) {
                        if ((v7dVar instanceof q7d) || (v7dVar instanceof m7d) || (v7dVar instanceof n7d) || (v7dVar instanceof p7d)) {
                            lueVar = oue.a;
                        } else if ((v7dVar instanceof r7d) || (v7dVar instanceof u7d)) {
                            lueVar = pue.a;
                        } else if (!(v7dVar instanceof s7d) && !(v7dVar instanceof o7d)) {
                            eg.o();
                        }
                        if (lueVar == null) {
                            return rih1Var;
                        }
                        s8dVar.b = 1;
                        if (vr20Var.emit(lueVar, s8dVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (i32 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 15:
                if (lnmVar instanceof t8d) {
                    t8dVar = (t8d) lnmVar;
                    int i33 = t8dVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        t8dVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        t8dVar = new t8d(this, lnmVar);
                    }
                } else {
                    t8dVar = new t8d(this, lnmVar);
                }
                Object obj17 = t8dVar.a;
                int i34 = t8dVar.b;
                if (i34 == 0) {
                    hm5.M(obj17);
                    o7d o7dVar = (v7d) obj;
                    if (o7dVar instanceof o7d) {
                        p1fVar = new p1f(o7dVar.b);
                    } else if (!(o7dVar instanceof r7d) && !(o7dVar instanceof u7d) && !(o7dVar instanceof m7d) && !(o7dVar instanceof n7d) && !(o7dVar instanceof q7d) && !(o7dVar instanceof p7d) && !(o7dVar instanceof s7d)) {
                        eg.o();
                    }
                    if (p1fVar == null) {
                        return rih1Var;
                    }
                    t8dVar.b = 1;
                    return vr20Var.emit(p1fVar, t8dVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof y8d) {
                    y8dVar = (y8d) lnmVar;
                    int i35 = y8dVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        y8dVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        y8dVar = new y8d(this, lnmVar);
                    }
                } else {
                    y8dVar = new y8d(this, lnmVar);
                }
                Object obj18 = y8dVar.a;
                int i36 = y8dVar.b;
                if (i36 == 0) {
                    hm5.M(obj18);
                    w8d w8dVar = (w8d) obj;
                    if (w8dVar != null) {
                        sue sueVar = new sue(w8dVar.b);
                        y8dVar.b = 1;
                        return vr20Var.emit(sueVar, y8dVar) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (i36 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 17:
                if (lnmVar instanceof ibd) {
                    ibdVar = (ibd) lnmVar;
                    int i37 = ibdVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ibdVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        ibdVar = new ibd(this, lnmVar);
                    }
                } else {
                    ibdVar = new ibd(this, lnmVar);
                }
                Object obj19 = ibdVar.a;
                int i38 = ibdVar.b;
                if (i38 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf6 = Boolean.valueOf(!((String) obj).equals("DISABLED_CANNOT_ENABLE"));
                    ibdVar.b = 1;
                    return vr20Var.emit(boolValueOf6, ibdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof jbd) {
                    jbdVar = (jbd) lnmVar;
                    int i39 = jbdVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        jbdVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        jbdVar = new jbd(this, lnmVar);
                    }
                } else {
                    jbdVar = new jbd(this, lnmVar);
                }
                Object obj20 = jbdVar.a;
                int i40 = jbdVar.b;
                if (i40 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    jbdVar.b = 1;
                    return vr20Var.emit(boolValueOf7, jbdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof qed) {
                    qedVar = (qed) lnmVar;
                    int i41 = qedVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        qedVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        qedVar = new qed(this, lnmVar);
                    }
                } else {
                    qedVar = new qed(this, lnmVar);
                }
                Object obj21 = qedVar.a;
                int i42 = qedVar.b;
                if (i42 == 0) {
                    hm5.M(obj21);
                    List listL = bfd.L((kdd) obj);
                    qedVar.b = 1;
                    return vr20Var.emit(listL, qedVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof red) {
                    redVar = (red) lnmVar;
                    int i43 = redVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        redVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        redVar = new red(this, lnmVar);
                    }
                } else {
                    redVar = new red(this, lnmVar);
                }
                Object obj22 = redVar.a;
                int i44 = redVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                ArrayList arrayList = new ArrayList();
                for (Object obj23 : (List) obj) {
                    if (!((goe) obj23).X) {
                        arrayList.add(obj23);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((goe) it.next()).h.a > 0 && (i2 = i2 + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                Integer num = new Integer(i2);
                redVar.b = 1;
                return vr20Var.emit(num, redVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof bkd) {
                    bkdVar = (bkd) lnmVar;
                    int i45 = bkdVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        bkdVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        bkdVar = new bkd(this, lnmVar);
                    }
                } else {
                    bkdVar = new bkd(this, lnmVar);
                }
                Object obj24 = bkdVar.a;
                int i46 = bkdVar.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf8 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    bkdVar.b = 1;
                    return vr20Var.emit(boolValueOf8, bkdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof jkd) {
                    jkdVar = (jkd) lnmVar;
                    int i47 = jkdVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        jkdVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        jkdVar = new jkd(this, lnmVar);
                    }
                } else {
                    jkdVar = new jkd(this, lnmVar);
                }
                Object obj25 = jkdVar.a;
                int i48 = jkdVar.b;
                if (i48 == 0) {
                    hm5.M(obj25);
                    g390 g390Var = ((Boolean) obj).booleanValue() ? g390.b : g390.a;
                    jkdVar.b = 1;
                    return vr20Var.emit(g390Var, jkdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof rpd) {
                    rpdVar = (rpd) lnmVar;
                    int i49 = rpdVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        rpdVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        rpdVar = new rpd(this, lnmVar);
                    }
                } else {
                    rpdVar = new rpd(this, lnmVar);
                }
                Object obj26 = rpdVar.a;
                int i50 = rpdVar.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    int iOrdinal2 = ((zpd) obj).ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                        listSingletonList = z6x.a;
                    } else if (iOrdinal2 == 3) {
                        listSingletonList = Collections.singletonList(qi.c(tpd.a, (String) null, (String) null, (String) null, (List) null, Boolean.TRUE, (axo1) null, (cn70) null, 223));
                    } else {
                        eg.o();
                    }
                    rpdVar.b = 1;
                    return vr20Var.emit(listSingletonList, rpdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof upd) {
                    updVar = (upd) lnmVar;
                    int i51 = updVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        updVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        updVar = new upd(this, lnmVar);
                    }
                } else {
                    updVar = new upd(this, lnmVar);
                }
                Object obj27 = updVar.a;
                int i52 = updVar.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf9 = Boolean.valueOf(zpdVar == ((zpd) obj));
                    updVar.b = 1;
                    return vr20Var.emit(boolValueOf9, updVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof vpd) {
                    vpdVar = (vpd) lnmVar;
                    int i53 = vpdVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        vpdVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        vpdVar = new vpd(this, lnmVar);
                    }
                } else {
                    vpdVar = new vpd(this, lnmVar);
                }
                Object obj28 = vpdVar.a;
                int i54 = vpdVar.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    d790 d790Var = new d790(((Boolean) obj).booleanValue());
                    vpdVar.b = 1;
                    return vr20Var.emit(d790Var, vpdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof xpd) {
                    xpdVar = (xpd) lnmVar;
                    int i55 = xpdVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        xpdVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        xpdVar = new xpd(this, lnmVar);
                    }
                } else {
                    xpdVar = new xpd(this, lnmVar);
                }
                Object obj29 = xpdVar.a;
                int i56 = xpdVar.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                Integer num2 = (Integer) obj;
                num2.getClass();
                int iIntValue = num2.intValue();
                if (iIntValue == 0) {
                    zpdVar = zpd.c;
                } else if (iIntValue == 1) {
                    zpdVar = zpd.d;
                } else if (iIntValue != 2) {
                    zpdVar = zpd.b;
                }
                xpdVar.b = 1;
                return vr20Var.emit(zpdVar, xpdVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof nud) {
                    nudVar = (nud) lnmVar;
                    int i57 = nudVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        nudVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        nudVar = new nud(this, lnmVar);
                    }
                } else {
                    nudVar = new nud(this, lnmVar);
                }
                Object obj30 = nudVar.a;
                int i58 = nudVar.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    ny71 ny71Var = (mtd) obj;
                    if (ny71Var instanceof mmt) {
                        mmt mmtVar = (mmt) ny71Var;
                        ytdVar = new aud(mmtVar.a, mmtVar.b);
                    } else if (ny71Var instanceof oy71) {
                        oy71 oy71Var = (oy71) ny71Var;
                        ytdVar = new ztd(oy71Var.a, oy71Var.b, oy71Var.c, oy71Var.d, oy71Var.e);
                    } else if (ny71Var instanceof ny71) {
                        ytdVar = new ytd(ny71Var.a);
                    } else {
                        eg.o();
                    }
                    nudVar.b = 1;
                    return vr20Var.emit(ytdVar, nudVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof mwd) {
                    mwdVar = (mwd) lnmVar;
                    int i59 = mwdVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        mwdVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        mwdVar = new mwd(this, lnmVar);
                    }
                } else {
                    mwdVar = new mwd(this, lnmVar);
                }
                Object obj31 = mwdVar.a;
                int i60 = mwdVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                c380 c380Var = (c380) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var, 10));
                for (Object obj32 : c380Var) {
                    int i61 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    kic1 kic1Var = new kic1(obj32, i);
                    arrayList2.add(new h8k1(kic1Var, kic1Var));
                    i = i61;
                }
                mwdVar.b = 1;
                return vr20Var.emit(arrayList2, mwdVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof u3e) {
                    u3eVar = (u3e) lnmVar;
                    int i62 = u3eVar.b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        u3eVar.b = i62 - Integer.MIN_VALUE;
                    } else {
                        u3eVar = new u3e(this, lnmVar);
                    }
                } else {
                    u3eVar = new u3e(this, lnmVar);
                }
                Object obj33 = u3eVar.a;
                int i63 = u3eVar.b;
                if (i63 == 0) {
                    hm5.M(obj33);
                    byte[] bArr = (byte[]) obj;
                    try {
                        CastMessages.DeviceId deviceIdO = CastMessages.DeviceId.o(bArr);
                        u3eVar.b = 1;
                        return vr20Var.emit(deviceIdO, u3eVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.DeviceId: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i63 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ vnb(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
