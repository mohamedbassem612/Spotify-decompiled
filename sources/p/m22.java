package p;

import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.v1.proto.AddressForm;
import com.spotify.address.endpoint.model.v1.proto.FieldValue;
import com.spotify.address.endpoint.model.v1.proto.FormField;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.address.endpoint.model.v1.proto.SavedAddress;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class m22 implements Update {
    /* JADX WARN: Code duplicated, block: B:224:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x0266  */
    public final Next a(Object obj, Object obj2) {
        mmr0 mmr0Var;
        Object next;
        Object next2;
        kgm0 kgm0Var;
        mmr0 mmr0Var2;
        jhm0 jhm0Var = (jhm0) obj;
        o700 o700Var = (o700) obj2;
        boolean z = o700Var instanceof byz;
        k12 k12Var = k12.a;
        k12 k12Var2 = k12.b;
        ogm0 ogm0Var = ogm0.a;
        boolean z2 = true;
        if (z) {
            GetFormResponse getFormResponse = ((byz) o700Var).a;
            AddressCollection addressCollectionN = getFormResponse.n();
            if (addressCollectionN == null) {
                return pve0.b(null);
            }
            if (AddressForm.q().equals(addressCollectionN.n())) {
                return Next.h(hgm0.a);
            }
            return SavedAddress.q().equals(addressCollectionN.r()) ? Next.i(new sgm0(addressCollectionN, new lgm0((Map) null, 3), false), f46.S0(new liw[]{new jhw(k12Var), new ecw(getFormResponse.n().q().o(), 1)})) : Next.i(new sgm0(addressCollectionN, ogm0Var, false), f46.S0(new liw[]{new jhw(k12Var2), new ecw(getFormResponse.n().q().o(), 2)}));
        }
        if (o700Var instanceof yxz) {
            return pve0.b((yxz) o700Var);
        }
        if (o700Var instanceof e400) {
            boolean z3 = jhm0Var instanceof hgm0;
            ugm0 ugm0Var = ugm0.a;
            if (z3) {
                return Next.i(ugm0Var, Collections.singleton(mbw.a));
            }
            if (jhm0Var instanceof xgm0) {
                return Next.i(ugm0Var, Collections.singleton(thw.a));
            }
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var = (sgm0) jhm0Var;
                pgm0 pgm0Var = sgm0Var.b;
                if (pgm0Var instanceof mgm0) {
                    Map map = ((mgm0) pgm0Var).a;
                    return Next.i(sgm0.a(sgm0Var, new ngm0(map), false, 5), Collections.singleton(new uew(map)));
                }
            }
            Logger.d("Received " + e400.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof hwz) {
            boolean z4 = jhm0Var instanceof sgm0;
            if (z4) {
                sgm0 sgm0Var2 = (sgm0) jhm0Var;
                if (sgm0Var2.b instanceof lgm0) {
                    return Next.i(sgm0.a(sgm0Var2, ogm0Var, false, 1), Collections.singleton(new jhw(k12Var2)));
                }
            }
            if (z4) {
                sgm0 sgm0Var3 = (sgm0) jhm0Var;
                pgm0 pgm0Var2 = sgm0Var3.b;
                if (pgm0Var2 instanceof mgm0) {
                    Map map2 = ((mgm0) pgm0Var2).a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new kgm0((String) entry.getValue(), null, null));
                    }
                    return Next.h(sgm0.a(sgm0Var3, new lgm0(linkedHashMap, 2), false, 5));
                }
            }
            Logger.d("Received " + hwz.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof o400) {
            if ((jhm0Var instanceof sgm0) && (((sgm0) jhm0Var).b instanceof lgm0)) {
                return Next.a(Collections.singleton(ahw.a));
            }
            Logger.d("Received " + o400.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof iyz) {
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var4 = (sgm0) jhm0Var;
                if (sgm0Var4.b instanceof ogm0) {
                    h290<FormField> h290VarR = sgm0Var4.a.n().r();
                    ArrayList arrayList = new ArrayList();
                    for (FormField formField : h290VarR) {
                        int iQ = formField.q();
                        int i = iQ == 0 ? -1 : lve0.a[l1d.C(iQ)];
                        if (i == -1) {
                            mmr0Var2 = null;
                        } else if (i == 1) {
                            String strO = formField.s().o();
                            if (strO == null || ihc1.y0(strO)) {
                                mmr0Var2 = null;
                            } else {
                                mmr0Var2 = new mmr0(formField.getId(), new kgm0(formField.s().o(), null, null));
                            }
                        } else if (i != 2) {
                            if (i == 3) {
                                String strP = formField.o().p();
                                if (strP != null && !ihc1.y0(strP)) {
                                    mmr0Var2 = new mmr0(formField.getId(), new kgm0(formField.o().p(), null, null));
                                }
                            } else if (i != 4) {
                                eg.o();
                                return null;
                            }
                            mmr0Var2 = null;
                        } else {
                            String strP2 = formField.p().p();
                            if (strP2 == null || ihc1.y0(strP2)) {
                                mmr0Var2 = null;
                            } else {
                                mmr0Var2 = new mmr0(formField.getId(), new kgm0(formField.p().p(), null, null));
                            }
                        }
                        if (mmr0Var2 != null) {
                            arrayList.add(mmr0Var2);
                        }
                    }
                    return Next.i(sgm0.a(sgm0Var4, new lgm0(sqg0.T(arrayList), 2), false, 5), Collections.singleton(new jhw(k12Var)));
                }
            }
            Logger.d("Received " + iyz.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof xyz) {
            xyz xyzVar = (xyz) o700Var;
            String str = xyzVar.b;
            String str2 = xyzVar.a;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var5 = (sgm0) jhm0Var;
                pgm0 pgm0Var3 = sgm0Var5.b;
                if (pgm0Var3 instanceof lgm0) {
                    Iterator it = sgm0Var5.a.n().r().iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!u890.j(((FormField) next2).getId(), str2));
                    FormField formField2 = (FormField) next2;
                    if (formField2 == null) {
                        Logger.d("Received " + xyzVar + " with unknown field ID", new Object[0]);
                        return Next.j();
                    }
                    Map map3 = ((lgm0) pgm0Var3).a;
                    kgm0 kgm0Var2 = (kgm0) map3.get(str2);
                    if (kgm0Var2 == null) {
                        kgm0Var2 = new kgm0(null, null, null);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int iQ2 = formField2.q();
                    int i2 = iQ2 == 0 ? -1 : lve0.a[l1d.C(iQ2)];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            kgm0Var = new kgm0(str, null, null);
                        } else if (i2 == 2) {
                            kgm0Var = new kgm0(kgm0Var2.a, null, null);
                        } else if (i2 == 3) {
                            if (sgm0Var5.b()) {
                                linkedHashSet.add(new k9w(new i9w(str2, str)));
                            }
                            kgm0Var = new kgm0(str, (sgm0Var5.c || str.length() == 0) ? null : ((long) str.length()) < 3 ? z6x.a : kgm0Var2.c, null);
                        } else if (i2 != 4) {
                            eg.o();
                            return null;
                        }
                        if (kgm0Var.equals(kgm0Var2)) {
                            return Next.a(linkedHashSet);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                        linkedHashMap2.put(str2, kgm0Var);
                        return Next.i(sgm0.a(sgm0Var5, new lgm0((String) null, linkedHashMap2), false, 5), linkedHashSet);
                    }
                    return Next.j();
                }
            }
            Logger.d("Received " + xyzVar + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof vyz) {
            vyz vyzVar = (vyz) o700Var;
            String str3 = vyzVar.a;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var6 = (sgm0) jhm0Var;
                pgm0 pgm0Var4 = sgm0Var6.b;
                if (pgm0Var4 instanceof lgm0) {
                    Iterator it2 = sgm0Var6.a.n().r().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!u890.j(((FormField) next).getId(), str3));
                    FormField formField3 = (FormField) next;
                    if (formField3 == null) {
                        Logger.d("Received " + vyzVar + " with unknown field ID", new Object[0]);
                        return Next.j();
                    }
                    Map map4 = ((lgm0) pgm0Var4).a;
                    String str4 = vyzVar.b;
                    kgm0 kgm0Var3 = (kgm0) map4.get(str3);
                    String str5 = kgm0Var3 != null ? kgm0Var3.a : null;
                    int iQ3 = formField3.q();
                    int i3 = iQ3 == 0 ? -1 : lve0.a[l1d.C(iQ3)];
                    if (i3 == -1) {
                        str4 = null;
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    eg.o();
                                    return null;
                                }
                                str4 = null;
                            }
                        } else if (str4 != null) {
                            h290 h290VarQ = formField3.p().q();
                            if (h290VarQ.isEmpty()) {
                                str4 = null;
                                break;
                            }
                            Iterator it3 = h290VarQ.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    str4 = null;
                                    break;
                                }
                            } while (!str4.equals(((FormField.Dropdown.Option) it3.next()).getValue()));
                            if (str4 == null) {
                                str4 = str5;
                            }
                        } else {
                            str4 = str5;
                        }
                    }
                    jve0 jve0VarA = pve0.a(formField3, str4);
                    if (u890.j(str5, str4) && jve0VarA == null) {
                        return Next.j();
                    }
                    kgm0 kgm0Var4 = (kgm0) map4.get(str3);
                    List list = kgm0Var4 != null ? kgm0Var4.c : null;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map4);
                    linkedHashMap3.put(str3, new kgm0(str4, list, jve0VarA != null ? jve0VarA.b : null));
                    return Next.i(sgm0.a(sgm0Var6, new lgm0((String) null, linkedHashMap3), false, 5), dm61.A0(jve0VarA != null ? new acw(new p12(jve0VarA.a, str3)) : null));
                }
            }
            Logger.d("Received " + vyzVar + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof yyz) {
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var7 = (sgm0) jhm0Var;
                pgm0 pgm0Var5 = sgm0Var7.b;
                if (pgm0Var5 instanceof lgm0) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    h290<FormField> h290VarR2 = sgm0Var7.a.n().r();
                    ArrayList arrayList2 = new ArrayList();
                    for (FormField formField4 : h290VarR2) {
                        Map map5 = ((lgm0) pgm0Var5).a;
                        kgm0 kgm0Var5 = (kgm0) map5.get(formField4.getId());
                        String str6 = kgm0Var5 != null ? kgm0Var5.a : null;
                        jve0 jve0VarA2 = pve0.a(formField4, str6);
                        if (str6 == null && jve0VarA2 == null) {
                            mmr0Var = null;
                        } else {
                            if (jve0VarA2 != null) {
                                linkedHashSet2.add(new acw(new p12(jve0VarA2.a, formField4.getId())));
                            }
                            String id = formField4.getId();
                            String str7 = jve0VarA2 != null ? jve0VarA2.b : null;
                            kgm0 kgm0Var6 = (kgm0) map5.get(formField4.getId());
                            mmr0Var = new mmr0(id, new kgm0(str6, kgm0Var6 != null ? kgm0Var6.c : null, str7));
                        }
                        if (mmr0Var != null) {
                            arrayList2.add(mmr0Var);
                        }
                    }
                    Map mapT = sqg0.T(arrayList2);
                    Collection collectionValues = mapT.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it4 = collectionValues.iterator();
                        do {
                            if (!it4.hasNext()) {
                                z2 = false;
                                break;
                            }
                        } while (((kgm0) it4.next()).b == null);
                    } else {
                        z2 = false;
                        break;
                    }
                    if (z2 && u890.j(((lgm0) pgm0Var5).a, mapT)) {
                        return Next.j();
                    }
                    if (z2) {
                        return Next.i(sgm0.a(sgm0Var7, lgm0.a((lgm0) pgm0Var5, mapT), false, 5), linkedHashSet2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry2 : mapT.entrySet()) {
                        String str8 = ((kgm0) entry2.getValue()).a;
                        mmr0 mmr0Var3 = str8 != null ? new mmr0(entry2.getKey(), str8) : null;
                        if (mmr0Var3 != null) {
                            arrayList3.add(mmr0Var3);
                        }
                    }
                    Map mapT2 = sqg0.T(arrayList3);
                    return Next.i(sgm0.a(sgm0Var7, new ngm0(mapT2), false, 5), Collections.singleton(new uew(mapT2)));
                }
            }
            Logger.d("Received " + yyz.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof uvz) {
            uvz uvzVar = (uvz) o700Var;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var8 = (sgm0) jhm0Var;
                AddressCollection addressCollection = sgm0Var8.a;
                pgm0 pgm0Var6 = sgm0Var8.b;
                if (pgm0Var6 instanceof ngm0) {
                    SubmitFormResponse submitFormResponse = uvzVar.a;
                    int iO = submitFormResponse.o();
                    int i4 = iO == 0 ? -1 : lve0.b[l1d.C(iO)];
                    if (i4 != -1) {
                        if (i4 == 1) {
                            w02 w02Var = (w02) addressCollection.toBuilder();
                            w02Var.n(x12.a(addressCollection.n(), uvzVar.b));
                            w02Var.q(submitFormResponse.p().o());
                            return Next.i(new sgm0((AddressCollection) w02Var.build(), ogm0Var, false), f46.S0(new liw[]{new zhw(submitFormResponse.p().p()), ihw.a, new jhw(k12Var2), new mcw(sgm0Var8.b())}));
                        }
                        if (i4 == 2) {
                            Map map6 = ((ngm0) pgm0Var6).a;
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(zno1.s(map6.size()));
                            for (Map.Entry entry3 : map6.entrySet()) {
                                linkedHashMap4.put(entry3.getKey(), new kgm0((String) entry3.getValue(), null, null));
                            }
                            return Next.i(sgm0.a(sgm0Var8, new lgm0((String) null, linkedHashMap4), false, 5), Collections.singleton(new biw(submitFormResponse.q())));
                        }
                        if (i4 == 3) {
                            Map map7 = ((ngm0) pgm0Var6).a;
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(zno1.s(map7.size()));
                            for (Map.Entry entry4 : map7.entrySet()) {
                                linkedHashMap5.put(entry4.getKey(), new kgm0((String) entry4.getValue(), null, null));
                            }
                            return Next.i(sgm0.a(sgm0Var8, new lgm0(submitFormResponse.n().getMessage(), linkedHashMap5), false, 5), Collections.singleton(new acw(new s12(submitFormResponse.n().getMessageId()))));
                        }
                        if (i4 != 4) {
                            eg.o();
                            return null;
                        }
                    }
                    Logger.d("Received unknown response: " + submitFormResponse, new Object[0]);
                    return Next.j();
                }
            }
            Logger.d("Received " + uvzVar + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof n400) {
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var9 = (sgm0) jhm0Var;
                pgm0 pgm0Var7 = sgm0Var9.b;
                if (pgm0Var7 instanceof ngm0) {
                    return Next.i(sgm0.a(sgm0Var9, new mgm0(((ngm0) pgm0Var7).a), false, 5), Collections.singleton(new acw(t12.b)));
                }
            }
            Logger.d("Received " + n400.a + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof k500) {
            k500 k500Var = (k500) o700Var;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var10 = (sgm0) jhm0Var;
                if (sgm0Var10.b instanceof lgm0) {
                    h290<FieldValue> h290Var = k500Var.a;
                    int iS = zno1.s(q7h.U(h290Var, 10));
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(iS >= 16 ? iS : 16);
                    for (FieldValue fieldValue : h290Var) {
                        linkedHashMap6.put(fieldValue.getId(), fieldValue.getValue());
                    }
                    return Next.i(sgm0.a(sgm0Var10, new ngm0(linkedHashMap6), false, 5), Collections.singleton(new uew(linkedHashMap6)));
                }
            }
            Logger.d("Received " + k500Var + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof a000) {
            a000 a000Var = (a000) o700Var;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var11 = (sgm0) jhm0Var;
                pgm0 pgm0Var8 = sgm0Var11.b;
                if (pgm0Var8 instanceof lgm0) {
                    lgm0 lgm0Var = (lgm0) pgm0Var8;
                    Map map8 = lgm0Var.a;
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(zno1.s(map8.size()));
                    for (Map.Entry entry5 : map8.entrySet()) {
                        linkedHashMap7.put(entry5.getKey(), kgm0.a((kgm0) entry5.getValue(), null));
                    }
                    return Next.h(sgm0.a(sgm0Var11, lgm0.a(lgm0Var, linkedHashMap7), true, 1));
                }
            }
            Logger.d("Received " + a000Var + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (o700Var instanceof bwz) {
            bwz bwzVar = (bwz) o700Var;
            if ((jhm0Var instanceof sgm0) && (((sgm0) jhm0Var).b instanceof lgm0)) {
                return Next.a(Collections.singleton(new k9w(new h9w(bwzVar.a, bwzVar.b))));
            }
            Logger.d("Received " + bwzVar + " with incompatible model " + jhm0Var, new Object[0]);
            return Next.j();
        }
        if (!(o700Var instanceof vvz)) {
            if (!(o700Var instanceof qvz)) {
                eg.o();
                return null;
            }
            qvz qvzVar = (qvz) o700Var;
            if (jhm0Var instanceof sgm0) {
                sgm0 sgm0Var12 = (sgm0) jhm0Var;
                pgm0 pgm0Var9 = sgm0Var12.b;
                if (pgm0Var9 instanceof lgm0) {
                    h290<FieldValue> h290Var2 = qvzVar.a;
                    int iS2 = zno1.s(q7h.U(h290Var2, 10));
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (FieldValue fieldValue2 : h290Var2) {
                        linkedHashMap8.put(fieldValue2.getId(), new kgm0(fieldValue2.getValue(), null, null));
                    }
                    return Next.h(sgm0.a(sgm0Var12, lgm0.a((lgm0) pgm0Var9, linkedHashMap8), false, 5));
                }
            }
            return Next.j();
        }
        vvz vvzVar = (vvz) o700Var;
        String str9 = vvzVar.a;
        if (jhm0Var instanceof sgm0) {
            sgm0 sgm0Var13 = (sgm0) jhm0Var;
            pgm0 pgm0Var10 = sgm0Var13.b;
            if (pgm0Var10 instanceof lgm0) {
                lgm0 lgm0Var2 = (lgm0) pgm0Var10;
                Map map9 = lgm0Var2.a;
                String str10 = vvzVar.b;
                kgm0 kgm0Var7 = (kgm0) map9.get(str9);
                if (kgm0Var7 == null) {
                    return Next.j();
                }
                String str11 = kgm0Var7.a;
                if (!u890.j(str11, str10)) {
                    Logger.d(cy30.p("Received {", str10, "} with wrong query should be {", str11, "}"), new Object[0]);
                    return Next.j();
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(map9);
                linkedHashMap9.put(str9, kgm0.a(kgm0Var7, vvzVar.c));
                return Next.h(sgm0.a(sgm0Var13, lgm0.a(lgm0Var2, linkedHashMap9), false, 5));
            }
        }
        return Next.j();
    }
}
