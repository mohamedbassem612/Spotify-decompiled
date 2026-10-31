package p;

import com.spotify.speechlessupload.proto.v1.FilePart;
import com.spotify.speechlessupload.proto.v1.FileUpload;
import com.spotify.speechlessupload.proto.v1.FileUploadUrls;
import com.spotify.speechlessupload.proto.v1.InitiateUploadRequest;
import com.spotify.speechlessupload.proto.v1.InitiateUploadResponse;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q9i0 implements f961 {
    public final r9i0 a;
    public final b8g1 b;
    public final bx5 c;
    public final q8n d;
    public final zle1 e;
    public final add f;
    public final cxc g;
    public final idd1 h;
    public final ConcurrentHashMap i;
    public final llm t;

    public q9i0(r9i0 r9i0Var, b8g1 b8g1Var, l270 l270Var, bx5 bx5Var, q8n q8nVar, zle1 zle1Var, add addVar) {
        this.a = r9i0Var;
        this.b = b8g1Var;
        this.c = bx5Var;
        this.d = q8nVar;
        this.e = zle1Var;
        this.f = addVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.g = ((yyp0) l270Var).f(30L, timeUnit).g(30L, timeUnit).c();
        this.h = new idd1(new z8i0(this, (byte) 0));
        this.i = new ConcurrentHashMap();
        this.t = i3a.k(q8nVar);
    }

    public static int f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 1;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((woh0) it.next()).c instanceof bph0) {
                return 2;
            }
        }
        return 1;
    }

    public static void k(w8i0 w8i0Var, String str, List list, iu30 iu30Var) {
        Object value;
        Map mapP;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((dph0) it.next()).a.a);
        }
        Set setP1 = o7h.p1(arrayList);
        bpb1 bpb1Var = w8i0Var.b;
        do {
            value = bpb1Var.getValue();
            mapP = (Map) value;
            List list3 = (List) mapP.get(str);
            if (list3 != null) {
                List<dph0> list4 = list3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                for (dph0 dph0VarA : list4) {
                    yxh1 yxh1Var = dph0VarA.b;
                    if (setP1.contains(dph0VarA.a.a) && (yxh1Var instanceof wxh1)) {
                        dph0VarA = dph0.a(dph0VarA, (yxh1) iu30Var.invoke(yxh1Var), false, 5);
                    }
                    arrayList2.add(dph0VarA);
                }
                mapP = sqg0.P(mapP, new mmr0(str, arrayList2));
            }
        } while (!bpb1Var.k(value, mapP));
    }

    public static void l(w8i0 w8i0Var, String str, yxh1 yxh1Var) {
        Object value;
        Map mapP;
        bpb1 bpb1Var = w8i0Var.b;
        do {
            value = bpb1Var.getValue();
            mapP = (Map) value;
            List list = (List) mapP.get(str);
            if (list != null) {
                List<dph0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (dph0 dph0VarA : list2) {
                    if (!(dph0VarA.b instanceof wxh1)) {
                        dph0VarA = dph0.a(dph0VarA, yxh1Var, false, 5);
                    }
                    arrayList.add(dph0VarA);
                }
                mapP = sqg0.P(mapP, new mmr0(str, arrayList));
            }
        } while (!bpb1Var.k(value, mapP));
    }

    public static void m(w8i0 w8i0Var, String str, String str2, yxh1 yxh1Var) {
        Object value;
        Map mapP;
        bpb1 bpb1Var = w8i0Var.b;
        do {
            value = bpb1Var.getValue();
            mapP = (Map) value;
            List list = (List) mapP.get(str);
            if (list != null) {
                List<dph0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (dph0 dph0VarA : list2) {
                    if (u890.j(dph0VarA.a.a, str2)) {
                        dph0VarA = dph0.a(dph0VarA, yxh1Var, false, 5);
                    }
                    arrayList.add(dph0VarA);
                }
                mapP = sqg0.P(mapP, new mmr0(str, arrayList));
            }
        } while (!bpb1Var.k(value, mapP));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        y8i0 y8i0Var;
        w8i0 w8i0Var;
        Object value;
        if (onmVar instanceof y8i0) {
            y8i0Var = (y8i0) onmVar;
            int i = y8i0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8i0Var.e = i - Integer.MIN_VALUE;
            } else {
                y8i0Var = new y8i0(this, onmVar);
            }
        } else {
            y8i0Var = new y8i0(this, onmVar);
        }
        Object obj = y8i0Var.c;
        int i2 = y8i0Var.e;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            w8i0Var = (w8i0) this.i.get(str);
            if (w8i0Var == null) {
                return rih1Var;
            }
            w8i0Var.d.remove(str2);
            l(w8i0Var, str2, sxh1.a);
            faa0 faa0Var = (faa0) w8i0Var.c.get(str2);
            if (faa0Var != null) {
                y8i0Var.a = str2;
                y8i0Var.b = w8i0Var;
                y8i0Var.e = 1;
                Object objP = op71.p(faa0Var, y8i0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w8i0Var = y8i0Var.b;
            str2 = y8i0Var.a;
            hm5.M(obj);
        }
        bpb1 bpb1Var = w8i0Var.b;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, sqg0.K(str2, (Map) value)));
        w8i0Var.c.remove(str2);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x013d -> B:40:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x015b -> B:41:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r22, java.util.List r23, long r24, p.onm r26) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q9i0.b(java.util.List, java.util.List, long, p.onm):java.lang.Object");
    }

    public final Object c(tn21 tn21Var, String str, a8d1 a8d1Var) {
        rih1 rih1Var = rih1.a;
        ohd ohdVar = new ohd(1, aym.t(a8d1Var));
        ohdVar.t();
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        ((t360) neVar.c).g("Content-Encoding", "identity");
        neVar.L("PUT", tn21Var);
        jf01 jf01VarA = this.g.a(new ln21(neVar));
        ohdVar.n(new b1u(jf01VarA, (byte) 1));
        try {
            ry21 ry21VarE = jf01VarA.e();
            try {
                if (ry21VarE.Q0) {
                    ohdVar.resumeWith(rih1Var);
                } else {
                    ohdVar.resumeWith(new m231(new IOException("Upload failed: " + ry21VarE.d)));
                }
                ry21VarE.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(ry21VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            if (ohdVar.s() instanceof ago0) {
                ohdVar.resumeWith(new m231(e));
            }
        }
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[PHI: r7 r8 r9 r10
      0x0063: PHI (r7v1 p.w8i0) = (r7v0 p.w8i0), (r7v2 p.w8i0) binds: [B:15:0x003a, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v2 java.lang.String) binds: [B:15:0x003a, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r9v1 java.util.List) = (r9v0 java.util.List), (r9v2 java.util.List) binds: [B:15:0x003a, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r10v1 p.v9i0) = (r10v0 p.v9i0), (r10v2 p.v9i0) binds: [B:15:0x003a, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(boolean z, String str, w8i0 w8i0Var, String str2, List list, v9i0 v9i0Var, onm onmVar) {
        b9i0 b9i0Var;
        if (onmVar instanceof b9i0) {
            b9i0Var = (b9i0) onmVar;
            int i = b9i0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9i0Var.g = i - Integer.MIN_VALUE;
            } else {
                b9i0Var = new b9i0(this, onmVar);
            }
        } else {
            b9i0Var = new b9i0(this, onmVar);
        }
        Object objQ = b9i0Var.e;
        int i2 = b9i0Var.g;
        if (i2 == 0) {
            hm5.M(objQ);
            if (z) {
                b9i0Var.a = w8i0Var;
                b9i0Var.b = str2;
                b9i0Var.c = list;
                b9i0Var.d = v9i0Var;
                b9i0Var.g = 1;
                objQ = q(str, list, b9i0Var);
                Object obj = d9n.a;
                if (objQ == obj) {
                    return obj;
                }
            } else {
                v9i0Var.h(5);
                k(w8i0Var, str2, list, y7i0.d);
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v9i0Var = b9i0Var.d;
        list = b9i0Var.c;
        str2 = b9i0Var.b;
        w8i0Var = b9i0Var.a;
        hm5.M(objQ);
        if (((Boolean) objQ).booleanValue()) {
            k(w8i0Var, str2, list, y7i0.c);
            v9i0Var.h(1);
        } else {
            v9i0Var.h(5);
            k(w8i0Var, str2, list, y7i0.d);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, List list, onm onmVar) {
        c9i0 c9i0Var;
        if (onmVar instanceof c9i0) {
            c9i0Var = (c9i0) onmVar;
            int i = c9i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9i0Var.c = i - Integer.MIN_VALUE;
            } else {
                c9i0Var = new c9i0(this, onmVar);
            }
        } else {
            c9i0Var = new c9i0(this, onmVar);
        }
        Object objC = c9i0Var.a;
        int i2 = c9i0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            List<List> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (List list3 : list2) {
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    t420 t420VarN = FilePart.n();
                    t420VarN.n(iIntValue);
                    arrayList2.add(t420VarN.build());
                }
                r520 r520VarO = FileUpload.o();
                r520VarO.n(arrayList2);
                arrayList.add(r520VarO.build());
            }
            String strD = pcf.d(6, str, (String) null);
            fd80 fd80VarO = InitiateUploadRequest.o();
            fd80VarO.q(strD);
            fd80VarO.n(arrayList);
            InitiateUploadRequest initiateUploadRequestBuild = fd80VarO.build();
            c9i0Var.c = 1;
            objC = this.a.c(initiateUploadRequestBuild, c9i0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        h290 h290VarN = ((InitiateUploadResponse) objC).n();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarN, 10));
        Iterator it2 = h290VarN.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FileUploadUrls) it2.next()).n());
        }
        return arrayList3;
    }

    public final mt g(String str) {
        return new mt(((w8i0) this.i.computeIfAbsent(str, new e9i0(this, (byte) 0))).b, (byte) 20);
    }

    public final void h(String str, String str2, ArrayList arrayList, boolean z) {
        LinkedHashMap linkedHashMap;
        if (arrayList.isEmpty()) {
            return;
        }
        String str3 = str;
        w8i0 w8i0Var = (w8i0) this.i.computeIfAbsent(str3, new e9i0(this, (byte) 2));
        synchronized (w8i0Var) {
            try {
                if (w8i0Var.c.containsKey(str2)) {
                    return;
                }
                bpb1 bpb1Var = w8i0Var.b;
                while (true) {
                    Object value = bpb1Var.getValue();
                    Map map = (Map) value;
                    List list = (List) map.get(str2);
                    if (list != null) {
                        List list2 = list;
                        int iS = zno1.s(q7h.U(list2, 10));
                        if (iS < 16) {
                            iS = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iS);
                        for (Object obj : list2) {
                            linkedHashMap.put(((dph0) obj).a.a, obj);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                        woh0 woh0Var = (woh0) it.next();
                        dph0 dph0Var = linkedHashMap != null ? (dph0) linkedHashMap.get(woh0Var.a) : null;
                        yxh1 yxh1Var = dph0Var != null ? dph0Var.b : null;
                        if (yxh1Var instanceof wxh1) {
                            if (z != 0) {
                                dph0Var = dph0.a(dph0Var, null, true, 3);
                            }
                        } else if (yxh1Var instanceof vxh1) {
                            dph0Var = dph0.a(dph0Var, new wxh1(((vxh1) yxh1Var).a, ((vxh1) yxh1Var).b, ((vxh1) yxh1Var).c, ((vxh1) yxh1Var).d, ((vxh1) yxh1Var).e, ((vxh1) yxh1Var).f, ((vxh1) yxh1Var).g, ((vxh1) yxh1Var).h), z != 0 || dph0Var.c, 1);
                        } else {
                            dph0Var = new dph0(woh0Var, xxh1.a, z);
                        }
                        arrayList2.add(dph0Var);
                    }
                    if (bpb1Var.k(value, sqg0.P(map, new mmr0(str2, arrayList2)))) {
                        w8i0Var.c.put(str2, fn31.T(w8i0Var.a, (o8n) null, 0, new h9i0(this, arrayList, z, w8i0Var, str2, str3, null), 3));
                        return;
                    }
                    str3 = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:181:0x0395  */
    /* JADX WARN: Code duplicated, block: B:188:0x03cc A[PHI: r9
      0x03cc: PHI (r9v40 java.lang.Object) = (r9v13 java.lang.Object), (r9v30 java.lang.Object), (r9v34 java.lang.Object), (r9v41 java.lang.Object) binds: [B:144:0x0314, B:175:0x0389, B:187:0x03ca, B:183:0x03ab] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0314, code lost:
    
        if (r0 == r9) goto L188;
     */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String, java.util.ArrayList, p.v9i0, p.w8i0] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.String, java.util.ArrayList, p.v9i0, p.w8i0] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r24, java.lang.String r25, p.w8i0 r26, p.v9i0 r27, p.onm r28) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q9i0.i(java.lang.String, java.lang.String, p.w8i0, p.v9i0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable j(opa opaVar, List list, String str, onm onmVar) {
        j9i0 j9i0Var;
        ArrayList arrayList;
        List list2;
        x8i0 x8i0Var;
        if (onmVar instanceof j9i0) {
            j9i0Var = (j9i0) onmVar;
            int i = j9i0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9i0Var.e = i - Integer.MIN_VALUE;
            } else {
                j9i0Var = new j9i0(this, onmVar);
            }
        } else {
            j9i0Var = new j9i0(this, onmVar);
        }
        Object obj = j9i0Var.c;
        int i2 = j9i0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            File file = new File(this.c.a.getCacheDir(), "campfire_media_upload/".concat(str));
            file.mkdirs();
            String absolutePath = file.getAbsolutePath();
            List list3 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (((woh0) obj2).c instanceof bph0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((woh0) it.next()).a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list3) {
                if (((woh0) obj3).c instanceof aph0) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((woh0) it2.next()).a);
            }
            gha ghaVar = new gha(arrayList3, arrayList5);
            vga vgaVar = new vga(absolutePath);
            arrayList = new ArrayList();
            opaVar.getClass();
            ezc ezcVarF = h4p1.f(new bh(opaVar, ghaVar, vgaVar, (lnm) null, (byte) 25));
            p5b0 p5b0Var = new p5b0(arrayList, (byte) 19);
            j9i0Var.a = list;
            j9i0Var.b = arrayList;
            j9i0Var.e = 1;
            Object objCollect = ezcVarF.collect(p5b0Var, j9i0Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = j9i0Var.b;
            list2 = j9i0Var.a;
            hm5.M(obj);
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj4 : arrayList) {
            linkedHashMap.put(((cga) obj4).a(), obj4);
        }
        List list4 = list2;
        ArrayList arrayList6 = new ArrayList(q7h.U(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            aga agaVar = (cga) sqg0.G(((woh0) it3.next()).a, linkedHashMap);
            if (agaVar instanceof bga) {
                bga bgaVar = (bga) agaVar;
                String str2 = bgaVar.c;
                Integer num = bgaVar.e;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = bgaVar.f;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                fie1 fie1Var = bgaVar.g;
                x8i0Var = new x8i0(iIntValue, iIntValue2, fie1Var != null ? fie1Var.b : 0, fie1Var != null ? fie1Var.c : 0, str2, fie1Var != null ? fie1Var.a : null);
            } else {
                if (!(agaVar instanceof aga)) {
                    eg.o();
                    return null;
                }
                aga agaVar2 = agaVar;
                x8i0Var = new x8i0(agaVar2.e, agaVar2.f, 0, 0, agaVar2.c, (String) null);
            }
            arrayList6.add(x8i0Var);
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (p.smo1.s(r0, r9) == r12) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r14, java.util.List r15, long r16, p.onm r18) {
        /*
            r13 = this;
            r1 = r18
            boolean r3 = r1 instanceof p.k9i0
            if (r3 == 0) goto L16
            r3 = r1
            p.k9i0 r3 = (p.k9i0) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L16
            int r4 = r4 - r5
            r3.f = r4
        L14:
            r9 = r3
            goto L1c
        L16:
            p.k9i0 r3 = new p.k9i0
            r3.<init>(r13, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r9.d
            int r3 = r9.f
            r10 = 0
            r11 = 2
            r4 = 1
            p.d9n r12 = p.d9n.a
            if (r3 == 0) goto L49
            if (r3 == r4) goto L39
            if (r3 != r11) goto L33
            java.util.List r0 = r9.b
            java.util.List r0 = (java.util.List) r0
            p.hm5.M(r1)
            goto L82
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r10
        L39:
            long r3 = r9.c
            java.util.List r0 = r9.b
            java.util.List r0 = (java.util.List) r0
            java.lang.String r5 = r9.a
            p.hm5.M(r1)
            r7 = r1
            r1 = r0
            r0 = r7
            r7 = r5
            goto L66
        L49:
            p.hm5.M(r1)
            r9.a = r14
            r1 = r15
            java.util.List r1 = (java.util.List) r1
            r9.b = r1
            r5 = r16
            r9.c = r5
            r9.f = r4
            p.bx5 r1 = r13.c
            java.lang.Object r1 = r1.c(r14, r9)
            if (r1 != r12) goto L62
            goto L81
        L62:
            r7 = r14
            r0 = r1
            r3 = r5
            r1 = r15
        L66:
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            p.m9i0 r0 = new p.m9i0
            r8 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r9.a = r10
            r9.b = r10
            r9.c = r3
            r9.f = r11
            java.lang.Object r0 = p.smo1.s(r0, r9)
            if (r0 != r12) goto L82
        L81:
            return r12
        L82:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q9i0.n(java.lang.String, java.util.List, long, p.onm):java.lang.Object");
    }

    public final Object o(String str, String str2, n9i0 n9i0Var) {
        File file = new File(str);
        se11 se11Var = r8i0.e;
        Object objC = c(new rn21(bmq0.w("application/octet-stream"), file), str2, n9i0Var);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final Object p(w8i0 w8i0Var, String str, List list, List list2, ArrayList arrayList, ArrayList arrayList2, long j, h9i0 h9i0Var) {
        Object objS = smo1.s(new o9i0(list, list2, arrayList, arrayList2, this, j, w8i0Var, str, null), h9i0Var);
        return objS == d9n.a ? objS : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3 A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116 A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120 A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012e A[Catch: CancellationException -> 0x0144, Exception -> 0x0146, TryCatch #4 {CancellationException -> 0x0144, Exception -> 0x0146, blocks: (B:13:0x002e, B:48:0x00dd, B:49:0x00e3, B:51:0x00ec, B:60:0x010c, B:54:0x00f3, B:55:0x00f7, B:57:0x00fd, B:62:0x010f, B:65:0x0116, B:66:0x011a, B:68:0x0120, B:70:0x012e, B:72:0x0136, B:40:0x00a8, B:44:0x00c0, B:18:0x0043), top: B:87:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0136 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d8 -> B:48:0x00dd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(java.lang.String r10, java.util.List r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q9i0.q(java.lang.String, java.util.List, p.onm):java.lang.Object");
    }

    public final void shutdown() {
        smo1.p(this.t, (CancellationException) null);
        this.i.clear();
        try {
            y520.E(new File(this.c.a.getCacheDir(), "campfire_media_upload"));
        } catch (Exception e) {
            v8i0.j("Failed to clean up output directories: ", e.getMessage());
        }
    }

    public final Object getApi() {
        return this;
    }
}
