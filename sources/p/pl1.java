package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import com.spotify.superconnect.v1.WritingStatusNotification;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ pl1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x023b  */
    /* JADX WARN: Code duplicated, block: B:157:0x027b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:204:0x032d  */
    /* JADX WARN: Code duplicated, block: B:219:0x036d  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:251:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:269:0x042b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0472  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:311:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:328:0x0503  */
    /* JADX WARN: Code duplicated, block: B:359:0x0574  */
    /* JADX WARN: Code duplicated, block: B:376:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:393:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:408:0x0628  */
    /* JADX WARN: Code duplicated, block: B:425:0x0669  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:440:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:455:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:470:0x0722  */
    /* JADX WARN: Code duplicated, block: B:487:0x075d  */
    /* JADX WARN: Code duplicated, block: B:514:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:529:0x080a  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object emit(Object obj, lnm lnmVar) {
        ol1 ol1Var;
        no1 no1Var;
        ro1 ro1Var;
        String str;
        qv1 qv1Var;
        w72 w72Var;
        c82 c82Var;
        xc2 xc2Var;
        pf2 pf2Var;
        qf2 qf2Var;
        sf2 sf2Var;
        ti2 ti2Var;
        il2 il2Var;
        jo2 jo2Var;
        xp2 xp2Var;
        yp2 yp2Var;
        rt2 rt2Var;
        iu2 iu2Var;
        wu2 wu2Var;
        pv2 pv2Var;
        rv2 rv2Var;
        dw2 dw2Var;
        gz2 gz2Var;
        zz2 zz2Var;
        j13 j13Var;
        f73 f73Var;
        e83 e83Var;
        h83 h83Var;
        List list;
        y83 y83Var;
        p93 p93Var;
        u93 u93Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        PlayerState num = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof ol1) {
                    ol1Var = (ol1) lnmVar;
                    int i = ol1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ol1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ol1Var = new ol1(this, lnmVar);
                    }
                } else {
                    ol1Var = new ol1(this, lnmVar);
                }
                Object obj2 = ol1Var.a;
                int i2 = ol1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                ol1Var.b = 1;
                return vr20Var.emit(objG, ol1Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof no1) {
                    no1Var = (no1) lnmVar;
                    int i3 = no1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        no1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        no1Var = new no1(this, lnmVar);
                    }
                } else {
                    no1Var = new no1(this, lnmVar);
                }
                Object obj3 = no1Var.a;
                int i4 = no1Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    io1 io1Var = new io1(((h7h) obj).b);
                    no1Var.b = 1;
                    return vr20Var.emit(io1Var, no1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof ro1) {
                    ro1Var = (ro1) lnmVar;
                    int i5 = ro1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ro1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ro1Var = new ro1(this, lnmVar);
                    }
                } else {
                    ro1Var = new ro1(this, lnmVar);
                }
                Object obj4 = ro1Var.a;
                int i6 = ro1Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    List<ck3> list2 = (List) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (ck3 ck3Var : list2) {
                        if (ck3Var instanceof ck3) {
                            str = ck3Var.a;
                        } else if (ck3Var instanceof bk3) {
                            str = bo1.b;
                        } else {
                            eg.o();
                        }
                        arrayList.add(str);
                    }
                    Set setP1 = o7h.p1(arrayList);
                    ro1Var.b = 1;
                    return vr20Var.emit(setP1, ro1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof qv1) {
                    qv1Var = (qv1) lnmVar;
                    int i7 = qv1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qv1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        qv1Var = new qv1(this, lnmVar);
                    }
                } else {
                    qv1Var = new qv1(this, lnmVar);
                }
                Object obj5 = qv1Var.a;
                int i8 = qv1Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (((wy71) obj) != wy71.c) {
                    return rih1Var;
                }
                qv1Var.b = 1;
                return vr20Var.emit(obj, qv1Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof w72) {
                    w72Var = (w72) lnmVar;
                    int i9 = w72Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        w72Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        w72Var = new w72(this, lnmVar);
                    }
                } else {
                    w72Var = new w72(this, lnmVar);
                }
                Object obj6 = w72Var.a;
                int i10 = w72Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    Boolean boolValueOf = Boolean.valueOf(((cxc0) obj).a());
                    w72Var.b = 1;
                    return vr20Var.emit(boolValueOf, w72Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof c82) {
                    c82Var = (c82) lnmVar;
                    int i11 = c82Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c82Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        c82Var = new c82(this, lnmVar);
                    }
                } else {
                    c82Var = new c82(this, lnmVar);
                }
                Object obj7 = c82Var.a;
                int i12 = c82Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf2 = Boolean.valueOf(((cxc0) obj).f.w.b);
                    c82Var.b = 1;
                    return vr20Var.emit(boolValueOf2, c82Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof xc2) {
                    xc2Var = (xc2) lnmVar;
                    int i13 = xc2Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xc2Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        xc2Var = new xc2(this, lnmVar);
                    }
                } else {
                    xc2Var = new xc2(this, lnmVar);
                }
                Object obj8 = xc2Var.a;
                int i14 = xc2Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    xc2Var.b = 1;
                    return vr20Var.emit(uc2.a, xc2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof pf2) {
                    pf2Var = (pf2) lnmVar;
                    int i15 = pf2Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        pf2Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        pf2Var = new pf2(this, lnmVar);
                    }
                } else {
                    pf2Var = new pf2(this, lnmVar);
                }
                Object obj9 = pf2Var.a;
                int i16 = pf2Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                pf2Var.b = 1;
                return vr20Var.emit(obj, pf2Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof qf2) {
                    qf2Var = (qf2) lnmVar;
                    int i17 = qf2Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        qf2Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        qf2Var = new qf2(this, lnmVar);
                    }
                } else {
                    qf2Var = new qf2(this, lnmVar);
                }
                Object obj10 = qf2Var.a;
                int i18 = qf2Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    Object objB = ((PlayerState) obj).track().b();
                    qf2Var.b = 1;
                    return vr20Var.emit(objB, qf2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof sf2) {
                    sf2Var = (sf2) lnmVar;
                    int i19 = sf2Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        sf2Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        sf2Var = new sf2(this, lnmVar);
                    }
                } else {
                    sf2Var = new sf2(this, lnmVar);
                }
                Object obj11 = sf2Var.a;
                int i20 = sf2Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                sf2Var.b = 1;
                return vr20Var.emit(obj, sf2Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof ti2) {
                    ti2Var = (ti2) lnmVar;
                    int i21 = ti2Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ti2Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        ti2Var = new ti2(this, lnmVar);
                    }
                } else {
                    ti2Var = new ti2(this, lnmVar);
                }
                Object obj12 = ti2Var.a;
                int i22 = ti2Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (!(obj instanceof oi2)) {
                    return rih1Var;
                }
                ti2Var.b = 1;
                return vr20Var.emit(obj, ti2Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof il2) {
                    il2Var = (il2) lnmVar;
                    int i23 = il2Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        il2Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        il2Var = new il2(this, lnmVar);
                    }
                } else {
                    il2Var = new il2(this, lnmVar);
                }
                Object obj13 = il2Var.a;
                int i24 = il2Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
                int iHashCode = upperCase.hashCode();
                t2j1 t2j1Var = t2j1.c;
                if (iHashCode == -1402997159) {
                    upperCase.equals("VERIFICATION_NEEDED");
                } else if (iHashCode != -1211756856) {
                    if (iHashCode == 175259132 && upperCase.equals("INELIGIBLE")) {
                        t2j1Var = t2j1.b;
                    }
                } else if (upperCase.equals("VERIFIED")) {
                    t2j1Var = t2j1.a;
                }
                il2Var.b = 1;
                return vr20Var.emit(t2j1Var, il2Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof jo2) {
                    jo2Var = (jo2) lnmVar;
                    int i25 = jo2Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        jo2Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        jo2Var = new jo2(this, lnmVar);
                    }
                } else {
                    jo2Var = new jo2(this, lnmVar);
                }
                Object obj14 = jo2Var.a;
                int i26 = jo2Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                jo2Var.b = 1;
                return vr20Var.emit(obj, jo2Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof xp2) {
                    xp2Var = (xp2) lnmVar;
                    int i27 = xp2Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        xp2Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        xp2Var = new xp2(this, lnmVar);
                    }
                } else {
                    xp2Var = new xp2(this, lnmVar);
                }
                Object obj15 = xp2Var.a;
                int i28 = xp2Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    k680 k680Var = (l680) obj;
                    if (k680Var instanceof k680) {
                        num = k680Var.b;
                    } else if (k680Var instanceof i680) {
                        num = ((i680) k680Var).b;
                    } else if (!(k680Var instanceof j680) && k680Var != null) {
                        eg.o();
                    }
                    xp2Var.b = 1;
                    return vr20Var.emit(num, xp2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof yp2) {
                    yp2Var = (yp2) lnmVar;
                    int i29 = yp2Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yp2Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        yp2Var = new yp2(this, lnmVar);
                    }
                } else {
                    yp2Var = new yp2(this, lnmVar);
                }
                Object obj16 = yp2Var.a;
                int i30 = yp2Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                lpu lpuVar = new lpu(o4p1.t(playerState), o4p1.C(playerState));
                yp2Var.b = 1;
                return vr20Var.emit(lpuVar, yp2Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof rt2) {
                    rt2Var = (rt2) lnmVar;
                    int i31 = rt2Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        rt2Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        rt2Var = new rt2(this, lnmVar);
                    }
                } else {
                    rt2Var = new rt2(this, lnmVar);
                }
                Object obj17 = rt2Var.a;
                int i32 = rt2Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                num = ihc1.y0(o4p1.o(playerState2)) ? null : playerState2;
                rt2Var.b = 1;
                return vr20Var.emit(num, rt2Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof iu2) {
                    iu2Var = (iu2) lnmVar;
                    int i33 = iu2Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        iu2Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        iu2Var = new iu2(this, lnmVar);
                    }
                } else {
                    iu2Var = new iu2(this, lnmVar);
                }
                Object obj18 = iu2Var.a;
                int i34 = iu2Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
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
                iu2Var.b = 1;
                return vr20Var.emit(obj, iu2Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof wu2) {
                    wu2Var = (wu2) lnmVar;
                    int i35 = wu2Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        wu2Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        wu2Var = new wu2(this, lnmVar);
                    }
                } else {
                    wu2Var = new wu2(this, lnmVar);
                }
                Object obj19 = wu2Var.a;
                int i36 = wu2Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    z0f z0fVar = new z0f((uu2) obj);
                    wu2Var.b = 1;
                    return vr20Var.emit(z0fVar, wu2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof pv2) {
                    pv2Var = (pv2) lnmVar;
                    int i37 = pv2Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        pv2Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        pv2Var = new pv2(this, lnmVar);
                    }
                } else {
                    pv2Var = new pv2(this, lnmVar);
                }
                Object obj20 = pv2Var.a;
                int i38 = pv2Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    a1f a1fVar = new a1f(((Boolean) obj).booleanValue());
                    pv2Var.b = 1;
                    return vr20Var.emit(a1fVar, pv2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof rv2) {
                    rv2Var = (rv2) lnmVar;
                    int i39 = rv2Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rv2Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        rv2Var = new rv2(this, lnmVar);
                    }
                } else {
                    rv2Var = new rv2(this, lnmVar);
                }
                Object obj21 = rv2Var.a;
                int i40 = rv2Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                WritingStatusNotification writingStatusNotification = (WritingStatusNotification) obj;
                if (writingStatusNotification == null) {
                    return rih1Var;
                }
                rv2Var.b = 1;
                return vr20Var.emit(writingStatusNotification, rv2Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof dw2) {
                    dw2Var = (dw2) lnmVar;
                    int i41 = dw2Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        dw2Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        dw2Var = new dw2(this, lnmVar);
                    }
                } else {
                    dw2Var = new dw2(this, lnmVar);
                }
                Object obj22 = dw2Var.a;
                int i42 = dw2Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    cw2 cw2Var = new cw2((xkk1) obj);
                    dw2Var.b = 1;
                    return vr20Var.emit(cw2Var, dw2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof gz2) {
                    gz2Var = (gz2) lnmVar;
                    int i43 = gz2Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        gz2Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        gz2Var = new gz2(this, lnmVar);
                    }
                } else {
                    gz2Var = new gz2(this, lnmVar);
                }
                Object obj23 = gz2Var.a;
                int i44 = gz2Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf3 = Boolean.valueOf(((twj1) obj) instanceof swj1);
                    gz2Var.b = 1;
                    return vr20Var.emit(boolValueOf3, gz2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof zz2) {
                    zz2Var = (zz2) lnmVar;
                    int i45 = zz2Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        zz2Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        zz2Var = new zz2(this, lnmVar);
                    }
                } else {
                    zz2Var = new zz2(this, lnmVar);
                }
                Object obj24 = zz2Var.a;
                int i46 = zz2Var.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf4 = Boolean.valueOf(((gr41) obj).a > 0);
                    zz2Var.b = 1;
                    return vr20Var.emit(boolValueOf4, zz2Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof j13) {
                    j13Var = (j13) lnmVar;
                    int i47 = j13Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        j13Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        j13Var = new j13(this, lnmVar);
                    }
                } else {
                    j13Var = new j13(this, lnmVar);
                }
                Object obj25 = j13Var.a;
                int i48 = j13Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                j13Var.b = 1;
                return vr20Var.emit(obj, j13Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof f73) {
                    f73Var = (f73) lnmVar;
                    int i49 = f73Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        f73Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        f73Var = new f73(this, lnmVar);
                    }
                } else {
                    f73Var = new f73(this, lnmVar);
                }
                Object obj26 = f73Var.a;
                int i50 = f73Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf5 = Boolean.valueOf(((cxc0) obj).a());
                    f73Var.b = 1;
                    return vr20Var.emit(boolValueOf5, f73Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof e83) {
                    e83Var = (e83) lnmVar;
                    int i51 = e83Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        e83Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        e83Var = new e83(this, lnmVar);
                    }
                } else {
                    e83Var = new e83(this, lnmVar);
                }
                Object obj27 = e83Var.a;
                int i52 = e83Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                CharSequence charSequence = (CharSequence) ((cxc0) obj).f.q.get("copyrights");
                Boolean boolValueOf6 = Boolean.valueOf(!(charSequence == null || ihc1.y0(charSequence)));
                e83Var.b = 1;
                return vr20Var.emit(boolValueOf6, e83Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof h83) {
                    h83Var = (h83) lnmVar;
                    int i53 = h83Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        h83Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        h83Var = new h83(this, lnmVar);
                    }
                } else {
                    h83Var = new h83(this, lnmVar);
                }
                Object obj28 = h83Var.a;
                int i54 = h83Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                hc91 hc91Var = (jc91) obj;
                hc91 hc91Var2 = hc91Var instanceof hc91 ? hc91Var : null;
                if (hc91Var2 != null && (list = hc91Var2.a) != null) {
                    num = new Integer(list.size());
                }
                if (num == null) {
                    return rih1Var;
                }
                h83Var.b = 1;
                return vr20Var.emit(num, h83Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof y83) {
                    y83Var = (y83) lnmVar;
                    int i55 = y83Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        y83Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        y83Var = new y83(this, lnmVar);
                    }
                } else {
                    y83Var = new y83(this, lnmVar);
                }
                Object obj29 = y83Var.a;
                int i56 = y83Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                hc91 hc91Var3 = (jc91) obj;
                ArrayList arrayList2 = new ArrayList();
                if ((hc91Var3 instanceof hc91) && hc91Var3.a.isEmpty()) {
                    arrayList2.add(new h8k1(rih1Var, rih1Var));
                }
                y83Var.b = 1;
                return vr20Var.emit(arrayList2, y83Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof p93) {
                    p93Var = (p93) lnmVar;
                    int i57 = p93Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        p93Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        p93Var = new p93(this, lnmVar);
                    }
                } else {
                    p93Var = new p93(this, lnmVar);
                }
                Object obj30 = p93Var.a;
                int i58 = p93Var.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    ly50 ly50VarA = ly50.a((ly50) obj, null, true, false, 2131956012, false, null, null, 245);
                    p93Var.b = 1;
                    return vr20Var.emit(ly50VarA, p93Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof u93) {
                    u93Var = (u93) lnmVar;
                    int i59 = u93Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        u93Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        u93Var = new u93(this, lnmVar);
                    }
                } else {
                    u93Var = new u93(this, lnmVar);
                }
                Object obj31 = u93Var.a;
                int i60 = u93Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                String str2 = (String) ((cxc0) obj).f.q.get("artistUris");
                List listJ0 = str2 != null ? o7h.j0(ihc1.Q0(str2, new String[]{","}, 0, 6)) : z6x.a;
                u93Var.b = 1;
                return vr20Var.emit(listJ0, u93Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
