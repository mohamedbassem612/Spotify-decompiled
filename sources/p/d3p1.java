package p;

import android.net.Uri;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.kodiak.dataloader.statement.DataStatementCrashContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d3p1 {
    public static b180 a;
    public static b180 b;

    public static void A() {
        jx0 jx0Var = jx0.b;
    }

    public static final go80 B(klm klmVar, rbp0 rbp0Var, vbp0 vbp0Var) {
        return klmVar.a("RemoteConfigAuthFetchTriggerDaemon", new ocp0(rbp0Var, vbp0Var, (byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r10 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(p.dg8 r7, p.q59 r8, int r9, p.onm r10) {
        /*
            boolean r0 = r10 instanceof p.do9
            if (r0 == 0) goto L13
            r0 = r10
            p.do9 r0 = (p.do9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.do9 r0 = new p.do9
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            java.util.List r7 = r0.b
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            goto L97
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L35:
            int r9 = r0.c
            p.q59 r8 = r0.a
            p.hm5.M(r10)
            goto L4d
        L3d:
            p.hm5.M(r10)
            r0.a = r8
            r0.c = r9
            r0.e = r3
            java.io.Serializable r10 = r7.p(r9, r0)
            if (r10 != r5) goto L4d
            goto L96
        L4d:
            r7 = r10
            java.util.List r7 = (java.util.List) r7
            int r10 = r7.size()
            if (r10 < r9) goto L57
            return r7
        L57:
            int r10 = r7.size()
            int r10 = r9 - r10
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = p.q7h.U(r1, r6)
            r3.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L6f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r1.next()
            p.ao9 r6 = (p.ao9) r6
            java.lang.String r6 = r6.a
            r3.add(r6)
            goto L6f
        L81:
            java.util.Set r1 = p.o7h.p1(r3)
            r0.a = r4     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            r3 = r7
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            r0.b = r3     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            r0.c = r9     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            r0.e = r2     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            java.lang.Object r10 = r8.k(r10, r1, r0)     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L9a java.util.concurrent.CancellationException -> La5
            goto L9c
        L9a:
            p.z6x r10 = p.z6x.a
        L9c:
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = p.o7h.N0(r10, r7)
            return r7
        La5:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d3p1.C(p.dg8, p.q59, int, p.onm):java.lang.Object");
    }

    public static void D(c8e1 c8e1Var, uu0 uu0Var, y9e1 y9e1Var, elb0 elb0Var, c9e1 c9e1Var, boolean z, hyp0 hyp0Var) {
        n511 n511VarB;
        if (z) {
            int iO = hyp0Var.o(nbe1.f(c8e1Var.b));
            String str = e5e1.a;
            if (iO < y9e1Var.a.a.b.length()) {
                n511VarB = y9e1Var.b(iO);
            } else {
                n511VarB = iO != 0 ? y9e1Var.b(iO - 1) : new n511(0.0f, 0.0f, 1.0f, (int) (e5e1.a((lee1) uu0Var.c, (wat) uu0Var.d, (f930) uu0Var.e) & 4294967295L));
            }
            float f = n511VarB.b;
            float f2 = n511VarB.a;
            long jO = elb0Var.O((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            n511 n511VarG = anm1.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jO & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jO >> 32)))) << 32), (((long) Float.floatToRawIntBits(n511VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(n511VarB.d - f)) & 4294967295L));
            if (u890.j((c9e1) c9e1Var.a.b.get(), c9e1Var)) {
                c9e1Var.b.f(n511VarG);
            }
        }
    }

    public static final y8n E(d0r d0rVar, o3r o3rVar, Object obj) {
        y8n y8nVarS = qmo1.s(o6x.a, 5000L, new r0r(d0rVar, o3rVar, obj, (lnm) null, (byte) 0));
        j1r j1rVarN = x2p1.n(d0rVar, o3rVar, obj);
        j1rVarN.getClass();
        j1r j1rVar = j1rVarN instanceof h1r ? null : j1rVarN;
        if (j1rVar == null) {
            j1rVar = j1r.a;
        }
        if (q26.e().a.c()) {
            y8nVarS.m(j1rVar);
            return y8nVarS;
        }
        y8nVarS.j(j1rVar);
        return y8nVarS;
    }

    public static final ay8 F(d0r d0rVar, o3r o3rVar, Object obj) {
        n4r n4rVarA = o3rVar.a(obj);
        j1r j1rVarB = d0rVar.b(n4rVarA);
        j1rVarB.getClass();
        if (j1rVarB instanceof h1r) {
            j1rVarB = null;
        }
        if (j1rVarB == null) {
            j1rVarB = j1r.a;
        }
        return yzo1.j(j1rVarB, new swn(d0rVar, n4rVarA, (lnm) null, (byte) 2));
    }

    public static final ay8 G(d0r d0rVar, f4r f4rVar, Object obj) {
        f1r f1rVarA = f4rVar.a(obj);
        j1r j1rVarB = d0rVar.b(f1rVarA);
        j1rVarB.getClass();
        if (j1rVarB instanceof h1r) {
            j1rVarB = null;
        }
        if (j1rVarB == null) {
            j1rVarB = j1r.a;
        }
        return yzo1.j(j1rVarB, new swn(d0rVar, f1rVarA, (lnm) null, (byte) 3));
    }

    public static final ay8 H(d0r d0rVar, o3r o3rVar, Object obj) {
        n4r n4rVarA = o3rVar.a(obj);
        try {
            Object objK = u890.k(d0rVar.b(n4rVarA), d0rVar, n4rVarA);
            q8n q8nVarI = d0rVar.i();
            return new ay8(gio1.b(objK), ygn0.a(), new AtomicInteger(0), new p811(), new el0(d0rVar, n4rVarA, o3rVar, (lnm) null, (byte) 20), q8nVarI);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            j2h1.h(th, new DataStatementCrashContext("DataStatement: " + o3rVar));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    public static final aob1 I(ea10 ea10Var, hv70 hv70Var, boolean z, boolean z2, boolean z3) {
        boolean z4;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        String str;
        goj0 goj0VarA3;
        jo70 jo70Var;
        String str2;
        goj0 goj0VarA4;
        w281 w281Var;
        u281 u281Var;
        hoj0 hoj0VarC;
        goj0 goj0VarA5;
        l98 l98Var;
        hv70 hv70Var2 = hv70Var;
        List list = hv70Var2.c;
        x360 x360Var = hv70Var2.b;
        String str3 = hv70Var2.a;
        ioj0 ioj0Var = ea10Var.a;
        if (ioj0Var == null) {
            return new wmb1(str3, x360Var);
        }
        List<String> list2 = list;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list2) {
            hoj0 hoj0VarC2 = ioj0Var.c(gw81.class, (String) obj);
            if (hoj0VarC2 != null ? hoj0VarC2 instanceof goj0 : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (String str4 : arrayList) {
            ArrayList arrayList3 = (!z2 || (hoj0VarC = ioj0Var.c(l98.class, str4)) == null || (goj0VarA5 = hoj0VarC.a()) == null || (l98Var = (l98) goj0VarA5.a) == null) ? null : l98Var.a;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                str2 = ((k98) o7h.q0(arrayList3)).a;
            } else if (z) {
                hoj0 hoj0VarC3 = ioj0Var.c(w281.class, str4);
                String str5 = (hoj0VarC3 == null || (goj0VarA4 = hoj0VarC3.a()) == null || (w281Var = (w281) goj0VarA4.a) == null || (u281Var = w281Var.g) == null) ? null : u281Var.a;
                if (str5 == null) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
            } else {
                str2 = "";
            }
            arrayList2.add(str2);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hoj0 hoj0VarC4 = ioj0Var.c(jo70.class, (String) it.next());
            if (hoj0VarC4 == null || (goj0VarA3 = hoj0VarC4.a()) == null || (jo70Var = (jo70) goj0VarA3.a) == null || (str = jo70Var.b) == null) {
                str = "";
            }
            arrayList4.add(str);
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList, 10));
        for (String str6 : arrayList) {
            Set set = alk1.a;
            arrayList5.add(qyo1.A(ihc1.Y0(str6, '?'), ioj0Var));
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList6 = new ArrayList(q7h.U(list2, 10));
            for (String str7 : list2) {
                arrayList6.add(new lv70(str3));
            }
            return new pmb1(str3, arrayList6, x360Var);
        }
        int i = 1;
        boolean z5 = o7h.j0(arrayList4).size() > 1;
        ArrayList arrayList7 = new ArrayList(q7h.U(arrayList, 10));
        int i2 = 0;
        for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            String str8 = (String) next;
            if (z3) {
                hoj0 hoj0VarC5 = ioj0Var.c(m1b1.class, str8);
                if (lnn1.l((hoj0VarC5 == null || (goj0VarA2 = hoj0VarC5.a()) == null) ? null : (m1b1) goj0VarA2.a)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            hoj0 hoj0VarC6 = ioj0Var.c(gw81.class, str8);
            ez00 ez00Var = (hoj0VarC6 == null || (goj0VarA = hoj0VarC6.a()) == null) ? null : (ez00) goj0VarA.a;
            if (ez00Var == null) {
                hhg1.f(f4i1.f(gw81.class.getSimpleName(), " not found for uri: ", str8));
                return null;
            }
            gw81 gw81Var = (gw81) ez00Var;
            String str9 = gw81Var.d;
            String strY0 = (String) (z5 ? arrayList4.get(i2) : arrayList2.get(i2));
            String str10 = (String) arrayList5.get(i2);
            boolean z6 = z5;
            boolean z7 = hv70Var2.e;
            n1x n1xVar = hv70Var2.f;
            ArrayList arrayList8 = arrayList5;
            String str11 = gw81Var.c;
            String str12 = gw81Var.b;
            if (strY0.length() == 0) {
                strY0 = o7h.y0(gw81Var.f, " • ", (String) null, (String) null, vu70.S0, 30);
            }
            Set set2 = s4b1.f;
            ArrayList arrayList9 = arrayList4;
            int i4 = i2;
            xt70 xt70Var = new xt70(Collections.singletonList(new j47(uic.g(str9, blc0.u1) ? new l07(new g07(str10), false) : new e17(new g07(str10, yz6.d)), x47.a)), (m87) null);
            String str13 = gw81Var.h;
            String str14 = (130816 & 256) != 0 ? "" : null;
            String str15 = (130816 & 512) != 0 ? "" : null;
            boolean z8 = (130816 & 131072) != 0 ? false : z7;
            n1x n1xVar2 = (130816 & 262144) != 0 ? null : n1xVar;
            ArrayList arrayList10 = arrayList7;
            arrayList10.add(new jv70(new aw70(i4, str8, str12, str11, strY0, xt70Var, str13, str9, str14, str15, (m9m) null, false, false, false, false, (Integer) null, (bu70) null, z8, n1xVar2, z4), str3));
            hv70Var2 = hv70Var;
            arrayList7 = arrayList10;
            arrayList4 = arrayList9;
            arrayList5 = arrayList8;
            i = 1;
            i2 = i3;
            ioj0Var = ioj0Var;
            z5 = z6;
        }
        int i5 = i;
        ArrayList<mv70> arrayList11 = arrayList7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mv70 mv70Var : arrayList11) {
            if (mv70Var instanceof jv70) {
                aw70 aw70Var = ((jv70) mv70Var).a;
                linkedHashMap.put(aw70Var.b, ero1.h(aw70Var.e, aw70Var.c, aw70Var.d, aw70Var.t));
            } else if (mv70Var instanceof mv70) {
                aw70 aw70Var2 = mv70Var.a;
                linkedHashMap.put(aw70Var2.b, ero1.h(aw70Var2.e, aw70Var2.c, aw70Var2.d, aw70Var2.t));
            } else {
                n57.s("Trying to calculate max lines of an unsupported ImageLinkElementSize: " + mv70Var);
            }
        }
        Iterator it3 = linkedHashMap.values().iterator();
        if (!it3.hasNext()) {
            hhg1.k();
            return null;
        }
        int iA = ((bu70) it3.next()).a();
        while (it3.hasNext()) {
            int iA2 = ((bu70) it3.next()).a();
            if (iA < iA2) {
                iA = iA2;
            }
        }
        bu70 bu70Var = new bu70(0, i5, 2);
        ArrayList arrayList12 = new ArrayList(q7h.U(arrayList11, 10));
        Iterator it4 = arrayList11.iterator();
        while (it4.hasNext()) {
            jv70 jv70Var = (ov70) it4.next();
            if (jv70Var instanceof jv70) {
                jv70 jv70Var2 = jv70Var;
                aw70 aw70Var3 = jv70Var2.a;
                aw70 aw70VarA = aw70.a(aw70Var3, Integer.valueOf(iA), (bu70) null, 1015807);
                bu70 bu70Var2 = (bu70) linkedHashMap.get(aw70Var3.b);
                if (bu70Var2 == null) {
                    bu70Var2 = bu70Var;
                }
                jv70Var = new jv70(aw70.a(aw70VarA, (Integer) null, bu70Var2, 983039), jv70Var2.b);
            }
            arrayList12.add(jv70Var);
        }
        return new kmb1(str3, arrayList12, x360Var);
    }

    public static final long J(fjk1 fjk1Var, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fjk1Var.a().a;
        float f = fjk1Var.c;
        return (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) - fjk1Var.a().b) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x024a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0251  */
    /* JADX WARN: Code duplicated, block: B:119:0x025a  */
    /* JADX WARN: Code duplicated, block: B:120:0x025c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x025f  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        if (r12 < (r9 != null ? r9.longValue() : r12)) goto L124;
     */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(p.f0e0 r26, p.lb50 r27, p.yqg r28, p.iu30 r29, p.j2i r30, p.j2i r31, p.qim0 r32, p.b0k r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d3p1.a(p.f0e0, p.lb50, p.yqg, p.iu30, p.j2i, p.j2i, p.qim0, p.b0k, int):void");
    }

    public static final void b(lb50 lb50Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-529176008);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lb50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new iwd0(lb50Var, (byte) 0);
                x340Var.s0(objT);
            }
            qim0Var2 = nim0.a;
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, qim0Var2, null, null, null, false, null, null, lwi.e, x340Var, (i3 << 3) & 896, 6, 1016);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(lb50Var, qim0Var2, i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(k0e0 k0e0Var, yle1 yle1Var, lb50 lb50Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1293238323);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(k0e0Var) : x340Var.i(k0e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(yle1Var) : x340Var.i(yle1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(lb50Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (k0e0Var instanceof j0e0) {
                x340Var.i0(-1556470448);
                if (yle1Var instanceof xle1) {
                    x340Var.i0(-1005905035);
                    j0e0 j0e0Var = (j0e0) k0e0Var;
                    int i4 = i3 << 9;
                    i(j0e0Var.a, j0e0Var.b, 1, j0e0Var.e, true, lb50Var, x340Var, (458752 & i4) | 24960 | (i4 & 3670016));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1005583255);
                    j0e0 j0e0Var2 = (j0e0) k0e0Var;
                    t(j0e0Var2.d, 64512 & (i3 << 3), j0e0Var2.a, j0e0Var2.c, x340Var, lb50Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (k0e0Var instanceof i0e0) {
                x340Var.i0(-1556448342);
                i0e0 i0e0Var = (i0e0) k0e0Var;
                i(i0e0Var.a, i0e0Var.b, i0e0Var.c, i0e0Var.d, yle1Var instanceof xle1, lb50Var, x340Var, (i3 << 9) & 4128768);
                x340Var.r(false);
            } else {
                if (!(k0e0Var instanceof h0e0)) {
                    throw p3d1.k(x340Var, -1556472375, false);
                }
                x340Var.i0(-1556435535);
                e(((h0e0) k0e0Var).a, lb50Var, x340Var, (i3 >> 3) & 1008);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, k0e0Var, yle1Var, lb50Var, qim0Var2, (byte) 14);
        }
    }

    public static final void d(int i, Function0 function0, yf yfVar, hux huxVar, max maxVar, b0k b0kVar, int i2, int i3) {
        int i4;
        yf yfVar2;
        max maxVar2;
        b0k b0kVar2;
        yf yfVar3;
        max maxVar3;
        vu30 vu30Var;
        hux huxVar2 = huxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(758528817);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.h(false) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                yfVar2 = yfVar;
                int i5 = b0kVar3.i(yfVar2) ? 2048 : 1024;
                i4 |= i5;
            } else {
                yfVar2 = yfVar;
            }
            i4 |= i5;
        } else {
            yfVar2 = yfVar;
        }
        int i6 = i4 | 24576;
        int i7 = i3 & 32;
        if (i7 != 0) {
            i6 = 221184 | i4;
        } else if ((196608 & i2) == 0) {
            i6 |= (262144 & i2) == 0 ? b0kVar3.g(huxVar2) : b0kVar3.i(huxVar2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                maxVar2 = maxVar;
                int i8 = b0kVar3.i(maxVar2) ? 1048576 : 524288;
                i6 |= i8;
            } else {
                maxVar2 = maxVar;
            }
            i6 |= i8;
        } else {
            maxVar2 = maxVar;
        }
        if (b0kVar3.Y(i6 & 1, (599187 & i6) != 599186)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                if ((i3 & 8) != 0) {
                    yfVar2 = jdx.c;
                    i6 &= -7169;
                }
                if (i7 != 0) {
                    huxVar2 = null;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    maxVar2 = jax.a;
                }
            } else {
                b0kVar3.b0();
                if ((i3 & 8) != 0) {
                    i6 &= -7169;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                }
            }
            max maxVar4 = maxVar2;
            int i9 = i6;
            yf yfVar4 = yfVar2;
            b0kVar3.s();
            gbx gbxVar = new gbx(z50.c, function0);
            gdx gdxVarS = yla.s(b0kVar3);
            b0kVar3.i0(1509740492);
            b0kVar3.r(false);
            if (huxVar2 != null) {
                b0kVar3.i0(1509800168);
                vu30 vu30VarR = apo.r(24095509, new f90(huxVar2, (byte) 13), b0kVar3);
                b0kVar3.r(false);
                vu30Var = vu30VarR;
            } else {
                b0kVar3.i0(1509876396);
                b0kVar3.r(false);
                vu30Var = null;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, yfVar4, null, maxVar4, gdxVarS, null, null, null, null, vu30Var, apo.r(1199339056, new vx1(i, (byte) 24), b0kVar3), b0kVar2, (i9 >> 6) & 57456, 48, 460);
            yfVar3 = yfVar4;
            maxVar3 = maxVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            yfVar3 = yfVar2;
            maxVar3 = maxVar2;
        }
        hux huxVar3 = huxVar2;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kih(i, function0, yfVar3, huxVar3, maxVar3, i2, i3);
        }
    }

    public static final void e(String str, lb50 lb50Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-984040531);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lb50Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 6.0f, 0.0f, 16.0f, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            r(str, lb50Var, null, x340Var, i2 & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(str, lb50Var, i);
        }
    }

    public static final void f(Object obj, String str, n511 n511Var, tyq tyqVar, iu30 iu30Var, fjk1 fjk1Var, ur80 ur80Var, float f, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        Object wzdVar;
        ven0 ven0Var;
        int i2;
        Object obj2 = obj;
        float f2 = n511Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1837457243);
        int i3 = i | (x340Var2.g(obj2) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.i(n511Var) ? 256 : 128) | (x340Var2.i(tyqVar) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.g(fjk1Var) ? 131072 : 65536) | (x340Var2.i(ur80Var) ? 1048576 : 524288);
        int i4 = 6 | (x340Var2.d(f) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(function1) ? 16384 : 8192);
        if (x340Var2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            wat watVar = (wat) x340Var2.k(t4k.h);
            float fX0 = watVar.X0(80.0f);
            if (z) {
                jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (n511Var.f() >> 32)));
                iFloatToRawIntBits = Float.floatToRawIntBits(f2);
            } else {
                float f3 = f2 + fX0;
                jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (n511Var.f() >> 32)));
                iFloatToRawIntBits = Float.floatToRawIntBits(f3);
            }
            long J = J(fjk1Var, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L));
            long jU = (((long) (jch0.U(Float.intBitsToFloat((int) (J >> 32))) + ur80Var.a)) << 32) | (((long) (jch0.U(Float.intBitsToFloat((int) (J & 4294967295L))) + ur80Var.b)) & 4294967295L);
            int iI0 = watVar.i0(32.0f);
            int iI1 = watVar.i0(6.0f);
            int iD = ur80Var.d() - (iI0 * 2);
            int iI2 = watVar.i0(440.0f);
            if (iI2 <= iD) {
                iD = iI2;
            }
            float fM0 = watVar.M0(iD);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.o(0.0f, x340Var2);
            }
            ven0 ven0Var2 = (ven0) objT;
            boolean zF = x340Var2.f(jU) | x340Var2.e(iI0) | x340Var2.e(iI1) | x340Var2.g(ur80Var) | ((i4 & 896) == 256) | x340Var2.g(watVar);
            Object objT2 = x340Var2.T();
            if (zF || objT2 == m4cVar) {
                ven0Var = ven0Var2;
                i2 = 4;
                wzdVar = new wzd(jU, iI1, iI0, ur80Var, z, watVar, ven0Var);
                x340Var2.s0(wzdVar);
            } else {
                wzdVar = objT2;
                ven0Var = ven0Var2;
                i2 = 4;
            }
            wzd wzdVar2 = (wzd) wzdVar;
            boolean z2 = ((i3 & 14) == i2) | ((i3 & 112) == 32);
            Object objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                obj2 = obj;
                objT3 = iu30Var.invoke(obj2);
                x340Var2.s0(objT3);
            } else {
                obj2 = obj;
            }
            Object obj3 = objT3;
            sy4.a(wzdVar2, function0, new nfv0(17, false, true, true), apo.r(839830979, new myg(fM0, f, function0, ven0Var, z, function1, tyqVar, obj3, wpb1.C(str, tyqVar, obj3, x340Var2, ((i3 >> 3) & 14) | ((i3 >> 6) & 112), 8)), x340Var2), x340Var2, ((i4 >> 6) & 112) | 3072, 0);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nyg(obj2, str, n511Var, tyqVar, iu30Var, fjk1Var, ur80Var, f, z, function0, function1, i);
        }
    }

    public static final void g(wx60 wx60Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-821689948);
        int i2 = i | (x340Var.g(wx60Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = god0.Q0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            if (ihc1.y0(wx60Var.e)) {
                x340Var.i0(-1946369180);
            } else {
                x340Var.i0(-1946335452);
                pm31 pm31Var = new pm31(0);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new jwd0(iu30Var, wx60Var, (byte) 0);
                    x340Var.s0(objT2);
                }
                qim0VarB = bin.x(qim0VarB, false, null, pm31Var, null, (Function0) objT2, 11);
            }
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ArrayList<vx60> arrayList = wx60Var.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (vx60 vx60Var : arrayList) {
                arrayList2.add(new phx(10, 0L, vx60Var.a, (String) null, vx60Var.b));
            }
            fc11.a(mqo1.A(arrayList2), (qim0) null, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 506);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0.a, 8.0f));
            boolean z2 = wx60Var.c;
            int i3 = wx60Var.d;
            String str = wx60Var.b;
            String str2 = z2 ? "{icon}" : "";
            String strF = f4i1.f("\u0000", str, "\u0000");
            if (i3 > 0) {
                x340Var.i0(374042549);
                strN0 = cwl1.U(2131820738, i3, new Object[]{strF, str2, Integer.valueOf(i3)}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(374246343);
                strN0 = cwl1.n0(2131957598, new Object[]{strF, str2}, x340Var);
                x340Var.r(false);
            }
            zma1 zma1VarA = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            List listQ0 = ihc1.Q0(strN0, new String[]{"{icon}"}, 2, 2);
            ye5 ye5Var = new ye5();
            v(ye5Var, (String) listQ0.get(0), str, zma1VarA);
            if (listQ0.size() > 1) {
                ye5Var.g(" ");
                z6p1.r(ye5Var, "verified_icon", "[verified]");
                ye5Var.g((String) listQ0.get(1));
            }
            af5 af5VarP = ye5Var.p();
            long j = cbx.a(x340Var).b.b;
            cjc0 cjc0Var = new cjc0(1);
            long j2 = lee1Var.a.b;
            uwo1.d(af5VarP, j, null, lee1Var, null, null, 2, false, cjc0Var, 0, null, mqo1.t(new mmr0("verified_icon", new gh80(new d6t0(4, j2, j2), lwi.a))), x340Var, 0, 0, 1716);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(wx60Var, iu30Var, qim0Var, i, (byte) 28);
        }
    }

    public static final void h(int i, String str, b0k b0kVar, max maxVar, lb50 lb50Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1999250513);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(maxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(lb50Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kwd0(lb50Var, str, (byte) 0);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(6), null, maxVar, yla.s(x340Var), null, null, null, null, lwi.b, lwi.c, x340Var, (i2 << 9) & 57344, 54, 972);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwd0(str, maxVar, lb50Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(String str, String str2, int i, o0e0 o0e0Var, boolean z, lb50 lb50Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        hax haxVar;
        boolean z2;
        String str3 = str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(309063537);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? x340Var.g(o0e0Var) : x340Var.i(o0e0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(lb50Var) ? 131072 : 65536;
        }
        int i4 = 1572864 & i2;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var.i(nim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            hax haxVar2 = jax.a;
            if (z) {
                x340Var.i0(-1097707352);
                haxVar = new hax(cwl1.o0(x340Var, 2131957606));
                x340Var.r(false);
            } else {
                x340Var.i0(-1097599441);
                x340Var.r(false);
                haxVar = haxVar2;
            }
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 6.0f, 0.0f, 16.0f, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            int i5 = (i3 >> 12) & 112;
            int i6 = i3;
            r(str, lb50Var, null, x340Var, (i3 & 14) | i5);
            op71.g(x340Var, new wnb0(1.0f, true));
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (o0e0Var instanceof n0e0) {
                x340Var.i0(269954952);
                n0e0 n0e0Var = (n0e0) o0e0Var;
                String str4 = n0e0Var.a;
                if (z) {
                    x340Var.i0(1948375309);
                    z2 = false;
                    x340Var.r(false);
                    haxVar2 = haxVar;
                } else {
                    z2 = false;
                    if (n0e0Var.b) {
                        x340Var.i0(1948382797);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1948378383);
                        haxVar2 = new hax(cwl1.o0(x340Var, 2131957570));
                        x340Var.r(false);
                    }
                }
                h((i6 >> 9) & 896, str4, x340Var, haxVar2, lb50Var);
                x340Var.r(z2);
            } else {
                x340Var.i0(270417193);
                x340Var.r(false);
            }
            int iC = l1d.C(i);
            if (iC == 0) {
                str3 = str2;
                x340Var.i0(1948393649);
                m(((i6 >> 3) & 14) | i5, str3, x340Var, haxVar, lb50Var);
                x340Var.r(false);
            } else if (iC == 1) {
                str3 = str2;
                x340Var.i0(1948399410);
                k(((i6 >> 3) & 14) | i5, str3, x340Var, haxVar, lb50Var);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1948386584, false);
                }
                x340Var.i0(1948387859);
                str3 = str2;
                yap1.b(str3, lb50Var, haxVar, null, x340Var, ((i6 >> 3) & 14) | i5);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lkf(str, str3, i, o0e0Var, z, lb50Var, i2);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        af5 af5Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1310610749);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zma1 zma1VarA = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            int iW0 = ihc1.w0(str, "\u0000", 0, false, 6);
            int iW1 = iW0 >= 0 ? ihc1.w0(str, "\u0000", iW0 + 1, false, 4) : -1;
            if (iW0 < 0 || iW1 <= iW0) {
                af5Var = new af5(nhc1.W(str, "\u0000", ""));
            } else {
                String strSubstring = str.substring(iW0 + 1, iW1);
                ye5 ye5Var = new ye5();
                v(ye5Var, str, strSubstring, zma1VarA);
                af5Var = ye5Var.p();
            }
            uwo1.d(af5Var, cbx.a(x340Var).b.a, qim0Var, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, (i2 << 3) & 896, 0, 4080);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 7);
        }
    }

    public static final void k(int i, String str, b0k b0kVar, max maxVar, lb50 lb50Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1165851530);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(maxVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int i3 = (i2 & 14) | 48;
            int i4 = i2 << 3;
            n(str, false, lb50Var, maxVar, x340Var, i3 | (i4 & 896) | (i4 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwd0(str, lb50Var, maxVar, i, (byte) 1);
        }
    }

    public static final void l(int i, boolean z, qim0 qim0Var, float f, Function0 function0, String str, boolean z2, m4c m4cVar, b0k b0kVar, int i2, int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1315353087);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        int i8 = i4 | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i8 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i5 = i8 | 196608;
            str2 = str;
        } else {
            str2 = str;
            i5 = i8 | (x340Var.g(str2) ? 131072 : 65536);
        }
        if ((i3 & 64) != 0) {
            i6 = 1572864;
        } else {
            i6 = x340Var.h(false) ? 1048576 : 524288;
        }
        int i10 = i5 | i6;
        int i11 = i3 & 128;
        if (i11 != 0) {
            i7 = i10 | 12582912;
        } else {
            i7 = i10 | (x340Var.h(z2) ? 8388608 : 4194304);
        }
        int i12 = i7 | (x340Var.g(m4cVar) ? 67108864 : 33554432);
        if (x340Var.Y(i12 & 1, (38347923 & i12) != 38347922)) {
            String str4 = i9 != 0 ? null : str2;
            boolean z4 = i11 != 0 ? false : z2;
            x340Var.i0(1057332993);
            nyx.a(2, (wux) null, apo.r(-427977394, new ubk0(qim0Var, function0, i, z, f, false, z4, str4), x340Var), x340Var, 3078, 6);
            x340Var.r(false);
            z3 = z4;
            str3 = str4;
        } else {
            x340Var.b0();
            z3 = z2;
            str3 = str2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbk0(i, z, qim0Var, f, function0, str3, z3, m4cVar, i2, i3);
        }
    }

    public static final void m(int i, String str, b0k b0kVar, max maxVar, lb50 lb50Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(443378416);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(maxVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int i3 = (i2 & 14) | 48;
            int i4 = i2 << 3;
            n(str, true, lb50Var, maxVar, x340Var, i3 | (i4 & 896) | (i4 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwd0(str, lb50Var, maxVar, i, (byte) 2);
        }
    }

    public static final void n(String str, boolean z, lb50 lb50Var, max maxVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1636336954);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(lb50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(maxVar) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            boolean z2 = !z;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new mwd0(lb50Var, z, str, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, (Function0) objT), new idx(4), null, maxVar, null, null, false, null, null, apo.r(-2007629757, new k750((byte) 6, z2), b0kVar3), b0kVar2, (i2 << 3) & 57344, 6, 1004);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(str, z, lb50Var, maxVar, i);
        }
    }

    public static final void o(wx60 wx60Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(333587612);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wx60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = god0.R0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            if (ihc1.y0(wx60Var.e)) {
                x340Var.i0(-645522068);
            } else {
                x340Var.i0(-645488340);
                pm31 pm31Var = new pm31(0);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT2 = x340Var.T();
                if (z || objT2 == obj) {
                    objT2 = new jwd0(iu30Var, wx60Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                qim0VarB = bin.x(qim0VarB, false, null, pm31Var, null, (Function0) objT2, 11);
            }
            x340Var.r(false);
            qim0 qim0Var2 = qim0VarB;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vx60 vx60Var = (vx60) o7h.s0(wx60Var.a);
            boolean zG = x340Var.g(vx60Var != null ? vx60Var.a : null);
            Object objT3 = x340Var.T();
            if (zG || objT3 == obj) {
                String str = vx60Var != null ? vx60Var.a : null;
                if (str == null) {
                    str = "";
                }
                objT3 = Uri.parse(str);
                x340Var.s0(objT3);
            }
            Uri uri = (Uri) objT3;
            uri.getClass();
            String str2 = vx60Var != null ? vx60Var.b : null;
            if (str2 == null) {
                str2 = "";
            }
            bmq0.a(uri, (qim0) null, hcx.g, (String) null, str2, 0L, 0L, false, x340Var, 384, 234);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0.a, 8.0f));
            String str3 = wx60Var.b;
            String strN0 = cwl1.n0(2131957605, new Object[]{f4i1.f("\u0000", str3, "\u0000")}, x340Var);
            zma1 zma1VarA = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            ye5 ye5Var = new ye5();
            v(ye5Var, strN0, str3, zma1VarA);
            uwo1.d(ye5Var.p(), cbx.a(x340Var).b.b, null, cbx.d(x340Var).j, null, null, 2, false, new cjc0(1), 0, null, null, x340Var, 0, 0, 3764);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) wx60Var, (Object) iu30Var, (Object) qim0Var, i, (byte) 1);
        }
    }

    public static final void p(wx60 wx60Var, lb50 lb50Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1808164857);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wx60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lb50Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hwd0(lb50Var, (byte) 1);
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            o(wx60Var, (iu30) objT, uyn1.z(16.0f, 0.0f, 2, nim0Var), x340Var, i2 & 14);
            cvx cvxVar2 = cbx.b(x340Var).b;
            x0d.s(nim0Var, 12.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(wx60Var, lb50Var, i, (byte) 21);
        }
    }

    public static final void q(zl11 zl11Var, iu30 iu30Var, sfn0 sfn0Var, b0k b0kVar, int i) {
        int i2;
        float f;
        byte b2;
        Object pxjVar;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1988024362);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zl11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(sfn0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            i091 i091Var = (i091) rwq.g(sfn0Var.a.y(), null, null, x340Var, 48, 2).getValue();
            ifu0 pfu0Var = mfu0.c;
            if (i091Var != null) {
                o091 o091Var = i091Var.h;
                if (o091Var instanceof j091) {
                    pfu0Var = ifu0.c;
                } else if (o091Var instanceof n091) {
                    pfu0Var = new pfu0(i091Var.d, i091Var.e, i091Var.c);
                }
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            boolean zI = x340Var.i(pfu0Var) | x340Var.i(drr0Var);
            Object objT2 = x340Var.T();
            gbx gbxVar = null;
            if (zI || objT2 == m4cVar) {
                objT2 = new dm11(pfu0Var, drr0Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(pfu0Var, x340Var, (vu30) objT2);
            float fS = drr0Var.s();
            uvx uvxVar = new uvx(ogx.e, 3, (tvx) null, (p3v) null, 25);
            if (zl11Var.g != null) {
                x340Var.i0(1930846031);
                boolean zI2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | x340Var.i(pfu0Var) | x340Var.d(fS);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    f = fS;
                    pxjVar = new pxj(zl11Var, pfu0Var, f, iu30Var2, (byte) 2);
                    iu30Var2 = iu30Var2;
                    x340Var.s0(pxjVar);
                } else {
                    pxjVar = objT3;
                    f = fS;
                }
                Function0 function0 = (Function0) pxjVar;
                if (ihc1.y0("Toggle preview")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50("Toggle preview"), function0);
                    b2 = 0;
                    x340Var.r(false);
                }
            } else {
                f = fS;
                b2 = 0;
                x340Var.i0(1931322594);
                x340Var.r(false);
            }
            jto1.b(null, uvxVar, null, false, null, null, gbxVar, null, null, apo.r(-603826527, new b470(zl11Var, pfu0Var, f, (byte) 3), x340Var), null, apo.r(1803347298, new cm11(zl11Var, b2), x340Var), apo.r(1813117859, new hov0(zl11Var, iu30Var2, (byte) 28), x340Var), null, null, apo.r(1842429542, new cm11(zl11Var, (byte) 1), x340Var), x340Var, 805306432, 197040, 26045);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(zl11Var, iu30Var2, sfn0Var, i, (byte) 22);
        }
    }

    public static final void r(String str, lb50 lb50Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1805621914);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lb50Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kwd0(lb50Var, str, (byte) 1);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            qim0 qim0Var3 = nim0.a;
            wro1.h(new gbx(z50Var, (Function0) objT), ldx.c, qim0Var3, null, null, null, false, null, null, lwi.d, x340Var, i3 & 896, 6, 1016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) str, (Object) lb50Var, (Object) qim0Var2, i, (byte) 2);
        }
    }

    public static final void s(t7q0 t7q0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1044237008);
        int i2 = (x340Var.g(t7q0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, t7q0Var instanceof g7q0 ? 2131953661 : 2131953778);
            qim0 qim0Var2 = nim0.a;
            j2h1.f(strO0, qim0Var2, 0L, 0L, (lee1) null, (vu30) null, x340Var, 48, 124);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(t7q0Var, qim0Var, i, (byte) 25);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void t(int i, int i2, String str, String str2, b0k b0kVar, lb50 lb50Var) throws NoWhenBranchMatchedException {
        int i3;
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1627380048);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= x340Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(lb50Var) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 6.0f, 0.0f, 16.0f, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i5 = i3 >> 6;
            r(str, lb50Var, null, x340Var, (i3 & 14) | (i5 & 112));
            b(lb50Var, null, x340Var, (i3 >> 9) & 14);
            kk0.s(1.0f, true, x340Var);
            int i6 = i3 << 3;
            u(i, (i5 & 14) | (i6 & 112) | (i6 & 896) | (i3 & 7168), str, str3, x340Var, lb50Var);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nwd0(str, str2, i, lb50Var, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void u(int i, int i2, String str, String str2, b0k b0kVar, lb50 lb50Var) throws NoWhenBranchMatchedException {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-563713948);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(lb50Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = owd0.a[l1d.C(i)] == 1;
            switch (l1d.C(i)) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                case 1:
                case 2:
                    x340Var.i0(-278103524);
                    x340Var.r(false);
                    break;
                case 3:
                    x340Var.i0(-563170545);
                    boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                    Object objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        objT = new kwd0(lb50Var, str2, (byte) 2);
                        x340Var.s0(objT);
                    }
                    d(2131957576, (Function0) objT, null, null, null, x340Var, 384, 120);
                    x340Var.r(false);
                    break;
                case 4:
                    x340Var.i0(-563196289);
                    boolean zH = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | x340Var.h(z);
                    Object objT2 = x340Var.T();
                    if (zH || objT2 == m4cVar) {
                        objT2 = new mwd0(lb50Var, z, str, (byte) 1);
                        x340Var.s0(objT2);
                    }
                    d(2131957572, (Function0) objT2, new idx(6), pox.c, null, x340Var, 384 | (pox.d << 15), 80);
                    x340Var.r(false);
                    break;
                case 5:
                case 7:
                    x340Var.i0(-563213293);
                    byte b2 = 14;
                    boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
                    Object objT3 = x340Var.T();
                    if (z3 || objT3 == m4cVar) {
                        objT3 = new wv1(lb50Var, str, i, b2);
                        x340Var.s0(objT3);
                    }
                    d(2131957572, (Function0) objT3, new idx(6), jpx.c, null, x340Var, 384 | (jpx.d << 15), 80);
                    x340Var.r(false);
                    break;
                case 6:
                    x340Var.i0(-563184766);
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = fnc0.W0;
                        x340Var.s0(objT4);
                    }
                    d(2131957571, (Function0) objT4, new idx(6), klx.c, new hax(cwl1.o0(x340Var, 2131957571)), x340Var, 432 | (klx.d << 15), 16);
                    x340Var.r(false);
                    break;
                default:
                    throw p3d1.k(x340Var, -563214811, false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nwd0(i, str, str2, lb50Var, i2);
        }
    }

    public static final void v(ye5 ye5Var, String str, String str2, zma1 zma1Var) {
        int iW0 = ihc1.w0(str, "\u0000", 0, false, 6);
        if (iW0 < 0) {
            ye5Var.g(str);
            return;
        }
        ye5Var.g(str.substring(0, iW0));
        int iO = ye5Var.o(zma1Var);
        try {
            ye5Var.g(str2);
            ye5Var.k(iO);
            int iW1 = ihc1.w0(str, "\u0000", iW0 + 1, false, 4);
            if (iW1 >= 0) {
                ye5Var.g(nhc1.W(str.substring(iW1 + 1), "\u0000", ""));
            }
        } catch (Throwable th) {
            ye5Var.k(iO);
            throw th;
        }
    }

    public static final cp20 w(zob1 zob1Var, fu fuVar) {
        return new cp20(fuVar, zob1Var);
    }

    public static jx0 x(String str) {
        Object next;
        Iterator it = jx0.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((jx0) next).a, str));
        jx0 jx0Var = (jx0) next;
        return jx0Var == null ? new jx0(str) : jx0Var;
    }

    public static void y() {
        jx0 jx0Var = jx0.b;
    }

    public static void z() {
        jx0 jx0Var = jx0.b;
    }
}
