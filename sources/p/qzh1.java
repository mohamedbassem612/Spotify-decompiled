package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qzh1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ qzh1(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:151:0x024a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0287  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:201:0x0309  */
    /* JADX WARN: Code duplicated, block: B:216:0x0344  */
    /* JADX WARN: Code duplicated, block: B:233:0x0381  */
    /* JADX WARN: Code duplicated, block: B:248:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:268:0x0403  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:283:0x043e  */
    /* JADX WARN: Code duplicated, block: B:300:0x047b  */
    /* JADX WARN: Code duplicated, block: B:315:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:330:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:349:0x055a  */
    /* JADX WARN: Code duplicated, block: B:364:0x0595  */
    /* JADX WARN: Code duplicated, block: B:379:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:397:0x0611  */
    /* JADX WARN: Code duplicated, block: B:412:0x064d  */
    /* JADX WARN: Code duplicated, block: B:429:0x068a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:446:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:461:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:480:0x0742  */
    /* JADX WARN: Code duplicated, block: B:499:0x077e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        pzh1 pzh1Var;
        u6i1 u6i1Var;
        bai1 bai1Var;
        cai1 cai1Var;
        gei1 gei1Var;
        nfi1 nfi1Var;
        ofi1 ofi1Var;
        zji1 zji1Var;
        ami1 ami1Var;
        bmi1 bmi1Var;
        qni1 qni1Var;
        i0o0 i0o0Var;
        g8j1 g8j1Var;
        u8j1 u8j1Var;
        obj1 obj1Var;
        pbj1 pbj1Var;
        qbj1 qbj1Var;
        rbj1 rbj1Var;
        tbj1 tbj1Var;
        ubj1 ubj1Var;
        vbj1 vbj1Var;
        wbj1 wbj1Var;
        sdj1 sdj1Var;
        whj1 whj1Var;
        zhj1 zhj1Var;
        bij1 bij1Var;
        llj1 llj1Var;
        qxc0 qxc0Var;
        ulj1 ulj1Var;
        ylj1 ylj1Var;
        zlj1 zlj1Var;
        rmj1 rmj1Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        i1r i1rVarValueOf = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof pzh1) {
                    pzh1Var = (pzh1) lnmVar;
                    int i = pzh1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pzh1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        pzh1Var = new pzh1(this, lnmVar);
                    }
                } else {
                    pzh1Var = new pzh1(this, lnmVar);
                }
                Object obj2 = pzh1Var.a;
                int i2 = pzh1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    sl30 sl30Var = new sl30((ozh1) obj);
                    pzh1Var.b = 1;
                    return vr20Var.emit(sl30Var, pzh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof u6i1) {
                    u6i1Var = (u6i1) lnmVar;
                    int i3 = u6i1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u6i1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        u6i1Var = new u6i1(this, lnmVar);
                    }
                } else {
                    u6i1Var = new u6i1(this, lnmVar);
                }
                Object obj3 = u6i1Var.a;
                int i4 = u6i1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                bn70 bn70Var = (bn70) obj;
                i1rVarValueOf = bn70Var != null ? bn70Var.c : null;
                if (i1rVarValueOf == null) {
                    return rih1Var;
                }
                u6i1Var.b = 1;
                return vr20Var.emit(i1rVarValueOf, u6i1Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof bai1) {
                    bai1Var = (bai1) lnmVar;
                    int i5 = bai1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bai1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        bai1Var = new bai1(this, lnmVar);
                    }
                } else {
                    bai1Var = new bai1(this, lnmVar);
                }
                Object obj4 = bai1Var.a;
                int i6 = bai1Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                th61 th61Var = (th61) obj;
                if (!th61Var.b || th61Var.a.length() <= 0) {
                    return rih1Var;
                }
                bai1Var.b = 1;
                return vr20Var.emit(obj, bai1Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof cai1) {
                    cai1Var = (cai1) lnmVar;
                    int i7 = cai1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cai1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        cai1Var = new cai1(this, lnmVar);
                    }
                } else {
                    cai1Var = new cai1(this, lnmVar);
                }
                Object obj5 = cai1Var.a;
                int i8 = cai1Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    String str = ((th61) obj).a;
                    cai1Var.b = 1;
                    return vr20Var.emit(str, cai1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof gei1) {
                    gei1Var = (gei1) lnmVar;
                    int i9 = gei1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        gei1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        gei1Var = new gei1(this, lnmVar);
                    }
                } else {
                    gei1Var = new gei1(this, lnmVar);
                }
                Object obj6 = gei1Var.a;
                int i10 = gei1Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                gei1Var.b = 1;
                return vr20Var.emit(obj, gei1Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof nfi1) {
                    nfi1Var = (nfi1) lnmVar;
                    int i11 = nfi1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nfi1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        nfi1Var = new nfi1(this, lnmVar);
                    }
                } else {
                    nfi1Var = new nfi1(this, lnmVar);
                }
                Object obj7 = nfi1Var.a;
                int i12 = nfi1Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                nfi1Var.b = 1;
                return vr20Var.emit(obj, nfi1Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof ofi1) {
                    ofi1Var = (ofi1) lnmVar;
                    int i13 = ofi1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ofi1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        ofi1Var = new ofi1(this, lnmVar);
                    }
                } else {
                    ofi1Var = new ofi1(this, lnmVar);
                }
                Object obj8 = ofi1Var.a;
                int i14 = ofi1Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    List listB = ((uv00) obj).b(zei1.class);
                    ofi1Var.b = 1;
                    return vr20Var.emit(listB, ofi1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof zji1) {
                    zji1Var = (zji1) lnmVar;
                    int i15 = zji1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        zji1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        zji1Var = new zji1(this, lnmVar);
                    }
                } else {
                    zji1Var = new zji1(this, lnmVar);
                }
                Object obj9 = zji1Var.a;
                int i16 = zji1Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf = Boolean.valueOf(((String) obj).length() > 0);
                    zji1Var.b = 1;
                    return vr20Var.emit(boolValueOf, zji1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof ami1) {
                    ami1Var = (ami1) lnmVar;
                    int i17 = ami1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ami1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        ami1Var = new ami1(this, lnmVar);
                    }
                } else {
                    ami1Var = new ami1(this, lnmVar);
                }
                Object obj10 = ami1Var.a;
                int i18 = ami1Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    lmi1 lmi1Var = new lmi1((b5i1) obj);
                    ami1Var.b = 1;
                    return vr20Var.emit(lmi1Var, ami1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof bmi1) {
                    bmi1Var = (bmi1) lnmVar;
                    int i19 = bmi1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        bmi1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        bmi1Var = new bmi1(this, lnmVar);
                    }
                } else {
                    bmi1Var = new bmi1(this, lnmVar);
                }
                Object obj11 = bmi1Var.a;
                int i20 = bmi1Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    jmi1 jmi1Var = new jmi1((b5i1) obj);
                    bmi1Var.b = 1;
                    return vr20Var.emit(jmi1Var, bmi1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof qni1) {
                    qni1Var = (qni1) lnmVar;
                    int i21 = qni1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        qni1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        qni1Var = new qni1(this, lnmVar);
                    }
                } else {
                    qni1Var = new qni1(this, lnmVar);
                }
                Object obj12 = qni1Var.a;
                int i22 = qni1Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                Set set = (Set) obj;
                if (set.isEmpty()) {
                    i0o0Var = new i0o0(false, false);
                } else {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    i0o0Var = new i0o0(set.contains(yon1.G1("USERS_NEARBY", "users_nearby", 2074, "users_nearby")), set.contains(yon1.G1("USERS_NEARBY_CHECK_IN", "users_nearby_check_in", 2075, "users_nearby_check_in")));
                }
                qni1Var.b = 1;
                return vr20Var.emit(i0o0Var, qni1Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof g8j1) {
                    g8j1Var = (g8j1) lnmVar;
                    int i23 = g8j1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        g8j1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        g8j1Var = new g8j1(this, lnmVar);
                    }
                } else {
                    g8j1Var = new g8j1(this, lnmVar);
                }
                Object obj13 = g8j1Var.a;
                int i24 = g8j1Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    u7j1 u7j1Var = new u7j1(((Boolean) obj).booleanValue());
                    g8j1Var.b = 1;
                    return vr20Var.emit(u7j1Var, g8j1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof u8j1) {
                    u8j1Var = (u8j1) lnmVar;
                    int i25 = u8j1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        u8j1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        u8j1Var = new u8j1(this, lnmVar);
                    }
                } else {
                    u8j1Var = new u8j1(this, lnmVar);
                }
                Object obj14 = u8j1Var.a;
                int i26 = u8j1Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    v7j1 v7j1Var = new v7j1((lzt0) obj);
                    u8j1Var.b = 1;
                    return vr20Var.emit(v7j1Var, u8j1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof obj1) {
                    obj1Var = (obj1) lnmVar;
                    int i27 = obj1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        obj1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        obj1Var = new obj1(this, lnmVar);
                    }
                } else {
                    obj1Var = new obj1(this, lnmVar);
                }
                Object obj15 = obj1Var.a;
                int i28 = obj1Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                obj1Var.b = 1;
                return vr20Var.emit(obj, obj1Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof pbj1) {
                    pbj1Var = (pbj1) lnmVar;
                    int i29 = pbj1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        pbj1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        pbj1Var = new pbj1(this, lnmVar);
                    }
                } else {
                    pbj1Var = new pbj1(this, lnmVar);
                }
                Object obj16 = pbj1Var.a;
                int i30 = pbj1Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    l7u0 l7u0Var = new l7u0((dv0) obj);
                    pbj1Var.b = 1;
                    return vr20Var.emit(l7u0Var, pbj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof qbj1) {
                    qbj1Var = (qbj1) lnmVar;
                    int i31 = qbj1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        qbj1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        qbj1Var = new qbj1(this, lnmVar);
                    }
                } else {
                    qbj1Var = new qbj1(this, lnmVar);
                }
                Object obj17 = qbj1Var.a;
                int i32 = qbj1Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                qbj1Var.b = 1;
                return vr20Var.emit(boolValueOf2, qbj1Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof rbj1) {
                    rbj1Var = (rbj1) lnmVar;
                    int i33 = rbj1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        rbj1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        rbj1Var = new rbj1(this, lnmVar);
                    }
                } else {
                    rbj1Var = new rbj1(this, lnmVar);
                }
                Object obj18 = rbj1Var.a;
                int i34 = rbj1Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    ((Boolean) obj).getClass();
                    rbj1Var.b = 1;
                    return vr20Var.emit(lv7.a, rbj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof tbj1) {
                    tbj1Var = (tbj1) lnmVar;
                    int i35 = tbj1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        tbj1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        tbj1Var = new tbj1(this, lnmVar);
                    }
                } else {
                    tbj1Var = new tbj1(this, lnmVar);
                }
                Object obj19 = tbj1Var.a;
                int i36 = tbj1Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                tbj1Var.b = 1;
                return vr20Var.emit(obj, tbj1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof ubj1) {
                    ubj1Var = (ubj1) lnmVar;
                    int i37 = ubj1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ubj1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        ubj1Var = new ubj1(this, lnmVar);
                    }
                } else {
                    ubj1Var = new ubj1(this, lnmVar);
                }
                Object obj20 = ubj1Var.a;
                int i38 = ubj1Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    m7u0 m7u0Var = new m7u0((dv0) obj);
                    ubj1Var.b = 1;
                    return vr20Var.emit(m7u0Var, ubj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof vbj1) {
                    vbj1Var = (vbj1) lnmVar;
                    int i39 = vbj1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        vbj1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        vbj1Var = new vbj1(this, lnmVar);
                    }
                } else {
                    vbj1Var = new vbj1(this, lnmVar);
                }
                Object obj21 = vbj1Var.a;
                int i40 = vbj1Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                vbj1Var.b = 1;
                return vr20Var.emit(boolValueOf3, vbj1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof wbj1) {
                    wbj1Var = (wbj1) lnmVar;
                    int i41 = wbj1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        wbj1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        wbj1Var = new wbj1(this, lnmVar);
                    }
                } else {
                    wbj1Var = new wbj1(this, lnmVar);
                }
                Object obj22 = wbj1Var.a;
                int i42 = wbj1Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                ((Boolean) obj).getClass();
                mv7 mv7Var = mv7.a;
                wbj1Var.b = 1;
                return vr20Var.emit(mv7Var, wbj1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof sdj1) {
                    sdj1Var = (sdj1) lnmVar;
                    int i43 = sdj1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        sdj1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        sdj1Var = new sdj1(this, lnmVar);
                    }
                } else {
                    sdj1Var = new sdj1(this, lnmVar);
                }
                Object obj23 = sdj1Var.a;
                int i44 = sdj1Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    Long l = new Long(((udj1) obj).a);
                    sdj1Var.b = 1;
                    return vr20Var.emit(l, sdj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof whj1) {
                    whj1Var = (whj1) lnmVar;
                    int i45 = whj1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        whj1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        whj1Var = new whj1(this, lnmVar);
                    }
                } else {
                    whj1Var = new whj1(this, lnmVar);
                }
                Object obj24 = whj1Var.a;
                int i46 = whj1Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                i1r i1rVar = (k1r) obj;
                i1rVarValueOf = i1rVar instanceof i1r ? i1rVar : null;
                Boolean boolValueOf4 = Boolean.valueOf(i1rVarValueOf != null ? ((Boolean) i1rVarValueOf.a).booleanValue() : false);
                whj1Var.b = 1;
                return vr20Var.emit(boolValueOf4, whj1Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof zhj1) {
                    zhj1Var = (zhj1) lnmVar;
                    int i47 = zhj1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        zhj1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        zhj1Var = new zhj1(this, lnmVar);
                    }
                } else {
                    zhj1Var = new zhj1(this, lnmVar);
                }
                Object obj25 = zhj1Var.a;
                int i48 = zhj1Var.b;
                if (i48 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf5 = Boolean.valueOf(cua.f((Map) obj));
                    zhj1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, zhj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof bij1) {
                    bij1Var = (bij1) lnmVar;
                    int i49 = bij1Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        bij1Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        bij1Var = new bij1(this, lnmVar);
                    }
                } else {
                    bij1Var = new bij1(this, lnmVar);
                }
                Object obj26 = bij1Var.a;
                int i50 = bij1Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf6 = Boolean.valueOf(((cxc0) obj).i);
                    bij1Var.b = 1;
                    return vr20Var.emit(boolValueOf6, bij1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof llj1) {
                    llj1Var = (llj1) lnmVar;
                    int i51 = llj1Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        llj1Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        llj1Var = new llj1(this, lnmVar);
                    }
                } else {
                    llj1Var = new llj1(this, lnmVar);
                }
                Object obj27 = llj1Var.a;
                int i52 = llj1Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                if (i1rVar3 != null && (qxc0Var = (qxc0) i1rVar3.a) != null) {
                    i1rVarValueOf = Boolean.valueOf(qxc0Var.Z0);
                }
                if (i1rVarValueOf == null) {
                    return rih1Var;
                }
                llj1Var.b = 1;
                return vr20Var.emit(i1rVarValueOf, llj1Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof ulj1) {
                    ulj1Var = (ulj1) lnmVar;
                    int i53 = ulj1Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        ulj1Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        ulj1Var = new ulj1(this, lnmVar);
                    }
                } else {
                    ulj1Var = new ulj1(this, lnmVar);
                }
                Object obj28 = ulj1Var.a;
                int i54 = ulj1Var.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf7 = Boolean.valueOf(cua.f((Map) obj));
                    ulj1Var.b = 1;
                    return vr20Var.emit(boolValueOf7, ulj1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof ylj1) {
                    ylj1Var = (ylj1) lnmVar;
                    int i55 = ylj1Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ylj1Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        ylj1Var = new ylj1(this, lnmVar);
                    }
                } else {
                    ylj1Var = new ylj1(this, lnmVar);
                }
                Object obj29 = ylj1Var.a;
                int i56 = ylj1Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                i1r i1rVar4 = (k1r) obj;
                i1rVarValueOf = i1rVar4 instanceof i1r ? i1rVar4 : null;
                Boolean boolValueOf8 = Boolean.valueOf(i1rVarValueOf != null ? ((Boolean) i1rVarValueOf.a).booleanValue() : false);
                ylj1Var.b = 1;
                return vr20Var.emit(boolValueOf8, ylj1Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof zlj1) {
                    zlj1Var = (zlj1) lnmVar;
                    int i57 = zlj1Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        zlj1Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        zlj1Var = new zlj1(this, lnmVar);
                    }
                } else {
                    zlj1Var = new zlj1(this, lnmVar);
                }
                Object obj30 = zlj1Var.a;
                int i58 = zlj1Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                cxc0 cxc0Var = (cxc0) obj;
                slj1 slj1Var = new slj1(z6k0.a(cxc0Var.f.q), cxc0Var.i);
                zlj1Var.b = 1;
                return vr20Var.emit(slj1Var, zlj1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof rmj1) {
                    rmj1Var = (rmj1) lnmVar;
                    int i59 = rmj1Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        rmj1Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        rmj1Var = new rmj1(this, lnmVar);
                    }
                } else {
                    rmj1Var = new rmj1(this, lnmVar);
                }
                Object obj31 = rmj1Var.a;
                int i60 = rmj1Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                Boolean bool = (Boolean) u890.G((k1r) obj);
                Boolean boolValueOf9 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                rmj1Var.b = 1;
                return vr20Var.emit(boolValueOf9, rmj1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ qzh1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
