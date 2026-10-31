package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ku2 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ List c;

    public ku2(vr20 vr20Var, it8 it8Var, List list) {
        this.a = (byte) 3;
        this.b = vr20Var;
        this.c = list;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:170:0x030c  */
    /* JADX WARN: Code duplicated, block: B:185:0x034a  */
    /* JADX WARN: Code duplicated, block: B:210:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03be  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:251:0x0449  */
    /* JADX WARN: Code duplicated, block: B:266:0x047c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    public final Object emit(Object obj, lnm lnmVar) {
        ju2 ju2Var;
        String str;
        up70 up70VarA;
        String str2;
        xkk1 xkk1Var;
        jo70 jo70Var;
        k13 k13Var;
        d13 d13Var;
        z6q0 z6q0Var;
        x93 x93Var;
        r93 r93Var;
        String str3;
        mq70 mq70Var;
        up70 up70VarA2;
        zq9 zq9Var;
        d5s d5sVar;
        bod0 bod0Var;
        out0 out0Var;
        uzv0 uzv0Var;
        x201 x201Var;
        ml51 ml51Var;
        mq70 mq70Var2;
        up70 up70VarA3;
        byte b = this.a;
        vp70 vp70Var = vp70.b;
        vp70 vp70Var2 = vp70.c;
        rih1 rih1Var = rih1.a;
        List<String> list = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        int i = 1;
        switch (b) {
            case 0:
                if (lnmVar instanceof ju2) {
                    ju2Var = (ju2) lnmVar;
                    int i2 = ju2Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ju2Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        ju2Var = new ju2(this, lnmVar);
                    }
                } else {
                    ju2Var = new ju2(this, lnmVar);
                }
                Object obj2 = ju2Var.a;
                int i3 = ju2Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                uv00 uv00Var = (uv00) obj;
                List listB = uv00Var.b(jo70.class);
                int iS = zno1.s(q7h.U(listB, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : listB) {
                    linkedHashMap.put(((tv00) obj3).a, obj3);
                }
                List listB2 = uv00Var.b(xkk1.class);
                int iS2 = zno1.s(q7h.U(listB2, 10));
                if (iS2 < 16) {
                    iS2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
                for (Object obj4 : listB2) {
                    linkedHashMap2.put(((tv00) obj4).a, obj4);
                }
                List list2 = list;
                int iS3 = zno1.s(q7h.U(list2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                for (Object obj5 : list2) {
                    String str4 = (String) obj5;
                    tv00 tv00Var = (tv00) linkedHashMap.get(str4);
                    if (tv00Var == null || (jo70Var = tv00Var.b) == null || (str = jo70Var.a) == null || ihc1.y0(str)) {
                        str = null;
                    }
                    tv00 tv00Var2 = (tv00) linkedHashMap2.get(str4);
                    mq70 mq70Var3 = (tv00Var2 == null || (xkk1Var = tv00Var2.b) == null) ? null : xkk1Var.a;
                    if (mq70Var3 == null || (up70VarA = mq70Var3.a(vp70Var2)) == null) {
                        up70VarA = mq70Var3 != null ? mq70Var3.a(vp70.d) : null;
                        if (up70VarA == null) {
                            up70VarA = mq70Var3 != null ? mq70Var3.a(vp70Var) : null;
                        }
                    }
                    if (up70VarA == null || (str2 = up70VarA.a.a) == null || ihc1.y0(str2)) {
                        str2 = null;
                    }
                    if (str == null) {
                        str = "Studio by Spotify Labs";
                    }
                    if (str2 == null) {
                        str2 = "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png";
                    }
                    linkedHashMap3.put(obj5, new w4i1(str4, str, 8, str2));
                }
                ju2Var.b = 1;
                return vr20Var.emit(linkedHashMap3, ju2Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof k13) {
                    k13Var = (k13) lnmVar;
                    int i4 = k13Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        k13Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        k13Var = new k13(this, lnmVar);
                    }
                } else {
                    k13Var = new k13(this, lnmVar);
                }
                Object obj6 = k13Var.a;
                int i5 = k13Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                uv00 uv00Var2 = (uv00) obj;
                ArrayList arrayList = new ArrayList();
                for (String str5 : list) {
                    a7q0 a7q0Var = uv00Var2.a(a7q0.class, str5).b;
                    if (a7q0Var == null || (z6q0Var = a7q0Var.f) == null) {
                        d13Var = null;
                    } else if (z6q0Var.a()) {
                        d13Var = d13.a;
                    } else if (z6q0Var.b()) {
                        d13Var = d13.b;
                    } else {
                        d13Var = null;
                    }
                    mmr0 mmr0Var = d13Var != null ? new mmr0(str5, d13Var) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                k13Var.b = 1;
                return vr20Var.emit(mapT, k13Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof x93) {
                    x93Var = (x93) lnmVar;
                    int i6 = x93Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        x93Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        x93Var = new x93(this, lnmVar);
                    }
                } else {
                    x93Var = new x93(this, lnmVar);
                }
                Object obj7 = x93Var.a;
                int i7 = x93Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                uv00 uv00Var3 = (uv00) obj;
                ArrayList arrayList2 = new ArrayList();
                for (String str6 : list) {
                    jo70 jo70Var2 = uv00Var3.a(jo70.class, str6).b;
                    if (jo70Var2 != null) {
                        String str7 = jo70Var2.a;
                        xkk1 xkk1Var2 = uv00Var3.a(xkk1.class, str6).b;
                        if (xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null) {
                            str3 = null;
                        } else {
                            up70 up70VarA4 = mq70Var.a(vp70Var);
                            if (up70VarA4 == null || (str3 = up70VarA4.a.a) == null) {
                                up70VarA2 = mq70Var.a(vp70Var2);
                                if (up70VarA2 != null) {
                                    str3 = up70VarA2.a.a;
                                } else {
                                    str3 = null;
                                }
                            } else {
                                if (str3.length() <= 0) {
                                    str3 = null;
                                }
                                if (str3 == null) {
                                    up70VarA2 = mq70Var.a(vp70Var2);
                                    if (up70VarA2 != null) {
                                        str3 = up70VarA2.a.a;
                                    } else {
                                        str3 = null;
                                    }
                                }
                            }
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        r93Var = new r93(str6, str7, str3);
                    } else {
                        r93Var = null;
                    }
                    if (r93Var != null) {
                        arrayList2.add(r93Var);
                    }
                    i = 1;
                }
                x93Var.b = i;
                return vr20Var.emit(arrayList2, x93Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof zq9) {
                    zq9Var = (zq9) lnmVar;
                    int i8 = zq9Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        zq9Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        zq9Var = new zq9(this, lnmVar);
                    }
                } else {
                    zq9Var = new zq9(this, lnmVar);
                }
                Object obj8 = zq9Var.a;
                int i9 = zq9Var.b;
                if (i9 == 0) {
                    hm5.M(obj8);
                    ArrayList arrayListD = it8.D(list, (Map) obj);
                    zq9Var.b = 1;
                    return vr20Var.emit(arrayListD, zq9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof d5s) {
                    d5sVar = (d5s) lnmVar;
                    int i10 = d5sVar.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        d5sVar.b = i10 - Integer.MIN_VALUE;
                    } else {
                        d5sVar = new d5s(this, lnmVar);
                    }
                } else {
                    d5sVar = new d5s(this, lnmVar);
                }
                Object obj9 = d5sVar.a;
                int i11 = d5sVar.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                pp90 pp90Var = (pp90) obj;
                if (pp90Var != null) {
                    ArrayList arrayList3 = pp90Var.c;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((hp90) it.next()).c);
                    }
                    if (arrayList4.isEmpty()) {
                        pp90Var = null;
                    } else {
                        Iterator it2 = arrayList4.iterator();
                        do {
                            if (!it2.hasNext()) {
                                pp90Var = null;
                            }
                        } while (!list.contains((String) it2.next()));
                    }
                } else {
                    pp90Var = null;
                }
                sba0 uba0Var = (pp90Var == null || !pp90Var.h.b.e) ? pp90Var != null ? new uba0(pp90Var) : rba0.a : new sba0(pp90Var);
                d5sVar.b = 1;
                return vr20Var.emit(uba0Var, d5sVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof bod0) {
                    bod0Var = (bod0) lnmVar;
                    int i12 = bod0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bod0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        bod0Var = new bod0(this, lnmVar);
                    }
                } else {
                    bod0Var = new bod0(this, lnmVar);
                }
                Object obj10 = bod0Var.a;
                int i13 = bod0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                ArrayList<mmr0> arrayListV1 = o7h.v1(o7h.l1(list), ((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                int iS4 = zno1.s(q7h.U(arrayListV1, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS4 >= 16 ? iS4 : 16);
                for (mmr0 mmr0Var2 : arrayListV1) {
                    linkedHashMap4.put(mmr0Var2.a, mmr0Var2.b);
                }
                bod0Var.b = 1;
                return vr20Var.emit(linkedHashMap4, bod0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof out0) {
                    out0Var = (out0) lnmVar;
                    int i14 = out0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        out0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        out0Var = new out0(this, lnmVar);
                    }
                } else {
                    out0Var = new out0(this, lnmVar);
                }
                Object obj11 = out0Var.a;
                int i15 = out0Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                Boolean bool = (Boolean) obj;
                List list3 = list;
                int iS5 = zno1.s(q7h.U(list3, 10));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iS5 >= 16 ? iS5 : 16);
                for (Object obj12 : list3) {
                    linkedHashMap5.put(obj12, bool);
                }
                out0Var.b = 1;
                return vr20Var.emit(linkedHashMap5, out0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof uzv0) {
                    uzv0Var = (uzv0) lnmVar;
                    int i16 = uzv0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        uzv0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        uzv0Var = new uzv0(this, lnmVar);
                    }
                } else {
                    uzv0Var = new uzv0(this, lnmVar);
                }
                Object obj13 = uzv0Var.a;
                int i17 = uzv0Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                ArrayList<mmr0> arrayListV2 = o7h.v1(o7h.l1(list), ((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                int iS6 = zno1.s(q7h.U(arrayListV2, 10));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(iS6 >= 16 ? iS6 : 16);
                for (mmr0 mmr0Var3 : arrayListV2) {
                    linkedHashMap6.put(mmr0Var3.a, mmr0Var3.b);
                }
                uzv0Var.b = 1;
                return vr20Var.emit(linkedHashMap6, uzv0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof x201) {
                    x201Var = (x201) lnmVar;
                    int i18 = x201Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        x201Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        x201Var = new x201(this, lnmVar);
                    }
                } else {
                    x201Var = new x201(this, lnmVar);
                }
                Object obj14 = x201Var.a;
                int i19 = x201Var.b;
                if (i19 == 0) {
                    hm5.M(obj14);
                    c380 c380VarA = mqo1.A(o7h.j0(o7h.N0(z201.b, o7h.N0((List) obj, list))));
                    x201Var.b = 1;
                    return vr20Var.emit(c380VarA, x201Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ml51) {
                    ml51Var = (ml51) lnmVar;
                    int i20 = ml51Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ml51Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        ml51Var = new ml51(this, lnmVar);
                    }
                } else {
                    ml51Var = new ml51(this, lnmVar);
                }
                Object obj15 = ml51Var.a;
                int i21 = ml51Var.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                uv00 uv00Var4 = (uv00) obj;
                List list4 = list;
                int iS7 = zno1.s(q7h.U(list4, 10));
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(iS7 >= 16 ? iS7 : 16);
                for (Object obj16 : list4) {
                    String str8 = (String) obj16;
                    jo70 jo70Var3 = uv00Var4.a(jo70.class, str8).b;
                    String str9 = jo70Var3 != null ? jo70Var3.a : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    xkk1 xkk1Var3 = uv00Var4.a(xkk1.class, str8).b;
                    String str10 = (xkk1Var3 == null || (mq70Var2 = xkk1Var3.a) == null || (up70VarA3 = mq70Var2.a(vp70Var2)) == null) ? null : up70VarA3.a.a;
                    if (str10 == null) {
                        str10 = "";
                    }
                    linkedHashMap7.put(obj16, new nar(str9, str10));
                }
                ml51Var.b = 1;
                return vr20Var.emit(linkedHashMap7, ml51Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ ku2(vr20 vr20Var, List list, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = list;
    }
}
