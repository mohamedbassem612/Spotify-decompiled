package p;

import android.net.Uri;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qr0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(ezt eztVar, String str, oxt oxtVar, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 14;
        this.b = eztVar;
        this.c = str;
        this.d = oxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x0303  */
    /* JADX WARN: Code duplicated, block: B:180:0x0361  */
    /* JADX WARN: Code duplicated, block: B:217:0x03dd  */
    private final Object e(Object obj) {
        int i;
        List listI0;
        Object next;
        int i2;
        d410 d410VarA;
        z3p0 z3p0Var;
        zeu zeuVar;
        z3p0 z3p0Var2;
        Object next2;
        int i3;
        z3p0 li51Var;
        z3p0 z3p0Var3;
        q510 q510Var;
        jpd jpdVar;
        jpd jpdVar2;
        String str;
        String string;
        String string2;
        int i4;
        z3p0 gvcVar;
        z3p0 z3p0Var4;
        Object next3;
        oz0 oz0Var;
        y310 y310Var;
        Object next4;
        z310 z310Var = (z310) this.b;
        z3p0 z3p0Var5 = (z3p0) this.c;
        hm5.M(obj);
        zeu zeuVar2 = (zeu) ((dxy) this.d).c;
        k84 k84Var = (k84) ((l7m0) zeuVar2.c).b;
        f410 f410Var = z310Var.b;
        z3p0 z3p0Var6 = null;
        String str2 = f410Var != null ? f410Var.a : null;
        String str3 = f410Var != null ? f410Var.b : null;
        List<u310> list = z310Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (u310 u310VarB : list) {
            if (u890.j(u310VarB.t, "library")) {
                u310VarB = u310.b(u310VarB, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -134217729, 15);
            }
            arrayList.add(u310VarB);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String str4 = ((u310) obj2).x;
            if (str4 == null) {
                str4 = "";
            }
            Object objH = linkedHashMap.get(str4);
            if (objH == null) {
                objH = cfm0.h(str4, linkedHashMap);
            }
            ((List) objH).add(obj2);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        smc0 arrayList2 = new ArrayList();
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            z3p0 z3p0Var7 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            smc0 smc0VarN = k4p1.n();
            u310 u310Var = (u310) o7h.s0(list2);
            if (u310Var != null ? f46.M(new String[]{"spotify:android-auto:offline-library", "non-playable-item"}, u310Var.a) : false) {
                smc0VarN.add(new epd(zeuVar2.h((u310) o7h.q0(list2), z3p0Var6)));
                z3p0 z3p0VarK0 = o7h.k0(list2, 1);
                if (((Collection) z3p0VarK0).isEmpty()) {
                    z3p0VarK0 = z3p0Var6;
                }
                if (z3p0VarK0 != null) {
                    Iterable iterable = (Iterable) z3p0VarK0;
                    ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zeuVar2.h((u310) it2.next(), z3p0Var5));
                    }
                    smc0VarN.add(new dpd(z3p0Var7, arrayList3, 1020));
                }
                zeuVar = zeuVar2;
                z3p0Var2 = z3p0Var5;
            } else {
                u310 u310Var2 = (u310) o7h.s0(list2);
                if (u310Var2 == null || (y310Var = u310Var2.w) == null) {
                    z3p0Var = z3p0Var6;
                } else {
                    Iterator it3 = y310Var.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z3p0Var = z3p0Var6;
                            next4 = z3p0Var;
                            break;
                        }
                        next4 = it3.next();
                        z3p0Var = z3p0Var6;
                        if (((p710) next4).a.equals("SECTION")) {
                            break;
                        }
                        z3p0Var6 = z3p0Var;
                    }
                    z3p0Var6 = (p710) next4;
                }
                u310 u310Var3 = (u310) o7h.s0(list2);
                z3p0 z3p0Var8 = u890.j(z3p0Var6 != null ? z3p0Var6.c : z3p0Var, "spotify:section:0JQ5DAIiKWzVFULQfUm85Y") ? z3p0Var : z3p0Var7;
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(zeuVar2.h((u310) it4.next(), z3p0Var5));
                }
                z3p0 z3p0Var9 = z3p0Var6 != null ? z3p0Var6.c : z3p0Var;
                z3p0 z3p0Var10 = z3p0Var6 != null ? z3p0Var6.b : z3p0Var;
                z3p0 z3p0Var11 = u310Var3 != null ? u310Var3.B : z3p0Var;
                Iterator it5 = qi51.c.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        zeuVar = zeuVar2;
                        z3p0Var2 = z3p0Var5;
                        next2 = z3p0Var;
                        break;
                    }
                    next2 = it5.next();
                    zeuVar = zeuVar2;
                    z3p0Var2 = z3p0Var5;
                    if (u890.j(((qi51) next2).name(), z3p0Var11 != null ? z3p0Var11.toUpperCase(Locale.ROOT).replace('-', '_') : z3p0Var)) {
                        break;
                    }
                    z3p0Var11 = z3p0Var11;
                    it5 = it5;
                    zeuVar2 = zeuVar;
                    z3p0Var5 = z3p0Var2;
                }
                qi51 qi51Var = (qi51) next2;
                if (qi51Var == null) {
                    qi51Var = qi51.a;
                }
                qi51 qi51Var2 = qi51Var;
                z3p0 yodVar = (u310Var3 == null || (oz0Var = u310Var3.D) == null) ? z3p0Var : new yod(oz0Var.a, oz0Var.b, oz0Var.c, oz0Var.d, oz0Var.e, oz0Var.f, oz0Var.g, oz0Var.k);
                if (u310Var3 == null) {
                    i3 = 1;
                } else {
                    y310 y310Var2 = u310Var3.w;
                    if (y310Var2 != null) {
                        Iterator it6 = y310Var2.a.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next3 = z3p0Var;
                                break;
                            }
                            next3 = it6.next();
                        } while (!((p710) next3).a.equals("SECTION"));
                        z3p0Var4 = (p710) next3;
                    } else {
                        z3p0Var4 = z3p0Var;
                    }
                    if (!nhc1.S(z3p0Var4 != null ? z3p0Var4.b : z3p0Var, "shortcuts", true)) {
                        if (!u890.j(z3p0Var4 != null ? z3p0Var4.c : z3p0Var, "spotify:section:0JQ5DAIiKWzVFULQfUm85Y")) {
                            i3 = 1;
                        }
                    }
                    i3 = 2;
                }
                if (z3p0Var6 != null) {
                    String str5 = z3p0Var6.c;
                    if (u890.j(str5, "spotify:section:0JQ5DAIiKWzVFULQfUm85Y") || str5 == null || ihc1.y0(str5) || ihc1.y0(z3p0Var7)) {
                        z3p0Var6 = z3p0Var;
                    }
                    if (z3p0Var6 != null) {
                        String str6 = z3p0Var6.c;
                        if (str6 == null) {
                            hhg1.n("Required value was null.");
                            return z3p0Var;
                        }
                        li51Var = new li51(str6, z3p0Var7, z3p0Var6.b);
                    } else {
                        li51Var = z3p0Var;
                    }
                } else {
                    li51Var = z3p0Var;
                }
                Iterator it7 = list3.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z3p0Var3 = null;
                        break;
                    }
                    Uri uri = ((u310) it7.next()).E;
                    if (uri == null) {
                        gvcVar = z3p0Var;
                    } else {
                        z3p0 string3 = uri.toString();
                        string3.getClass();
                        if (ihc1.y0(string3)) {
                            string3 = z3p0Var;
                        }
                        if (string3 == null) {
                            gvcVar = z3p0Var;
                        } else {
                            String scheme = uri.getScheme();
                            z3p0 lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : z3p0Var;
                            if (lowerCase == null) {
                                i4 = 14;
                                string3 = z3p0Var;
                            } else {
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1998723398) {
                                    if (iHashCode == 3213448 ? lowerCase.equals("http") : iHashCode == 99617003 && lowerCase.equals("https")) {
                                        String host = uri.getHost();
                                        if (host != null && !ihc1.y0(host)) {
                                            i4 = 14;
                                        }
                                    }
                                    i4 = 14;
                                    string3 = z3p0Var;
                                } else {
                                    if (lowerCase.equals("spotify") && nhc1.Y(string3, "spotify:image:", false)) {
                                        i4 = 14;
                                        if (string3.length() <= 14) {
                                        }
                                    } else {
                                        i4 = 14;
                                    }
                                    string3 = z3p0Var;
                                }
                            }
                            gvcVar = string3 != null ? new gvc(i4, string3, z3p0Var) : null;
                        }
                    }
                    if (gvcVar != null) {
                        z3p0Var3 = gvcVar;
                        break;
                    }
                    z3p0Var = null;
                }
                Iterator it8 = list3.iterator();
                do {
                    if (!it8.hasNext()) {
                        q510Var = null;
                        break;
                    }
                    q510Var = ((u310) it8.next()).F;
                } while (q510Var == null);
                if (q510Var != null) {
                    String str7 = q510Var.c;
                    if (str7 == null || (string2 = ihc1.e1(str7).toString()) == null) {
                        jpdVar2 = null;
                    } else {
                        if (string2.length() <= 0 || qpw.a.a.matcher(string2).find()) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            jpdVar2 = new jpd(z3p0Var7, (String) null, 2, string2);
                        } else {
                            jpdVar2 = null;
                        }
                    }
                    String str8 = q510Var.a;
                    if (str8 != null && (str = q510Var.b) != null && (string = ihc1.e1(str).toString()) != null && z561.k0(new sgg1(z6w.T0, se11.b(qpw.a, str8))).equals(Collections.singletonList("{0}"))) {
                        String strZ0 = ihc1.Z0(str8, "{0}");
                        String strU0 = ihc1.U0(str8, "{0}", str8);
                        if (!ihc1.y0(strZ0) && strU0.length() <= 0 && string.length() != 0 && nhc1.Y(z3p0Var7, strZ0, false) && u890.j(ihc1.e1(ihc1.H0(z3p0Var7, strZ0)).toString(), string)) {
                            jpdVar2 = new jpd(string, ihc1.e1(strZ0).toString(), 4, (String) null);
                        }
                    }
                    jpdVar = jpdVar2;
                } else {
                    jpdVar = null;
                }
                smc0VarN.add(new dpd(z3p0Var8, arrayList4, z3p0Var9, z3p0Var10, qi51Var2, yodVar, i3, li51Var, z3p0Var3, jpdVar));
            }
            r7h.W(k4p1.k(smc0VarN), arrayList2);
            k84Var = k84Var;
            it = it;
            str2 = str2;
            zeuVar2 = zeuVar;
            z3p0Var5 = z3p0Var2;
            z3p0Var6 = null;
        }
        k84 k84Var2 = k84Var;
        String str9 = str2;
        if (str3 != null && str3.length() != 0 && (o7h.s0(arrayList2) instanceof dpd)) {
            smc0 arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
            int i5 = 0;
            for (Object obj3 : arrayList2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                dpd dpdVarE = (fpd) obj3;
                if (i5 == 0) {
                    dpdVarE = dpd.e(dpdVarE, str3, (List) null, 1022);
                }
                arrayList5.add(dpdVarE);
                i5 = i6;
            }
            arrayList2 = arrayList5;
        }
        k310 k310Var = f410Var != null ? f410Var.c : null;
        if (k310Var != null) {
            smc0 smc0Var = arrayList2.size() > 1 ? arrayList2 : null;
            if (smc0Var != null) {
                n57.e("A response including audiobook specifics should have just one section");
                arrayList2 = smc0Var;
            } else {
                fpd fpdVar = (fpd) o7h.q0(arrayList2);
                boolean z = k310Var.h;
                String str10 = k310Var.g;
                String str11 = k310Var.d;
                String str12 = k310Var.b;
                arrayList2 = Collections.singletonList(zeu.f(fpdVar, z ? rwo1.k(str12, new kwc(2131953092), str11, str10, true) : rwo1.k(str12, new lwc(k310Var.c), str11, str10, false)));
            }
        }
        if (!k84Var2.e() && f410Var != null && (d410VarA = f410Var.a()) != null) {
            fpd fpdVar2 = (fpd) o7h.q0((List) arrayList2);
            smc0 smc0VarN2 = k4p1.n();
            lwc lwcVar = new lwc(d410VarA.a);
            String str13 = d410VarA.b;
            smc0VarN2.add(zeu.f(fpdVar2, new apd(lwcVar, str13 != null ? new lwc(str13) : null, new fvc(Integer.valueOf(d410VarA.d), (String) null, (mmr0) null, 14), new k80(d410VarA.c), (y6x0) null, (Float) null, 224)));
            smc0VarN2.addAll(o7h.k0((Iterable) arrayList2, 1));
            arrayList2 = k4p1.k(smc0VarN2);
        }
        m510 m510Var = z310Var.c;
        if (m510Var != null) {
            int iOrdinal = m510Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 4;
            } else if (iOrdinal == 1) {
                i2 = 3;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                i2 = 1;
            }
            i = i2;
        } else {
            i = 1;
        }
        if (f410Var == null || !k84Var2.e()) {
            listI0 = z6x.a;
        } else {
            Iterator it9 = f410Var.d.iterator();
            do {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
            } while (!(((e410) next) instanceof c410));
            c410 c410Var = next instanceof c410 ? (c410) next : null;
            acy acyVar = c410Var != null ? new acy(new lwc(c410Var.a), new fvc(2131232313, (String) null, (mmr0) null, 14), c410Var.b) : null;
            d410 d410VarA2 = f410Var.a();
            listI0 = f46.i0(new ccy[]{acyVar, d410VarA2 != null ? new bcy(new lwc(d410VarA2.a), new fvc(Integer.valueOf(d410VarA2.d), (String) null, (mmr0) null, 14), d410VarA2.c) : null});
        }
        return new f020(new bpd(str9, listI0, (List) arrayList2), i, z310Var.d);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                qr0 qr0Var = new qr0((yr0) obj4, (lnm) obj3, (byte) 0);
                qr0Var.b = (ji0) obj;
                qr0Var.c = (ContextTrack) obj2;
                return qr0Var.invokeSuspend(rih1Var);
            case 1:
                qr0 qr0Var2 = new qr0((so1) obj4, (lnm) obj3, (byte) 1);
                qr0Var2.b = (Boolean) obj;
                qr0Var2.c = (ko1) obj2;
                return qr0Var2.invokeSuspend(rih1Var);
            case 2:
                qr0 qr0Var3 = new qr0((h63) obj4, (lnm) obj3, (byte) 2);
                qr0Var3.b = (c63) obj;
                qr0Var3.c = (String) obj2;
                return qr0Var3.invokeSuspend(rih1Var);
            case 3:
                qr0 qr0Var4 = new qr0((bv6) obj4, (lnm) obj3, (byte) 3);
                qr0Var4.b = (List) obj;
                qr0Var4.c = (vfm0) obj2;
                return qr0Var4.invokeSuspend(rih1Var);
            case 4:
                qr0 qr0Var5 = new qr0((bw7) obj4, (lnm) obj3, (byte) 4);
                qr0Var5.b = (List) obj;
                qr0Var5.c = (yab0) obj2;
                return qr0Var5.invokeSuspend(rih1Var);
            case 5:
                qr0 qr0Var6 = new qr0((cl8) obj4, (lnm) obj3, (byte) 5);
                qr0Var6.b = (jl8) obj;
                qr0Var6.c = (mmr0) obj2;
                return qr0Var6.invokeSuspend(rih1Var);
            case 6:
                qr0 qr0Var7 = new qr0((ngb) obj4, (lnm) obj3, (byte) 6);
                qr0Var7.b = (spq0) obj;
                qr0Var7.c = (spq0) obj2;
                return qr0Var7.invokeSuspend(rih1Var);
            case 7:
                qr0 qr0Var8 = new qr0((llb) obj4, (lnm) obj3, (byte) 7);
                qr0Var8.b = (yrt0) obj;
                qr0Var8.c = (PlayerState) obj2;
                return qr0Var8.invokeSuspend(rih1Var);
            case 8:
                qr0 qr0Var9 = new qr0((xpg) obj4, (lnm) obj3, (byte) 8);
                qr0Var9.b = (cxc0) obj;
                qr0Var9.c = (Set) obj2;
                return qr0Var9.invokeSuspend(rih1Var);
            case 9:
                qr0 qr0Var10 = new qr0((drg) obj4, (lnm) obj3, (byte) 9);
                qr0Var10.b = (String) obj;
                qr0Var10.c = (tv80) obj2;
                qr0Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                qr0 qr0Var11 = new qr0((g1i) obj4, (lnm) obj3, (byte) 10);
                qr0Var11.b = (PlayerState) obj;
                qr0Var11.c = (Boolean) obj2;
                return qr0Var11.invokeSuspend(rih1Var);
            case 11:
                qr0 qr0Var12 = new qr0((u1r) obj4, (lnm) obj3, (byte) 11);
                qr0Var12.b = (Boolean) obj;
                qr0Var12.c = (Boolean) obj2;
                return qr0Var12.invokeSuspend(rih1Var);
            case 12:
                qr0 qr0Var13 = new qr0((jz5) obj4, (lnm) obj3, (byte) 12);
                qr0Var13.b = (vxs0) obj;
                qr0Var13.c = (List) obj2;
                return qr0Var13.invokeSuspend(rih1Var);
            case 13:
                qr0 qr0Var14 = new qr0((l6s) obj4, (lnm) obj3, (byte) 13);
                qr0Var14.b = (pp90) obj;
                qr0Var14.c = (os60) obj2;
                return qr0Var14.invokeSuspend(rih1Var);
            case 14:
                new qr0((ezt) this.b, (String) this.c, (oxt) obj4, (lnm) obj3).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                qr0 qr0Var15 = new qr0((zxv) obj4, (lnm) obj3, (byte) 15);
                qr0Var15.b = (List) obj;
                qr0Var15.c = (List) obj2;
                return qr0Var15.invokeSuspend(rih1Var);
            case 16:
                qr0 qr0Var16 = new qr0((goq) obj4, (lnm) obj3, (byte) 16);
                qr0Var16.b = (PlayerState) obj;
                qr0Var16.c = (PlayerQueue) obj2;
                return qr0Var16.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qr0 qr0Var17 = new qr0((eqp0) obj4, (lnm) obj3, (byte) 17);
                qr0Var17.b = (Map) obj;
                qr0Var17.c = (Map) obj2;
                return qr0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qr0 qr0Var18 = new qr0((xl00) obj4, (lnm) obj3, (byte) 18);
                qr0Var18.b = (u0a0) obj;
                qr0Var18.c = (ap90) obj2;
                return qr0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qr0 qr0Var19 = new qr0(this.c, obj4, (lnm) obj3, (byte) 19);
                qr0Var19.b = (Map) obj;
                return qr0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qr0 qr0Var20 = new qr0((dxy) obj4, (lnm) obj3, (byte) 20);
                qr0Var20.b = (z310) obj;
                qr0Var20.c = (z3p0) obj2;
                return qr0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qr0 qr0Var21 = new qr0(this.c, obj4, (lnm) obj3, (byte) 21);
                qr0Var21.b = (Throwable) obj2;
                qr0Var21.invokeSuspend(rih1Var);
                throw null;
            case 22:
                qr0 qr0Var22 = new qr0((String) obj4, (lnm) obj3, (byte) 22);
                qr0Var22.b = (i091) obj;
                qr0Var22.c = (o731) obj2;
                return qr0Var22.invokeSuspend(rih1Var);
            case 23:
                qr0 qr0Var23 = new qr0((ArrayList) obj4, (lnm) obj3, (byte) 23);
                qr0Var23.b = (List) obj;
                qr0Var23.c = (Set) obj2;
                return qr0Var23.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qr0 qr0Var24 = new qr0((ie90) obj4, (lnm) obj3, (byte) 24);
                qr0Var24.b = (String) obj;
                qr0Var24.c = (tv80) obj2;
                qr0Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                qr0 qr0Var25 = new qr0((rq90) obj4, (lnm) obj3, (byte) 25);
                qr0Var25.b = (List) obj;
                qr0Var25.c = (List) obj2;
                return qr0Var25.invokeSuspend(rih1Var);
            case 26:
                qr0 qr0Var26 = new qr0((fey) obj4, (lnm) obj3, (byte) 26);
                qr0Var26.b = (pp90) obj;
                qr0Var26.c = (ap90) obj2;
                return qr0Var26.invokeSuspend(rih1Var);
            case 27:
                qr0 qr0Var27 = new qr0((ncc0) obj4, (lnm) obj3, (byte) 27);
                qr0Var27.b = (cxc0) obj;
                qr0Var27.c = (k1r) obj2;
                return qr0Var27.invokeSuspend(rih1Var);
            case 28:
                qr0 qr0Var28 = new qr0((q7d0) obj4, (lnm) obj3, (byte) 28);
                qr0Var28.b = (g3d0) obj;
                qr0Var28.c = (Set) obj2;
                return qr0Var28.invokeSuspend(rih1Var);
            default:
                qr0 qr0Var29 = new qr0((vjd0) obj4, (lnm) obj3, (byte) 29);
                qr0Var29.b = (u3f) obj;
                qr0Var29.c = (hse) obj2;
                return qr0Var29.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x0309  */
    /* JADX WARN: Code duplicated, block: B:152:0x031c  */
    /* JADX WARN: Code duplicated, block: B:154:0x031f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0365  */
    /* JADX WARN: Code duplicated, block: B:163:0x038c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x038e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0398  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:255:0x0668  */
    /* JADX WARN: Code duplicated, block: B:256:0x066f  */
    /* JADX WARN: Code duplicated, block: B:534:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[LOOP:7: B:145:0x0303->B:546:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v17 java.lang.Object, still in use, count: 2, list:
          (r14v17 java.lang.Object) from 0x02bf: PHI (r14 I:??) = (r14v3 java.lang.Object), (r14v17 java.lang.Object) binds: [B:128:0x02be, B:537:0x02bf] A[DONT_GENERATE, DONT_INLINE]
          (r14v17 java.lang.Object) from 0x02b1: CHECK_CAST (p.l0l) (r14v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
