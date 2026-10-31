package p;

import com.spotify.deviceproxy.navigation.v1.NavigationCommand;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mcn0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public mcn0(vr20 vr20Var, km0 km0Var) {
        this.a = (byte) 17;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:133:0x0226  */
    /* JADX WARN: Code duplicated, block: B:148:0x0261  */
    /* JADX WARN: Code duplicated, block: B:163:0x029e  */
    /* JADX WARN: Code duplicated, block: B:182:0x02df  */
    /* JADX WARN: Code duplicated, block: B:197:0x031f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0373  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:253:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:276:0x044b  */
    /* JADX WARN: Code duplicated, block: B:296:0x048f  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:328:0x0506  */
    /* JADX WARN: Code duplicated, block: B:350:0x0555  */
    /* JADX WARN: Code duplicated, block: B:365:0x0594  */
    /* JADX WARN: Code duplicated, block: B:380:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:397:0x060e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:414:0x0651  */
    /* JADX WARN: Code duplicated, block: B:429:0x068e  */
    /* JADX WARN: Code duplicated, block: B:446:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:456:0x0701  */
    /* JADX WARN: Code duplicated, block: B:466:0x071e  */
    /* JADX WARN: Code duplicated, block: B:481:0x075e  */
    /* JADX WARN: Code duplicated, block: B:496:0x079b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Object emit(Object obj, lnm lnmVar) {
        lcn0 lcn0Var;
        pcn0 pcn0Var;
        qcn0 qcn0Var;
        len0 len0Var;
        a811 a811Var;
        rfn0 rfn0Var;
        tgn0 tgn0Var;
        ztn0 ztn0Var;
        aun0 aun0Var;
        dvn0 dvn0Var;
        evn0 evn0Var;
        ovn0 ovn0Var;
        h1o0 h1o0Var;
        l2o0 l2o0Var;
        c3o0 c3o0Var;
        u4o0 u4o0Var;
        i4o0 i4o0Var;
        c5o0 c5o0Var;
        d5o0 d5o0Var;
        b9o0 b9o0Var;
        spo0 spo0Var;
        ypo0 ypo0Var;
        zpo0 zpo0Var;
        avo0 avo0Var;
        fyo0 fyo0Var;
        gyo0 gyo0Var;
        i0p0 i0p0Var;
        j0p0 j0p0Var;
        l0p0 l0p0Var;
        e4p0 e4p0Var;
        f4p0 f4p0Var;
        h4p0 h4p0Var;
        byte b = this.a;
        w8c0 w8c0Var = w8c0.e;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof lcn0) {
                    lcn0Var = (lcn0) lnmVar;
                    int i = lcn0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lcn0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        lcn0Var = new lcn0(this, lnmVar);
                    }
                } else {
                    lcn0Var = new lcn0(this, lnmVar);
                }
                Object obj3 = lcn0Var.a;
                int i2 = lcn0Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    ly50 ly50VarA = ly50.a((ly50) obj, null, true, false, 0, false, null, null, 249);
                    lcn0Var.b = 1;
                    return vr20Var.emit(ly50VarA, lcn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof pcn0) {
                    pcn0Var = (pcn0) lnmVar;
                    int i3 = pcn0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pcn0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        pcn0Var = new pcn0(this, lnmVar);
                    }
                } else {
                    pcn0Var = new pcn0(this, lnmVar);
                }
                Object obj4 = pcn0Var.a;
                int i4 = pcn0Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((ecn0) obj) instanceof dcn0);
                    pcn0Var.b = 1;
                    return vr20Var.emit(boolValueOf, pcn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof qcn0) {
                    qcn0Var = (qcn0) lnmVar;
                    int i5 = qcn0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qcn0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        qcn0Var = new qcn0(this, lnmVar);
                    }
                } else {
                    qcn0Var = new qcn0(this, lnmVar);
                }
                Object obj5 = qcn0Var.a;
                int i6 = qcn0Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    qcn0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, qcn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof len0) {
                    len0Var = (len0) lnmVar;
                    int i7 = len0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        len0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        len0Var = new len0(this, lnmVar);
                    }
                } else {
                    len0Var = new len0(this, lnmVar);
                }
                Object obj6 = len0Var.a;
                int i8 = len0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                bma1 bma1Var = men0.c;
                Integer num = (Integer) ((cma1) obj).a;
                if (num != null) {
                    a811Var = (a811) men0.d.get(Integer.valueOf(num.intValue()));
                    if (a811Var == null) {
                        a811Var = men0.e;
                    }
                } else {
                    a811Var = men0.e;
                }
                len0Var.b = 1;
                return vr20Var.emit(a811Var, len0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof rfn0) {
                    rfn0Var = (rfn0) lnmVar;
                    int i9 = rfn0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        rfn0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        rfn0Var = new rfn0(this, lnmVar);
                    }
                } else {
                    rfn0Var = new rfn0(this, lnmVar);
                }
                Object obj7 = rfn0Var.a;
                int i10 = rfn0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
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
                rfn0Var.b = 1;
                return vr20Var.emit(obj, rfn0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof tgn0) {
                    tgn0Var = (tgn0) lnmVar;
                    int i11 = tgn0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tgn0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        tgn0Var = new tgn0(this, lnmVar);
                    }
                } else {
                    tgn0Var = new tgn0(this, lnmVar);
                }
                Object obj8 = tgn0Var.a;
                int i12 = tgn0Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf3 = Boolean.valueOf(((sgn0) obj).a);
                    tgn0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, tgn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof ztn0) {
                    ztn0Var = (ztn0) lnmVar;
                    int i13 = ztn0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ztn0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        ztn0Var = new ztn0(this, lnmVar);
                    }
                } else {
                    ztn0Var = new ztn0(this, lnmVar);
                }
                Object obj9 = ztn0Var.a;
                int i14 = ztn0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (!u890.j(((NavigationCommand) obj).n(), "open")) {
                    return rih1Var;
                }
                ztn0Var.b = 1;
                return vr20Var.emit(obj, ztn0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof aun0) {
                    aun0Var = (aun0) lnmVar;
                    int i15 = aun0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        aun0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        aun0Var = new aun0(this, lnmVar);
                    }
                } else {
                    aun0Var = new aun0(this, lnmVar);
                }
                Object obj10 = aun0Var.a;
                int i16 = aun0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                if (((NavigationCommand) obj).getUri().length() <= 0) {
                    return rih1Var;
                }
                aun0Var.b = 1;
                return vr20Var.emit(obj, aun0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof dvn0) {
                    dvn0Var = (dvn0) lnmVar;
                    int i17 = dvn0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        dvn0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        dvn0Var = new dvn0(this, lnmVar);
                    }
                } else {
                    dvn0Var = new dvn0(this, lnmVar);
                }
                Object obj11 = dvn0Var.a;
                int i18 = dvn0Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    nar0 nar0Var = ((bn70) obj).c;
                    dvn0Var.b = 1;
                    return vr20Var.emit(nar0Var, dvn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof evn0) {
                    evn0Var = (evn0) lnmVar;
                    int i19 = evn0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        evn0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        evn0Var = new evn0(this, lnmVar);
                    }
                } else {
                    evn0Var = new evn0(this, lnmVar);
                }
                Object obj12 = evn0Var.a;
                int i20 = evn0Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf4 = Boolean.valueOf(((w8c0) obj).a(w8c0Var));
                    evn0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, evn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof ovn0) {
                    ovn0Var = (ovn0) lnmVar;
                    int i21 = ovn0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ovn0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        ovn0Var = new ovn0(this, lnmVar);
                    }
                } else {
                    ovn0Var = new ovn0(this, lnmVar);
                }
                Object obj13 = ovn0Var.a;
                int i22 = ovn0Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    s8l1 s8l1Var = (u8l1) obj;
                    if (s8l1Var instanceof s8l1) {
                        obj2 = s8l1Var.a.b;
                    } else if (!u890.j(s8l1Var, t8l1.a)) {
                        eg.o();
                    }
                    ovn0Var.b = 1;
                    return vr20Var.emit(obj2, ovn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof h1o0) {
                    h1o0Var = (h1o0) lnmVar;
                    int i23 = h1o0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        h1o0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        h1o0Var = new h1o0(this, lnmVar);
                    }
                } else {
                    h1o0Var = new h1o0(this, lnmVar);
                }
                Object obj14 = h1o0Var.a;
                int i24 = h1o0Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    mmi1 mmi1Var = new mmi1((m4o0) obj);
                    h1o0Var.b = 1;
                    return vr20Var.emit(mmi1Var, h1o0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof l2o0) {
                    l2o0Var = (l2o0) lnmVar;
                    int i25 = l2o0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        l2o0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        l2o0Var = new l2o0(this, lnmVar);
                    }
                } else {
                    l2o0Var = new l2o0(this, lnmVar);
                }
                Object obj15 = l2o0Var.a;
                int i26 = l2o0Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                if (!(((dr90) obj) instanceof zq90)) {
                    return rih1Var;
                }
                l2o0Var.b = 1;
                return vr20Var.emit(obj, l2o0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof c3o0) {
                    c3o0Var = (c3o0) lnmVar;
                    int i27 = c3o0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c3o0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        c3o0Var = new c3o0(this, lnmVar);
                    }
                } else {
                    c3o0Var = new c3o0(this, lnmVar);
                }
                Object obj16 = c3o0Var.a;
                int i28 = c3o0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                th61 th61Var = (th61) obj;
                String str = th61Var.a;
                if (th61Var.b && str.length() > 0) {
                    obj2 = str;
                }
                c3o0Var.b = 1;
                return vr20Var.emit(obj2, c3o0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof u4o0) {
                    u4o0Var = (u4o0) lnmVar;
                    int i29 = u4o0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        u4o0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        u4o0Var = new u4o0(this, lnmVar);
                    }
                } else {
                    u4o0Var = new u4o0(this, lnmVar);
                }
                Object obj17 = u4o0Var.a;
                int i30 = u4o0Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    Boolean bool = (Boolean) obj;
                    if (u890.j(bool, Boolean.TRUE)) {
                        i4o0Var = i4o0.a;
                    } else if (u890.j(bool, Boolean.FALSE)) {
                        i4o0Var = j4o0.a;
                    } else {
                        eg.o();
                    }
                    u4o0Var.b = 1;
                    return vr20Var.emit(i4o0Var, u4o0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof c5o0) {
                    c5o0Var = (c5o0) lnmVar;
                    int i31 = c5o0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        c5o0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        c5o0Var = new c5o0(this, lnmVar);
                    }
                } else {
                    c5o0Var = new c5o0(this, lnmVar);
                }
                Object obj18 = c5o0Var.a;
                int i32 = c5o0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                b5o0 b5o0Var = (b5o0) obj;
                if (b5o0Var.a.length() <= 0 || b5o0Var.b.length() <= 0) {
                    return rih1Var;
                }
                c5o0Var.b = 1;
                return vr20Var.emit(obj, c5o0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof d5o0) {
                    d5o0Var = (d5o0) lnmVar;
                    int i33 = d5o0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        d5o0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        d5o0Var = new d5o0(this, lnmVar);
                    }
                } else {
                    d5o0Var = new d5o0(this, lnmVar);
                }
                Object obj19 = d5o0Var.a;
                int i34 = d5o0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                b5o0 b5o0Var2 = (b5o0) obj;
                nmi1 nmi1Var = new nmi1(b5o0Var2.a, b5o0Var2.b);
                d5o0Var.b = 1;
                return vr20Var.emit(nmi1Var, d5o0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof b9o0) {
                    b9o0Var = (b9o0) lnmVar;
                    int i35 = b9o0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        b9o0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        b9o0Var = new b9o0(this, lnmVar);
                    }
                } else {
                    b9o0Var = new b9o0(this, lnmVar);
                }
                Object obj20 = b9o0Var.a;
                int i36 = b9o0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                PlayerState playerState = (PlayerState) obj;
                playerState.getClass();
                String strO = o4p1.o(playerState);
                if (playerState.isPlaying() && !playerState.isPaused() && nhc1.Y(strO, "spotify:episode:", false)) {
                    obj2 = strO;
                }
                b9o0Var.b = 1;
                return vr20Var.emit(obj2, b9o0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof spo0) {
                    spo0Var = (spo0) lnmVar;
                    int i37 = spo0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        spo0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        spo0Var = new spo0(this, lnmVar);
                    }
                } else {
                    spo0Var = new spo0(this, lnmVar);
                }
                Object obj21 = spo0Var.a;
                int i38 = spo0Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    e2f e2fVar = new e2f(((Boolean) obj).booleanValue());
                    spo0Var.b = 1;
                    return vr20Var.emit(e2fVar, spo0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof ypo0) {
                    ypo0Var = (ypo0) lnmVar;
                    int i39 = ypo0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        ypo0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        ypo0Var = new ypo0(this, lnmVar);
                    }
                } else {
                    ypo0Var = new ypo0(this, lnmVar);
                }
                Object obj22 = ypo0Var.a;
                int i40 = ypo0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                gfe gfeVar = ((qmq0) obj).b;
                if (gfeVar != gfe.b && gfeVar != gfe.c) {
                    return rih1Var;
                }
                ypo0Var.b = 1;
                return vr20Var.emit(obj, ypo0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof zpo0) {
                    zpo0Var = (zpo0) lnmVar;
                    int i41 = zpo0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        zpo0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        zpo0Var = new zpo0(this, lnmVar);
                    }
                } else {
                    zpo0Var = new zpo0(this, lnmVar);
                }
                Object obj23 = zpo0Var.a;
                int i42 = zpo0Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf5 = Boolean.valueOf(((qmq0) obj).c);
                    zpo0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, zpo0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof avo0) {
                    avo0Var = (avo0) lnmVar;
                    int i43 = avo0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        avo0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        avo0Var = new avo0(this, lnmVar);
                    }
                } else {
                    avo0Var = new avo0(this, lnmVar);
                }
                Object obj24 = avo0Var.a;
                int i44 = avo0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    spq0 spq0VarA = spq0.a((pp90) obj);
                    avo0Var.b = 1;
                    return vr20Var.emit(spq0VarA, avo0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof fyo0) {
                    fyo0Var = (fyo0) lnmVar;
                    int i45 = fyo0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        fyo0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        fyo0Var = new fyo0(this, lnmVar);
                    }
                } else {
                    fyo0Var = new fyo0(this, lnmVar);
                }
                Object obj25 = fyo0Var.a;
                int i46 = fyo0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                fyo0Var.b = 1;
                return vr20Var.emit(obj, fyo0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof gyo0) {
                    gyo0Var = (gyo0) lnmVar;
                    int i47 = gyo0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gyo0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        gyo0Var = new gyo0(this, lnmVar);
                    }
                } else {
                    gyo0Var = new gyo0(this, lnmVar);
                }
                Object obj26 = gyo0Var.a;
                int i48 = gyo0Var.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    String strUri = ((ContextTrack) ((PlayerState) obj).track().b()).uri();
                    gyo0Var.b = 1;
                    return vr20Var.emit(strUri, gyo0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof i0p0) {
                    i0p0Var = (i0p0) lnmVar;
                    int i49 = i0p0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        i0p0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        i0p0Var = new i0p0(this, lnmVar);
                    }
                } else {
                    i0p0Var = new i0p0(this, lnmVar);
                }
                Object obj27 = i0p0Var.a;
                int i50 = i0p0Var.b;
                if (i50 == 0) {
                    hm5.M(obj27);
                    b0p0 b0p0Var = new b0p0(((Boolean) obj).booleanValue());
                    i0p0Var.b = 1;
                    return vr20Var.emit(b0p0Var, i0p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof j0p0) {
                    j0p0Var = (j0p0) lnmVar;
                    int i51 = j0p0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        j0p0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        j0p0Var = new j0p0(this, lnmVar);
                    }
                } else {
                    j0p0Var = new j0p0(this, lnmVar);
                }
                Object obj28 = j0p0Var.a;
                int i52 = j0p0Var.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf6 = Boolean.valueOf(!(((vir0) obj) instanceof tir0));
                    j0p0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, j0p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof l0p0) {
                    l0p0Var = (l0p0) lnmVar;
                    int i53 = l0p0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        l0p0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        l0p0Var = new l0p0(this, lnmVar);
                    }
                } else {
                    l0p0Var = new l0p0(this, lnmVar);
                }
                Object obj29 = l0p0Var.a;
                int i54 = l0p0Var.b;
                if (i54 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf7 = Boolean.valueOf(((w8c0) obj).a(w8c0Var));
                    l0p0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, l0p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof e4p0) {
                    e4p0Var = (e4p0) lnmVar;
                    int i55 = e4p0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        e4p0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        e4p0Var = new e4p0(this, lnmVar);
                    }
                } else {
                    e4p0Var = new e4p0(this, lnmVar);
                }
                Object obj30 = e4p0Var.a;
                int i56 = e4p0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                e4p0Var.b = 1;
                return vr20Var.emit(obj, e4p0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof f4p0) {
                    f4p0Var = (f4p0) lnmVar;
                    int i57 = f4p0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        f4p0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        f4p0Var = new f4p0(this, lnmVar);
                    }
                } else {
                    f4p0Var = new f4p0(this, lnmVar);
                }
                Object obj31 = f4p0Var.a;
                int i58 = f4p0Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    ((Boolean) obj).getClass();
                    f4p0Var.b = 1;
                    return vr20Var.emit(i3p0.a, f4p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof h4p0) {
                    h4p0Var = (h4p0) lnmVar;
                    int i59 = h4p0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        h4p0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        h4p0Var = new h4p0(this, lnmVar);
                    }
                } else {
                    h4p0Var = new h4p0(this, lnmVar);
                }
                Object obj32 = h4p0Var.a;
                int i60 = h4p0Var.b;
                if (i60 == 0) {
                    hm5.M(obj32);
                    o3p0 o3p0Var = new o3p0(((Boolean) obj).booleanValue());
                    h4p0Var.b = 1;
                    return vr20Var.emit(o3p0Var, h4p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ mcn0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
