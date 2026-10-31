package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wl01 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ wl01(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0200  */
    /* JADX WARN: Code duplicated, block: B:140:0x023d  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:181:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x0345  */
    /* JADX WARN: Code duplicated, block: B:231:0x0393  */
    /* JADX WARN: Code duplicated, block: B:258:0x0412  */
    /* JADX WARN: Code duplicated, block: B:273:0x0451  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:291:0x0493  */
    /* JADX WARN: Code duplicated, block: B:306:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:321:0x050f  */
    /* JADX WARN: Code duplicated, block: B:346:0x055a  */
    /* JADX WARN: Code duplicated, block: B:369:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:384:0x05de  */
    /* JADX WARN: Code duplicated, block: B:412:0x063f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0691  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:452:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:467:0x0707  */
    /* JADX WARN: Code duplicated, block: B:484:0x0742  */
    /* JADX WARN: Code duplicated, block: B:512:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:527:0x080b  */
    /* JADX WARN: Code duplicated, block: B:542:0x0846  */
    /* JADX WARN: Code duplicated, block: B:562:0x0893  */
    /* JADX WARN: Code duplicated, block: B:577:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        vl01 vl01Var;
        qr01 qr01Var;
        ur01 ur01Var;
        ContextTrack contextTrack;
        tu01 tu01Var;
        pv01 pv01Var;
        cw01 cw01Var;
        q711 q711Var;
        r711 r711Var;
        u711 u711Var;
        b811 b811Var;
        c911 c911Var;
        oh11 oh11Var;
        di11 di11Var;
        ei11 ei11Var;
        gi11 gi11Var;
        cn11 cn11Var;
        gp11 gp11Var;
        iq11 iq11Var;
        qq11 qq11Var;
        uvn wvnVar;
        uvn uvnVar;
        sq11 sq11Var;
        String str;
        fs11 fs11Var;
        he2 ke2Var;
        hs11 hs11Var;
        uw11 uw11Var;
        lx11 lx11Var;
        sy11 sy11Var;
        r121 r121Var;
        c521 c521Var;
        j521 j521Var;
        xd21 xd21Var;
        xe21 xe21Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        brl1 brl1VarUri = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof vl01) {
                    vl01Var = (vl01) lnmVar;
                    int i = vl01Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vl01Var.b = i - Integer.MIN_VALUE;
                    } else {
                        vl01Var = new vl01(this, lnmVar);
                    }
                } else {
                    vl01Var = new vl01(this, lnmVar);
                }
                Object obj2 = vl01Var.a;
                int i2 = vl01Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new z2a0((String) entry.getKey(), ((ul01) entry.getValue()).b));
                }
                Set setP1 = o7h.p1(arrayList);
                vl01Var.b = 1;
                return vr20Var.emit(setP1, vl01Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof qr01) {
                    qr01Var = (qr01) lnmVar;
                    int i3 = qr01Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qr01Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        qr01Var = new qr01(this, lnmVar);
                    }
                } else {
                    qr01Var = new qr01(this, lnmVar);
                }
                Object obj3 = qr01Var.a;
                int i4 = qr01Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    String str2 = ((th61) obj).a;
                    qr01Var.b = 1;
                    return vr20Var.emit(str2, qr01Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof ur01) {
                    ur01Var = (ur01) lnmVar;
                    int i5 = ur01Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ur01Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ur01Var = new ur01(this, lnmVar);
                    }
                } else {
                    ur01Var = new ur01(this, lnmVar);
                }
                Object obj4 = ur01Var.a;
                int i6 = ur01Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && (contextTrack = (ContextTrack) playerState.track().h()) != null) {
                    brl1VarUri = contextTrack.uri();
                }
                ur01Var.b = 1;
                return vr20Var.emit(brl1VarUri, ur01Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof tu01) {
                    tu01Var = (tu01) lnmVar;
                    int i7 = tu01Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tu01Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        tu01Var = new tu01(this, lnmVar);
                    }
                } else {
                    tu01Var = new tu01(this, lnmVar);
                }
                Object obj5 = tu01Var.a;
                int i8 = tu01Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    Object objA = ((ebr) obj).a();
                    tu01Var.b = 1;
                    return vr20Var.emit(objA, tu01Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof pv01) {
                    pv01Var = (pv01) lnmVar;
                    int i9 = pv01Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pv01Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        pv01Var = new pv01(this, lnmVar);
                    }
                } else {
                    pv01Var = new pv01(this, lnmVar);
                }
                Object obj6 = pv01Var.a;
                int i10 = pv01Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                bma1 bma1Var = qv01.b;
                List listU = myo1.u((String) ((cma1) obj).a);
                pv01Var.b = 1;
                return vr20Var.emit(listU, pv01Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof cw01) {
                    cw01Var = (cw01) lnmVar;
                    int i11 = cw01Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cw01Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        cw01Var = new cw01(this, lnmVar);
                    }
                } else {
                    cw01Var = new cw01(this, lnmVar);
                }
                Object obj7 = cw01Var.a;
                int i12 = cw01Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                mv01 mv01Var = (mv01) obj;
                ArrayList arrayList2 = mv01Var.a;
                List list = mv01Var.d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : arrayList2) {
                    if (obj8 instanceof tt01) {
                        arrayList3.add(obj8);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((tt01) it.next()).a);
                }
                bw01 bw01Var = new bw01(arrayList4, list.size() == 1 ? ((ws01) o7h.q0(list)).a : null);
                cw01Var.b = 1;
                return vr20Var.emit(bw01Var, cw01Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof q711) {
                    q711Var = (q711) lnmVar;
                    int i13 = q711Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        q711Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        q711Var = new q711(this, lnmVar);
                    }
                } else {
                    q711Var = new q711(this, lnmVar);
                }
                Object obj9 = q711Var.a;
                int i14 = q711Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                q711Var.b = 1;
                return vr20Var.emit(obj, q711Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof r711) {
                    r711Var = (r711) lnmVar;
                    int i15 = r711Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        r711Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        r711Var = new r711(this, lnmVar);
                    }
                } else {
                    r711Var = new r711(this, lnmVar);
                }
                Object obj10 = r711Var.a;
                int i16 = r711Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    String str3 = ((th61) obj).a;
                    r711Var.b = 1;
                    return vr20Var.emit(str3, r711Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof u711) {
                    u711Var = (u711) lnmVar;
                    int i17 = u711Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        u711Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        u711Var = new u711(this, lnmVar);
                    }
                } else {
                    u711Var = new u711(this, lnmVar);
                }
                Object obj11 = u711Var.a;
                int i18 = u711Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (((Map) obj).isEmpty()) {
                    return rih1Var;
                }
                u711Var.b = 1;
                return vr20Var.emit(obj, u711Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof b811) {
                    b811Var = (b811) lnmVar;
                    int i19 = b811Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        b811Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        b811Var = new b811(this, lnmVar);
                    }
                } else {
                    b811Var = new b811(this, lnmVar);
                }
                Object obj12 = b811Var.a;
                int i20 = b811Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    a811 a811Var = (a811) obj;
                    if (!u890.j(a811Var, y711.a)) {
                        if (u890.j(a811Var, z711.a)) {
                            z = true;
                        } else {
                            eg.o();
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    b811Var.b = 1;
                    return vr20Var.emit(boolValueOf, b811Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof c911) {
                    c911Var = (c911) lnmVar;
                    int i21 = c911Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c911Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        c911Var = new c911(this, lnmVar);
                    }
                } else {
                    c911Var = new c911(this, lnmVar);
                }
                Object obj13 = c911Var.a;
                int i22 = c911Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                b911 b911Var = (b911) obj;
                pp90 pp90Var = b911Var.a;
                pp90 pp90Var2 = b911Var.b;
                if (pp90Var == null && pp90Var2 != null) {
                    brl1VarUri = new d911(pp90Var2);
                } else if (pp90Var != null && pp90Var2 == null) {
                    brl1VarUri = e911.a;
                } else if (pp90Var != null && pp90Var2 != null && !pp90Var.c.equals(pp90Var2.c)) {
                    brl1VarUri = new f911(pp90Var2);
                }
                if (brl1VarUri == null) {
                    return rih1Var;
                }
                c911Var.b = 1;
                return vr20Var.emit(brl1VarUri, c911Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof oh11) {
                    oh11Var = (oh11) lnmVar;
                    int i23 = oh11Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        oh11Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        oh11Var = new oh11(this, lnmVar);
                    }
                } else {
                    oh11Var = new oh11(this, lnmVar);
                }
                Object obj14 = oh11Var.a;
                int i24 = oh11Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    oh11Var.b = 1;
                    return vr20Var.emit(fh11.a, oh11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof di11) {
                    di11Var = (di11) lnmVar;
                    int i25 = di11Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        di11Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        di11Var = new di11(this, lnmVar);
                    }
                } else {
                    di11Var = new di11(this, lnmVar);
                }
                Object obj15 = di11Var.a;
                int i26 = di11Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                ErrorType errorTypeError = ((PlayerError) obj).error();
                if (errorTypeError != ErrorType.PICK_AND_SHUFFLE_CAPPED && errorTypeError != ErrorType.PICK_AND_SHUFFLE_CONNECT_RESTRICTED && errorTypeError != ErrorType.INTERRUPT_PLAYBACK_RESTRICTED && errorTypeError != ErrorType.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED) {
                    return rih1Var;
                }
                di11Var.b = 1;
                return vr20Var.emit(obj, di11Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof ei11) {
                    ei11Var = (ei11) lnmVar;
                    int i27 = ei11Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ei11Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        ei11Var = new ei11(this, lnmVar);
                    }
                } else {
                    ei11Var = new ei11(this, lnmVar);
                }
                Object obj16 = ei11Var.a;
                int i28 = ei11Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                t5l t5lVar = (t5l) obj;
                if (!t5lVar.a || !t5lVar.b || !t5lVar.c || !t5lVar.d || !t5lVar.e) {
                    return rih1Var;
                }
                ei11Var.b = 1;
                return vr20Var.emit(obj, ei11Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof gi11) {
                    gi11Var = (gi11) lnmVar;
                    int i29 = gi11Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        gi11Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        gi11Var = new gi11(this, lnmVar);
                    }
                } else {
                    gi11Var = new gi11(this, lnmVar);
                }
                Object obj17 = gi11Var.a;
                int i30 = gi11Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                t5l t5lVar2 = (t5l) obj;
                q321 q321Var = new q321(t5lVar2.g, t5lVar2.f);
                gi11Var.b = 1;
                return vr20Var.emit(q321Var, gi11Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof cn11) {
                    cn11Var = (cn11) lnmVar;
                    int i31 = cn11Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        cn11Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        cn11Var = new cn11(this, lnmVar);
                    }
                } else {
                    cn11Var = new cn11(this, lnmVar);
                }
                Object obj18 = cn11Var.a;
                int i32 = cn11Var.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    ym11 ym11Var = new ym11((ioj0) obj);
                    cn11Var.b = 1;
                    return vr20Var.emit(ym11Var, cn11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof gp11) {
                    gp11Var = (gp11) lnmVar;
                    int i33 = gp11Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        gp11Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        gp11Var = new gp11(this, lnmVar);
                    }
                } else {
                    gp11Var = new gp11(this, lnmVar);
                }
                Object obj19 = gp11Var.a;
                int i34 = gp11Var.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf2 = Boolean.valueOf(((aca) obj).a == wls0.c);
                    gp11Var.b = 1;
                    return vr20Var.emit(boolValueOf2, gp11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof iq11) {
                    iq11Var = (iq11) lnmVar;
                    int i35 = iq11Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        iq11Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        iq11Var = new iq11(this, lnmVar);
                    }
                } else {
                    iq11Var = new iq11(this, lnmVar);
                }
                Object obj20 = iq11Var.a;
                int i36 = iq11Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                Map map2 = (Map) obj;
                map2.getClass();
                pvn pvnVar = new pvn(map2);
                iq11Var.b = 1;
                return vr20Var.emit(pvnVar, iq11Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof qq11) {
                    qq11Var = (qq11) lnmVar;
                    int i37 = qq11Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        qq11Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        qq11Var = new qq11(this, lnmVar);
                    }
                } else {
                    qq11Var = new qq11(this, lnmVar);
                }
                Object obj21 = qq11Var.a;
                int i38 = qq11Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    xp11 xp11Var = (aq11) obj;
                    if (xp11Var instanceof xp11) {
                        uvnVar = new uvn(xp11Var.a);
                    } else {
                        if (xp11Var instanceof yp11) {
                            yp11 yp11Var = (yp11) xp11Var;
                            wvnVar = new vvn(yp11Var.c, yp11Var.d, yp11Var.a, yp11Var.b);
                        } else if (xp11Var instanceof zp11) {
                            zp11 zp11Var = (zp11) xp11Var;
                            wvnVar = new wvn(zp11Var.c, zp11Var.d, zp11Var.a, zp11Var.b);
                        } else {
                            eg.o();
                        }
                        uvnVar = wvnVar;
                    }
                    qq11Var.b = 1;
                    return vr20Var.emit(uvnVar, qq11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof sq11) {
                    sq11Var = (sq11) lnmVar;
                    int i39 = sq11Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        sq11Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        sq11Var = new sq11(this, lnmVar);
                    }
                } else {
                    sq11Var = new sq11(this, lnmVar);
                }
                Object obj22 = sq11Var.a;
                int i40 = sq11Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (str = (String) i1rVar2.a) != null) {
                    brl1VarUri = new yvn(str);
                }
                if (brl1VarUri == null) {
                    return rih1Var;
                }
                sq11Var.b = 1;
                return vr20Var.emit(brl1VarUri, sq11Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof fs11) {
                    fs11Var = (fs11) lnmVar;
                    int i41 = fs11Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        fs11Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        fs11Var = new fs11(this, lnmVar);
                    }
                } else {
                    fs11Var = new fs11(this, lnmVar);
                }
                Object obj23 = fs11Var.a;
                int i42 = fs11Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    qls0 qls0Var = (qls0) obj;
                    if (qls0Var instanceof ols0) {
                        ke2Var = he2.a;
                    } else if (qls0Var instanceof nls0) {
                        ke2Var = le2.a;
                    } else if (qls0Var instanceof pls0) {
                        pls0 pls0Var = (pls0) qls0Var;
                        ke2Var = new ke2(pls0Var.b, pls0Var.a);
                    } else {
                        eg.o();
                    }
                    fs11Var.b = 1;
                    return vr20Var.emit(ke2Var, fs11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof hs11) {
                    hs11Var = (hs11) lnmVar;
                    int i43 = hs11Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        hs11Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        hs11Var = new hs11(this, lnmVar);
                    }
                } else {
                    hs11Var = new hs11(this, lnmVar);
                }
                Object obj24 = hs11Var.a;
                int i44 = hs11Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                brl1VarUri = i1rVar4 != null ? (iix0) i1rVar4.a : null;
                if (brl1VarUri == null) {
                    return rih1Var;
                }
                hs11Var.b = 1;
                return vr20Var.emit(brl1VarUri, hs11Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof uw11) {
                    uw11Var = (uw11) lnmVar;
                    int i45 = uw11Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        uw11Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        uw11Var = new uw11(this, lnmVar);
                    }
                } else {
                    uw11Var = new uw11(this, lnmVar);
                }
                Object obj25 = uw11Var.a;
                int i46 = uw11Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                List<xx11> list2 = ((yw11) obj).c;
                ArrayList arrayList5 = new ArrayList(q7h.U(list2, 10));
                for (xx11 xx11Var : list2) {
                    arrayList5.add(new h8k1(xx11Var, xx11Var.getId()));
                }
                hj50 hj50Var = new hj50(arrayList5, (ioj0) null);
                uw11Var.b = 1;
                return vr20Var.emit(hj50Var, uw11Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof lx11) {
                    lx11Var = (lx11) lnmVar;
                    int i47 = lx11Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        lx11Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        lx11Var = new lx11(this, lnmVar);
                    }
                } else {
                    lx11Var = new lx11(this, lnmVar);
                }
                Object obj26 = lx11Var.a;
                int i48 = lx11Var.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    Set setP2 = o7h.p1((List) obj);
                    lx11Var.b = 1;
                    return vr20Var.emit(setP2, lx11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof sy11) {
                    sy11Var = (sy11) lnmVar;
                    int i49 = sy11Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        sy11Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        sy11Var = new sy11(this, lnmVar);
                    }
                } else {
                    sy11Var = new sy11(this, lnmVar);
                }
                Object obj27 = sy11Var.a;
                int i50 = sy11Var.b;
                if (i50 == 0) {
                    hm5.M(obj27);
                    p5l p5lVar = (r5l) obj;
                    boolean z2 = p5lVar instanceof q5l;
                    gax gaxVar = iax.a;
                    if (!z2) {
                        if (p5lVar instanceof o5l) {
                            gaxVar = new gax((Integer) null, (String) null);
                        } else if (!(p5lVar instanceof p5l)) {
                            eg.o();
                        } else if (!p5lVar.b) {
                            gaxVar = new gax(new Integer(2131961692), (String) null);
                        }
                    }
                    sy11Var.b = 1;
                    return vr20Var.emit(gaxVar, sy11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof r121) {
                    r121Var = (r121) lnmVar;
                    int i51 = r121Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        r121Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        r121Var = new r121(this, lnmVar);
                    }
                } else {
                    r121Var = new r121(this, lnmVar);
                }
                Object obj28 = r121Var.a;
                int i52 = r121Var.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    i121 i121Var = new i121((x221) obj);
                    r121Var.b = 1;
                    return vr20Var.emit(i121Var, r121Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof c521) {
                    c521Var = (c521) lnmVar;
                    int i53 = c521Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        c521Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        c521Var = new c521(this, lnmVar);
                    }
                } else {
                    c521Var = new c521(this, lnmVar);
                }
                Object obj29 = c521Var.a;
                int i54 = c521Var.b;
                if (i54 == 0) {
                    hm5.M(obj29);
                    e331 e331Var = new e331((b521) obj);
                    c521Var.b = 1;
                    return vr20Var.emit(e331Var, c521Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof j521) {
                    j521Var = (j521) lnmVar;
                    int i55 = j521Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        j521Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        j521Var = new j521(this, lnmVar);
                    }
                } else {
                    j521Var = new j521(this, lnmVar);
                }
                Object obj30 = j521Var.a;
                int i56 = j521Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                Set setKeySet = ((b521) obj).a.keySet();
                int iS = zno1.s(q7h.U(setKeySet, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj31 : setKeySet) {
                    linkedHashMap.put(obj31, new nlq0(Collections.singleton(mlq0.b)));
                }
                rlq0 rlq0Var = new rlq0(linkedHashMap);
                j521Var.b = 1;
                return vr20Var.emit(rlq0Var, j521Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof xd21) {
                    xd21Var = (xd21) lnmVar;
                    int i57 = xd21Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        xd21Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        xd21Var = new xd21(this, lnmVar);
                    }
                } else {
                    xd21Var = new xd21(this, lnmVar);
                }
                Object obj32 = xd21Var.a;
                int i58 = xd21Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                xd21Var.b = 1;
                return vr20Var.emit(obj, xd21Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof xe21) {
                    xe21Var = (xe21) lnmVar;
                    int i59 = xe21Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        xe21Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        xe21Var = new xe21(this, lnmVar);
                    }
                } else {
                    xe21Var = new xe21(this, lnmVar);
                }
                Object obj33 = xe21Var.a;
                int i60 = xe21Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf3 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                xe21Var.b = 1;
                return vr20Var.emit(boolValueOf3, xe21Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ wl01(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
