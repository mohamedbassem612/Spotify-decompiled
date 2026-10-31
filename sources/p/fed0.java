package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fed0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public fed0(vr20 vr20Var, vld0 vld0Var) {
        this.a = (byte) 16;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0268  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:197:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:215:0x0330  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:271:0x0409  */
    /* JADX WARN: Code duplicated, block: B:288:0x0444  */
    /* JADX WARN: Code duplicated, block: B:303:0x0482  */
    /* JADX WARN: Code duplicated, block: B:318:0x04be  */
    /* JADX WARN: Code duplicated, block: B:333:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:348:0x053d  */
    /* JADX WARN: Code duplicated, block: B:363:0x0577  */
    /* JADX WARN: Code duplicated, block: B:383:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:398:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:413:0x0639  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:428:0x0677  */
    /* JADX WARN: Code duplicated, block: B:445:0x06af  */
    /* JADX WARN: Code duplicated, block: B:460:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:475:0x0723  */
    /* JADX WARN: Code duplicated, block: B:497:0x0768  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        eed0 eed0Var;
        ged0 ged0Var;
        hed0 hed0Var;
        ied0 ied0Var;
        kfd0 kfd0Var;
        mfd0 mfd0Var;
        nfd0 nfd0Var;
        ofd0 ofd0Var;
        tgd0 tgd0Var;
        vgd0 vgd0Var;
        wgd0 wgd0Var;
        xgd0 xgd0Var;
        ygd0 ygd0Var;
        mhd0 mhd0Var;
        tjd0 tjd0Var;
        vkd0 vkd0Var;
        sld0 sld0Var;
        Long m231Var;
        Object mld0Var;
        uld0 uld0Var;
        znd0 znd0Var;
        dod0 dod0Var;
        nrd0 nrd0Var;
        d1e0 d1e0Var;
        i1e0 i1e0Var;
        n1e0 n1e0Var;
        o1e0 o1e0Var;
        q1e0 q1e0Var;
        r1e0 r1e0Var;
        s1e0 s1e0Var;
        t1e0 t1e0Var;
        y1e0 y1e0Var;
        byte b = this.a;
        Object obj2 = j9d0.a;
        i9d0 i9d0Var = i9d0.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof eed0) {
                    eed0Var = (eed0) lnmVar;
                    int i = eed0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eed0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        eed0Var = new eed0(this, lnmVar);
                    }
                } else {
                    eed0Var = new eed0(this, lnmVar);
                }
                Object obj3 = eed0Var.a;
                int i2 = eed0Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    vl10 vl10Var = (vl10) obj;
                    if (vl10Var instanceof ul10) {
                        obj2 = i9d0Var;
                    } else if (!(vl10Var instanceof tl10)) {
                        eg.o();
                    }
                    eed0Var.b = 1;
                    return vr20Var.emit(obj2, eed0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof ged0) {
                    ged0Var = (ged0) lnmVar;
                    int i3 = ged0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ged0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ged0Var = new ged0(this, lnmVar);
                    }
                } else {
                    ged0Var = new ged0(this, lnmVar);
                }
                Object obj4 = ged0Var.a;
                int i4 = ged0Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    vl10 vl10Var2 = (vl10) obj;
                    if (vl10Var2 instanceof ul10) {
                        obj2 = i9d0Var;
                    } else if (!(vl10Var2 instanceof tl10)) {
                        eg.o();
                    }
                    ged0Var.b = 1;
                    return vr20Var.emit(obj2, ged0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof hed0) {
                    hed0Var = (hed0) lnmVar;
                    int i5 = hed0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hed0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        hed0Var = new hed0(this, lnmVar);
                    }
                } else {
                    hed0Var = new hed0(this, lnmVar);
                }
                Object obj5 = hed0Var.a;
                int i6 = hed0Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    ibd0 ibd0VarL = c0p1.l((vl10) obj);
                    hed0Var.b = 1;
                    return vr20Var.emit(ibd0VarL, hed0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof ied0) {
                    ied0Var = (ied0) lnmVar;
                    int i7 = ied0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ied0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        ied0Var = new ied0(this, lnmVar);
                    }
                } else {
                    ied0Var = new ied0(this, lnmVar);
                }
                Object obj6 = ied0Var.a;
                int i8 = ied0Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    ibd0 ibd0VarL2 = c0p1.l((vl10) obj);
                    ied0Var.b = 1;
                    return vr20Var.emit(ibd0VarL2, ied0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof kfd0) {
                    kfd0Var = (kfd0) lnmVar;
                    int i9 = kfd0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        kfd0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        kfd0Var = new kfd0(this, lnmVar);
                    }
                } else {
                    kfd0Var = new kfd0(this, lnmVar);
                }
                Object obj7 = kfd0Var.a;
                int i10 = kfd0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                a5w0 a5w0Var = (a5w0) obj;
                if (a5w0Var == null) {
                    return rih1Var;
                }
                kfd0Var.b = 1;
                return vr20Var.emit(a5w0Var, kfd0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof mfd0) {
                    mfd0Var = (mfd0) lnmVar;
                    int i11 = mfd0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mfd0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        mfd0Var = new mfd0(this, lnmVar);
                    }
                } else {
                    mfd0Var = new mfd0(this, lnmVar);
                }
                Object obj8 = mfd0Var.a;
                int i12 = mfd0Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    mfd0Var.b = 1;
                    return vr20Var.emit(boolValueOf, mfd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof nfd0) {
                    nfd0Var = (nfd0) lnmVar;
                    int i13 = nfd0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        nfd0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        nfd0Var = new nfd0(this, lnmVar);
                    }
                } else {
                    nfd0Var = new nfd0(this, lnmVar);
                }
                Object obj9 = nfd0Var.a;
                int i14 = nfd0Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf2 = Boolean.valueOf(u890.j((ibd0) obj, ebd0.a));
                    nfd0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, nfd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof ofd0) {
                    ofd0Var = (ofd0) lnmVar;
                    int i15 = ofd0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ofd0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ofd0Var = new ofd0(this, lnmVar);
                    }
                } else {
                    ofd0Var = new ofd0(this, lnmVar);
                }
                Object obj10 = ofd0Var.a;
                int i16 = ofd0Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    x1f x1fVar = new x1f(((Boolean) obj).booleanValue());
                    ofd0Var.b = 1;
                    return vr20Var.emit(x1fVar, ofd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof tgd0) {
                    tgd0Var = (tgd0) lnmVar;
                    int i17 = tgd0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        tgd0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        tgd0Var = new tgd0(this, lnmVar);
                    }
                } else {
                    tgd0Var = new tgd0(this, lnmVar);
                }
                Object obj11 = tgd0Var.a;
                int i18 = tgd0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                ibd0 ibd0Var = (ibd0) obj;
                Boolean boolValueOf3 = Boolean.valueOf((ibd0Var instanceof ebd0) || (ibd0Var instanceof hbd0));
                tgd0Var.b = 1;
                return vr20Var.emit(boolValueOf3, tgd0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof vgd0) {
                    vgd0Var = (vgd0) lnmVar;
                    int i19 = vgd0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        vgd0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        vgd0Var = new vgd0(this, lnmVar);
                    }
                } else {
                    vgd0Var = new vgd0(this, lnmVar);
                }
                Object obj12 = vgd0Var.a;
                int i20 = vgd0Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    lax laxVarY = h0p1.y((ibd0) obj);
                    vgd0Var.b = 1;
                    return vr20Var.emit(laxVarY, vgd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof wgd0) {
                    wgd0Var = (wgd0) lnmVar;
                    int i21 = wgd0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        wgd0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        wgd0Var = new wgd0(this, lnmVar);
                    }
                } else {
                    wgd0Var = new wgd0(this, lnmVar);
                }
                Object obj13 = wgd0Var.a;
                int i22 = wgd0Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    wgd0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, wgd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof xgd0) {
                    xgd0Var = (xgd0) lnmVar;
                    int i23 = xgd0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        xgd0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        xgd0Var = new xgd0(this, lnmVar);
                    }
                } else {
                    xgd0Var = new xgd0(this, lnmVar);
                }
                Object obj14 = xgd0Var.a;
                int i24 = xgd0Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf5 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    xgd0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, xgd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof ygd0) {
                    ygd0Var = (ygd0) lnmVar;
                    int i25 = ygd0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ygd0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ygd0Var = new ygd0(this, lnmVar);
                    }
                } else {
                    ygd0Var = new ygd0(this, lnmVar);
                }
                Object obj15 = ygd0Var.a;
                int i26 = ygd0Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf6 = Boolean.valueOf(((kom1) obj) instanceof fom1);
                    ygd0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, ygd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof mhd0) {
                    mhd0Var = (mhd0) lnmVar;
                    int i27 = mhd0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        mhd0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        mhd0Var = new mhd0(this, lnmVar);
                    }
                } else {
                    mhd0Var = new mhd0(this, lnmVar);
                }
                Object obj16 = mhd0Var.a;
                int i28 = mhd0Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    mhd0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, mhd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof tjd0) {
                    tjd0Var = (tjd0) lnmVar;
                    int i29 = tjd0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        tjd0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        tjd0Var = new tjd0(this, lnmVar);
                    }
                } else {
                    tjd0Var = new tjd0(this, lnmVar);
                }
                Object obj17 = tjd0Var.a;
                int i30 = tjd0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                if (((s3s0) obj).a == null) {
                    return rih1Var;
                }
                tjd0Var.b = 1;
                return vr20Var.emit(obj, tjd0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof vkd0) {
                    vkd0Var = (vkd0) lnmVar;
                    int i31 = vkd0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        vkd0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        vkd0Var = new vkd0(this, lnmVar);
                    }
                } else {
                    vkd0Var = new vkd0(this, lnmVar);
                }
                Object obj18 = vkd0Var.a;
                int i32 = vkd0Var.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    Object obj19 = ((PlayerState) obj).contextMetadata().get("listening_party_notify_preview_almost_ended_timestamp");
                    vkd0Var.b = 1;
                    return vr20Var.emit(obj19, vkd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof sld0) {
                    sld0Var = (sld0) lnmVar;
                    int i33 = sld0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        sld0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        sld0Var = new sld0(this, lnmVar);
                    }
                } else {
                    sld0Var = new sld0(this, lnmVar);
                }
                Object obj20 = sld0Var.a;
                int i34 = sld0Var.b;
                if (i34 == 0) {
                    hm5.M(obj20);
                    t9c0 t9c0Var = (t9c0) obj;
                    t9c0Var.getClass();
                    String str = t9c0Var.a().a;
                    try {
                        m231Var = Long.valueOf(Instant.parse(str).toEpochMilli());
                        break;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (e331.a(m231Var) != null) {
                        try {
                            m231Var = Long.valueOf(LocalDateTime.parse(str).toInstant(ZoneOffset.UTC).toEpochMilli());
                        } catch (Throwable th2) {
                            m231Var = new m231(th2);
                        }
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    Long l = m231Var;
                    if (t9c0Var instanceof s9c0) {
                        mld0Var = new nld0(l);
                    } else if ((t9c0Var instanceof p9c0) || (t9c0Var instanceof m9c0)) {
                        mld0Var = new mld0(l);
                    } else {
                        eg.o();
                    }
                    sld0Var.b = 1;
                    return vr20Var.emit(mld0Var, sld0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof uld0) {
                    uld0Var = (uld0) lnmVar;
                    int i35 = uld0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        uld0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        uld0Var = new uld0(this, lnmVar);
                    }
                } else {
                    uld0Var = new uld0(this, lnmVar);
                }
                Object obj21 = uld0Var.a;
                int i36 = uld0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                Boolean bool = ((ekp0) obj).b.e;
                old0 old0Var = new old0(bool != null ? bool.booleanValue() : false);
                uld0Var.b = 1;
                return vr20Var.emit(old0Var, uld0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof znd0) {
                    znd0Var = (znd0) lnmVar;
                    int i37 = znd0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        znd0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        znd0Var = new znd0(this, lnmVar);
                    }
                } else {
                    znd0Var = new znd0(this, lnmVar);
                }
                Object obj22 = znd0Var.a;
                int i38 = znd0Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                List list = (List) obj;
                list.getClass();
                ijo ijoVar = new ijo(8, o7h.p1(list), w7x.a);
                znd0Var.b = 1;
                return vr20Var.emit(ijoVar, znd0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof dod0) {
                    dod0Var = (dod0) lnmVar;
                    int i39 = dod0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dod0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        dod0Var = new dod0(this, lnmVar);
                    }
                } else {
                    dod0Var = new dod0(this, lnmVar);
                }
                Object obj23 = dod0Var.a;
                int i40 = dod0Var.b;
                if (i40 == 0) {
                    hm5.M(obj23);
                    fio fioVar = new fio((Map) obj);
                    dod0Var.b = 1;
                    return vr20Var.emit(fioVar, dod0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof nrd0) {
                    nrd0Var = (nrd0) lnmVar;
                    int i41 = nrd0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        nrd0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        nrd0Var = new nrd0(this, lnmVar);
                    }
                } else {
                    nrd0Var = new nrd0(this, lnmVar);
                }
                Object obj24 = nrd0Var.a;
                int i42 = nrd0Var.b;
                if (i42 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf8 = Boolean.valueOf(((bp90) obj).a);
                    nrd0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, nrd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof d1e0) {
                    d1e0Var = (d1e0) lnmVar;
                    int i43 = d1e0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        d1e0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        d1e0Var = new d1e0(this, lnmVar);
                    }
                } else {
                    d1e0Var = new d1e0(this, lnmVar);
                }
                Object obj25 = d1e0Var.a;
                int i44 = d1e0Var.b;
                if (i44 == 0) {
                    hm5.M(obj25);
                    o7j0 o7j0Var = new o7j0(((Boolean) obj).booleanValue());
                    d1e0Var.b = 1;
                    return vr20Var.emit(o7j0Var, d1e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof i1e0) {
                    i1e0Var = (i1e0) lnmVar;
                    int i45 = i1e0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        i1e0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        i1e0Var = new i1e0(this, lnmVar);
                    }
                } else {
                    i1e0Var = new i1e0(this, lnmVar);
                }
                Object obj26 = i1e0Var.a;
                int i46 = i1e0Var.b;
                if (i46 == 0) {
                    hm5.M(obj26);
                    tad0 tad0Var = new tad0((rad0) obj);
                    i1e0Var.b = 1;
                    return vr20Var.emit(tad0Var, i1e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof n1e0) {
                    n1e0Var = (n1e0) lnmVar;
                    int i47 = n1e0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        n1e0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        n1e0Var = new n1e0(this, lnmVar);
                    }
                } else {
                    n1e0Var = new n1e0(this, lnmVar);
                }
                Object obj27 = n1e0Var.a;
                int i48 = n1e0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                n1e0Var.b = 1;
                return vr20Var.emit(obj, n1e0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof o1e0) {
                    o1e0Var = (o1e0) lnmVar;
                    int i49 = o1e0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        o1e0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        o1e0Var = new o1e0(this, lnmVar);
                    }
                } else {
                    o1e0Var = new o1e0(this, lnmVar);
                }
                Object obj28 = o1e0Var.a;
                int i50 = o1e0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                o1e0Var.b = 1;
                return vr20Var.emit(obj, o1e0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof q1e0) {
                    q1e0Var = (q1e0) lnmVar;
                    int i51 = q1e0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        q1e0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        q1e0Var = new q1e0(this, lnmVar);
                    }
                } else {
                    q1e0Var = new q1e0(this, lnmVar);
                }
                Object obj29 = q1e0Var.a;
                int i52 = q1e0Var.b;
                if (i52 == 0) {
                    hm5.M(obj29);
                    Object obj30 = ((i1r) obj).a;
                    q1e0Var.b = 1;
                    return vr20Var.emit(obj30, q1e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof r1e0) {
                    r1e0Var = (r1e0) lnmVar;
                    int i53 = r1e0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        r1e0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        r1e0Var = new r1e0(this, lnmVar);
                    }
                } else {
                    r1e0Var = new r1e0(this, lnmVar);
                }
                Object obj31 = r1e0Var.a;
                int i54 = r1e0Var.b;
                if (i54 == 0) {
                    hm5.M(obj31);
                    Object obj32 = ((i1r) obj).a;
                    r1e0Var.b = 1;
                    return vr20Var.emit(obj32, r1e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof s1e0) {
                    s1e0Var = (s1e0) lnmVar;
                    int i55 = s1e0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        s1e0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        s1e0Var = new s1e0(this, lnmVar);
                    }
                } else {
                    s1e0Var = new s1e0(this, lnmVar);
                }
                Object obj33 = s1e0Var.a;
                int i56 = s1e0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                s1e0Var.b = 1;
                return vr20Var.emit(obj, s1e0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof t1e0) {
                    t1e0Var = (t1e0) lnmVar;
                    int i57 = t1e0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        t1e0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        t1e0Var = new t1e0(this, lnmVar);
                    }
                } else {
                    t1e0Var = new t1e0(this, lnmVar);
                }
                Object obj34 = t1e0Var.a;
                int i58 = t1e0Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                t1e0Var.b = 1;
                return vr20Var.emit(obj, t1e0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof y1e0) {
                    y1e0Var = (y1e0) lnmVar;
                    int i59 = y1e0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        y1e0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        y1e0Var = new y1e0(this, lnmVar);
                    }
                } else {
                    y1e0Var = new y1e0(this, lnmVar);
                }
                Object obj35 = y1e0Var.a;
                int i60 = y1e0Var.b;
                if (i60 == 0) {
                    hm5.M(obj35);
                    kcv kcvVar = new kcv((gbv) obj);
                    y1e0Var.b = 1;
                    return vr20Var.emit(kcvVar, y1e0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj35);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ fed0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
