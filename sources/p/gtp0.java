package p;

import com.google.protobuf.Duration;
import com.spotify.collection2.itemdata.proto.CollectionItemdata;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.offline_esperanto.proto.EsOffline;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gtp0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ gtp0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01de  */
    /* JADX WARN: Code duplicated, block: B:143:0x0219  */
    /* JADX WARN: Code duplicated, block: B:161:0x025a  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:206:0x0326  */
    /* JADX WARN: Code duplicated, block: B:225:0x036e  */
    /* JADX WARN: Code duplicated, block: B:244:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:293:0x0470  */
    /* JADX WARN: Code duplicated, block: B:308:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:327:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:346:0x0534  */
    /* JADX WARN: Code duplicated, block: B:361:0x0573  */
    /* JADX WARN: Code duplicated, block: B:376:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:398:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:416:0x0637  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:433:0x0674  */
    /* JADX WARN: Code duplicated, block: B:448:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:474:0x0738  */
    /* JADX WARN: Code duplicated, block: B:489:0x0776  */
    /* JADX WARN: Code duplicated, block: B:504:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:519:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        ftp0 ftp0Var;
        htp0 htp0Var;
        utp0 utp0Var;
        aup0 aup0Var;
        wxp0 wxp0Var;
        t3q0 t3q0Var;
        n4q0 n4q0Var;
        v4q0 v4q0Var;
        w4q0 w4q0Var;
        deq0 deq0Var;
        grq0 grq0Var;
        yrq0 yrq0Var;
        zrq0 zrq0Var;
        l6r0 l6r0Var;
        u8r0 u8r0Var;
        CollectionItemdata.ItemData itemDataO;
        CollectionItemdata.PageMatchItemData pageMatchItemDataQ;
        Duration durationO;
        b9r0 b9r0Var;
        e9r0 e9r0Var;
        f9r0 f9r0Var;
        g9r0 g9r0Var;
        h9r0 h9r0Var;
        q9r0 q9r0Var;
        ear0 ear0Var;
        nbr0 nbr0Var;
        gcr0 gcr0Var;
        wcr0 wcr0Var;
        Set setP1;
        qhr0 qhr0Var;
        shr0 shr0Var;
        thr0 thr0Var;
        uhr0 uhr0Var;
        vhr0 vhr0Var;
        byte b = this.a;
        s3q0 s3q0Var = s3q0.b;
        h6r0 h6r0Var = h6r0.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        jfv jfvVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof ftp0) {
                    ftp0Var = (ftp0) lnmVar;
                    int i = ftp0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ftp0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ftp0Var = new ftp0(this, lnmVar);
                    }
                } else {
                    ftp0Var = new ftp0(this, lnmVar);
                }
                Object obj2 = ftp0Var.a;
                int i2 = ftp0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    dtp0 dtp0Var = (dtp0) ((mmr0) obj).b;
                    ftp0Var.b = 1;
                    return vr20Var.emit(dtp0Var, ftp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof htp0) {
                    htp0Var = (htp0) lnmVar;
                    int i3 = htp0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        htp0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        htp0Var = new htp0(this, lnmVar);
                    }
                } else {
                    htp0Var = new htp0(this, lnmVar);
                }
                Object obj3 = htp0Var.a;
                int i4 = htp0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    vgc0 vgc0Var = ((dtp0) obj).c;
                    htp0Var.b = 1;
                    return vr20Var.emit(vgc0Var, htp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof utp0) {
                    utp0Var = (utp0) lnmVar;
                    int i5 = utp0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        utp0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        utp0Var = new utp0(this, lnmVar);
                    }
                } else {
                    utp0Var = new utp0(this, lnmVar);
                }
                Object obj4 = utp0Var.a;
                int i6 = utp0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    String str = ((cxc0) obj).f.d.a;
                    utp0Var.b = 1;
                    return vr20Var.emit(str, utp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof aup0) {
                    aup0Var = (aup0) lnmVar;
                    int i7 = aup0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        aup0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        aup0Var = new aup0(this, lnmVar);
                    }
                } else {
                    aup0Var = new aup0(this, lnmVar);
                }
                Object obj5 = aup0Var.a;
                int i8 = aup0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf = Boolean.valueOf(((EsOffline.GetOfflinePlaybackStatusResponse) obj).n());
                    aup0Var.b = 1;
                    return vr20Var.emit(boolValueOf, aup0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof wxp0) {
                    wxp0Var = (wxp0) lnmVar;
                    int i9 = wxp0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wxp0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        wxp0Var = new wxp0(this, lnmVar);
                    }
                } else {
                    wxp0Var = new wxp0(this, lnmVar);
                }
                Object obj6 = wxp0Var.a;
                int i10 = wxp0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                h290<EsOffline.ContextProgress> h290VarO = ((EsOffline.ContextsProgressResponse) obj).o();
                int iS = zno1.s(q7h.U(h290VarO, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (EsOffline.ContextProgress contextProgress : h290VarO) {
                    String uri = contextProgress.getUri();
                    EsOffline.Progress progressN = contextProgress.n();
                    linkedHashMap.put(uri, new vxp0((int) progressN.r(), (int) progressN.y(), progressN.z() == fpz.TRACK_TOTALS_STATE_RESOLVED));
                }
                wxp0Var.b = 1;
                return vr20Var.emit(linkedHashMap, wxp0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof t3q0) {
                    t3q0Var = (t3q0) lnmVar;
                    int i11 = t3q0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        t3q0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        t3q0Var = new t3q0(this, lnmVar);
                    }
                } else {
                    t3q0Var = new t3q0(this, lnmVar);
                }
                Object obj7 = t3q0Var.a;
                int i12 = t3q0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf2 = Boolean.valueOf(u890.j((String) obj, "enhanced_trial_active"));
                    t3q0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, t3q0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof n4q0) {
                    n4q0Var = (n4q0) lnmVar;
                    int i13 = n4q0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        n4q0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        n4q0Var = new n4q0(this, lnmVar);
                    }
                } else {
                    n4q0Var = new n4q0(this, lnmVar);
                }
                Object obj8 = n4q0Var.a;
                int i14 = n4q0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                n4q0Var.b = 1;
                return vr20Var.emit(obj, n4q0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof v4q0) {
                    v4q0Var = (v4q0) lnmVar;
                    int i15 = v4q0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        v4q0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        v4q0Var = new v4q0(this, lnmVar);
                    }
                } else {
                    v4q0Var = new v4q0(this, lnmVar);
                }
                Object obj9 = v4q0Var.a;
                int i16 = v4q0Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf3 = Boolean.valueOf(((s3q0) obj) == s3q0Var);
                    v4q0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, v4q0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof w4q0) {
                    w4q0Var = (w4q0) lnmVar;
                    int i17 = w4q0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        w4q0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        w4q0Var = new w4q0(this, lnmVar);
                    }
                } else {
                    w4q0Var = new w4q0(this, lnmVar);
                }
                Object obj10 = w4q0Var.a;
                int i18 = w4q0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                String str2 = (String) obj;
                if (!u890.j(str2, "1")) {
                    s3q0Var = u890.j(str2, "0") ? s3q0.c : s3q0.a;
                }
                w4q0Var.b = 1;
                return vr20Var.emit(s3q0Var, w4q0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof deq0) {
                    deq0Var = (deq0) lnmVar;
                    int i19 = deq0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        deq0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        deq0Var = new deq0(this, lnmVar);
                    }
                } else {
                    deq0Var = new deq0(this, lnmVar);
                }
                Object obj11 = deq0Var.a;
                int i20 = deq0Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    ndq0 ndq0Var = new ndq0((List) obj);
                    deq0Var.b = 1;
                    return vr20Var.emit(ndq0Var, deq0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof grq0) {
                    grq0Var = (grq0) lnmVar;
                    int i21 = grq0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        grq0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        grq0Var = new grq0(this, lnmVar);
                    }
                } else {
                    grq0Var = new grq0(this, lnmVar);
                }
                Object obj12 = grq0Var.a;
                int i22 = grq0Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    grq0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, grq0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof yrq0) {
                    yrq0Var = (yrq0) lnmVar;
                    int i23 = yrq0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        yrq0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        yrq0Var = new yrq0(this, lnmVar);
                    }
                } else {
                    yrq0Var = new yrq0(this, lnmVar);
                }
                Object obj13 = yrq0Var.a;
                int i24 = yrq0Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                i1r i1rVar = (k1r) obj;
                jfvVar = i1rVar instanceof i1r ? (String) i1rVar.a : null;
                if (jfvVar == null) {
                    return rih1Var;
                }
                yrq0Var.b = 1;
                return vr20Var.emit(jfvVar, yrq0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof zrq0) {
                    zrq0Var = (zrq0) lnmVar;
                    int i25 = zrq0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        zrq0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        zrq0Var = new zrq0(this, lnmVar);
                    }
                } else {
                    zrq0Var = new zrq0(this, lnmVar);
                }
                Object obj14 = zrq0Var.a;
                int i26 = zrq0Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                i1r i1rVar2 = (k1r) obj;
                jfvVar = i1rVar2 instanceof i1r ? (String) i1rVar2.a : null;
                if (jfvVar == null) {
                    return rih1Var;
                }
                zrq0Var.b = 1;
                return vr20Var.emit(jfvVar, zrq0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof l6r0) {
                    l6r0Var = (l6r0) lnmVar;
                    int i27 = l6r0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        l6r0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        l6r0Var = new l6r0(this, lnmVar);
                    }
                } else {
                    l6r0Var = new l6r0(this, lnmVar);
                }
                Object obj15 = l6r0Var.a;
                int i28 = l6r0Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    vir0 vir0VarG = f610.g(((Boolean) obj).booleanValue());
                    l6r0Var.b = 1;
                    return vr20Var.emit(vir0VarG, l6r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof u8r0) {
                    u8r0Var = (u8r0) lnmVar;
                    int i29 = u8r0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        u8r0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        u8r0Var = new u8r0(this, lnmVar);
                    }
                } else {
                    u8r0Var = new u8r0(this, lnmVar);
                }
                Object obj16 = u8r0Var.a;
                int i30 = u8r0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                CollectionPlatformItem collectionPlatformItem = (CollectionPlatformItem) o7h.s0(((CollectionPlatformEsperantoItemsResponse) obj).getItemsList());
                if (collectionPlatformItem != null) {
                    if (!collectionPlatformItem.p()) {
                        collectionPlatformItem = null;
                    }
                    if (collectionPlatformItem != null && (itemDataO = collectionPlatformItem.o()) != null) {
                        if (!itemDataO.s()) {
                            itemDataO = null;
                        }
                        if (itemDataO != null && (pageMatchItemDataQ = itemDataO.q()) != null && (durationO = pageMatchItemDataQ.o()) != null) {
                            long jP = durationO.p();
                            ytw0 ytw0Var = jfv.b;
                            jfvVar = new jfv(fdg1.l0(jP, ngv.e));
                        }
                    }
                }
                u8r0Var.b = 1;
                return vr20Var.emit(jfvVar, u8r0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof b9r0) {
                    b9r0Var = (b9r0) lnmVar;
                    int i31 = b9r0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        b9r0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        b9r0Var = new b9r0(this, lnmVar);
                    }
                } else {
                    b9r0Var = new b9r0(this, lnmVar);
                }
                Object obj17 = b9r0Var.a;
                int i32 = b9r0Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf5 = Boolean.valueOf(u890.j(((cma1) obj).a, Boolean.TRUE));
                    b9r0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, b9r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof e9r0) {
                    e9r0Var = (e9r0) lnmVar;
                    int i33 = e9r0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        e9r0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        e9r0Var = new e9r0(this, lnmVar);
                    }
                } else {
                    e9r0Var = new e9r0(this, lnmVar);
                }
                Object obj18 = e9r0Var.a;
                int i34 = e9r0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                Integer num = (Integer) ((cma1) obj).a;
                Integer num2 = new Integer(num != null ? num.intValue() : -1);
                e9r0Var.b = 1;
                return vr20Var.emit(num2, e9r0Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof f9r0) {
                    f9r0Var = (f9r0) lnmVar;
                    int i35 = f9r0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        f9r0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        f9r0Var = new f9r0(this, lnmVar);
                    }
                } else {
                    f9r0Var = new f9r0(this, lnmVar);
                }
                Object obj19 = f9r0Var.a;
                int i36 = f9r0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                Long l = (Long) ((cma1) obj).a;
                Long l2 = new Long(l != null ? l.longValue() : -1L);
                f9r0Var.b = 1;
                return vr20Var.emit(l2, f9r0Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof g9r0) {
                    g9r0Var = (g9r0) lnmVar;
                    int i37 = g9r0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        g9r0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        g9r0Var = new g9r0(this, lnmVar);
                    }
                } else {
                    g9r0Var = new g9r0(this, lnmVar);
                }
                Object obj20 = g9r0Var.a;
                int i38 = g9r0Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j(((cma1) obj).a, Boolean.TRUE));
                    g9r0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, g9r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof h9r0) {
                    h9r0Var = (h9r0) lnmVar;
                    int i39 = h9r0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        h9r0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        h9r0Var = new h9r0(this, lnmVar);
                    }
                } else {
                    h9r0Var = new h9r0(this, lnmVar);
                }
                Object obj21 = h9r0Var.a;
                int i40 = h9r0Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j(((cma1) obj).a, Boolean.TRUE));
                    h9r0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, h9r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof q9r0) {
                    q9r0Var = (q9r0) lnmVar;
                    int i41 = q9r0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        q9r0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        q9r0Var = new q9r0(this, lnmVar);
                    }
                } else {
                    q9r0Var = new q9r0(this, lnmVar);
                }
                Object obj22 = q9r0Var.a;
                int i42 = q9r0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                kby kbyVar = ((cxc0) obj).f;
                o9r0 o9r0Var = new o9r0(kbyVar.a, kbyVar.b, kbyVar.d.a(2));
                q9r0Var.b = 1;
                return vr20Var.emit(o9r0Var, q9r0Var) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof ear0) {
                    ear0Var = (ear0) lnmVar;
                    int i43 = ear0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ear0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        ear0Var = new ear0(this, lnmVar);
                    }
                } else {
                    ear0Var = new ear0(this, lnmVar);
                }
                Object obj23 = ear0Var.a;
                int i44 = ear0Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf8 = Boolean.valueOf(((Number) obj).intValue() > 0);
                    ear0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, ear0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof nbr0) {
                    nbr0Var = (nbr0) lnmVar;
                    int i45 = nbr0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        nbr0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        nbr0Var = new nbr0(this, lnmVar);
                    }
                } else {
                    nbr0Var = new nbr0(this, lnmVar);
                }
                Object obj24 = nbr0Var.a;
                int i46 = nbr0Var.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    ns01 ns01Var = new ns01((mv01) obj);
                    nbr0Var.b = 1;
                    return vr20Var.emit(ns01Var, nbr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof gcr0) {
                    gcr0Var = (gcr0) lnmVar;
                    int i47 = gcr0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gcr0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        gcr0Var = new gcr0(this, lnmVar);
                    }
                } else {
                    gcr0Var = new gcr0(this, lnmVar);
                }
                Object obj25 = gcr0Var.a;
                int i48 = gcr0Var.b;
                if (i48 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf9 = Boolean.valueOf(((vir0) obj) instanceof sir0);
                    gcr0Var.b = 1;
                    return vr20Var.emit(boolValueOf9, gcr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof wcr0) {
                    wcr0Var = (wcr0) lnmVar;
                    int i49 = wcr0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        wcr0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        wcr0Var = new wcr0(this, lnmVar);
                    }
                } else {
                    wcr0Var = new wcr0(this, lnmVar);
                }
                Object obj26 = wcr0Var.a;
                int i50 = wcr0Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    hc91 hc91Var = (jc91) obj;
                    if (hc91Var instanceof hc91) {
                        setP1 = o7h.p1(hc91Var.b);
                    } else if (u890.j(hc91Var, ic91.a)) {
                        setP1 = w7x.a;
                    } else {
                        eg.o();
                    }
                    wcr0Var.b = 1;
                    return vr20Var.emit(setP1, wcr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof qhr0) {
                    qhr0Var = (qhr0) lnmVar;
                    int i51 = qhr0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        qhr0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        qhr0Var = new qhr0(this, lnmVar);
                    }
                } else {
                    qhr0Var = new qhr0(this, lnmVar);
                }
                Object obj27 = qhr0Var.a;
                int i52 = qhr0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (((h6r0) obj) == h6r0Var) {
                    return rih1Var;
                }
                qhr0Var.b = 1;
                return vr20Var.emit(obj, qhr0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof shr0) {
                    shr0Var = (shr0) lnmVar;
                    int i53 = shr0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        shr0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        shr0Var = new shr0(this, lnmVar);
                    }
                } else {
                    shr0Var = new shr0(this, lnmVar);
                }
                Object obj28 = shr0Var.a;
                int i54 = shr0Var.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf10 = Boolean.valueOf(((w8c0) obj).a(w8c0.e));
                    shr0Var.b = 1;
                    return vr20Var.emit(boolValueOf10, shr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof thr0) {
                    thr0Var = (thr0) lnmVar;
                    int i55 = thr0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        thr0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        thr0Var = new thr0(this, lnmVar);
                    }
                } else {
                    thr0Var = new thr0(this, lnmVar);
                }
                Object obj29 = thr0Var.a;
                int i56 = thr0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                if (((h6r0) obj) == h6r0Var) {
                    return rih1Var;
                }
                thr0Var.b = 1;
                return vr20Var.emit(obj, thr0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof uhr0) {
                    uhr0Var = (uhr0) lnmVar;
                    int i57 = uhr0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        uhr0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        uhr0Var = new uhr0(this, lnmVar);
                    }
                } else {
                    uhr0Var = new uhr0(this, lnmVar);
                }
                Object obj30 = uhr0Var.a;
                int i58 = uhr0Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if (((h6r0) obj) == h6r0Var) {
                    return rih1Var;
                }
                uhr0Var.b = 1;
                return vr20Var.emit(obj, uhr0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof vhr0) {
                    vhr0Var = (vhr0) lnmVar;
                    int i59 = vhr0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        vhr0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        vhr0Var = new vhr0(this, lnmVar);
                    }
                } else {
                    vhr0Var = new vhr0(this, lnmVar);
                }
                Object obj31 = vhr0Var.a;
                int i60 = vhr0Var.b;
                if (i60 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf11 = Boolean.valueOf(((vir0) obj) instanceof sir0);
                    vhr0Var.b = 1;
                    return vr20Var.emit(boolValueOf11, vhr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
