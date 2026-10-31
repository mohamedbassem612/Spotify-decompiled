package p;

import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import j$.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qmd1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ qmd1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x0243  */
    /* JADX WARN: Code duplicated, block: B:166:0x0285  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:196:0x0306  */
    /* JADX WARN: Code duplicated, block: B:212:0x0353  */
    /* JADX WARN: Code duplicated, block: B:223:0x0382  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:252:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:267:0x0424  */
    /* JADX WARN: Code duplicated, block: B:282:0x0461  */
    /* JADX WARN: Code duplicated, block: B:300:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:337:0x0528  */
    /* JADX WARN: Code duplicated, block: B:352:0x0566  */
    /* JADX WARN: Code duplicated, block: B:371:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:386:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:407:0x0634  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:422:0x0674  */
    /* JADX WARN: Code duplicated, block: B:439:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:461:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:476:0x0738  */
    /* JADX WARN: Code duplicated, block: B:502:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:517:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:534:0x0826  */
    /* JADX WARN: Code duplicated, block: B:549:0x0862  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Object emit(Object obj, lnm lnmVar) {
        pmd1 pmd1Var;
        wmd1 wmd1Var;
        jtd1 jtd1Var;
        ktd1 ktd1Var;
        eud1 eud1Var;
        Object kud1Var;
        pxd1 pxd1Var;
        h8e1 h8e1Var;
        Object objA;
        hae1 hae1Var;
        xce1 xce1Var;
        nie1 nie1Var;
        ere1 ere1Var;
        wse1 wse1Var;
        v2f1 v2f1Var;
        w2f1 w2f1Var;
        x2f1 x2f1Var;
        g4f1 g4f1Var;
        slf1 slf1Var;
        ynf1 ynf1Var;
        fsf1 fsf1Var;
        boolean z;
        boolean z2;
        String string;
        String string2;
        String string3;
        osf1 osf1Var;
        psf1 psf1Var;
        qsf1 qsf1Var;
        itf1 itf1Var;
        rtf1 rtf1Var;
        uuf1 uuf1Var;
        c4g1 c4g1Var;
        abg1 abg1Var;
        afg1 afg1Var;
        bfg1 bfg1Var;
        lgg1 lgg1Var;
        byte b = this.a;
        boolean z3 = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof pmd1) {
                    pmd1Var = (pmd1) lnmVar;
                    int i = pmd1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pmd1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        pmd1Var = new pmd1(this, lnmVar);
                    }
                } else {
                    pmd1Var = new pmd1(this, lnmVar);
                }
                Object obj2 = pmd1Var.a;
                int i2 = pmd1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    e331 e331Var = new e331(obj);
                    pmd1Var.b = 1;
                    return vr20Var.emit(e331Var, pmd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof wmd1) {
                    wmd1Var = (wmd1) lnmVar;
                    int i3 = wmd1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wmd1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        wmd1Var = new wmd1(this, lnmVar);
                    }
                } else {
                    wmd1Var = new wmd1(this, lnmVar);
                }
                Object obj3 = wmd1Var.a;
                int i4 = wmd1Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    hj50 hj50Var = new hj50((List) obj, (ioj0) null);
                    wmd1Var.b = 1;
                    return vr20Var.emit(hj50Var, wmd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof jtd1) {
                    jtd1Var = (jtd1) lnmVar;
                    int i5 = jtd1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jtd1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        jtd1Var = new jtd1(this, lnmVar);
                    }
                } else {
                    jtd1Var = new jtd1(this, lnmVar);
                }
                Object obj4 = jtd1Var.a;
                int i6 = jtd1Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                jtd1Var.b = 1;
                return vr20Var.emit(obj, jtd1Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof ktd1) {
                    ktd1Var = (ktd1) lnmVar;
                    int i7 = ktd1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ktd1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        ktd1Var = new ktd1(this, lnmVar);
                    }
                } else {
                    ktd1Var = new ktd1(this, lnmVar);
                }
                Object obj5 = ktd1Var.a;
                int i8 = ktd1Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    List listB = ((uv00) obj).b(upa1.class);
                    ktd1Var.b = 1;
                    return vr20Var.emit(listB, ktd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof eud1) {
                    eud1Var = (eud1) lnmVar;
                    int i9 = eud1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        eud1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        eud1Var = new eud1(this, lnmVar);
                    }
                } else {
                    eud1Var = new eud1(this, lnmVar);
                }
                Object obj6 = eud1Var.a;
                int i10 = eud1Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    rw10 rw10Var = (rw10) obj;
                    if (rw10Var instanceof ow10) {
                        ow10 ow10Var = (ow10) rw10Var;
                        kud1Var = new jud1(ow10Var.a, ow10Var.b);
                    } else if (rw10Var instanceof qw10) {
                        qw10 qw10Var = (qw10) rw10Var;
                        kud1Var = new lud1(qw10Var.c, qw10Var.a, qw10Var.b, qw10Var.d);
                    } else if (rw10Var instanceof pw10) {
                        kud1Var = new kud1(((pw10) rw10Var).a);
                    } else {
                        eg.o();
                    }
                    eud1Var.b = 1;
                    return vr20Var.emit(kud1Var, eud1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof pxd1) {
                    pxd1Var = (pxd1) lnmVar;
                    int i11 = pxd1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pxd1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        pxd1Var = new pxd1(this, lnmVar);
                    }
                } else {
                    pxd1Var = new pxd1(this, lnmVar);
                }
                Object obj7 = pxd1Var.a;
                int i12 = pxd1Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Event.TempDismissedEntitiesChanged tempDismissedEntitiesChanged = new Event.TempDismissedEntitiesChanged((Set) obj);
                    pxd1Var.b = 1;
                    return vr20Var.emit(tempDismissedEntitiesChanged, pxd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof h8e1) {
                    h8e1Var = (h8e1) lnmVar;
                    int i13 = h8e1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        h8e1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        h8e1Var = new h8e1(this, lnmVar);
                    }
                } else {
                    h8e1Var = new h8e1(this, lnmVar);
                }
                Object obj8 = h8e1Var.a;
                int i14 = h8e1Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                objA = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (objA == null) {
                    return rih1Var;
                }
                h8e1Var.b = 1;
                return vr20Var.emit(objA, h8e1Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof hae1) {
                    hae1Var = (hae1) lnmVar;
                    int i15 = hae1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hae1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        hae1Var = new hae1(this, lnmVar);
                    }
                } else {
                    hae1Var = new hae1(this, lnmVar);
                }
                Object obj9 = hae1Var.a;
                int i16 = hae1Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (((lae1) obj).a.size() < 5) {
                    return rih1Var;
                }
                hae1Var.b = 1;
                return vr20Var.emit(obj, hae1Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof xce1) {
                    xce1Var = (xce1) lnmVar;
                    int i17 = xce1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        xce1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        xce1Var = new xce1(this, lnmVar);
                    }
                } else {
                    xce1Var = new xce1(this, lnmVar);
                }
                Object obj10 = xce1Var.a;
                int i18 = xce1Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    iy51 iy51Var = new iy51(((Number) obj).intValue());
                    xce1Var.b = 1;
                    return vr20Var.emit(iy51Var, xce1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof nie1) {
                    nie1Var = (nie1) lnmVar;
                    int i19 = nie1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        nie1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        nie1Var = new nie1(this, lnmVar);
                    }
                } else {
                    nie1Var = new nie1(this, lnmVar);
                }
                Object obj11 = nie1Var.a;
                int i20 = nie1Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.isPaused() && playerState.isPlaying()) {
                    z3 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                nie1Var.b = 1;
                return vr20Var.emit(boolValueOf, nie1Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof ere1) {
                    ere1Var = (ere1) lnmVar;
                    int i21 = ere1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ere1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        ere1Var = new ere1(this, lnmVar);
                    }
                } else {
                    ere1Var = new ere1(this, lnmVar);
                }
                Object obj12 = ere1Var.a;
                int i22 = ere1Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    List list = ((yqe1) obj).b;
                    ere1Var.b = 1;
                    return vr20Var.emit(list, ere1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof wse1) {
                    wse1Var = (wse1) lnmVar;
                    int i23 = wse1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        wse1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        wse1Var = new wse1(this, lnmVar);
                    }
                } else {
                    wse1Var = new wse1(this, lnmVar);
                }
                Object obj13 = wse1Var.a;
                int i24 = wse1Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                mmr0 mmr0Var = (mmr0) obj;
                int iIntValue = ((Number) mmr0Var.a).intValue();
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                if (iIntValue2 <= 0 || iIntValue < iIntValue2 - 3) {
                    return rih1Var;
                }
                wse1Var.b = 1;
                return vr20Var.emit(obj, wse1Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof v2f1) {
                    v2f1Var = (v2f1) lnmVar;
                    int i25 = v2f1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        v2f1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        v2f1Var = new v2f1(this, lnmVar);
                    }
                } else {
                    v2f1Var = new v2f1(this, lnmVar);
                }
                Object obj14 = v2f1Var.a;
                int i26 = v2f1Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    Integer num = new Integer(((l160) obj).a);
                    v2f1Var.b = 1;
                    return vr20Var.emit(num, v2f1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof w2f1) {
                    w2f1Var = (w2f1) lnmVar;
                    int i27 = w2f1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        w2f1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        w2f1Var = new w2f1(this, lnmVar);
                    }
                } else {
                    w2f1Var = new w2f1(this, lnmVar);
                }
                Object obj15 = w2f1Var.a;
                int i28 = w2f1Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    String str = ((cxc0) obj).f.b;
                    w2f1Var.b = 1;
                    return vr20Var.emit(str, w2f1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof x2f1) {
                    x2f1Var = (x2f1) lnmVar;
                    int i29 = x2f1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        x2f1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        x2f1Var = new x2f1(this, lnmVar);
                    }
                } else {
                    x2f1Var = new x2f1(this, lnmVar);
                }
                Object obj16 = x2f1Var.a;
                int i30 = x2f1Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                objA = i1rVar4 != null ? (Boolean) i1rVar4.a : null;
                if (objA == null) {
                    return rih1Var;
                }
                x2f1Var.b = 1;
                return vr20Var.emit(objA, x2f1Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof g4f1) {
                    g4f1Var = (g4f1) lnmVar;
                    int i31 = g4f1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        g4f1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        g4f1Var = new g4f1(this, lnmVar);
                    }
                } else {
                    g4f1Var = new g4f1(this, lnmVar);
                }
                Object obj17 = g4f1Var.a;
                int i32 = g4f1Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                k6w0 k6w0Var = (k6w0) obj;
                smc0 smc0VarN = k4p1.n();
                if (k6w0Var != null) {
                    smc0VarN.add(k6w0Var);
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                g4f1Var.b = 1;
                return vr20Var.emit(smc0VarK, g4f1Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof slf1) {
                    slf1Var = (slf1) lnmVar;
                    int i33 = slf1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        slf1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        slf1Var = new slf1(this, lnmVar);
                    }
                } else {
                    slf1Var = new slf1(this, lnmVar);
                }
                Object obj18 = slf1Var.a;
                int i34 = slf1Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    Boolean boolValueOf2 = Boolean.valueOf(((bf90) obj).a);
                    slf1Var.b = 1;
                    return vr20Var.emit(boolValueOf2, slf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof ynf1) {
                    ynf1Var = (ynf1) lnmVar;
                    int i35 = ynf1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ynf1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        ynf1Var = new ynf1(this, lnmVar);
                    }
                } else {
                    ynf1Var = new ynf1(this, lnmVar);
                }
                Object obj19 = ynf1Var.a;
                int i36 = ynf1Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf3 = Boolean.valueOf(((p0d0) obj).a.b());
                    ynf1Var.b = 1;
                    return vr20Var.emit(boolValueOf3, ynf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof fsf1) {
                    fsf1Var = (fsf1) lnmVar;
                    int i37 = fsf1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        fsf1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        fsf1Var = new fsf1(this, lnmVar);
                    }
                } else {
                    fsf1Var = new fsf1(this, lnmVar);
                }
                Object obj20 = fsf1Var.a;
                int i38 = fsf1Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                cxc0 cxc0Var = (cxc0) obj;
                boolean zA = cxc0Var.a();
                kby kbyVar = cxc0Var.f;
                String str2 = "";
                if (zA) {
                    Map map = kbyVar.q;
                    Set set = h4d0.a;
                    String str3 = (String) map.get("generation_status");
                    if (str3 == null || (string3 = ihc1.e1(str3).toString()) == null) {
                        string3 = "";
                    }
                    if (qyo1.u(string3).b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (cxc0Var.a()) {
                    Map map2 = kbyVar.q;
                    Set set2 = h4d0.a;
                    String str4 = (String) map2.get("generation_status");
                    if (str4 == null || (string2 = ihc1.e1(str4).toString()) == null) {
                        string2 = "";
                    }
                    h4d0 h4d0VarU = qyo1.u(string2);
                    h4d0VarU.getClass();
                    if (h4d0.a.contains(h4d0VarU)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                String str5 = (String) kbyVar.q.get("tracklist_summary");
                if (str5 == null) {
                    str5 = "";
                }
                boolean zY0 = ihc1.y0(str5);
                Map map3 = kbyVar.q;
                Set set3 = h4d0.a;
                String str6 = (String) map3.get("generation_status");
                if (str6 != null && (string = ihc1.e1(str6).toString()) != null) {
                    str2 = string;
                }
                h4d0 h4d0VarU2 = qyo1.u(str2);
                h4d0VarU2.getClass();
                if (h4d0VarU2 == h4d0.h || h4d0VarU2 == h4d0.f || (!z && !zY0 && !z2)) {
                    z3 = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z3);
                fsf1Var.b = 1;
                return vr20Var.emit(boolValueOf4, fsf1Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof osf1) {
                    osf1Var = (osf1) lnmVar;
                    int i39 = osf1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        osf1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        osf1Var = new osf1(this, lnmVar);
                    }
                } else {
                    osf1Var = new osf1(this, lnmVar);
                }
                Object obj21 = osf1Var.a;
                int i40 = osf1Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    osf1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, osf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof psf1) {
                    psf1Var = (psf1) lnmVar;
                    int i41 = psf1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        psf1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        psf1Var = new psf1(this, lnmVar);
                    }
                } else {
                    psf1Var = new psf1(this, lnmVar);
                }
                Object obj22 = psf1Var.a;
                int i42 = psf1Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j((String) obj, "1"));
                    psf1Var.b = 1;
                    return vr20Var.emit(boolValueOf6, psf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof qsf1) {
                    qsf1Var = (qsf1) lnmVar;
                    int i43 = qsf1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        qsf1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        qsf1Var = new qsf1(this, lnmVar);
                    }
                } else {
                    qsf1Var = new qsf1(this, lnmVar);
                }
                Object obj23 = qsf1Var.a;
                int i44 = qsf1Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf7 = Boolean.valueOf(!((bva1) obj).equals(ava1.a));
                    qsf1Var.b = 1;
                    return vr20Var.emit(boolValueOf7, qsf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof itf1) {
                    itf1Var = (itf1) lnmVar;
                    int i45 = itf1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        itf1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        itf1Var = new itf1(this, lnmVar);
                    }
                } else {
                    itf1Var = new itf1(this, lnmVar);
                }
                Object obj24 = itf1Var.a;
                int i46 = itf1Var.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf8 = Boolean.valueOf(((p0d0) obj).a.b());
                    itf1Var.b = 1;
                    return vr20Var.emit(boolValueOf8, itf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof rtf1) {
                    rtf1Var = (rtf1) lnmVar;
                    int i47 = rtf1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        rtf1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        rtf1Var = new rtf1(this, lnmVar);
                    }
                } else {
                    rtf1Var = new rtf1(this, lnmVar);
                }
                Object obj25 = rtf1Var.a;
                int i48 = rtf1Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (((String) obj).length() <= 0) {
                    return rih1Var;
                }
                rtf1Var.b = 1;
                return vr20Var.emit(obj, rtf1Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof uuf1) {
                    uuf1Var = (uuf1) lnmVar;
                    int i49 = uuf1Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        uuf1Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        uuf1Var = new uuf1(this, lnmVar);
                    }
                } else {
                    uuf1Var = new uuf1(this, lnmVar);
                }
                Object obj26 = uuf1Var.a;
                int i50 = uuf1Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                vzh1 vzh1Var = ((mhb1) obj).c;
                objA = vzh1Var != null ? vzh1Var.a() : null;
                uuf1Var.b = 1;
                return vr20Var.emit(objA, uuf1Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof c4g1) {
                    c4g1Var = (c4g1) lnmVar;
                    int i51 = c4g1Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        c4g1Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        c4g1Var = new c4g1(this, lnmVar);
                    }
                } else {
                    c4g1Var = new c4g1(this, lnmVar);
                }
                Object obj27 = c4g1Var.a;
                int i52 = c4g1Var.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsTrafficEvents.TrafficEvent trafficEventW = EsTrafficEvents.TrafficEvent.w(bArr);
                        c4g1Var.b = 1;
                        return vr20Var.emit(trafficEventW, c4g1Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents.TrafficEvent: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 26:
                if (lnmVar instanceof abg1) {
                    abg1Var = (abg1) lnmVar;
                    int i53 = abg1Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        abg1Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        abg1Var = new abg1(this, lnmVar);
                    }
                } else {
                    abg1Var = new abg1(this, lnmVar);
                }
                Object obj28 = abg1Var.a;
                int i54 = abg1Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                List list2 = (List) obj;
                list2.getClass();
                qfd qfdVar = (qfd) o7h.s0(list2);
                Boolean boolValueOf9 = Boolean.valueOf((qfdVar != null ? qfdVar.c : 0) == 3);
                abg1Var.b = 1;
                return vr20Var.emit(boolValueOf9, abg1Var) == d9nVar ? d9nVar : rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (lnmVar instanceof afg1) {
                    afg1Var = (afg1) lnmVar;
                    int i55 = afg1Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        afg1Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        afg1Var = new afg1(this, lnmVar);
                    }
                } else {
                    afg1Var = new afg1(this, lnmVar);
                }
                Object obj29 = afg1Var.a;
                int i56 = afg1Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                zyc zycVar = (zyc) obj;
                if (zycVar.f != 3 || zycVar.b.n) {
                    return rih1Var;
                }
                afg1Var.b = 1;
                return vr20Var.emit(obj, afg1Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof bfg1) {
                    bfg1Var = (bfg1) lnmVar;
                    int i57 = bfg1Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bfg1Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        bfg1Var = new bfg1(this, lnmVar);
                    }
                } else {
                    bfg1Var = new bfg1(this, lnmVar);
                }
                Object obj30 = bfg1Var.a;
                int i58 = bfg1Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if (!(obj instanceof zyc)) {
                    return rih1Var;
                }
                bfg1Var.b = 1;
                return vr20Var.emit(obj, bfg1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof lgg1) {
                    lgg1Var = (lgg1) lnmVar;
                    int i59 = lgg1Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        lgg1Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        lgg1Var = new lgg1(this, lnmVar);
                    }
                } else {
                    lgg1Var = new lgg1(this, lnmVar);
                }
                Object obj31 = lgg1Var.a;
                int i60 = lgg1Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                cxc0 cxc0Var2 = (cxc0) obj;
                kby kbyVar2 = cxc0Var2.f;
                d811 d811Var = new d811(kbyVar2.j, cxc0Var2.e, kbyVar2.q, kbyVar2.x);
                lgg1Var.b = 1;
                return vr20Var.emit(d811Var, lgg1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
