package p;

import com.google.protobuf.Empty;
import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t9w implements Function, Predicate, s2i1, av30, o4e1, BiFunction {
    public final /* synthetic */ byte a;
    public static final t9w b = new t9w(0);
    public static final t9w c = new t9w(1);
    public static final t9w d = new t9w(2);
    public static final t9w e = new t9w(3);
    public static final t9w f = new t9w(4);
    public static final t9w g = new t9w(5);
    public static final t9w h = new t9w(6);
    public static final t9w i = new t9w(7);
    public static final t9w t = new t9w(8);
    public static final t9w X = new t9w(9);
    public static final t9w Y = new t9w(10);
    public static final t9w Z = new t9w(11);
    public static final t9w N0 = new t9w(12);
    public static final t9w O0 = new t9w(13);
    public static final t9w P0 = new t9w(14);
    public static final t9w Q0 = new t9w(15);
    public static final t9w R0 = new t9w(16);
    public static final t9w S0 = new t9w(19);
    public static final t9w T0 = new t9w(20);
    public static final t9w U0 = new t9w(21);
    public static final t9w V0 = new t9w(22);
    public static final t9w W0 = new t9w(23);
    public static final t9w X0 = new t9w(24);
    public static final t9w Y0 = new t9w(25);
    public static final t9w Z0 = new t9w(26);
    public static final t9w a1 = new t9w(27);
    public static final t9w b1 = new t9w(28);
    public static final t9w c1 = new t9w(29);

    public /* synthetic */ t9w(byte b2) {
        this.a = b2;
    }

    public static jc9 a(ne neVar) {
        return new jc9(neVar, (byte) 24);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0 A[LOOP:5: B:101:0x01b7->B:113:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x0225  */
    /* JADX WARN: Code duplicated, block: B:130:0x022f  */
    /* JADX WARN: Code duplicated, block: B:134:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0241  */
    /* JADX WARN: Code duplicated, block: B:137:0x0244  */
    /* JADX WARN: Code duplicated, block: B:138:0x024b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0256  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263 A[LOOP:7: B:128:0x0229->B:142:0x0263, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0274 A[PHI: r2
      0x0274: PHI (r2v96 java.util.Collection) = (r2v89 java.util.Collection), (r2v91 java.util.Collection) binds: [B:145:0x0272, B:188:0x032a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0277  */
    /* JADX WARN: Code duplicated, block: B:150:0x0282  */
    /* JADX WARN: Code duplicated, block: B:153:0x0293 A[LOOP:8: B:148:0x027c->B:153:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0299  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02de  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:177:0x0302  */
    /* JADX WARN: Code duplicated, block: B:180:0x0313 A[LOOP:12: B:175:0x02fc->B:180:0x0313, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x031f  */
    /* JADX WARN: Code duplicated, block: B:188:0x032a  */
    /* JADX WARN: Code duplicated, block: B:532:0x01b2 A[EDGE_INSN: B:532:0x01b2->B:100:0x01b2 BREAK  A[LOOP:4: B:86:0x018b->B:98:0x01ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x01e4 A[EDGE_INSN: B:535:0x01e4->B:115:0x01e4 BREAK  A[LOOP:5: B:101:0x01b7->B:113:0x01e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0266 A[EDGE_INSN: B:538:0x0266->B:143:0x0266 BREAK  A[LOOP:7: B:128:0x0229->B:142:0x0263], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0297 A[EDGE_INSN: B:543:0x0297->B:155:0x0297 BREAK  A[LOOP:8: B:148:0x027c->B:153:0x0293], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0317 A[EDGE_INSN: B:558:0x0317->B:182:0x0317 BREAK  A[LOOP:12: B:175:0x02fc->B:180:0x0313], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Code duplicated, block: B:91:0x019e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ae A[LOOP:4: B:86:0x018b->B:98:0x01ae, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v74, types: [p.jxs0] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v77, types: [p.gxs0] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v64, types: [p.jxs0] */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67, types: [p.gxs0] */
    /* JADX WARN: Type inference failed for: r6v47, types: [p.jxs0] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v50, types: [p.gxs0] */
    public static Next b(ro41 ro41Var, zzl zzlVar) {
        int i2;
        Object next;
        boolean z;
        Object next2;
        ?? arrayList;
        int i3;
        Object next3;
        String str;
        Object next4;
        Integer numValueOf;
        String string;
        gxs0 gxs0Var;
        int i4;
        boolean z2;
        Object next5;
        cq00 cq00Var;
        Iterator it;
        int i5;
        Iterator it2;
        int i6;
        int i7;
        ArrayList arrayList2;
        Collection collectionN0;
        txs0 txs0VarM;
        Iterator it3;
        int i8;
        ?? SingletonList;
        ?? arrayList3;
        Iterator it4;
        int i9;
        Integer numValueOf2;
        Iterator it5;
        Object next6;
        txs0 txs0Var;
        Iterator it6;
        gxs0 gxs0Var2;
        String uri;
        jxs0 jxs0Var;
        gxs0 gxs0Var3;
        String uri2;
        jxs0 jxs0Var2;
        gxs0 gxs0Var4;
        String str2;
        List list = ro41Var.i;
        List<jxs0> list2 = ro41Var.c;
        String str3 = ro41Var.a;
        if (zzlVar instanceof pzl) {
            return ro41Var.equals(ro41.O0) ? Next.h(((pzl) zzlVar).a) : Next.j();
        }
        if (!(zzlVar instanceof uzl)) {
            if (zzlVar instanceof rzl) {
                rzl rzlVar = (rzl) zzlVar;
                boolean z3 = rzlVar.e;
                String str4 = rzlVar.c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it7 = cyo1.o(list2, wpo1.m(ro41Var)).iterator();
                int i10 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    jxs0 jxs0Var3 = (jxs0) it7.next();
                    gxs0 gxs0Var5 = jxs0Var3 instanceof gxs0 ? (gxs0) jxs0Var3 : null;
                    if (u890.j(gxs0Var5 != null ? gxs0Var5.c.getUri() : null, str4)) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf3 = Integer.valueOf(i10);
                if (i10 == -1) {
                    numValueOf3 = null;
                }
                Iterator it8 = list2.iterator();
                do {
                    if (!it8.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it8.next();
                    jxs0 jxs0Var4 = (jxs0) next4;
                    gxs0Var = jxs0Var4 instanceof gxs0 ? (gxs0) jxs0Var4 : null;
                } while (!u890.j(gxs0Var != null ? gxs0Var.c.getUri() : null, str4));
                jxs0 jxs0Var5 = (jxs0) next4;
                if (jxs0Var5 == null) {
                    return Next.j();
                }
                gxs0 gxs0Var6 = (gxs0) jxs0Var5;
                int iIndexOf = list2.indexOf(jxs0Var5);
                List list3 = rzlVar.a;
                List listD1 = o7h.d1(list2, iIndexOf + (z3 ? 1 : 0));
                List<hv51> list4 = list3;
                ArrayList arrayList4 = new ArrayList(q7h.U(list4, 10));
                for (hv51 hv51Var : list4) {
                    arrayList4.add(new gxs0(gxs0Var6.a, gxs0Var6.b, hv51Var, hv51Var instanceof hv51 ? hv51Var.f() : false, p7h.N(rzlVar.d), 80));
                }
                ArrayList<??> arrayListN0 = o7h.N0(o7h.e1((list2.size() - iIndexOf) - (z3 ? 1 : 0), list2), o7h.N0(arrayList4, listD1));
                if (rzlVar.f) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayListN0) {
                        jxs0 jxs0Var6 = (jxs0) obj;
                        gxs0 gxs0Var7 = jxs0Var6 instanceof gxs0 ? (gxs0) jxs0Var6 : null;
                        if (!u890.j(gxs0Var7 != null ? gxs0Var7.c.getUri() : null, str4)) {
                            arrayList5.add(obj);
                        }
                    }
                    arrayListN0 = arrayList5;
                }
                ArrayList<??> arrayList6 = new ArrayList(q7h.U(arrayListN0, 10));
                for (?? A : arrayListN0) {
                    gxs0 gxs0Var8 = A instanceof gxs0 ? (gxs0) A : null;
                    if (u890.j(gxs0Var8 != null ? gxs0Var8.c.getUri() : null, str4)) {
                        A = gxs0.a((gxs0) A, false, null, false, 63);
                    }
                    arrayList6.add(A);
                }
                Iterator it9 = cyo1.o(arrayList6, wpo1.m(ro41Var)).iterator();
                int i11 = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    jxs0 jxs0Var7 = (jxs0) it9.next();
                    gxs0 gxs0Var9 = jxs0Var7 instanceof gxs0 ? (gxs0) jxs0Var7 : null;
                    if (u890.j(gxs0Var9 != null ? gxs0Var9.c.getUri() : null, str4)) {
                        break;
                    }
                    i11++;
                }
                Integer numValueOf4 = Integer.valueOf(i11);
                if (i11 == -1) {
                    numValueOf4 = null;
                }
                if (numValueOf4 != null) {
                    int iIntValue = numValueOf4.intValue();
                    if (!z3) {
                        iIntValue -= list3.size();
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    numValueOf = null;
                }
                Integer numValueOf5 = ((rzlVar.b || !arrayList4.isEmpty()) && numValueOf3 != null) ? Integer.valueOf(numValueOf != null ? numValueOf.intValue() : numValueOf3.intValue()) : null;
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                for (?? A2 : arrayList6) {
                    if (A2 instanceof gxs0) {
                        gxs0 gxs0Var10 = (gxs0) A2;
                        xl81 xl81Var = gxs0Var10.c;
                        if (u890.j(xl81Var.getUri(), str4) && (xl81Var instanceof hv51)) {
                            A2 = gxs0.a(gxs0Var10, false, null, false, 111);
                        }
                    }
                    arrayList7.add(A2);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : arrayList7) {
                    jxs0 jxs0Var8 = (jxs0) obj2;
                    gxs0 gxs0Var11 = jxs0Var8 instanceof gxs0 ? (gxs0) jxs0Var8 : null;
                    if (gxs0Var11 == null || (string = gxs0Var11.c.getUri()) == null) {
                        string = UUID.randomUUID().toString();
                    }
                    if (hashSet.add(string)) {
                        arrayList8.add(obj2);
                    }
                }
                return Next.i(ro41.a(ro41Var, arrayList8, null, null, numValueOf5, false, 14331), linkedHashSet);
            }
            if (zzlVar instanceof szl) {
                SearchConfiguration searchConfiguration = ro41Var.e;
                return searchConfiguration == null ? Next.j() : Next.a(Collections.singleton(new gzl(str3, searchConfiguration)));
            }
            if (!(zzlVar instanceof qzl)) {
                if (zzlVar instanceof ozl) {
                    for (jxs0 jxs0Var9 : list2) {
                        if (!(jxs0Var9 instanceof hxs0) && !(jxs0Var9 instanceof ixs0)) {
                            if (ro41Var.N0) {
                                return Next.a(f46.S0(new kzl[]{new bzl(str3), new jzl("User pressed back button")}));
                            }
                            gxs0 gxs0Var12 = jxs0Var9 instanceof gxs0 ? (gxs0) jxs0Var9 : null;
                            xl81 xl81Var2 = gxs0Var12 != null ? gxs0Var12.c : null;
                            id21 id21Var = xl81Var2 instanceof id21 ? (id21) xl81Var2 : null;
                            return ((id21Var != null ? id21Var.a1() : 0) == 2 || (xl81Var2 instanceof w4a)) ? Next.a(f46.S0(new kzl[]{new bzl(str3), new izl(str3, ro41Var.Z)})) : Next.j();
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                if (!(zzlVar instanceof tzl)) {
                    if (zzlVar instanceof wzl) {
                        return Next.h(ro41.a(ro41Var, null, null, null, null, false, 14335));
                    }
                    if (zzlVar instanceof vzl) {
                        return Next.a(f46.S0(new kzl[]{new dzl(str3), new xyl(1, wpo1.q(ro41Var))}));
                    }
                    if (zzlVar instanceof xzl) {
                        return Next.a(f46.S0(new kzl[]{new fzl(str3), new xyl(2, wpo1.q(ro41Var))}));
                    }
                    if (zzlVar instanceof yzl) {
                        return Next.a(Collections.singleton(new jzl("Skipped")));
                    }
                    eg.o();
                    return null;
                }
                String str5 = ((tzl) zzlVar).a.b;
                Iterator it10 = list.iterator();
                int i12 = 0;
                while (true) {
                    if (!it10.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (u890.j(((txs0) it10.next()).b, str5)) {
                        i2 = i12;
                        break;
                    }
                    i12++;
                }
                List<txs0> list5 = list;
                ArrayList arrayList9 = new ArrayList(q7h.U(list5, 10));
                for (txs0 txs0Var2 : list5) {
                    arrayList9.add(txs0.a(txs0Var2, u890.j(str5, txs0Var2.b)));
                }
                return Next.i(ro41.a(ro41Var, null, arrayList9, null, 0, false, 14079), Collections.singleton(new hzl(str3, i2, ((txs0) list.get(i2)).b)));
            }
            gxs0 gxs0Var13 = ((qzl) zzlVar).a;
            String str6 = gxs0Var13.a;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            ArrayList arrayList10 = new ArrayList(list2);
            Iterator it11 = arrayList10.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    next = null;
                    break;
                }
                next = it11.next();
                jxs0 jxs0Var10 = (jxs0) next;
                if ((jxs0Var10 instanceof gxs0) && u890.j(((gxs0) jxs0Var10).c.getUri(), gxs0Var13.c.getUri())) {
                    break;
                }
            }
            jxs0 jxs0Var11 = (jxs0) next;
            gxs0 gxs0VarA = jxs0Var11 instanceof gxs0 ? (gxs0) jxs0Var11 : null;
            if (gxs0VarA == null) {
                List listD2 = o7h.d1(list, 1);
                ArrayList arrayList11 = new ArrayList(q7h.U(listD2, 10));
                Iterator it12 = listD2.iterator();
                while (it12.hasNext()) {
                    arrayList11.add(((txs0) it12.next()).b);
                }
                z = false;
                gxs0VarA = gxs0.a(gxs0Var13, false, arrayList11, false, 95);
            } else {
                z = false;
            }
            gxs0 gxs0VarA2 = gxs0.a(gxs0VarA, z, null, z, 119);
            Iterator it13 = arrayList10.iterator();
            int i13 = 0;
            while (true) {
                if (!it13.hasNext()) {
                    i13 = -1;
                    break;
                }
                jxs0 jxs0Var12 = (jxs0) it13.next();
                if ((jxs0Var12 instanceof gxs0) && u890.j(((gxs0) jxs0Var12).a, str6)) {
                    break;
                }
                i13++;
            }
            Integer numValueOf6 = Integer.valueOf(i13);
            if (i13 == -1) {
                numValueOf6 = null;
            }
            if (jxs0Var11 == null) {
                if (numValueOf6 == null) {
                    Iterator it14 = ro41Var.d.iterator();
                    do {
                        if (!it14.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it14.next();
                    } while (!u890.j(((qo41) next3).a, str6));
                    qo41 qo41Var = (qo41) next3;
                    arrayList10 = o7h.N0(arrayList10, f46.i0(new jxs0[]{(qo41Var == null || (str = qo41Var.b) == null) ? null : new hxs0(str), gxs0VarA2, ixs0.a}));
                } else {
                    arrayList10.add(numValueOf6.intValue(), gxs0VarA2);
                }
            }
            if (jxs0Var11 == null) {
                List list6 = list;
                arrayList = new ArrayList(q7h.U(list6, 10));
                int i14 = 0;
                for (Object obj3 : list6) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(txs0.a((txs0) obj3, i14 == 0));
                    i14 = i15;
                }
            } else {
                Iterator it15 = ((gxs0) jxs0Var11).f.iterator();
                loop27: while (true) {
                    if (!it15.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it15.next();
                    String str7 = (String) next2;
                    List list7 = list;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator it16 = list7.iterator();
                        while (it16.hasNext()) {
                            if (u890.j(((txs0) it16.next()).b, str7)) {
                                break loop27;
                            }
                        }
                    }
                }
                String str8 = (String) next2;
                if (str8 == null) {
                    arrayList = list;
                } else {
                    List<txs0> list8 = list;
                    arrayList = new ArrayList(q7h.U(list8, 10));
                    for (txs0 txs0Var3 : list8) {
                        arrayList.add(txs0.a(txs0Var3, u890.j(txs0Var3.b, str8)));
                    }
                }
            }
            Iterator it17 = arrayList.iterator();
            int i16 = 0;
            while (true) {
                if (!it17.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((txs0) it17.next()).c) {
                    i3 = i16;
                    break;
                }
                i16++;
            }
            Integer numValueOf7 = i3 != -1 ? Integer.valueOf(i3) : null;
            if (numValueOf7 != null) {
                int iIntValue2 = numValueOf7.intValue();
                linkedHashSet2.add(new hzl(str3, iIntValue2, ((txs0) arrayList.get(iIntValue2)).b));
            }
            linkedHashSet2.add(new zyl(gxs0VarA2));
            return Next.i(ro41.a(ro41Var, arrayList10, arrayList, null, null, false, 16123), linkedHashSet2);
        }
        uzl uzlVar = (uzl) zzlVar;
        gxs0 gxs0Var14 = uzlVar.a;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        List<jxs0> list9 = list2;
        ArrayList<??> arrayList12 = new ArrayList(q7h.U(list9, 10));
        for (jxs0 jxs0VarA : list9) {
            if (jxs0VarA instanceof gxs0) {
                gxs0 gxs0Var15 = (gxs0) jxs0VarA;
                if (u890.j(gxs0Var15.c.getUri(), gxs0Var14.c.getUri()) && (gxs0Var14.c instanceof hv51)) {
                    jxs0VarA = gxs0.a(gxs0Var15, !gxs0Var14.d, null, false, 119);
                }
            }
            arrayList12.add(jxs0VarA);
        }
        boolean z4 = true;
        boolean z5 = uzlVar.b;
        cq00 cq00Var2 = gxs0Var14.c;
        boolean z6 = gxs0Var14.d;
        xl81 xl81Var3 = gxs0Var14.c;
        Iterator it18 = cyo1.o(list2, wpo1.m(ro41Var)).iterator();
        int i17 = 0;
        while (true) {
            if (!it18.hasNext()) {
                i4 = -1;
                break;
            }
            jxs0 jxs0Var13 = (jxs0) it18.next();
            gxs0 gxs0Var16 = jxs0Var13 instanceof gxs0 ? (gxs0) jxs0Var13 : null;
            if (u890.j(gxs0Var16 != null ? gxs0Var16.c.getUri() : null, xl81Var3.getUri())) {
                i4 = i17;
                break;
            }
            i17++;
        }
        Integer numValueOf8 = Integer.valueOf(i4);
        if (i4 == -1) {
            numValueOf8 = null;
        }
        Iterator it19 = arrayList12.iterator();
        while (true) {
            if (!it19.hasNext()) {
                z2 = z5;
                next5 = null;
                break;
            }
            next5 = it19.next();
            z2 = z5;
            jxs0 jxs0Var14 = (jxs0) next5;
            Iterator it20 = it19;
            if ((jxs0Var14 instanceof gxs0) && u890.j(((gxs0) jxs0Var14).c.getUri(), xl81Var3.getUri())) {
                break;
            }
            it19 = it20;
            z5 = z2;
        }
        gxs0 gxs0Var17 = next5 instanceof gxs0 ? (gxs0) next5 : null;
        if (gxs0Var17 == null) {
            return Next.j();
        }
        if (!(cq00Var2 instanceof cq00) || z6 || gxs0Var14.e) {
            cq00Var = cq00Var2;
            if (z2) {
            }
            it = list2.iterator();
            i5 = 0;
            while (true) {
                if (it.hasNext()) {
                    i5 = -1;
                    break;
                }
                jxs0Var2 = (jxs0) it.next();
                if (jxs0Var2 instanceof gxs0) {
                    gxs0Var4 = (gxs0) jxs0Var2;
                } else {
                    gxs0Var4 = null;
                }
                if (gxs0Var4 != null) {
                    str2 = gxs0Var4.a;
                } else {
                    str2 = null;
                }
                if (u890.j(str2, gxs0Var14.a)) {
                    break;
                }
                i5++;
            }
            it2 = list2.iterator();
            i6 = 0;
            while (true) {
                if (it2.hasNext()) {
                    i6 = -1;
                    break;
                }
                jxs0Var = (jxs0) it2.next();
                if (jxs0Var instanceof gxs0) {
                    gxs0Var3 = (gxs0) jxs0Var;
                } else {
                    gxs0Var3 = null;
                }
                if (gxs0Var3 != null) {
                    uri2 = gxs0Var3.c.getUri();
                } else {
                    uri2 = null;
                }
                if (u890.j(uri2, xl81Var3.getUri())) {
                    break;
                }
                i6++;
            }
            i7 = i6 - i5;
            if ((cq00Var instanceof qpl) || !((qpl) cq00Var).t) {
                linkedHashSet3.add(new czl(str3, gxs0Var14, i7));
            } else {
                linkedHashSet3.add(new yyl(str3, gxs0Var14, i7, uzlVar.c));
            }
            arrayList2 = new ArrayList(q7h.U(arrayList12, 10));
            for (?? A3 : arrayList12) {
                if (linkedHashSet3.isEmpty()) {
                    it6 = linkedHashSet3.iterator();
                    while (it6.hasNext()) {
                        if (((kzl) it6.next()) instanceof azl) {
                            if (A3 instanceof gxs0) {
                                gxs0Var2 = (gxs0) A3;
                            } else {
                                gxs0Var2 = null;
                            }
                            if (gxs0Var2 != null) {
                                uri = gxs0Var2.c.getUri();
                            } else {
                                uri = null;
                            }
                            if (u890.j(uri, xl81Var3.getUri())) {
                                break;
                            }
                            A3 = gxs0.a((gxs0) A3, false, null, z4, 63);
                            break;
                        }
                        z4 = true;
                    }
                }
                arrayList2.add(A3);
                z4 = true;
            }
            collectionN0 = ro41Var.t;
            txs0VarM = wpo1.m(ro41Var);
            if (txs0VarM == null) {
                arrayList3 = collectionN0;
            } else {
                it3 = list.iterator();
                i8 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    if (u890.j(((txs0) it3.next()).b, txs0VarM.b)) {
                        break;
                    }
                    i8++;
                }
                if (i8 == 0) {
                    List<String> list10 = gxs0Var14.f;
                    SingletonList = new ArrayList();
                    for (String str9 : list10) {
                        it5 = list.iterator();
                        do {
                            if (it5.hasNext()) {
                                next6 = null;
                                break;
                            }
                            next6 = it5.next();
                        } while (!u890.j(((txs0) next6).b, str9));
                        txs0Var = (txs0) next6;
                        if (txs0Var != null) {
                            SingletonList.add(txs0Var);
                        }
                    }
                } else {
                    SingletonList = Collections.singletonList(txs0VarM);
                }
                if (z6) {
                    arrayList3 = new ArrayList(collectionN0);
                    for (txs0 txs0Var4 : (Iterable) SingletonList) {
                        it4 = arrayList3.iterator();
                        i9 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                i9 = -1;
                                break;
                            }
                            if (u890.j(((txs0) it4.next()).b, txs0Var4.b)) {
                                break;
                            }
                            i9++;
                        }
                        numValueOf2 = Integer.valueOf(i9);
                        if (i9 == -1) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            arrayList3.remove(numValueOf2.intValue());
                        }
                    }
                } else {
                    collectionN0 = o7h.N0((Iterable) SingletonList, collectionN0);
                    arrayList3 = collectionN0;
                }
            }
            ro41 ro41VarA = ro41.a(ro41Var, arrayList2, null, arrayList3, numValueOf8, false, 13819);
            linkedHashSet3.add(new wyl(wpo1.o(ro41VarA), wpo1.p(ro41VarA)));
            return Next.i(ro41VarA, linkedHashSet3);
        }
        if (gxs0Var17.g) {
            cq00Var = cq00Var2;
        } else {
            boolean z7 = !z2;
            txs0 txs0VarM2 = wpo1.m(ro41Var);
            String str10 = txs0VarM2 != null ? txs0VarM2.b : null;
            ArrayList arrayList13 = new ArrayList();
            for (jxs0 jxs0Var15 : list9) {
                String uri3 = jxs0Var15 instanceof gxs0 ? ((gxs0) jxs0Var15).c.getUri() : null;
                if (uri3 != null) {
                    arrayList13.add(uri3);
                }
            }
            cq00 cq00Var3 = cq00Var2;
            azl azlVar = new azl(cq00Var2, z7, str10, arrayList13, cq00Var3.T(), cq00Var3.n0());
            cq00Var = cq00Var2;
            linkedHashSet3.add(azlVar);
        }
        numValueOf8 = null;
        it = list2.iterator();
        i5 = 0;
        while (true) {
            if (it.hasNext()) {
                i5 = -1;
                break;
            }
            jxs0Var2 = (jxs0) it.next();
            if (jxs0Var2 instanceof gxs0) {
                gxs0Var4 = (gxs0) jxs0Var2;
            } else {
                gxs0Var4 = null;
            }
            if (gxs0Var4 != null) {
                str2 = gxs0Var4.a;
            } else {
                str2 = null;
            }
            if (u890.j(str2, gxs0Var14.a)) {
                break;
                break;
            }
            i5++;
        }
        it2 = list2.iterator();
        i6 = 0;
        while (true) {
            if (it2.hasNext()) {
                i6 = -1;
                break;
            }
            jxs0Var = (jxs0) it2.next();
            if (jxs0Var instanceof gxs0) {
                gxs0Var3 = (gxs0) jxs0Var;
            } else {
                gxs0Var3 = null;
            }
            if (gxs0Var3 != null) {
                uri2 = gxs0Var3.c.getUri();
            } else {
                uri2 = null;
            }
            if (u890.j(uri2, xl81Var3.getUri())) {
                break;
                break;
            }
            i6++;
        }
        i7 = i6 - i5;
        if (cq00Var instanceof qpl) {
            linkedHashSet3.add(new czl(str3, gxs0Var14, i7));
        } else {
            linkedHashSet3.add(new czl(str3, gxs0Var14, i7));
        }
        arrayList2 = new ArrayList(q7h.U(arrayList12, 10));
        while (r2.hasNext()) {
            if (linkedHashSet3.isEmpty()) {
                it6 = linkedHashSet3.iterator();
                while (it6.hasNext()) {
                    if (((kzl) it6.next()) instanceof azl) {
                        if (A3 instanceof gxs0) {
                            gxs0Var2 = (gxs0) A3;
                        } else {
                            gxs0Var2 = null;
                        }
                        if (gxs0Var2 != null) {
                            uri = gxs0Var2.c.getUri();
                        } else {
                            uri = null;
                        }
                        if (u890.j(uri, xl81Var3.getUri())) {
                            break;
                            break;
                        }
                        A3 = gxs0.a((gxs0) A3, false, null, z4, 63);
                        break;
                        break;
                    }
                    z4 = true;
                }
            }
            arrayList2.add(A3);
            z4 = true;
        }
        collectionN0 = ro41Var.t;
        txs0VarM = wpo1.m(ro41Var);
        if (txs0VarM == null) {
            arrayList3 = collectionN0;
        } else {
            it3 = list.iterator();
            i8 = 0;
            while (true) {
                if (it3.hasNext()) {
                    i8 = -1;
                    break;
                }
                if (u890.j(((txs0) it3.next()).b, txs0VarM.b)) {
                    break;
                    break;
                }
                i8++;
            }
            if (i8 == 0) {
                List<String> list11 = gxs0Var14.f;
                SingletonList = new ArrayList();
                while (r3.hasNext()) {
                    it5 = list.iterator();
                    do {
                        if (it5.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it5.next();
                    } while (!u890.j(((txs0) next6).b, str9));
                    txs0Var = (txs0) next6;
                    if (txs0Var != null) {
                        SingletonList.add(txs0Var);
                    }
                }
            } else {
                SingletonList = Collections.singletonList(txs0VarM);
            }
            if (z6) {
                arrayList3 = new ArrayList(collectionN0);
                while (r2.hasNext()) {
                    it4 = arrayList3.iterator();
                    i9 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            i9 = -1;
                            break;
                        }
                        if (u890.j(((txs0) it4.next()).b, txs0Var4.b)) {
                            break;
                            break;
                        }
                        i9++;
                    }
                    numValueOf2 = Integer.valueOf(i9);
                    if (i9 == -1) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        arrayList3.remove(numValueOf2.intValue());
                    }
                }
            } else {
                collectionN0 = o7h.N0((Iterable) SingletonList, collectionN0);
                arrayList3 = collectionN0;
            }
        }
        ro41 ro41VarA2 = ro41.a(ro41Var, arrayList2, null, arrayList3, numValueOf8, false, 13819);
        linkedHashSet3.add(new wyl(wpo1.o(ro41VarA2), wpo1.p(ro41VarA2)));
        return Next.i(ro41VarA2, linkedHashSet3);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                hi accessory = ((AccessoryStateManager.Event) obj).getAccessory();
                accessory.getClass();
                return accessory;
            case 2:
                return Boolean.valueOf(((l62) obj).Z instanceof lsn);
            case 3:
            case 4:
            case 11:
            case 13:
            case 16:
            case 17:
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 23:
            case 24:
            default:
                return ((GetEntityResponse) obj).n().n().getName();
            case 5:
                return ((u04) obj).a;
            case 6:
                return Integer.valueOf(((yw4) obj).a);
            case 7:
                Logger.e((Throwable) obj, "Assisted Curation Artist Loader failed.", new Object[0]);
                return Single.just(as6.a);
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                b1f1 b1f1Var = (b1f1) obj;
                if (b1f1Var instanceof a1f1) {
                    return new im70(((a1f1) b1f1Var).a.a);
                }
                if (b1f1Var instanceof z0f1) {
                    Logger.d("Failed to fetch id token. Response: %s", new Object[]{b1f1Var});
                    return new hm70(b1f1Var.toString());
                }
                eg.o();
                return null;
            case 10:
                return new t49(((Boolean) obj).booleanValue());
            case 12:
                return Boolean.valueOf(((r560) obj) == r560.a);
            case 14:
                return new c5e((List) obj);
            case 15:
                return new elg(503, "Received an error while retrieving client token");
            case 20:
                return new pf7((sd7) obj);
            case 21:
                return new h7h(true, ((Boolean) obj).booleanValue());
            case 22:
                Boolean bool = (Boolean) o7h.s0(((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 25:
                return new tou((PlayerState) obj);
            case 26:
                return Boolean.valueOf(((s0w) obj).w);
        }
    }

    public void f(int i2, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2101003086);
        int i3 = (x340Var.g(this) ? 32 : 16) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            j2iVar.invoke(x340Var, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(this, j2iVar, i2, (byte) 3);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 4:
                return new d03(xkg0Var, str2, str);
            default:
                return new uvm(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        boolean zBooleanValue;
        switch (this.a) {
            case 3:
                return ((mmr0) obj).a == null;
            case 13:
                List list = (List) obj;
                return list.size() == 2 && !((Boolean) list.get(0)).booleanValue() && ((Boolean) list.get(1)).booleanValue();
            case 24:
                return ((Number) obj).doubleValue() >= 0.0d;
            case 28:
                zBooleanValue = ((uv00) obj).f;
                break;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                return sqg0.O((Map) obj, (Map) obj2);
            default:
                return new hry0((kpy0) obj, (k8f0) obj2);
        }
    }
}
