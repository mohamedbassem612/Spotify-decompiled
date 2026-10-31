package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dfu0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public dfu0(vr20 vr20Var, oei1 oei1Var, int i, boolean z) {
        this.a = (byte) 24;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0197  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x0214  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:209:0x0318  */
    /* JADX WARN: Code duplicated, block: B:224:0x0352  */
    /* JADX WARN: Code duplicated, block: B:239:0x038a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:269:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x0451  */
    /* JADX WARN: Code duplicated, block: B:303:0x0490  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:333:0x0500  */
    /* JADX WARN: Code duplicated, block: B:353:0x054e  */
    /* JADX WARN: Code duplicated, block: B:374:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:389:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:406:0x0626  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0674  */
    /* JADX WARN: Code duplicated, block: B:441:0x06af  */
    /* JADX WARN: Code duplicated, block: B:465:0x072c  */
    /* JADX WARN: Code duplicated, block: B:480:0x0767  */
    /* JADX WARN: Code duplicated, block: B:495:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x014a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        cfu0 cfu0Var;
        bhu0 bhu0Var;
        qhu0 qhu0Var;
        aju0 aju0Var;
        gku0 gku0Var;
        qku0 qku0Var;
        dou0 dou0Var;
        eou0 eou0Var;
        bqu0 bqu0Var;
        rtu0 rtu0Var;
        q0v0 q0v0Var;
        t0v0 t0v0Var;
        u0v0 u0v0Var;
        v0v0 v0v0Var;
        b1v0 b1v0Var;
        d1v0 d1v0Var;
        g1v0 g1v0Var;
        h1v0 h1v0Var;
        i1v0 i1v0Var;
        l9v0 l9v0Var;
        jev0 jev0Var;
        kev0 kev0Var;
        mev0 mev0Var;
        cfv0 cfv0Var;
        yfv0 yfv0Var;
        fgv0 fgv0Var;
        wgv0 wgv0Var;
        xgv0 xgv0Var;
        ygv0 ygv0Var;
        okv0 okv0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        oei1 lju0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof cfu0) {
                    cfu0Var = (cfu0) lnmVar;
                    int i = cfu0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cfu0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        cfu0Var = new cfu0(this, lnmVar);
                    }
                } else {
                    cfu0Var = new cfu0(this, lnmVar);
                }
                Object obj2 = cfu0Var.a;
                int i2 = cfu0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (((PlayerError) obj).error() != ErrorType.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED) {
                    return rih1Var;
                }
                cfu0Var.b = 1;
                return vr20Var.emit(obj, cfu0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof bhu0) {
                    bhu0Var = (bhu0) lnmVar;
                    int i3 = bhu0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bhu0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        bhu0Var = new bhu0(this, lnmVar);
                    }
                } else {
                    bhu0Var = new bhu0(this, lnmVar);
                }
                Object obj3 = bhu0Var.a;
                int i4 = bhu0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf = Boolean.valueOf(!((String) obj).equals("DISABLED_CANNOT_ENABLE"));
                    bhu0Var.b = 1;
                    return vr20Var.emit(boolValueOf, bhu0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof qhu0) {
                    qhu0Var = (qhu0) lnmVar;
                    int i5 = qhu0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qhu0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        qhu0Var = new qhu0(this, lnmVar);
                    }
                } else {
                    qhu0Var = new qhu0(this, lnmVar);
                }
                Object obj4 = qhu0Var.a;
                int i6 = qhu0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                dpu0 dpu0Var = new dpu0((ugo0) null, (ok51) null, false, (p860) null);
                qhu0Var.b = 1;
                return vr20Var.emit(dpu0Var, qhu0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof aju0) {
                    aju0Var = (aju0) lnmVar;
                    int i7 = aju0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        aju0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        aju0Var = new aju0(this, lnmVar);
                    }
                } else {
                    aju0Var = new aju0(this, lnmVar);
                }
                Object obj5 = aju0Var.a;
                int i8 = aju0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                if (k1rVar instanceof i1r) {
                    uqi0 uqi0Var = (uqi0) u890.k(k1rVar, (d0r) null, (n4r) null);
                    List<pvc0> list = uqi0Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (pvc0 pvc0Var : list) {
                        arrayList.add(new uju0(pvc0Var.c, pvc0Var.a));
                    }
                    qxc0 qxc0Var = uqi0Var.b;
                    lju0Var = new lju0(qxc0Var.a, arrayList, qxc0Var.t.b);
                }
                if (lju0Var == null) {
                    return rih1Var;
                }
                aju0Var.b = 1;
                return vr20Var.emit(lju0Var, aju0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof gku0) {
                    gku0Var = (gku0) lnmVar;
                    int i9 = gku0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        gku0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        gku0Var = new gku0(this, lnmVar);
                    }
                } else {
                    gku0Var = new gku0(this, lnmVar);
                }
                Object obj6 = gku0Var.a;
                int i10 = gku0Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    fio fioVar = new fio((Map) obj);
                    gku0Var.b = 1;
                    return vr20Var.emit(fioVar, gku0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof qku0) {
                    qku0Var = (qku0) lnmVar;
                    int i11 = qku0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qku0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        qku0Var = new qku0(this, lnmVar);
                    }
                } else {
                    qku0Var = new qku0(this, lnmVar);
                }
                Object obj7 = qku0Var.a;
                int i12 = qku0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PlaylistGetResponse playlistGetResponseS = PlaylistGetResponse.s(bArr);
                        qku0Var.b = 1;
                        return vr20Var.emit(playlistGetResponseS, qku0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistGetResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                if (lnmVar instanceof dou0) {
                    dou0Var = (dou0) lnmVar;
                    int i13 = dou0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dou0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        dou0Var = new dou0(this, lnmVar);
                    }
                } else {
                    dou0Var = new dou0(this, lnmVar);
                }
                Object obj8 = dou0Var.a;
                int i14 = dou0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (((py21) obj).c() == null) {
                    return rih1Var;
                }
                dou0Var.b = 1;
                return vr20Var.emit(obj, dou0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof eou0) {
                    eou0Var = (eou0) lnmVar;
                    int i15 = eou0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        eou0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        eou0Var = new eou0(this, lnmVar);
                    }
                } else {
                    eou0Var = new eou0(this, lnmVar);
                }
                Object obj9 = eou0Var.a;
                int i16 = eou0Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    cou0 cou0Var = new cou0((zuc0) ((py21) obj).c());
                    eou0Var.b = 1;
                    return vr20Var.emit(cou0Var, eou0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof bqu0) {
                    bqu0Var = (bqu0) lnmVar;
                    int i17 = bqu0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        bqu0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        bqu0Var = new bqu0(this, lnmVar);
                    }
                } else {
                    bqu0Var = new bqu0(this, lnmVar);
                }
                Object obj10 = bqu0Var.a;
                int i18 = bqu0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                List list2 = ((iqi0) obj).f;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj11 : list2) {
                    if (((fji0) obj11).f == wls0.f) {
                        arrayList2.add(obj11);
                    }
                }
                bqu0Var.b = 1;
                return vr20Var.emit(arrayList2, bqu0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof rtu0) {
                    rtu0Var = (rtu0) lnmVar;
                    int i19 = rtu0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        rtu0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        rtu0Var = new rtu0(this, lnmVar);
                    }
                } else {
                    rtu0Var = new rtu0(this, lnmVar);
                }
                Object obj12 = rtu0Var.a;
                int i20 = rtu0Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        PlaylistMembersResponse playlistMembersResponseP = PlaylistMembersResponse.p(bArr2);
                        rtu0Var.b = 1;
                        return vr20Var.emit(playlistMembersResponseP, rtu0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistMembersResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 10:
                if (lnmVar instanceof q0v0) {
                    q0v0Var = (q0v0) lnmVar;
                    int i21 = q0v0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        q0v0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        q0v0Var = new q0v0(this, lnmVar);
                    }
                } else {
                    q0v0Var = new q0v0(this, lnmVar);
                }
                Object obj13 = q0v0Var.a;
                int i22 = q0v0Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Integer num = ((igg1) obj).a;
                    q0v0Var.b = 1;
                    return vr20Var.emit(num, q0v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof t0v0) {
                    t0v0Var = (t0v0) lnmVar;
                    int i23 = t0v0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        t0v0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        t0v0Var = new t0v0(this, lnmVar);
                    }
                } else {
                    t0v0Var = new t0v0(this, lnmVar);
                }
                Object obj14 = t0v0Var.a;
                int i24 = t0v0Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    ArrayList arrayList3 = ((igg1) obj).b;
                    t0v0Var.b = 1;
                    return vr20Var.emit(arrayList3, t0v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof u0v0) {
                    u0v0Var = (u0v0) lnmVar;
                    int i25 = u0v0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        u0v0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        u0v0Var = new u0v0(this, lnmVar);
                    }
                } else {
                    u0v0Var = new u0v0(this, lnmVar);
                }
                Object obj15 = u0v0Var.a;
                int i26 = u0v0Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    Integer num2 = new Integer(((List) obj).size());
                    u0v0Var.b = 1;
                    return vr20Var.emit(num2, u0v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof v0v0) {
                    v0v0Var = (v0v0) lnmVar;
                    int i27 = v0v0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        v0v0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        v0v0Var = new v0v0(this, lnmVar);
                    }
                } else {
                    v0v0Var = new v0v0(this, lnmVar);
                }
                Object obj16 = v0v0Var.a;
                int i28 = v0v0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((rrj0) it.next()).b);
                }
                v0v0Var.b = 1;
                return vr20Var.emit(arrayList4, v0v0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof b1v0) {
                    b1v0Var = (b1v0) lnmVar;
                    int i29 = b1v0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        b1v0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        b1v0Var = new b1v0(this, lnmVar);
                    }
                } else {
                    b1v0Var = new b1v0(this, lnmVar);
                }
                Object obj17 = b1v0Var.a;
                int i30 = b1v0Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    Set set = ((o0v0) obj).b;
                    b1v0Var.b = 1;
                    return vr20Var.emit(set, b1v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof d1v0) {
                    d1v0Var = (d1v0) lnmVar;
                    int i31 = d1v0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        d1v0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        d1v0Var = new d1v0(this, lnmVar);
                    }
                } else {
                    d1v0Var = new d1v0(this, lnmVar);
                }
                Object obj18 = d1v0Var.a;
                int i32 = d1v0Var.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    Set set2 = ((o0v0) obj).b;
                    d1v0Var.b = 1;
                    return vr20Var.emit(set2, d1v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof g1v0) {
                    g1v0Var = (g1v0) lnmVar;
                    int i33 = g1v0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        g1v0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        g1v0Var = new g1v0(this, lnmVar);
                    }
                } else {
                    g1v0Var = new g1v0(this, lnmVar);
                }
                Object obj19 = g1v0Var.a;
                int i34 = g1v0Var.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    Set set3 = ((o0v0) obj).a;
                    g1v0Var.b = 1;
                    return vr20Var.emit(set3, g1v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof h1v0) {
                    h1v0Var = (h1v0) lnmVar;
                    int i35 = h1v0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        h1v0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        h1v0Var = new h1v0(this, lnmVar);
                    }
                } else {
                    h1v0Var = new h1v0(this, lnmVar);
                }
                Object obj20 = h1v0Var.a;
                int i36 = h1v0Var.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    Object objS0 = o7h.s0((List) obj);
                    h1v0Var.b = 1;
                    return vr20Var.emit(objS0, h1v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof i1v0) {
                    i1v0Var = (i1v0) lnmVar;
                    int i37 = i1v0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        i1v0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        i1v0Var = new i1v0(this, lnmVar);
                    }
                } else {
                    i1v0Var = new i1v0(this, lnmVar);
                }
                Object obj21 = i1v0Var.a;
                int i38 = i1v0Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    Set set4 = ((o0v0) obj).a;
                    i1v0Var.b = 1;
                    return vr20Var.emit(set4, i1v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof l9v0) {
                    l9v0Var = (l9v0) lnmVar;
                    int i39 = l9v0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        l9v0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        l9v0Var = new l9v0(this, lnmVar);
                    }
                } else {
                    l9v0Var = new l9v0(this, lnmVar);
                }
                Object obj22 = l9v0Var.a;
                int i40 = l9v0Var.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    rlq0 rlq0VarB = m9v0.b(((j9v0) obj).a);
                    l9v0Var.b = 1;
                    return vr20Var.emit(rlq0VarB, l9v0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof jev0) {
                    jev0Var = (jev0) lnmVar;
                    int i41 = jev0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        jev0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        jev0Var = new jev0(this, lnmVar);
                    }
                } else {
                    jev0Var = new jev0(this, lnmVar);
                }
                Object obj23 = jev0Var.a;
                int i42 = jev0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                mm11 mm11VarA = ((cxc0) obj).f.x.a(mm11.class);
                Boolean boolValueOf2 = Boolean.valueOf((mm11VarA != null ? mm11VarA.a : null) != null);
                jev0Var.b = 1;
                return vr20Var.emit(boolValueOf2, jev0Var) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof kev0) {
                    kev0Var = (kev0) lnmVar;
                    int i43 = kev0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        kev0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        kev0Var = new kev0(this, lnmVar);
                    }
                } else {
                    kev0Var = new kev0(this, lnmVar);
                }
                Object obj24 = kev0Var.a;
                int i44 = kev0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    iev0 iev0Var = new iev0(new Integer(6), ((iev0) obj).a);
                    kev0Var.b = 1;
                    return vr20Var.emit(iev0Var, kev0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof mev0) {
                    mev0Var = (mev0) lnmVar;
                    int i45 = mev0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        mev0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        mev0Var = new mev0(this, lnmVar);
                    }
                } else {
                    mev0Var = new mev0(this, lnmVar);
                }
                Object obj25 = mev0Var.a;
                int i46 = mev0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                String str = ((aev0) obj).b;
                if ((2 & 1) != 0) {
                    str = null;
                }
                iev0 iev0Var2 = new iev0((Integer) null, str);
                mev0Var.b = 1;
                return vr20Var.emit(iev0Var2, mev0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof cfv0) {
                    cfv0Var = (cfv0) lnmVar;
                    int i47 = cfv0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        cfv0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        cfv0Var = new cfv0(this, lnmVar);
                    }
                } else {
                    cfv0Var = new cfv0(this, lnmVar);
                }
                Object obj26 = cfv0Var.a;
                int i48 = cfv0Var.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    zev0 zev0Var = new zev0((String) obj);
                    cfv0Var.b = 1;
                    return vr20Var.emit(zev0Var, cfv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof yfv0) {
                    yfv0Var = (yfv0) lnmVar;
                    int i49 = yfv0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        yfv0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        yfv0Var = new yfv0(this, lnmVar);
                    }
                } else {
                    yfv0Var = new yfv0(this, lnmVar);
                }
                Object obj27 = yfv0Var.a;
                int i50 = yfv0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                AdDetectionOuterClass.SubscribeUserToCanonicalTimestampResponse subscribeUserToCanonicalTimestampResponse = (AdDetectionOuterClass.SubscribeUserToCanonicalTimestampResponse) obj;
                lju0Var = subscribeUserToCanonicalTimestampResponse.n() ? null : new Long(subscribeUserToCanonicalTimestampResponse.o().o());
                if (lju0Var == null) {
                    return rih1Var;
                }
                yfv0Var.b = 1;
                return vr20Var.emit(lju0Var, yfv0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof fgv0) {
                    fgv0Var = (fgv0) lnmVar;
                    int i51 = fgv0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        fgv0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        fgv0Var = new fgv0(this, lnmVar);
                    }
                } else {
                    fgv0Var = new fgv0(this, lnmVar);
                }
                Object obj28 = fgv0Var.a;
                int i52 = fgv0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                tei1 tei1Var = (tei1) obj;
                lju0Var = tei1Var != null ? tei1Var.a : null;
                fgv0Var.b = 1;
                return vr20Var.emit(lju0Var, fgv0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof wgv0) {
                    wgv0Var = (wgv0) lnmVar;
                    int i53 = wgv0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        wgv0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        wgv0Var = new wgv0(this, lnmVar);
                    }
                } else {
                    wgv0Var = new wgv0(this, lnmVar);
                }
                Object obj29 = wgv0Var.a;
                int i54 = wgv0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
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
                wgv0Var.b = 1;
                return vr20Var.emit(obj, wgv0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof xgv0) {
                    xgv0Var = (xgv0) lnmVar;
                    int i55 = xgv0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        xgv0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        xgv0Var = new xgv0(this, lnmVar);
                    }
                } else {
                    xgv0Var = new xgv0(this, lnmVar);
                }
                Object obj30 = xgv0Var.a;
                int i56 = xgv0Var.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    String str2 = ((th61) obj).a;
                    xgv0Var.b = 1;
                    return vr20Var.emit(str2, xgv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof ygv0) {
                    ygv0Var = (ygv0) lnmVar;
                    int i57 = ygv0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        ygv0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        ygv0Var = new ygv0(this, lnmVar);
                    }
                } else {
                    ygv0Var = new ygv0(this, lnmVar);
                }
                Object obj31 = ygv0Var.a;
                int i58 = ygv0Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                if (!(obj instanceof zq90)) {
                    return rih1Var;
                }
                ygv0Var.b = 1;
                return vr20Var.emit(obj, ygv0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof okv0) {
                    okv0Var = (okv0) lnmVar;
                    int i59 = okv0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        okv0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        okv0Var = new okv0(this, lnmVar);
                    }
                } else {
                    okv0Var = new okv0(this, lnmVar);
                }
                Object obj32 = okv0Var.a;
                int i60 = okv0Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                Map map = (Map) obj;
                map.getClass();
                xkv0 xkv0Var = new xkv0(map);
                okv0Var.b = 1;
                return vr20Var.emit(xkv0Var, okv0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ dfu0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    public /* synthetic */ dfu0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }
}
