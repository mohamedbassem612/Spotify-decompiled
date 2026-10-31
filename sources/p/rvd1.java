package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvd1(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:267:0x07ac  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        y8f1 y8f1Var;
        goj0 goj0VarA;
        gw81 gw81Var;
        String str2;
        h6i1 h6i1Var;
        byte b = this.a;
        int i = 0;
        objArr = 0;
        Object[] objArr = 0;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                lvd1 lvd1Var = (lvd1) obj;
                h290 h290Var = lvd1Var.c;
                List list = ((jvd1) obj2).a;
                int i2 = lvd1Var.e;
                vp70 vp70Var = vp70.c;
                vp70 vp70Var2 = vp70.b;
                k1p1 ovd1Var = nvd1.c;
                if (i2 != 1) {
                    ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
                    for (Object obj3 : h290Var) {
                        int i3 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str3 = (String) obj3;
                        xkk1 xkk1Var = (xkk1) o7h.t0(i, list);
                        if (xkk1Var == null) {
                            str = null;
                        } else {
                            mq70 mq70Var = xkk1Var.a;
                            up70 up70VarA = mq70Var.a(vp70Var2);
                            if (up70VarA == null) {
                                up70VarA = mq70Var.a(vp70Var);
                            }
                            if (up70VarA != null) {
                                str = up70VarA.a.a;
                            } else {
                                str = null;
                            }
                        }
                        arrayList.add(new kvd1(str, svd1.f(str3)));
                        i = i3;
                    }
                    if (!h290Var.isEmpty()) {
                        c380 c380VarA = mqo1.A(arrayList);
                        ArrayList arrayList2 = new ArrayList(q7h.U(h290Var, 10));
                        Iterator it = h290Var.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(svd1.f((String) it.next()));
                        }
                        ovd1Var = new pvd1(c380VarA, mqo1.A(arrayList2));
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        mq70 mq70Var2 = ((xkk1) it2.next()).a;
                        up70 up70VarA2 = mq70Var2.a(vp70Var2);
                        if (up70VarA2 == null) {
                            up70VarA2 = mq70Var2.a(vp70Var);
                        }
                        String str4 = up70VarA2 != null ? up70VarA2.a.a : null;
                        if (str4 != null) {
                            arrayList3.add(str4);
                        }
                    }
                    String str5 = (String) o7h.s0(h290Var);
                    if (str5 != null) {
                        ovd1Var = new ovd1(mqo1.A(arrayList3), svd1.f(str5));
                    }
                }
                return new mvd1(lvd1Var.b, lvd1Var.d, ovd1Var, i2);
            case 1:
                ((Number) obj2).intValue();
                o1p1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                o1p1.p((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                p1p1.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                p1p1.q((b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                j2p1.l((b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(fux.c, new jsl(cwl1.o0(x340Var2, 2131963718)), u291.r(nim0.a, 24.0f), 0L, 0L, false, x340Var2, fux.d, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.i0(543167655);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                d9f1 d9f1Var = (d9f1) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                ArrayList<c9f1> arrayList4 = d9f1Var.b;
                ArrayList arrayList5 = new ArrayList();
                for (c9f1 c9f1Var : arrayList4) {
                    hoj0 hoj0VarC = ioj0Var.c(gw81.class, c9f1Var.a);
                    if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (gw81Var = (gw81) goj0VarA.a) == null) {
                        y8f1Var = null;
                    } else {
                        String str6 = c9f1Var.a;
                        y8f1Var = new y8f1(str6, gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(d9f1Var.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(str6, new String[]{":"}, 0, 6))), gw81Var.b, gw81Var.a, c9f1Var.b, c9f1Var.c);
                    }
                    if (y8f1Var != null) {
                        arrayList5.add(y8f1Var);
                    }
                }
                return new z8f1(arrayList5);
            case 9:
                ((Number) obj2).intValue();
                odf1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                odf1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                dkf1 dkf1Var = (dkf1) obj2;
                PlayerState playerState = dkf1Var.a;
                return new gkf1(new ikf1((ContextTrack) o7h.C0(playerState.prevTracks()), (ContextTrack) playerState.track().b(), (ContextTrack) o7h.s0(playerState.nextTracks())), new hkf1(false, !playerState.restrictions().disallowSkippingPrevReasons().isEmpty(), !playerState.restrictions().disallowSkippingNextReasons().isEmpty(), !playerState.restrictions().disallowPeekingPrevReasons().isEmpty(), !playerState.restrictions().disallowPeekingNextReasons().isEmpty(), !playerState.restrictions().disallowSwipePrevReasons().isEmpty(), !playerState.restrictions().disallowSwipeNextReasons().isEmpty()), dkf1Var.b, o4p1.v(playerState), dkf1Var.c);
            case 12:
                i1r i1rVar = (k1r) obj2;
                boolean z = i1rVar instanceof j1r;
                ArrayList arrayList6 = z6x.a;
                if (z) {
                    return new omf1(mqo1.A(arrayList6), mqo1.A(arrayList6));
                }
                if (!(i1rVar instanceof i1r)) {
                    if (i1rVar instanceof h1r) {
                        return new omf1(mqo1.A(arrayList6), mqo1.A(arrayList6));
                    }
                    eg.o();
                    return null;
                }
                f7a1 f7a1Var = (f7a1) i1rVar.a;
                if (f7a1Var != null) {
                    arrayList6 = f7a1Var.a;
                }
                ArrayList<b7a1> arrayList7 = arrayList6;
                sgg1 sgg1Var = new sgg1(udf1.b1, z561.T(udf1.a1, z561.Y(udf1.Z0, new i46(arrayList7, (byte) 1))));
                cix0 cix0Var = new cix0((byte) 17);
                drs0 drs0VarD = fg91.b.d();
                qlu qluVar = new qlu(sgg1Var.iterator(), cix0Var);
                while (qluVar.hasNext()) {
                    drs0VarD.add(qluVar.next());
                }
                c9 c9VarD = drs0VarD.d();
                ArrayList<yvg1> arrayList8 = new ArrayList();
                for (b7a1 b7a1Var : arrayList7) {
                    ArrayList arrayList9 = b7a1Var.d;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : arrayList9) {
                        if (!((e7a1) obj4).b) {
                            arrayList10.add(obj4);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                    Iterator it3 = arrayList10.iterator();
                    while (it3.hasNext()) {
                        arrayList11.add(new yvg1(((e7a1) it3.next()).a, b7a1Var.b, b7a1Var.c.a));
                    }
                    r7h.W(arrayList11, arrayList8);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (yvg1 yvg1Var : arrayList8) {
                    String str7 = (String) yvg1Var.a;
                    Object objH = linkedHashMap.get(str7);
                    if (objH == null) {
                        objH = cfm0.h(str7, linkedHashMap);
                    }
                    ((List) objH).add(new mmr0(yvg1Var.b, yvg1Var.c));
                }
                ArrayList arrayList12 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str8 = (String) entry.getKey();
                    List<mmr0> list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (mmr0 mmr0Var : list2) {
                        String str9 = (String) mmr0Var.a;
                        Object objH2 = linkedHashMap2.get(str9);
                        if (objH2 == null) {
                            objH2 = cfm0.h(str9, linkedHashMap2);
                        }
                        ((List) objH2).add((String) mmr0Var.b);
                    }
                    ArrayList arrayList13 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        arrayList13.add(new gm6((String) entry2.getKey(), mqo1.A(o7h.j0((List) entry2.getValue()))));
                    }
                    arrayList12.add(new zz1(str8, mqo1.A(arrayList13)));
                }
                return new omf1(c9VarD, mqo1.A(arrayList12));
            case 13:
                ((Number) obj2).intValue();
                hqq0.w((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                luf1 luf1Var = (luf1) obj;
                kuf1 kuf1Var = (kuf1) obj2;
                cvf1 cvf1Var = luf1Var.b;
                if (u890.j(cvf1Var, cvf1.a)) {
                    return new quf1(luf1Var.a, cvf1Var, kuf1Var.a, 2131963354, 2131963353, kuf1Var.b);
                }
                eg.o();
                return null;
            case 15:
                return kox0.f((kzf1) obj, (kcz0) u890.G((k1r) obj2));
            case 16:
                String str10 = (String) obj;
                i1r i1rVar2 = (k1r) obj2;
                if (!(i1rVar2 instanceof i1r)) {
                    return new e7g1(u7h.c, null, "", "", false);
                }
                d7g1 d7g1Var = (d7g1) i1rVar2.a;
                up70 up70VarA3 = d7g1Var.a.a.a(vp70.d);
                String str11 = (up70VarA3 == null || (str2 = up70VarA3.a.a) == null || str2.length() <= 0) ? null : str2;
                pp70 pp70Var = d7g1Var.a.a.b;
                long j = pp70Var != null ? pp70Var.c.a.c : u7h.c;
                jo70 jo70Var = d7g1Var.b;
                String str12 = jo70Var != null ? jo70Var.a : null;
                String strY0 = "";
                String str13 = str12 == null ? "" : str12;
                f7g1.f.getClass();
                if (jo70Var != null) {
                    String str14 = jo70Var.b;
                    ArrayList arrayList14 = new ArrayList();
                    if (!ihc1.y0(str14)) {
                        arrayList14.add(str14);
                    }
                    ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                    String str15 = ho70Var != null ? ho70Var.a : null;
                    if (str15 != null && !ihc1.y0(str15)) {
                        arrayList14.add(str15);
                    }
                    strY0 = o7h.y0(arrayList14, " · ", (String) null, (String) null, (iu30) null, 62);
                }
                return new e7g1(j, str11, str13, strY0, nhc1.Y(str10, "spotify:artist:", false) || nhc1.Y(str10, "spotify:user:", false));
            case 17:
                dbg1 dbg1Var = (dbg1) obj;
                return Next.i(sma1.e((ccg1) obj2, dbg1Var), Collections.singleton(new rbg1(dbg1Var.a, dbg1Var.d)));
            case 18:
                ((Number) obj2).intValue();
                fdg1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var6, 2131959404), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var8, 2131959425), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 21:
                kuh1 kuh1Var = (kuh1) obj;
                luh1 luh1Var = (luh1) obj2;
                return Next.h(luh1.a(luh1Var, kuh1Var.a, false, kuh1Var.b, kuh1Var.c, kuh1Var.d ? false : luh1Var.e, kuh1Var.d, kuh1Var.e, false, false, ytw0.e(kuh1Var.f) != null, (z740) null, (z740) null, 3458));
            case 22:
                ((Number) obj2).intValue();
                ioo1.u((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                e6i1 e6i1Var = (e6i1) obj;
                i6i1 i6i1Var = (i6i1) obj2;
                String entityUri = i6i1Var.getEntityUri();
                String str16 = e6i1Var.a;
                Object[] objArr2 = !u890.j(entityUri, str16) && str16.length() > 0;
                String strH = m6i1.h(e6i1Var);
                y5i1 y5i1VarA = i6i1Var.a();
                y5i1 y5i1Var = y5i1VarA instanceof y5i1 ? y5i1VarA : null;
                String uri = y5i1Var != null ? y5i1Var.getUri() : null;
                if (strH != null && !strH.equals(uri)) {
                    objArr = 1;
                }
                h6i1 h6i1VarI = m6i1.i(i6i1Var, e6i1Var);
                if (objArr2 != false) {
                    if (h6i1VarI instanceof h6i1) {
                        h6i1VarI = h6i1VarI;
                    } else {
                        if (h6i1VarI instanceof g6i1) {
                            g6i1 g6i1Var = (g6i1) h6i1VarI;
                            h6i1Var = new h6i1(g6i1Var.a, g6i1Var.b, g6i1Var.c, g6i1Var.d);
                        } else {
                            if (!(h6i1VarI instanceof f6i1)) {
                                eg.o();
                                return null;
                            }
                            f6i1 f6i1Var = (f6i1) h6i1VarI;
                            h6i1Var = new h6i1(f6i1Var.a, f6i1Var.b, f6i1Var.c, f6i1Var.d);
                        }
                        h6i1VarI = h6i1Var;
                    }
                }
                xj61 xj61Var = new xj61();
                if (objArr2 != false) {
                    xj61Var.add(new pbw(str16));
                }
                if (objArr != 0) {
                    xj61Var.add(new ibw(strH));
                }
                return Next.i(h6i1VarI, cwl1.j(xj61Var));
            case 24:
                e6i1 e6i1Var2 = (e6i1) obj;
                String strH2 = m6i1.h(e6i1Var2);
                i6i1 i6i1VarI = m6i1.i((i6i1) obj2, e6i1Var2);
                xj61 xj61Var2 = new xj61();
                String str17 = e6i1Var2.a;
                if (str17.length() > 0) {
                    xj61Var2.add(new pbw(str17));
                }
                if (strH2 != null) {
                    xj61Var2.add(new ibw(strH2));
                }
                return First.c(i6i1VarI, cwl1.j(xj61Var2));
            case 25:
                ((Number) obj2).intValue();
                aqo1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                aqo1.l((b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                int iC = l1d.C(((rdi1) obj).d);
                if (iC == 0) {
                    return null;
                }
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-listening-timeline";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("edge_case_no_listening_history", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 28:
                ((Number) obj2).intValue();
                wro1.C((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                czo1.a((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvd1(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvd1(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
