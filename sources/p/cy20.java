package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cy20 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public cy20(vr20 vr20Var, wc30 wc30Var) {
        this.a = (byte) 8;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x020d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0278  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:193:0x0329  */
    /* JADX WARN: Code duplicated, block: B:212:0x0373  */
    /* JADX WARN: Code duplicated, block: B:224:0x0399  */
    /* JADX WARN: Code duplicated, block: B:239:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:256:0x0414  */
    /* JADX WARN: Code duplicated, block: B:279:0x0486  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:315:0x0518  */
    /* JADX WARN: Code duplicated, block: B:330:0x0557  */
    /* JADX WARN: Code duplicated, block: B:353:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:368:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:385:0x0620  */
    /* JADX WARN: Code duplicated, block: B:400:0x0659  */
    /* JADX WARN: Code duplicated, block: B:423:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:460:0x071c  */
    /* JADX WARN: Code duplicated, block: B:477:0x0757  */
    /* JADX WARN: Code duplicated, block: B:492:0x079c  */
    /* JADX WARN: Code duplicated, block: B:509:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:524:0x0819  */
    /* JADX WARN: Code duplicated, block: B:539:0x0854  */
    /* JADX WARN: Code duplicated, block: B:556:0x0895  */
    /* JADX WARN: Code duplicated, block: B:573:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0195  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object emit(Object obj, lnm lnmVar) {
        by20 by20Var;
        ly20 ly20Var;
        m230 m230Var;
        o230 o230Var;
        x330 x330Var;
        g530 g530Var;
        i530 i530Var;
        y530 y530Var;
        vc30 vc30Var;
        mo30 mo30Var;
        pnk rnkVar;
        no30 no30Var;
        bt30 bt30Var;
        jw30 jw30Var;
        h040 h040Var;
        g440 g440Var;
        h440 h440Var;
        g740 g740Var;
        l740 l740Var;
        y840 y840Var;
        ae40 ae40Var;
        qf40 qf40Var;
        tq40 tq40Var;
        lr40 lr40Var;
        mr40 mr40Var;
        qt40 qt40Var;
        List listSingletonList;
        hu40 hu40Var;
        tz40 tz40Var;
        xf50 xf50Var;
        ah50 ah50Var;
        h5e0 m5e0Var;
        h5e0 h5e0Var;
        nk50 nk50Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object c040Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof by20) {
                    by20Var = (by20) lnmVar;
                    int i = by20Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        by20Var.b = i - Integer.MIN_VALUE;
                    } else {
                        by20Var = new by20(this, lnmVar);
                    }
                } else {
                    by20Var = new by20(this, lnmVar);
                }
                Object obj2 = by20Var.a;
                int i2 = by20Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    o6d1 o6d1Var = new o6d1(((Boolean) obj).booleanValue());
                    by20Var.b = 1;
                    return vr20Var.emit(o6d1Var, by20Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof ly20) {
                    ly20Var = (ly20) lnmVar;
                    int i3 = ly20Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ly20Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ly20Var = new ly20(this, lnmVar);
                    }
                } else {
                    ly20Var = new ly20(this, lnmVar);
                }
                Object obj3 = ly20Var.a;
                int i4 = ly20Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!(obj instanceof ty20)) {
                    return rih1Var;
                }
                ly20Var.b = 1;
                return vr20Var.emit(obj, ly20Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof m230) {
                    m230Var = (m230) lnmVar;
                    int i5 = m230Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        m230Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        m230Var = new m230(this, lnmVar);
                    }
                } else {
                    m230Var = new m230(this, lnmVar);
                }
                Object obj4 = m230Var.a;
                int i6 = m230Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (((YourLibraryDecorateResponse) obj).p().o()) {
                    return rih1Var;
                }
                m230Var.b = 1;
                return vr20Var.emit(obj, m230Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof o230) {
                    o230Var = (o230) lnmVar;
                    int i7 = o230Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        o230Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        o230Var = new o230(this, lnmVar);
                    }
                } else {
                    o230Var = new o230(this, lnmVar);
                }
                Object obj5 = o230Var.a;
                int i8 = o230Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    String strP = t6p1.p((YourLibraryDecorateResponse) obj);
                    o230Var.b = 1;
                    return vr20Var.emit(strP, o230Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof x330) {
                    x330Var = (x330) lnmVar;
                    int i9 = x330Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x330Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        x330Var = new x330(this, lnmVar);
                    }
                } else {
                    x330Var = new x330(this, lnmVar);
                }
                Object obj6 = x330Var.a;
                int i10 = x330Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    n330 n330Var = new n330(((Boolean) obj).booleanValue());
                    x330Var.b = 1;
                    return vr20Var.emit(n330Var, x330Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof g530) {
                    g530Var = (g530) lnmVar;
                    int i11 = g530Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        g530Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        g530Var = new g530(this, lnmVar);
                    }
                } else {
                    g530Var = new g530(this, lnmVar);
                }
                Object obj7 = g530Var.a;
                int i12 = g530Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (((Map) obj).isEmpty()) {
                    return rih1Var;
                }
                g530Var.b = 1;
                return vr20Var.emit(obj, g530Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof i530) {
                    i530Var = (i530) lnmVar;
                    int i13 = i530Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i530Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        i530Var = new i530(this, lnmVar);
                    }
                } else {
                    i530Var = new i530(this, lnmVar);
                }
                Object obj8 = i530Var.a;
                int i14 = i530Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    d530 d530Var = new d530(new s630(((Boolean) obj).booleanValue()));
                    i530Var.b = 1;
                    return vr20Var.emit(d530Var, i530Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof y530) {
                    y530Var = (y530) lnmVar;
                    int i15 = y530Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        y530Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        y530Var = new y530(this, lnmVar);
                    }
                } else {
                    y530Var = new y530(this, lnmVar);
                }
                Object obj9 = y530Var.a;
                int i16 = y530Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (((p530) obj).a == null) {
                    return rih1Var;
                }
                y530Var.b = 1;
                return vr20Var.emit(obj, y530Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof vc30) {
                    vc30Var = (vc30) lnmVar;
                    int i17 = vc30Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vc30Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        vc30Var = new vc30(this, lnmVar);
                    }
                } else {
                    vc30Var = new vc30(this, lnmVar);
                }
                Object obj10 = vc30Var.a;
                int i18 = vc30Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    tc30 tc30Var = (tc30) obj;
                    int i19 = tc30Var != null ? tc30Var.a : 0;
                    int i20 = i19 == 0 ? -1 : uc30.a[l1d.C(i19)];
                    if (i20 != -1) {
                        if (i20 == 1) {
                            c040Var = 1;
                        } else if (i20 == 2) {
                            c040Var = 0;
                        } else if (i20 == 3) {
                            c040Var = 14;
                        } else if (i20 != 4) {
                            eg.o();
                        }
                    }
                    vc30Var.b = 1;
                    return vr20Var.emit(c040Var, vc30Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof mo30) {
                    mo30Var = (mo30) lnmVar;
                    int i21 = mo30Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        mo30Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        mo30Var = new mo30(this, lnmVar);
                    }
                } else {
                    mo30Var = new mo30(this, lnmVar);
                }
                Object obj11 = mo30Var.a;
                int i22 = mo30Var.b;
                if (i22 == 0) {
                    hm5.M(obj11);
                    owc1 owc1Var = (owc1) obj;
                    if (owc1Var instanceof mwc1) {
                        rnkVar = new pnk(((mwc1) owc1Var).a);
                    } else if (owc1Var instanceof nwc1) {
                        rnkVar = new rnk(((nwc1) owc1Var).a);
                    } else {
                        eg.o();
                    }
                    mo30Var.b = 1;
                    return vr20Var.emit(rnkVar, mo30Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof no30) {
                    no30Var = (no30) lnmVar;
                    int i23 = no30Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        no30Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        no30Var = new no30(this, lnmVar);
                    }
                } else {
                    no30Var = new no30(this, lnmVar);
                }
                Object obj12 = no30Var.a;
                int i24 = no30Var.b;
                if (i24 == 0) {
                    hm5.M(obj12);
                    no30Var.b = 1;
                    return vr20Var.emit(mnk.a, no30Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof bt30) {
                    bt30Var = (bt30) lnmVar;
                    int i25 = bt30Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        bt30Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        bt30Var = new bt30(this, lnmVar);
                    }
                } else {
                    bt30Var = new bt30(this, lnmVar);
                }
                Object obj13 = bt30Var.a;
                int i26 = bt30Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                Object obj14 = ((cma1) obj).a;
                if (obj14 == null) {
                    return rih1Var;
                }
                bt30Var.b = 1;
                return vr20Var.emit(obj14, bt30Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof jw30) {
                    jw30Var = (jw30) lnmVar;
                    int i27 = jw30Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        jw30Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        jw30Var = new jw30(this, lnmVar);
                    }
                } else {
                    jw30Var = new jw30(this, lnmVar);
                }
                Object obj15 = jw30Var.a;
                int i28 = jw30Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    ozz ozzVar = new ozz(((jo60) obj).a);
                    jw30Var.b = 1;
                    return vr20Var.emit(ozzVar, jw30Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof h040) {
                    h040Var = (h040) lnmVar;
                    int i29 = h040Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        h040Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        h040Var = new h040(this, lnmVar);
                    }
                } else {
                    h040Var = new h040(this, lnmVar);
                }
                Object obj16 = h040Var.a;
                int i30 = h040Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    bkz0 bkz0Var = (bkz0) obj;
                    if (bkz0Var instanceof akz0) {
                        c040Var = new c040(((akz0) bkz0Var).a);
                    } else if (!(bkz0Var instanceof zjz0)) {
                        eg.o();
                    }
                    if (c040Var == null) {
                        return rih1Var;
                    }
                    h040Var.b = 1;
                    return vr20Var.emit(c040Var, h040Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof g440) {
                    g440Var = (g440) lnmVar;
                    int i31 = g440Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        g440Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        g440Var = new g440(this, lnmVar);
                    }
                } else {
                    g440Var = new g440(this, lnmVar);
                }
                Object obj17 = g440Var.a;
                int i32 = g440Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                it61 it61Var = new it61(bool);
                g440Var.b = 1;
                return vr20Var.emit(it61Var, g440Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof h440) {
                    h440Var = (h440) lnmVar;
                    int i33 = h440Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h440Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        h440Var = new h440(this, lnmVar);
                    }
                } else {
                    h440Var = new h440(this, lnmVar);
                }
                Object obj18 = h440Var.a;
                int i34 = h440Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                PlaybackSettingsEsperantoService.StreamSettingChange streamSettingChange = (PlaybackSettingsEsperantoService.StreamSettingChange) obj;
                if (streamSettingChange.p() && streamSettingChange.o().v()) {
                    c040Var = Boolean.valueOf(streamSettingChange.o().r());
                }
                if (c040Var == null) {
                    return rih1Var;
                }
                h440Var.b = 1;
                return vr20Var.emit(c040Var, h440Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof g740) {
                    g740Var = (g740) lnmVar;
                    int i35 = g740Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g740Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        g740Var = new g740(this, lnmVar);
                    }
                } else {
                    g740Var = new g740(this, lnmVar);
                }
                Object obj19 = g740Var.a;
                int i36 = g740Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf = Boolean.valueOf(((bf90) obj).a);
                    g740Var.b = 1;
                    return vr20Var.emit(boolValueOf, g740Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof l740) {
                    l740Var = (l740) lnmVar;
                    int i37 = l740Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        l740Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        l740Var = new l740(this, lnmVar);
                    }
                } else {
                    l740Var = new l740(this, lnmVar);
                }
                Object obj20 = l740Var.a;
                int i38 = l740Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    Set<String> set = (Set) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    for (String str : set) {
                        if (new y6b1(str, false).c == v6b1.H1) {
                            arrayList.add(new s640(str, (String) null));
                        } else {
                            hhg1.n("ContextUri must be an show");
                        }
                    }
                    Set setP1 = o7h.p1(arrayList);
                    l740Var.b = 1;
                    return vr20Var.emit(setP1, l740Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof y840) {
                    y840Var = (y840) lnmVar;
                    int i39 = y840Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        y840Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        y840Var = new y840(this, lnmVar);
                    }
                } else {
                    y840Var = new y840(this, lnmVar);
                }
                Object obj21 = y840Var.a;
                int i40 = y840Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (!((w281) obj).c) {
                    return rih1Var;
                }
                y840Var.b = 1;
                return vr20Var.emit(obj, y840Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof ae40) {
                    ae40Var = (ae40) lnmVar;
                    int i41 = ae40Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ae40Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        ae40Var = new ae40(this, lnmVar);
                    }
                } else {
                    ae40Var = new ae40(this, lnmVar);
                }
                Object obj22 = ae40Var.a;
                int i42 = ae40Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    td40 td40Var = new td40(((Boolean) obj).booleanValue());
                    ae40Var.b = 1;
                    return vr20Var.emit(td40Var, ae40Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof qf40) {
                    qf40Var = (qf40) lnmVar;
                    int i43 = qf40Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        qf40Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        qf40Var = new qf40(this, lnmVar);
                    }
                } else {
                    qf40Var = new qf40(this, lnmVar);
                }
                Object obj23 = qf40Var.a;
                int i44 = qf40Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                List<k581> listA = ((t681) obj).a();
                ArrayList arrayList2 = new ArrayList();
                for (k581 k581Var : listA) {
                    String str2 = k581Var.d;
                    if (str2 == null) {
                        str2 = null;
                    } else {
                        if (ihc1.y0(str2)) {
                            str2 = null;
                        }
                        if (str2 == null || k581Var.f != 1) {
                            str2 = null;
                        }
                    }
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                Set setP2 = o7h.p1(arrayList2);
                qf40Var.b = 1;
                return vr20Var.emit(setP2, qf40Var) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof tq40) {
                    tq40Var = (tq40) lnmVar;
                    int i45 = tq40Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        tq40Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        tq40Var = new tq40(this, lnmVar);
                    }
                } else {
                    tq40Var = new tq40(this, lnmVar);
                }
                Object obj24 = tq40Var.a;
                int i46 = tq40Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                tq40Var.b = 1;
                return vr20Var.emit(obj, tq40Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof lr40) {
                    lr40Var = (lr40) lnmVar;
                    int i47 = lr40Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        lr40Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        lr40Var = new lr40(this, lnmVar);
                    }
                } else {
                    lr40Var = new lr40(this, lnmVar);
                }
                Object obj25 = lr40Var.a;
                int i48 = lr40Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                lr40Var.b = 1;
                return vr20Var.emit(obj, lr40Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof mr40) {
                    mr40Var = (mr40) lnmVar;
                    int i49 = mr40Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mr40Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        mr40Var = new mr40(this, lnmVar);
                    }
                } else {
                    mr40Var = new mr40(this, lnmVar);
                }
                Object obj26 = mr40Var.a;
                int i50 = mr40Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    String str3 = ((th61) obj).a;
                    mr40Var.b = 1;
                    return vr20Var.emit(str3, mr40Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof qt40) {
                    qt40Var = (qt40) lnmVar;
                    int i51 = qt40Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        qt40Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        qt40Var = new qt40(this, lnmVar);
                    }
                } else {
                    qt40Var = new qt40(this, lnmVar);
                }
                Object obj27 = qt40Var.a;
                int i52 = qt40Var.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    qmm1 qmm1Var = (smm1) obj;
                    if (qmm1Var instanceof qmm1) {
                        listSingletonList = Collections.singletonList(qi.c(tt40.a, ihc1.H0(qmm1Var.a, "ProjectionDevice-"), (String) null, (String) null, (List) null, Boolean.TRUE, (axo1) null, (cn70) null, 222));
                    } else if (u890.j(qmm1Var, rmm1.a)) {
                        listSingletonList = z6x.a;
                    } else {
                        eg.o();
                    }
                    qt40Var.b = 1;
                    return vr20Var.emit(listSingletonList, qt40Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof hu40) {
                    hu40Var = (hu40) lnmVar;
                    int i53 = hu40Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hu40Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        hu40Var = new hu40(this, lnmVar);
                    }
                } else {
                    hu40Var = new hu40(this, lnmVar);
                }
                Object obj28 = hu40Var.a;
                int i54 = hu40Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!(obj instanceof qmm1)) {
                    return rih1Var;
                }
                hu40Var.b = 1;
                return vr20Var.emit(obj, hu40Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof tz40) {
                    tz40Var = (tz40) lnmVar;
                    int i55 = tz40Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        tz40Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        tz40Var = new tz40(this, lnmVar);
                    }
                } else {
                    tz40Var = new tz40(this, lnmVar);
                }
                Object obj29 = tz40Var.a;
                int i56 = tz40Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    return rih1Var;
                }
                tz40Var.b = 1;
                return vr20Var.emit(obj, tz40Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof xf50) {
                    xf50Var = (xf50) lnmVar;
                    int i57 = xf50Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        xf50Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        xf50Var = new xf50(this, lnmVar);
                    }
                } else {
                    xf50Var = new xf50(this, lnmVar);
                }
                Object obj30 = xf50Var.a;
                int i58 = xf50Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                wf50 wf50Var = (wf50) obj;
                List<String> list = wf50Var.a;
                ArrayList arrayList3 = new ArrayList();
                for (String str4 : list) {
                    List list2 = wf50Var.b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj31 : list2) {
                        if (((zvh) obj31).a.equals(str4)) {
                            arrayList4.add(obj31);
                        }
                    }
                    r7h.W(arrayList4, arrayList3);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    r7h.W(((zvh) it.next()).b, arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj32 : arrayList5) {
                    if (((rzh) obj32).c instanceof zkb) {
                        arrayList7.add(obj32);
                    } else {
                        arrayList6.add(obj32);
                    }
                }
                vf50 vf50Var = new vf50(o7h.N0(arrayList7, arrayList6));
                xf50Var.b = 1;
                return vr20Var.emit(vf50Var, xf50Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof ah50) {
                    ah50Var = (ah50) lnmVar;
                    int i59 = ah50Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ah50Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        ah50Var = new ah50(this, lnmVar);
                    }
                } else {
                    ah50Var = new ah50(this, lnmVar);
                }
                Object obj33 = ah50Var.a;
                int i60 = ah50Var.b;
                if (i60 == 0) {
                    hm5.M(obj33);
                    gh50 gh50Var = (ih50) obj;
                    if (gh50Var instanceof hh50) {
                        h5e0Var = h5e0.a;
                    } else {
                        if (gh50Var instanceof gh50) {
                            m5e0Var = new f5e0(mqo1.A(gh50Var.a));
                        } else if (gh50Var instanceof fh50) {
                            m5e0Var = new m5e0(((fh50) gh50Var).a);
                        } else {
                            eg.o();
                        }
                        h5e0Var = m5e0Var;
                    }
                    ah50Var.b = 1;
                    return vr20Var.emit(h5e0Var, ah50Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof nk50) {
                    nk50Var = (nk50) lnmVar;
                    int i61 = nk50Var.b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        nk50Var.b = i61 - Integer.MIN_VALUE;
                    } else {
                        nk50Var = new nk50(this, lnmVar);
                    }
                } else {
                    nk50Var = new nk50(this, lnmVar);
                }
                Object obj34 = nk50Var.a;
                int i62 = nk50Var.b;
                if (i62 == 0) {
                    hm5.M(obj34);
                    Object objH = ((spq0) obj).h();
                    nk50Var.b = 1;
                    return vr20Var.emit(objH, nk50Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i62 == 1) {
                    hm5.M(obj34);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ cy20(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
