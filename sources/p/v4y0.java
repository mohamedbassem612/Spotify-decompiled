package p;

import com.spotify.connectivity.pubsub.esperanto.proto.EsConnectionId;
import com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage;
import com.spotify.homeagent.v1.Seed;
import com.spotify.homeagent.v1.UserPromptEntry;
import com.spotify.homeagent.v1.WorldListAttributes;
import com.spotify.homeagent.v1.WorldSection;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v4y0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ v4y0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        d6z0 d6z0Var;
        if (lnmVar instanceof d6z0) {
            d6z0Var = (d6z0) lnmVar;
            int i = d6z0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d6z0Var.b = i - Integer.MIN_VALUE;
            } else {
                d6z0Var = new d6z0(this, lnmVar);
            }
        } else {
            d6z0Var = new d6z0(this, lnmVar);
        }
        Object obj2 = d6z0Var.a;
        int i2 = d6z0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            b8z0 b8z0Var = new b8z0((bpd) obj);
            d6z0Var.b = 1;
            Object objEmit = this.b.emit(b8z0Var, d6z0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x0222  */
    /* JADX WARN: Code duplicated, block: B:155:0x0276  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0316  */
    /* JADX WARN: Code duplicated, block: B:213:0x0356  */
    /* JADX WARN: Code duplicated, block: B:228:0x0397  */
    /* JADX WARN: Code duplicated, block: B:248:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:268:0x0433  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:283:0x046e  */
    /* JADX WARN: Code duplicated, block: B:300:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:339:0x052b  */
    /* JADX WARN: Code duplicated, block: B:403:0x0643  */
    /* JADX WARN: Code duplicated, block: B:411:0x0660  */
    /* JADX WARN: Code duplicated, block: B:413:0x0668  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:421:0x0683  */
    /* JADX WARN: Code duplicated, block: B:446:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:484:0x0786  */
    /* JADX WARN: Code duplicated, block: B:509:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:530:0x083f  */
    /* JADX WARN: Code duplicated, block: B:553:0x089f  */
    /* JADX WARN: Code duplicated, block: B:568:0x08db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:583:0x091b  */
    /* JADX WARN: Code duplicated, block: B:598:0x095e  */
    /* JADX WARN: Code duplicated, block: B:617:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:673:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    /* JADX WARN: Code duplicated, block: B:92:0x0188  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final Object emit(Object obj, lnm lnmVar) {
        u4y0 u4y0Var;
        String string;
        d5y0 d5y0Var;
        g5y0 g5y0Var;
        b6y0 b6y0Var;
        z6y0 z6y0Var;
        n7y0 n7y0Var;
        String string2;
        q7y0 q7y0Var;
        Boolean boolD1;
        s7y0 s7y0Var;
        String string3;
        l8y0 l8y0Var;
        Boolean boolD2;
        String string4;
        rby0 rby0Var;
        String string5;
        bdy0 bdy0Var;
        Object cdy0Var;
        h290 h290VarO;
        UserPromptEntry userPromptEntryO;
        String strO;
        String strO2;
        String strO3;
        aly0 aly0Var;
        bly0 bly0Var;
        zly0 zly0Var;
        jmy0 jmy0Var;
        mmy0 mmy0Var;
        nmy0 nmy0Var;
        ony0 ony0Var;
        pny0 pny0Var;
        ioy0 ioy0Var;
        joy0 joy0Var;
        cpy0 cpy0Var;
        puy0 puy0Var;
        pzy0 pzy0Var;
        uzy0 uzy0Var;
        xzy0 xzy0Var;
        yzy0 yzy0Var;
        l0z0 l0z0Var;
        e6z0 e6z0Var;
        byte b = this.a;
        String str = "";
        boolean z = false;
        i = 0;
        int i = 0;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        zBooleanValue = false;
        boolean zBooleanValue = false;
        z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        String str2 = null;
        Object obj2 = null;
        str = null;
        str = null;
        String str3 = null;
        edy0Var = null;
        Object edy0Var = null;
        str = null;
        str = null;
        String str4 = null;
        str2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof u4y0) {
                    u4y0Var = (u4y0) lnmVar;
                    int i2 = u4y0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        u4y0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        u4y0Var = new u4y0(this, lnmVar);
                    }
                } else {
                    u4y0Var = new u4y0(this, lnmVar);
                }
                Object obj3 = u4y0Var.a;
                int i3 = u4y0Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                cxc0 cxc0Var = (cxc0) obj;
                Map map = cxc0Var.f.q;
                Set set = h4d0.a;
                String str5 = (String) map.get("generation_status");
                if (str5 == null || (string = ihc1.e1(str5).toString()) == null) {
                    string = "";
                }
                if (qyo1.u(string).b()) {
                    String str6 = (String) cxc0Var.f.q.get("spotbot_message_id");
                    if (!ihc1.y0(str6 != null ? str6 : "")) {
                        z = true;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                u4y0Var.b = 1;
                return vr20Var.emit(boolValueOf, u4y0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof d5y0) {
                    d5y0Var = (d5y0) lnmVar;
                    int i4 = d5y0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        d5y0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        d5y0Var = new d5y0(this, lnmVar);
                    }
                } else {
                    d5y0Var = new d5y0(this, lnmVar);
                }
                Object obj4 = d5y0Var.a;
                int i5 = d5y0Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                ul10 ul10Var = (vl10) ((Map) obj).get(q1y0.a);
                if ((ul10Var instanceof ul10) && ul10Var.b) {
                    return rih1Var;
                }
                d5y0Var.b = 1;
                return vr20Var.emit(obj, d5y0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof g5y0) {
                    g5y0Var = (g5y0) lnmVar;
                    int i6 = g5y0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        g5y0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        g5y0Var = new g5y0(this, lnmVar);
                    }
                } else {
                    g5y0Var = new g5y0(this, lnmVar);
                }
                Object obj5 = g5y0Var.a;
                int i7 = g5y0Var.b;
                if (i7 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(((Map) obj).get(r1y0.a) instanceof ul10);
                    g5y0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, g5y0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof b6y0) {
                    b6y0Var = (b6y0) lnmVar;
                    int i8 = b6y0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        b6y0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        b6y0Var = new b6y0(this, lnmVar);
                    }
                } else {
                    b6y0Var = new b6y0(this, lnmVar);
                }
                Object obj6 = b6y0Var.a;
                int i9 = b6y0Var.b;
                if (i9 == 0) {
                    hm5.M(obj6);
                    q5y0 q5y0Var = new q5y0(((Boolean) obj).booleanValue());
                    b6y0Var.b = 1;
                    return vr20Var.emit(q5y0Var, b6y0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof z6y0) {
                    z6y0Var = (z6y0) lnmVar;
                    int i10 = z6y0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        z6y0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        z6y0Var = new z6y0(this, lnmVar);
                    }
                } else {
                    z6y0Var = new z6y0(this, lnmVar);
                }
                Object obj7 = z6y0Var.a;
                int i11 = z6y0Var.b;
                if (i11 == 0) {
                    hm5.M(obj7);
                    x6y0 x6y0Var = new x6y0((v6y0) obj);
                    z6y0Var.b = 1;
                    return vr20Var.emit(x6y0Var, z6y0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof n7y0) {
                    n7y0Var = (n7y0) lnmVar;
                    int i12 = n7y0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        n7y0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        n7y0Var = new n7y0(this, lnmVar);
                    }
                } else {
                    n7y0Var = new n7y0(this, lnmVar);
                }
                Object obj8 = n7y0Var.a;
                int i13 = n7y0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                Map map2 = ((cxc0) obj).f.q;
                Set set2 = h4d0.a;
                String str7 = (String) map2.get("generation_status");
                if (str7 != null && (string2 = ihc1.e1(str7).toString()) != null) {
                    str = string2;
                }
                h4d0 h4d0VarU = qyo1.u(str);
                h4d0VarU.getClass();
                if (!h4d0.a.contains(h4d0VarU)) {
                    return rih1Var;
                }
                n7y0Var.b = 1;
                return vr20Var.emit(obj, n7y0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof q7y0) {
                    q7y0Var = (q7y0) lnmVar;
                    int i14 = q7y0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        q7y0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        q7y0Var = new q7y0(this, lnmVar);
                    }
                } else {
                    q7y0Var = new q7y0(this, lnmVar);
                }
                Object obj9 = q7y0Var.a;
                int i15 = q7y0Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                String str8 = (String) ((cxc0) obj).f.q.get("is_overdue_for_scheduled_update");
                if (str8 != null && (boolD1 = ihc1.d1(str8)) != null) {
                    zBooleanValue = boolD1.booleanValue();
                }
                if (!zBooleanValue) {
                    return rih1Var;
                }
                q7y0Var.b = 1;
                return vr20Var.emit(obj, q7y0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof s7y0) {
                    s7y0Var = (s7y0) lnmVar;
                    int i16 = s7y0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        s7y0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        s7y0Var = new s7y0(this, lnmVar);
                    }
                } else {
                    s7y0Var = new s7y0(this, lnmVar);
                }
                Object obj10 = s7y0Var.a;
                int i17 = s7y0Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                cxc0 cxc0Var2 = (cxc0) obj;
                boolean zA = cxc0Var2.a();
                Set set3 = t7y0.h;
                Map map3 = cxc0Var2.f.q;
                Set set4 = h4d0.a;
                String str9 = (String) map3.get("generation_status");
                if (str9 != null && (string3 = ihc1.e1(str9).toString()) != null) {
                    str = string3;
                }
                Boolean boolValueOf3 = Boolean.valueOf(!zA || set3.contains(qyo1.u(str)));
                s7y0Var.b = 1;
                return vr20Var.emit(boolValueOf3, s7y0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof l8y0) {
                    l8y0Var = (l8y0) lnmVar;
                    int i18 = l8y0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        l8y0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        l8y0Var = new l8y0(this, lnmVar);
                    }
                } else {
                    l8y0Var = new l8y0(this, lnmVar);
                }
                Object obj11 = l8y0Var.a;
                int i19 = l8y0Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                kby kbyVar = ((cxc0) obj).f;
                Map map4 = kbyVar.q;
                Set set5 = h4d0.a;
                String str10 = (String) map4.get("generation_status");
                if (str10 != null && (string4 = ihc1.e1(str10).toString()) != null) {
                    str = string4;
                }
                boolean zB = qyo1.u(str).b();
                Set set6 = m8y0.g;
                String str11 = (String) map4.get("spotbot_assistant_name");
                if (str11 != null && !ihc1.y0(str11)) {
                    str2 = str11;
                }
                boolean zI0 = o7h.i0(set6, str2);
                if (kbyVar.w.b && zB && zI0) {
                    String str12 = (String) map4.get("allow_refinement");
                    if ((str12 == null || (boolD2 = ihc1.d1(str12)) == null) ? false : boolD2.booleanValue()) {
                        z2 = true;
                    }
                }
                Boolean boolValueOf4 = Boolean.valueOf(z2);
                l8y0Var.b = 1;
                return vr20Var.emit(boolValueOf4, l8y0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof rby0) {
                    rby0Var = (rby0) lnmVar;
                    int i20 = rby0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        rby0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        rby0Var = new rby0(this, lnmVar);
                    }
                } else {
                    rby0Var = new rby0(this, lnmVar);
                }
                Object obj12 = rby0Var.a;
                int i21 = rby0Var.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                cxc0 cxc0Var3 = (cxc0) obj;
                boolean zA2 = cxc0Var3.a();
                Set set7 = sby0.h;
                Map map5 = cxc0Var3.f.q;
                Set set8 = h4d0.a;
                String str13 = (String) map5.get("generation_status");
                if (str13 != null && (string5 = ihc1.e1(str13).toString()) != null) {
                    str = string5;
                }
                Boolean boolValueOf5 = Boolean.valueOf(!zA2 || set7.contains(qyo1.u(str)));
                rby0Var.b = 1;
                return vr20Var.emit(boolValueOf5, rby0Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof bdy0) {
                    bdy0Var = (bdy0) lnmVar;
                    int i22 = bdy0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        bdy0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        bdy0Var = new bdy0(this, lnmVar);
                    }
                } else {
                    bdy0Var = new bdy0(this, lnmVar);
                }
                Object obj13 = bdy0Var.a;
                int i23 = bdy0Var.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    wsc0 wsc0Var = (wsc0) ((py21) obj).d();
                    kby kbyVar2 = wsc0Var.f;
                    WorldListAttributes worldListAttributes = (WorldListAttributes) xzn1.H(kbyVar2.q, "world_attributes", acy0.a);
                    if (worldListAttributes != null) {
                        if (!worldListAttributes.t() || worldListAttributes.n().o() != z5m1.GENERATION_ERROR) {
                            int i24 = ycy0.a[worldListAttributes.s().ordinal()];
                            if (i24 == 1) {
                                List list = wsc0Var.e;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    WorldSection worldSection = (WorldSection) xzn1.H(((zuc0) it.next()).g, "world_section", bcy0.a);
                                    if (worldSection == null) {
                                        h290VarO = null;
                                    } else {
                                        if (worldSection.n() != 10) {
                                            worldSection = null;
                                        }
                                        if (worldSection == null || (userPromptEntryO = worldSection.o()) == null) {
                                            h290VarO = null;
                                        } else {
                                            h290VarO = userPromptEntryO.o();
                                        }
                                    }
                                    if (h290VarO != null) {
                                        arrayList.add(h290VarO);
                                    }
                                }
                                ArrayList arrayListV = q7h.V(arrayList);
                                String str14 = kbyVar2.b;
                                cdy0Var = new cdy0(str14.length() > 0 ? str14 : null, arrayListV);
                            } else if (i24 == 2) {
                                Seed seedR = worldListAttributes.r();
                                if (seedR != null && (strO = seedR.o()) != null && !ihc1.y0(strO)) {
                                    str4 = strO;
                                }
                                edy0Var = new edy0(str4);
                            } else if (i24 == 3) {
                                String strQ = worldListAttributes.q();
                                strQ.getClass();
                                String str15 = strQ.length() > 0 ? strQ : null;
                                if (str15 != null) {
                                    String str16 = kbyVar2.b;
                                    String strP = worldListAttributes.p();
                                    String strO4 = worldListAttributes.o();
                                    Seed seedR2 = worldListAttributes.r();
                                    edy0Var = new ddy0(str16, strP, strO4, str15, (seedR2 == null || (strO2 = seedR2.o()) == null || ihc1.y0(strO2)) ? null : strO2);
                                }
                            }
                            if (edy0Var != null) {
                                return rih1Var;
                            }
                            bdy0Var.b = 1;
                            if (vr20Var.emit(edy0Var, bdy0Var) == d9nVar) {
                                return d9nVar;
                            }
                            return rih1Var;
                        }
                        String strP2 = worldListAttributes.n().p();
                        Seed seedR3 = worldListAttributes.r();
                        if (seedR3 != null && (strO3 = seedR3.o()) != null && !ihc1.y0(strO3)) {
                            str3 = strO3;
                        }
                        cdy0Var = new fdy0(strP2, str3);
                        edy0Var = cdy0Var;
                        if (edy0Var != null) {
                            return rih1Var;
                        }
                        bdy0Var.b = 1;
                        if (vr20Var.emit(edy0Var, bdy0Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    hhg1.n("Missing world_attributes on list entity");
                } else {
                    if (i23 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 11:
                if (lnmVar instanceof aly0) {
                    aly0Var = (aly0) lnmVar;
                    int i25 = aly0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        aly0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        aly0Var = new aly0(this, lnmVar);
                    }
                } else {
                    aly0Var = new aly0(this, lnmVar);
                }
                Object obj14 = aly0Var.a;
                int i26 = aly0Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                aly0Var.b = 1;
                return vr20Var.emit(obj, aly0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof bly0) {
                    bly0Var = (bly0) lnmVar;
                    int i27 = bly0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bly0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        bly0Var = new bly0(this, lnmVar);
                    }
                } else {
                    bly0Var = new bly0(this, lnmVar);
                }
                Object obj15 = bly0Var.a;
                int i28 = bly0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                Boolean bool = i1rVar2 != null ? (Boolean) i1rVar2.a : null;
                if (bool == null) {
                    return rih1Var;
                }
                bly0Var.b = 1;
                return vr20Var.emit(bool, bly0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof zly0) {
                    zly0Var = (zly0) lnmVar;
                    int i29 = zly0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        zly0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        zly0Var = new zly0(this, lnmVar);
                    }
                } else {
                    zly0Var = new zly0(this, lnmVar);
                }
                Object obj16 = zly0Var.a;
                int i30 = zly0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                if (!(obj instanceof jn41)) {
                    return rih1Var;
                }
                zly0Var.b = 1;
                return vr20Var.emit(obj, zly0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof jmy0) {
                    jmy0Var = (jmy0) lnmVar;
                    int i31 = jmy0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        jmy0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        jmy0Var = new jmy0(this, lnmVar);
                    }
                } else {
                    jmy0Var = new jmy0(this, lnmVar);
                }
                Object obj17 = jmy0Var.a;
                int i32 = jmy0Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    String id = ((EsConnectionId.ConnectionID) obj).getId();
                    jmy0Var.b = 1;
                    return vr20Var.emit(id, jmy0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof mmy0) {
                    mmy0Var = (mmy0) lnmVar;
                    int i33 = mmy0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        mmy0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        mmy0Var = new mmy0(this, lnmVar);
                    }
                } else {
                    mmy0Var = new mmy0(this, lnmVar);
                }
                Object obj18 = mmy0Var.a;
                int i34 = mmy0Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsConnectionId.ConnectionID connectionIDO = EsConnectionId.ConnectionID.o(bArr);
                        mmy0Var.b = 1;
                        return vr20Var.emit(connectionIDO, mmy0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.pubsub.esperanto.proto.EsConnectionId.ConnectionID: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 16:
                if (lnmVar instanceof nmy0) {
                    nmy0Var = (nmy0) lnmVar;
                    int i35 = nmy0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        nmy0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        nmy0Var = new nmy0(this, lnmVar);
                    }
                } else {
                    nmy0Var = new nmy0(this, lnmVar);
                }
                Object obj19 = nmy0Var.a;
                int i36 = nmy0Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        EsPushedMessage.PushedMessage pushedMessageR = EsPushedMessage.PushedMessage.r(bArr2);
                        nmy0Var.b = 1;
                        return vr20Var.emit(pushedMessageR, nmy0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage.PushedMessage: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof ony0) {
                    ony0Var = (ony0) lnmVar;
                    int i37 = ony0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ony0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        ony0Var = new ony0(this, lnmVar);
                    }
                } else {
                    ony0Var = new ony0(this, lnmVar);
                }
                Object obj20 = ony0Var.a;
                int i38 = ony0Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j((ibd0) obj, gbd0.a));
                    ony0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, ony0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof pny0) {
                    pny0Var = (pny0) lnmVar;
                    int i39 = pny0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        pny0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        pny0Var = new pny0(this, lnmVar);
                    }
                } else {
                    pny0Var = new pny0(this, lnmVar);
                }
                Object obj21 = pny0Var.a;
                int i40 = pny0Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf7 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    pny0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, pny0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof ioy0) {
                    ioy0Var = (ioy0) lnmVar;
                    int i41 = ioy0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ioy0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        ioy0Var = new ioy0(this, lnmVar);
                    }
                } else {
                    ioy0Var = new ioy0(this, lnmVar);
                }
                Object obj22 = ioy0Var.a;
                int i42 = ioy0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                if (!h290VarN.isEmpty()) {
                    Iterator it2 = h290VarN.iterator();
                    while (it2.hasNext()) {
                        if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it2.next()).hasPlaylist() && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                Integer num = new Integer(i);
                ioy0Var.b = 1;
                return vr20Var.emit(num, ioy0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof joy0) {
                    joy0Var = (joy0) lnmVar;
                    int i43 = joy0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        joy0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        joy0Var = new joy0(this, lnmVar);
                    }
                } else {
                    joy0Var = new joy0(this, lnmVar);
                }
                Object obj23 = joy0Var.a;
                int i44 = joy0Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    ((Number) obj).intValue();
                    joy0Var.b = 1;
                    return vr20Var.emit(rih1Var, joy0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof cpy0) {
                    cpy0Var = (cpy0) lnmVar;
                    int i45 = cpy0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        cpy0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        cpy0Var = new cpy0(this, lnmVar);
                    }
                } else {
                    cpy0Var = new cpy0(this, lnmVar);
                }
                Object obj24 = cpy0Var.a;
                int i46 = cpy0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                int iOrdinal = ((hry0) obj).a.ordinal();
                vnx vnxVar = (iOrdinal == 3 || iOrdinal == 6) ? vnx.c : null;
                List listN = p7h.N(vnxVar != null ? new eay(vnxVar) : null);
                cpy0Var.b = 1;
                return vr20Var.emit(listN, cpy0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof puy0) {
                    puy0Var = (puy0) lnmVar;
                    int i47 = puy0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        puy0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        puy0Var = new puy0(this, lnmVar);
                    }
                } else {
                    puy0Var = new puy0(this, lnmVar);
                }
                Object obj25 = puy0Var.a;
                int i48 = puy0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                tb0 tb0Var = (tb0) obj;
                tb0Var.getClass();
                qty0 qty0Var = new qty0(tb0Var);
                puy0Var.b = 1;
                return vr20Var.emit(qty0Var, puy0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof pzy0) {
                    pzy0Var = (pzy0) lnmVar;
                    int i49 = pzy0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        pzy0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        pzy0Var = new pzy0(this, lnmVar);
                    }
                } else {
                    pzy0Var = new pzy0(this, lnmVar);
                }
                Object obj26 = pzy0Var.a;
                int i50 = pzy0Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    q5l q5lVar = (r5l) obj;
                    boolean z3 = q5lVar instanceof q5l;
                    gax gaxVar = iax.a;
                    if (z3) {
                        int iC = l1d.C(q5lVar.c);
                        if (iC == 0) {
                            gaxVar = new gax(new Integer(2131961954), (String) null);
                        } else if (iC != 1) {
                            eg.o();
                        }
                    }
                    pzy0Var.b = 1;
                    return vr20Var.emit(gaxVar, pzy0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof uzy0) {
                    uzy0Var = (uzy0) lnmVar;
                    int i51 = uzy0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        uzy0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        uzy0Var = new uzy0(this, lnmVar);
                    }
                } else {
                    uzy0Var = new uzy0(this, lnmVar);
                }
                Object obj27 = uzy0Var.a;
                int i52 = uzy0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                String str17 = (String) obj;
                t0z t0zVar = qzy0.f;
                t0zVar.getClass();
                d7 d7Var = new d7(t0zVar, (byte) 0);
                while (d7Var.hasNext()) {
                    Object next = d7Var.next();
                    if (u890.j(((qzy0) next).a, str17)) {
                        obj2 = next;
                        uzy0Var.b = 1;
                        if (vr20Var.emit(obj2, uzy0Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                uzy0Var.b = 1;
                if (vr20Var.emit(obj2, uzy0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 25:
                if (lnmVar instanceof xzy0) {
                    xzy0Var = (xzy0) lnmVar;
                    int i53 = xzy0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        xzy0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        xzy0Var = new xzy0(this, lnmVar);
                    }
                } else {
                    xzy0Var = new xzy0(this, lnmVar);
                }
                Object obj28 = xzy0Var.a;
                int i54 = xzy0Var.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf8 = Boolean.valueOf(y7y0.A((Map) obj));
                    xzy0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, xzy0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof yzy0) {
                    yzy0Var = (yzy0) lnmVar;
                    int i55 = yzy0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        yzy0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        yzy0Var = new yzy0(this, lnmVar);
                    }
                } else {
                    yzy0Var = new yzy0(this, lnmVar);
                }
                Object obj29 = yzy0Var.a;
                int i56 = yzy0Var.b;
                if (i56 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf9 = Boolean.valueOf(u890.j((String) obj, "GBB"));
                    yzy0Var.b = 1;
                    return vr20Var.emit(boolValueOf9, yzy0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof l0z0) {
                    l0z0Var = (l0z0) lnmVar;
                    int i57 = l0z0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        l0z0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        l0z0Var = new l0z0(this, lnmVar);
                    }
                } else {
                    l0z0Var = new l0z0(this, lnmVar);
                }
                Object obj30 = l0z0Var.a;
                int i58 = l0z0Var.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    egn egnVar = new egn(((Set) obj).toString());
                    l0z0Var.b = 1;
                    return vr20Var.emit(egnVar, l0z0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof e6z0) {
                    e6z0Var = (e6z0) lnmVar;
                    int i59 = e6z0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        e6z0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        e6z0Var = new e6z0(this, lnmVar);
                    }
                } else {
                    e6z0Var = new e6z0(this, lnmVar);
                }
                Object obj31 = e6z0Var.a;
                int i60 = e6z0Var.b;
                if (i60 == 0) {
                    hm5.M(obj31);
                    p7z0 p7z0Var = new p7z0((String) obj);
                    e6z0Var.b = 1;
                    return vr20Var.emit(p7z0Var, e6z0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ v4y0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
