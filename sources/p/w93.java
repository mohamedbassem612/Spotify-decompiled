package p;

import com.google.protobuf.h;
import com.spotify.connectivity.reachability.esperanto.proto.EsNotReachable;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachability;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w93 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ w93(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:122:0x0212  */
    /* JADX WARN: Code duplicated, block: B:140:0x0258  */
    /* JADX WARN: Code duplicated, block: B:157:0x0298  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0312  */
    /* JADX WARN: Code duplicated, block: B:213:0x0380  */
    /* JADX WARN: Code duplicated, block: B:228:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:255:0x0446  */
    /* JADX WARN: Code duplicated, block: B:272:0x0486  */
    /* JADX WARN: Code duplicated, block: B:290:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:305:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:322:0x053e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0578  */
    /* JADX WARN: Code duplicated, block: B:352:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:371:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:392:0x0653  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:410:0x068f  */
    /* JADX WARN: Code duplicated, block: B:427:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:447:0x0718  */
    /* JADX WARN: Code duplicated, block: B:467:0x0762  */
    /* JADX WARN: Code duplicated, block: B:485:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:507:0x0802  */
    /* JADX WARN: Code duplicated, block: B:526:0x0853  */
    /* JADX WARN: Code duplicated, block: B:541:0x0893  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:556:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        v93 v93Var;
        na3 na3Var;
        oa3 oa3Var;
        eb3 eb3Var;
        qb3 qb3Var;
        ud3 ud3Var;
        wd3 wd3Var;
        be3 be3Var;
        sj3 sj3Var;
        a64 a64Var;
        u64 u64Var;
        i74 i74Var;
        j74 j74Var;
        as4 as4Var;
        bs4 bs4Var;
        cs4 cs4Var;
        ds4 ds4Var;
        es4 es4Var;
        fs4 fs4Var;
        gs4 gs4Var;
        hs4 hs4Var;
        is4 is4Var;
        ns4 ns4Var;
        os4 os4Var;
        ss4 ss4Var;
        rz4 rz4Var;
        ArrayList arrayList;
        int number;
        h hVarBuild;
        w85 w85Var;
        en5 en5Var;
        dv5 dv5Var;
        rv5 rv5Var;
        byte b = this.a;
        String strB0 = "";
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        u7h u7hVarQ0 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof v93) {
                    v93Var = (v93) lnmVar;
                    int i = v93Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        v93Var.b = i - Integer.MIN_VALUE;
                    } else {
                        v93Var = new v93(this, lnmVar);
                    }
                } else {
                    v93Var = new v93(this, lnmVar);
                }
                Object obj2 = v93Var.a;
                int i2 = v93Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                v93Var.b = 1;
                return vr20Var.emit(obj, v93Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof na3) {
                    na3Var = (na3) lnmVar;
                    int i3 = na3Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        na3Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        na3Var = new na3(this, lnmVar);
                    }
                } else {
                    na3Var = new na3(this, lnmVar);
                }
                Object obj3 = na3Var.a;
                int i4 = na3Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((p0d0) obj).a.a());
                    na3Var.b = 1;
                    return vr20Var.emit(boolValueOf, na3Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof oa3) {
                    oa3Var = (oa3) lnmVar;
                    int i5 = oa3Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        oa3Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        oa3Var = new oa3(this, lnmVar);
                    }
                } else {
                    oa3Var = new oa3(this, lnmVar);
                }
                Object obj4 = oa3Var.a;
                int i6 = oa3Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf2 = Boolean.valueOf(((p0d0) obj).a.b());
                    oa3Var.b = 1;
                    return vr20Var.emit(boolValueOf2, oa3Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof eb3) {
                    eb3Var = (eb3) lnmVar;
                    int i7 = eb3Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        eb3Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        eb3Var = new eb3(this, lnmVar);
                    }
                } else {
                    eb3Var = new eb3(this, lnmVar);
                }
                Object obj5 = eb3Var.a;
                int i8 = eb3Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                String str = (String) ((cxc0) obj).f.q.get("artistUris");
                u7hVarQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
                if (u7hVarQ0 == null) {
                    return rih1Var;
                }
                eb3Var.b = 1;
                return vr20Var.emit(u7hVarQ0, eb3Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof qb3) {
                    qb3Var = (qb3) lnmVar;
                    int i9 = qb3Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qb3Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        qb3Var = new qb3(this, lnmVar);
                    }
                } else {
                    qb3Var = new qb3(this, lnmVar);
                }
                Object obj6 = qb3Var.a;
                int i10 = qb3Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                xti0 xti0VarA = ((cxc0) obj).f.x.a(xti0.class);
                u7hVarQ0 = xti0VarA != null ? xti0VarA.a : null;
                Boolean boolValueOf3 = Boolean.valueOf(!(u7hVarQ0 == null || u7hVarQ0.isEmpty()));
                qb3Var.b = 1;
                return vr20Var.emit(boolValueOf3, qb3Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof ud3) {
                    ud3Var = (ud3) lnmVar;
                    int i11 = ud3Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ud3Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ud3Var = new ud3(this, lnmVar);
                    }
                } else {
                    ud3Var = new ud3(this, lnmVar);
                }
                Object obj7 = ud3Var.a;
                int i12 = ud3Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                mmr0 mmr0Var = (mmr0) obj;
                tv00 tv00Var = (tv00) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                if (!tv00Var.c.a && zBooleanValue) {
                    return rih1Var;
                }
                ud3Var.b = 1;
                return vr20Var.emit(obj, ud3Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof wd3) {
                    wd3Var = (wd3) lnmVar;
                    int i13 = wd3Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wd3Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        wd3Var = new wd3(this, lnmVar);
                    }
                } else {
                    wd3Var = new wd3(this, lnmVar);
                }
                Object obj8 = wd3Var.a;
                int i14 = wd3Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                sv00 sv00Var = ((tv00) ((mmr0) obj).a).c;
                if (sv00Var.a && sv00Var.b == 4) {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                wd3Var.b = 1;
                return vr20Var.emit(boolValueOf4, wd3Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof be3) {
                    be3Var = (be3) lnmVar;
                    int i15 = be3Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        be3Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        be3Var = new be3(this, lnmVar);
                    }
                } else {
                    be3Var = new be3(this, lnmVar);
                }
                Object obj9 = be3Var.a;
                int i16 = be3Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                s211 s211VarA = ((cxc0) obj).f.x.a(s211.class);
                Boolean boolValueOf5 = Boolean.valueOf((s211VarA != null ? s211VarA.a : null) != null);
                be3Var.b = 1;
                return vr20Var.emit(boolValueOf5, be3Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof sj3) {
                    sj3Var = (sj3) lnmVar;
                    int i17 = sj3Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        sj3Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        sj3Var = new sj3(this, lnmVar);
                    }
                } else {
                    sj3Var = new sj3(this, lnmVar);
                }
                Object obj10 = sj3Var.a;
                int i18 = sj3Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                sj3Var.b = 1;
                return vr20Var.emit(objG, sj3Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof a64) {
                    a64Var = (a64) lnmVar;
                    int i19 = a64Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        a64Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        a64Var = new a64(this, lnmVar);
                    }
                } else {
                    a64Var = new a64(this, lnmVar);
                }
                Object obj11 = a64Var.a;
                int i20 = a64Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                pp90 pp90Var = (pp90) obj;
                u7hVarQ0 = pp90Var != null ? pp90Var.h.a : null;
                a64Var.b = 1;
                return vr20Var.emit(u7hVarQ0, a64Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof u64) {
                    u64Var = (u64) lnmVar;
                    int i21 = u64Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        u64Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        u64Var = new u64(this, lnmVar);
                    }
                } else {
                    u64Var = new u64(this, lnmVar);
                }
                Object obj12 = u64Var.a;
                int i22 = u64Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                pp90 pp90Var2 = (pp90) obj;
                if (pp90Var2 != null) {
                    ArrayList<hp90> arrayList2 = pp90Var2.c;
                    u7hVarQ0 = new ArrayList(q7h.U(arrayList2, 10));
                    for (hp90 hp90Var : arrayList2) {
                        u7hVarQ0.add(new qvc(hp90Var.b, hp90Var.e));
                    }
                }
                u64Var.b = 1;
                return vr20Var.emit(u7hVarQ0, u64Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof i74) {
                    i74Var = (i74) lnmVar;
                    int i23 = i74Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        i74Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        i74Var = new i74(this, lnmVar);
                    }
                } else {
                    i74Var = new i74(this, lnmVar);
                }
                Object obj13 = i74Var.a;
                int i24 = i74Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                th61 th61Var = (th61) obj;
                if (th61Var.c || th61Var.d) {
                    return rih1Var;
                }
                i74Var.b = 1;
                return vr20Var.emit(obj, i74Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof j74) {
                    j74Var = (j74) lnmVar;
                    int i25 = j74Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        j74Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        j74Var = new j74(this, lnmVar);
                    }
                } else {
                    j74Var = new j74(this, lnmVar);
                }
                Object obj14 = j74Var.a;
                int i26 = j74Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf6 = Boolean.valueOf(((th61) obj).b);
                    j74Var.b = 1;
                    return vr20Var.emit(boolValueOf6, j74Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof as4) {
                    as4Var = (as4) lnmVar;
                    int i27 = as4Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        as4Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        as4Var = new as4(this, lnmVar);
                    }
                } else {
                    as4Var = new as4(this, lnmVar);
                }
                Object obj15 = as4Var.a;
                int i28 = as4Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    String strB1 = l4o1.b0((ContextTrack) obj);
                    as4Var.b = 1;
                    return vr20Var.emit(strB1, as4Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof bs4) {
                    bs4Var = (bs4) lnmVar;
                    int i29 = bs4Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        bs4Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        bs4Var = new bs4(this, lnmVar);
                    }
                } else {
                    bs4Var = new bs4(this, lnmVar);
                }
                Object obj16 = bs4Var.a;
                int i30 = bs4Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                Object objH = ((PlayerState) obj).track().h();
                if (objH == null) {
                    return rih1Var;
                }
                bs4Var.b = 1;
                return vr20Var.emit(objH, bs4Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof cs4) {
                    cs4Var = (cs4) lnmVar;
                    int i31 = cs4Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        cs4Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        cs4Var = new cs4(this, lnmVar);
                    }
                } else {
                    cs4Var = new cs4(this, lnmVar);
                }
                Object obj17 = cs4Var.a;
                int i32 = cs4Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    ktl ktlVar = ((mtl) obj).a;
                    cs4Var.b = 1;
                    return vr20Var.emit(ktlVar, cs4Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof ds4) {
                    ds4Var = (ds4) lnmVar;
                    int i33 = ds4Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ds4Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        ds4Var = new ds4(this, lnmVar);
                    }
                } else {
                    ds4Var = new ds4(this, lnmVar);
                }
                Object obj18 = ds4Var.a;
                int i34 = ds4Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                ContextTrack contextTrack = (ContextTrack) obj;
                strB0 = l4o1.C(contextTrack) ? "" : l4o1.b0(contextTrack);
                ds4Var.b = 1;
                return vr20Var.emit(strB0, ds4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof es4) {
                    es4Var = (es4) lnmVar;
                    int i35 = es4Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        es4Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        es4Var = new es4(this, lnmVar);
                    }
                } else {
                    es4Var = new es4(this, lnmVar);
                }
                Object obj19 = es4Var.a;
                int i36 = es4Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                Object objH2 = ((PlayerState) obj).track().h();
                if (objH2 == null) {
                    return rih1Var;
                }
                es4Var.b = 1;
                return vr20Var.emit(objH2, es4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof fs4) {
                    fs4Var = (fs4) lnmVar;
                    int i37 = fs4Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        fs4Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        fs4Var = new fs4(this, lnmVar);
                    }
                } else {
                    fs4Var = new fs4(this, lnmVar);
                }
                Object obj20 = fs4Var.a;
                int i38 = fs4Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                xkk1 xkk1Var = (xkk1) obj;
                pp70 pp70Var = xkk1Var.d;
                u7h u7hVar = pp70Var != null ? new u7h(pp70Var.b.a.c) : null;
                pp70 pp70Var2 = xkk1Var.a.b;
                u7hVarQ0 = pp70Var2 != null ? new u7h(pp70Var2.b.a.c) : null;
                if (u7hVar != null) {
                    strB0 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(z4p1.G(u7hVar.a) & 16777215)}, 1));
                } else if (u7hVarQ0 != null) {
                    u7hVar = u7hVarQ0;
                    strB0 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(z4p1.G(u7hVar.a) & 16777215)}, 1));
                }
                fs4Var.b = 1;
                return vr20Var.emit(strB0, fs4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof gs4) {
                    gs4Var = (gs4) lnmVar;
                    int i39 = gs4Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        gs4Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        gs4Var = new gs4(this, lnmVar);
                    }
                } else {
                    gs4Var = new gs4(this, lnmVar);
                }
                Object obj21 = gs4Var.a;
                int i40 = gs4Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                ContextTrack contextTrack2 = (ContextTrack) obj;
                List listJ0 = o7h.j0(p7h.M(new String[]{l4o1.b0(contextTrack2), contextTrack2.uri()}));
                gs4Var.b = 1;
                return vr20Var.emit(listJ0, gs4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof hs4) {
                    hs4Var = (hs4) lnmVar;
                    int i41 = hs4Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hs4Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        hs4Var = new hs4(this, lnmVar);
                    }
                } else {
                    hs4Var = new hs4(this, lnmVar);
                }
                Object obj22 = hs4Var.a;
                int i42 = hs4Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str2 = (String) entry.getKey();
                    jo70 jo70Var = (jo70) entry.getValue();
                    mmr0 mmr0Var2 = jo70Var != null ? new mmr0(str2, jo70Var) : null;
                    if (mmr0Var2 != null) {
                        arrayList3.add(mmr0Var2);
                    }
                }
                Map mapT = sqg0.T(arrayList3);
                hs4Var.b = 1;
                return vr20Var.emit(mapT, hs4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof is4) {
                    is4Var = (is4) lnmVar;
                    int i43 = is4Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        is4Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        is4Var = new is4(this, lnmVar);
                    }
                } else {
                    is4Var = new is4(this, lnmVar);
                }
                Object obj23 = is4Var.a;
                int i44 = is4Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                Object objH3 = ((PlayerState) obj).track().h();
                if (objH3 == null) {
                    return rih1Var;
                }
                is4Var.b = 1;
                return vr20Var.emit(objH3, is4Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof ns4) {
                    ns4Var = (ns4) lnmVar;
                    int i45 = ns4Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ns4Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        ns4Var = new ns4(this, lnmVar);
                    }
                } else {
                    ns4Var = new ns4(this, lnmVar);
                }
                Object obj24 = ns4Var.a;
                int i46 = ns4Var.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    String strB2 = l4o1.b0((ContextTrack) obj);
                    ns4Var.b = 1;
                    return vr20Var.emit(strB2, ns4Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof os4) {
                    os4Var = (os4) lnmVar;
                    int i47 = os4Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        os4Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        os4Var = new os4(this, lnmVar);
                    }
                } else {
                    os4Var = new os4(this, lnmVar);
                }
                Object obj25 = os4Var.a;
                int i48 = os4Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                Object objH4 = ((PlayerState) obj).track().h();
                if (objH4 == null) {
                    return rih1Var;
                }
                os4Var.b = 1;
                return vr20Var.emit(objH4, os4Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof ss4) {
                    ss4Var = (ss4) lnmVar;
                    int i49 = ss4Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ss4Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        ss4Var = new ss4(this, lnmVar);
                    }
                } else {
                    ss4Var = new ss4(this, lnmVar);
                }
                Object obj26 = ss4Var.a;
                int i50 = ss4Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                ContextTrack contextTrack3 = (ContextTrack) ((PlayerState) obj).track().h();
                u7hVarQ0 = contextTrack3 != null ? l4o1.b0(contextTrack3) : null;
                ss4Var.b = 1;
                return vr20Var.emit(u7hVarQ0, ss4Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof rz4) {
                    rz4Var = (rz4) lnmVar;
                    int i51 = rz4Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        rz4Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        rz4Var = new rz4(this, lnmVar);
                    }
                } else {
                    rz4Var = new rz4(this, lnmVar);
                }
                Object obj27 = rz4Var.a;
                int i52 = rz4Var.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    swz0 swz0Var = (uwz0) obj;
                    qqz qqzVarN = EsReachability.LegacyReachability.n();
                    if (swz0Var instanceof swz0) {
                        eho0 eho0Var = swz0Var.a;
                        ooz oozVarN = EsNotReachable.LegacyNotReachable.n();
                        if (eho0Var.equals(dho0.a)) {
                            oozVarN.n(EsNotReachable.LegacyForcedOffline.o());
                        } else if (eho0Var instanceof eho0) {
                            noz nozVarN = EsNotReachable.LegacyNoInternet.n();
                            eho0 eho0Var2 = eho0Var;
                            nozVarN.q(eho0Var2.a);
                            nozVarN.n(eho0Var2.b);
                            oozVarN.q(nozVarN.build());
                        } else {
                            eg.o();
                        }
                        qqzVarN.n(oozVarN.build());
                        hVarBuild = qqzVarN.build();
                        rz4Var.b = 1;
                        if (vr20Var.emit(hVarBuild, rz4Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    if (swz0Var instanceof twz0) {
                        sqz sqzVarO = EsReachable.LegacyReachable.o();
                        Set set = ((twz0) swz0Var).a;
                        if (set != null) {
                            Set set2 = set;
                            arrayList = new ArrayList(q7h.U(set2, 10));
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                int iOrdinal = ((a7o0) it.next()).ordinal();
                                if (iOrdinal == 0) {
                                    number = moz.b.getNumber();
                                } else if (iOrdinal == 1) {
                                    number = moz.c.getNumber();
                                } else if (iOrdinal == 2) {
                                    number = moz.d.getNumber();
                                } else if (iOrdinal == 3) {
                                    number = moz.e.getNumber();
                                } else {
                                    eg.o();
                                }
                                arrayList.add(new Integer(number));
                            }
                        } else {
                            arrayList = z6x.a;
                        }
                        sqzVarO.n(arrayList);
                        qqzVarN.q(sqzVarO);
                        hVarBuild = qqzVarN.build();
                        rz4Var.b = 1;
                        if (vr20Var.emit(hVarBuild, rz4Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 26:
                if (lnmVar instanceof w85) {
                    w85Var = (w85) lnmVar;
                    int i53 = w85Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        w85Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        w85Var = new w85(this, lnmVar);
                    }
                } else {
                    w85Var = new w85(this, lnmVar);
                }
                Object obj28 = w85Var.a;
                int i54 = w85Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                xvl1 xvl1Var = (xvl1) obj;
                if (xvl1Var == null || !xvl1Var.b.a()) {
                    return rih1Var;
                }
                w85Var.b = 1;
                return vr20Var.emit(obj, w85Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof en5) {
                    en5Var = (en5) lnmVar;
                    int i55 = en5Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        en5Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        en5Var = new en5(this, lnmVar);
                    }
                } else {
                    en5Var = new en5(this, lnmVar);
                }
                Object obj29 = en5Var.a;
                int i56 = en5Var.b;
                if (i56 == 0) {
                    hm5.M(obj29);
                    c0o0 c0o0Var = new c0o0(((Boolean) obj).booleanValue());
                    en5Var.b = 1;
                    return vr20Var.emit(c0o0Var, en5Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof dv5) {
                    dv5Var = (dv5) lnmVar;
                    int i57 = dv5Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dv5Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        dv5Var = new dv5(this, lnmVar);
                    }
                } else {
                    dv5Var = new dv5(this, lnmVar);
                }
                Object obj30 = dv5Var.a;
                int i58 = dv5Var.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    nen nenVar = new nen((String) obj);
                    dv5Var.b = 1;
                    return vr20Var.emit(nenVar, dv5Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof rv5) {
                    rv5Var = (rv5) lnmVar;
                    int i59 = rv5Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        rv5Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        rv5Var = new rv5(this, lnmVar);
                    }
                } else {
                    rv5Var = new rv5(this, lnmVar);
                }
                Object obj31 = rv5Var.a;
                int i60 = rv5Var.b;
                if (i60 == 0) {
                    hm5.M(obj31);
                    spq0 spq0VarTrack = ((PlayerState) obj).track();
                    rv5Var.b = 1;
                    return vr20Var.emit(spq0VarTrack, rv5Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ w93(vr20 vr20Var, hsw hswVar, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
