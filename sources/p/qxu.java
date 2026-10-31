package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qxu {
    public static final PlaylistRequestDecorationPolicy a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.H();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.v(iou0VarV);
        a = hru0VarS.build();
    }

    public static final EsOfflinePlugin.DownloadResponse a(String str, lpz lpzVar) {
        kpz kpzVarN = EsOfflinePlugin.DownloadResponse.n();
        kpzVarN.u(str);
        kpzVarN.q();
        kpzVarN.r(lpzVar);
        return kpzVarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x038a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0396  */
    /* JADX WARN: Code duplicated, block: B:106:0x0399  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0301 A[EDGE_INSN: B:112:0x0301->B:92:0x0301 BREAK  A[LOOP:1: B:89:0x02b7->B:91:0x02c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0220 A[EDGE_INSN: B:117:0x0220->B:65:0x0220 BREAK  A[LOOP:3: B:58:0x0202->B:63:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x016c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:44:0x0183  */
    /* JADX WARN: Code duplicated, block: B:45:0x0187  */
    /* JADX WARN: Code duplicated, block: B:47:0x018f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0208  */
    /* JADX WARN: Code duplicated, block: B:63:0x021b A[LOOP:3: B:58:0x0202->B:63:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0255  */
    /* JADX WARN: Code duplicated, block: B:76:0x025d  */
    /* JADX WARN: Code duplicated, block: B:79:0x026e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:84:0x0286 A[PHI: r0 r2 r4 r5 r7 r9 r11 r14 r15 r16 r17 r19
      0x0286: PHI (r0v20 p.ytw0) = (r0v14 p.ytw0), (r0v14 p.ytw0), (r0v41 p.ytw0) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r2v13 int) = (r2v9 int), (r2v9 int), (r2v16 int) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r4v10 p.avw0) = (r4v7 p.avw0), (r4v7 p.avw0), (r4v25 p.avw0) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r5v15 boolean) = (r5v12 boolean), (r5v12 boolean), (r5v16 boolean) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r7v8 p.cyp0) = (r7v5 p.cyp0), (r7v5 p.cyp0), (r7v10 p.cyp0) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r9v11 java.lang.String) = (r9v9 java.lang.String), (r9v9 java.lang.String), (r9v12 java.lang.String) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r11v10 p.rm5) = (r11v7 p.rm5), (r11v7 p.rm5), (r11v11 p.rm5) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r14v9 p.xaz0) = (r14v6 p.xaz0), (r14v6 p.xaz0), (r14v10 p.xaz0) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r15v10 p.tz01) = (r15v7 p.tz01), (r15v7 p.tz01), (r15v11 p.tz01) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r16v9 java.util.List) = (r16v6 java.util.List), (r16v6 java.util.List), (r16v10 java.util.List) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r17v5 p.zuc0) = (r17v3 p.zuc0), (r17v3 p.zuc0), (r17v7 p.zuc0) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r19v5 p.lpz) = (r19v3 p.lpz), (r19v3 p.lpz), (r19v8 p.lpz) binds: [B:66:0x0222, B:67:0x0224, B:83:0x027f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x028a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0299  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c1 A[LOOP:1: B:89:0x02b7->B:91:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0318  */
    /* JADX WARN: Code duplicated, block: B:97:0x033f  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x02c1, please report this as an issue */
    public static final Object b(EsOfflinePlugin.DownloadCommand downloadCommand, vpp0 vpp0Var, xrc0 xrc0Var, ytw0 ytw0Var, rm5 rm5Var, avw0 avw0Var, m2l1 m2l1Var, tz01 tz01Var, xaz0 xaz0Var, ConcurrentHashMap concurrentHashMap, onm onmVar) {
        jxu jxuVar;
        rm5 rm5Var2;
        m2l1 m2l1Var2;
        xaz0 xaz0Var2;
        Object objB;
        String str;
        tz01 tz01Var2;
        avw0 avw0Var2;
        xrc0 xrc0Var2;
        ConcurrentHashMap concurrentHashMap2;
        ytw0 ytw0Var2;
        rm5 rm5Var3;
        ytw0 ytw0Var3;
        xaz0 xaz0Var3;
        avw0 avw0Var3;
        tz01 tz01Var3;
        Object obj;
        String str2;
        ConcurrentHashMap concurrentHashMap3;
        bzl1 bzl1Var;
        boolean z;
        String str3;
        cyp0 cyp0Var;
        wsc0 wsc0Var;
        int i;
        cyp0 cyp0Var2;
        int i2;
        String str4;
        avw0 avw0Var4;
        xaz0 xaz0Var4;
        rm5 rm5Var4;
        tz01 tz01Var4;
        ConcurrentHashMap concurrentHashMap4;
        String str5;
        boolean z2;
        ytw0 ytw0Var4;
        List list;
        wsc0 wsc0Var2;
        ytw0 ytw0Var5;
        Object objD;
        boolean z3;
        Object obj2;
        ytw0 ytw0Var6;
        rm5 rm5Var5;
        avw0 avw0Var5;
        tz01 tz01Var5;
        xaz0 xaz0Var5;
        ConcurrentHashMap concurrentHashMap5;
        cyp0 cyp0Var3;
        Iterator it;
        Object next;
        zuc0 zuc0Var;
        ytw0 ytw0Var7;
        Object obj3;
        int i3;
        cyp0 cyp0Var4;
        Iterator it2;
        wsc0 wsc0Var3;
        zuc0 zuc0Var2;
        lpz lpzVar;
        List list2;
        ArrayList arrayList;
        Iterator it3;
        List list3;
        lpz lpzVar2;
        ArrayList arrayList2;
        Iterator it4;
        String str6;
        Object next2;
        wsc0 wsc0Var4;
        Iterator it5;
        Object next3;
        boolean zBooleanValue;
        lpz lpzVar3;
        if (onmVar instanceof jxu) {
            jxuVar = (jxu) onmVar;
            int i4 = jxuVar.O0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jxuVar.O0 = i4 - Integer.MIN_VALUE;
            } else {
                jxuVar = new jxu(onmVar);
            }
        } else {
            jxuVar = new jxu(onmVar);
        }
        Object objS = jxuVar.N0;
        int i5 = jxuVar.O0;
        List list4 = z6x.a;
        lpz lpzVar4 = lpz.b;
        lpz lpzVar5 = lpz.c;
        d9n d9nVar = d9n.a;
        if (i5 == 0) {
            hm5.M(objS);
            String link = downloadCommand.getLink();
            link.getClass();
            jxuVar.a = xrc0Var;
            jxuVar.b = ytw0Var;
            rm5Var2 = rm5Var;
            jxuVar.c = rm5Var2;
            jxuVar.d = avw0Var;
            m2l1Var2 = m2l1Var;
            jxuVar.e = m2l1Var2;
            jxuVar.f = tz01Var;
            xaz0Var2 = xaz0Var;
            jxuVar.g = xaz0Var2;
            jxuVar.h = concurrentHashMap;
            jxuVar.i = link;
            jxuVar.O0 = 1;
            objB = ygu0.b(link, vpp0Var, jxuVar);
            if (objB != d9nVar) {
                str = link;
                tz01Var2 = tz01Var;
                avw0Var2 = avw0Var;
                xrc0Var2 = xrc0Var;
                concurrentHashMap2 = concurrentHashMap;
                ytw0Var2 = ytw0Var;
            }
            return d9nVar;
        }
        if (i5 == 1) {
            String str7 = jxuVar.i;
            concurrentHashMap2 = jxuVar.h;
            xaz0 xaz0Var6 = jxuVar.g;
            tz01 tz01Var6 = jxuVar.f;
            m2l1Var2 = jxuVar.e;
            avw0Var2 = jxuVar.d;
            rm5 rm5Var6 = jxuVar.c;
            ytw0Var2 = jxuVar.b;
            xrc0Var2 = jxuVar.a;
            hm5.M(objS);
            str = str7;
            tz01Var2 = tz01Var6;
            rm5Var2 = rm5Var6;
            xaz0Var2 = xaz0Var6;
            objB = objS;
        } else {
            if (i5 == 2) {
                String str8 = jxuVar.i;
                concurrentHashMap2 = jxuVar.h;
                xaz0 xaz0Var7 = jxuVar.g;
                tz01 tz01Var7 = jxuVar.f;
                avw0 avw0Var6 = jxuVar.d;
                rm5 rm5Var7 = jxuVar.c;
                ytw0 ytw0Var8 = jxuVar.b;
                xrc0 xrc0Var3 = jxuVar.a;
                hm5.M(objS);
                tz01Var3 = tz01Var7;
                ytw0Var3 = ytw0Var8;
                rm5Var3 = rm5Var7;
                xrc0Var2 = xrc0Var3;
                xaz0Var3 = xaz0Var7;
                avw0Var3 = avw0Var6;
                str2 = str8;
                obj = objS;
                concurrentHashMap3 = concurrentHashMap2;
                dzl1 dzl1Var = (dzl1) obj;
                bzl1Var = dzl1Var.a;
                z = dzl1Var.b;
                if (bzl1Var == null) {
                    if (z) {
                        str2.getClass();
                        return a(str2, lpzVar5);
                    }
                    str2.getClass();
                    rm5Var3.L(str2, list4);
                    return a(str2, lpzVar4);
                }
                str3 = bzl1Var.a;
                cyp0Var = bzl1Var.b;
                wsc0Var = (wsc0) concurrentHashMap3.get(str3);
                if (wsc0Var != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (wsc0Var == null) {
                    jxuVar.a = xrc0Var2;
                    jxuVar.b = ytw0Var3;
                    jxuVar.c = rm5Var3;
                    jxuVar.d = avw0Var3;
                    ytw0Var5 = ytw0Var3;
                    jxuVar.e = null;
                    jxuVar.f = tz01Var3;
                    jxuVar.g = xaz0Var3;
                    jxuVar.h = concurrentHashMap3;
                    jxuVar.i = str2;
                    jxuVar.t = str3;
                    jxuVar.X = cyp0Var;
                    jxuVar.Y = z;
                    jxuVar.Z = i;
                    jxuVar.O0 = 3;
                    objD = d(str3, jxuVar, xrc0Var2);
                    if (objD != d9nVar) {
                        z3 = z;
                        obj2 = objD;
                        ytw0Var6 = ytw0Var5;
                        rm5Var5 = rm5Var3;
                        avw0Var5 = avw0Var3;
                        tz01Var5 = tz01Var3;
                        xaz0Var5 = xaz0Var3;
                        concurrentHashMap5 = concurrentHashMap3;
                        str5 = str2;
                        str4 = str3;
                        cyp0Var3 = cyp0Var;
                        wsc0Var3 = (wsc0) obj2;
                        if (wsc0Var3 == null) {
                            str5.getClass();
                            return a(str5, lpzVar5);
                        }
                        concurrentHashMap5.put(str4, wsc0Var3);
                        wsc0Var2 = wsc0Var3;
                        ytw0Var4 = ytw0Var6;
                        z2 = z3;
                        i2 = i;
                        cyp0Var2 = cyp0Var3;
                        avw0Var4 = avw0Var5;
                        tz01Var4 = tz01Var5;
                        xaz0Var4 = xaz0Var5;
                        concurrentHashMap4 = concurrentHashMap5;
                        rm5Var4 = rm5Var5;
                        list = list4;
                        it = wsc0Var2.e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            it2 = it;
                            if (u890.j(((zuc0) next).c, str5)) {
                                break;
                                break;
                            }
                            it = it2;
                        }
                        zuc0Var = (zuc0) next;
                        if (zuc0Var == null) {
                            zuc0Var2 = zuc0Var;
                            if (zuc0Var2 == null) {
                                str5.getClass();
                                rm5Var4.L(str5, list);
                                return a(str5, lpzVar4);
                            }
                            lpzVar = lpzVar4;
                            Map map = zuc0Var2.g;
                            ytw0Var4.getClass();
                            list2 = ytw0.f(map).b;
                            arrayList = new ArrayList(q7h.U(list2, 10));
                            it3 = list2.iterator();
                            while (true) {
                                list3 = list2;
                                if (!it3.hasNext()) {
                                    break;
                                    break;
                                }
                                String str9 = ((iyl1) it3.next()).a;
                                avw0 avw0Var7 = avw0Var4;
                                String str10 = cyp0Var2.a;
                                lpz lpzVar6 = lpzVar;
                                String str11 = cyp0Var2.b;
                                avw0Var7.getClass();
                                arrayList.add(avw0.e((str11 + "/" + str10 + "/" + str9).getBytes(nne.a)));
                                list2 = list3;
                                avw0Var4 = avw0Var7;
                                it3 = it3;
                                lpzVar = lpzVar6;
                            }
                            lpzVar2 = lpzVar;
                            str5.getClass();
                            rm5Var4.L(str5, arrayList);
                            arrayList2 = new ArrayList();
                            it4 = list3.iterator();
                            while (it4.hasNext()) {
                                next2 = it4.next();
                                Iterator it6 = it4;
                                if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                    arrayList2.add(next2);
                                }
                                it4 = it6;
                            }
                            yn0 yn0Var = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                            jxuVar.a = null;
                            jxuVar.b = null;
                            jxuVar.c = null;
                            jxuVar.d = null;
                            jxuVar.e = null;
                            jxuVar.f = null;
                            jxuVar.g = null;
                            jxuVar.h = null;
                            jxuVar.i = str5;
                            jxuVar.t = null;
                            jxuVar.X = null;
                            jxuVar.Y = z2;
                            jxuVar.Z = i2;
                            jxuVar.O0 = 5;
                            objS = smo1.s(yn0Var, jxuVar);
                            if (objS != d9nVar) {
                                str6 = str5;
                            }
                        } else {
                            zuc0Var2 = zuc0Var;
                            if (zuc0Var2 == null) {
                                str5.getClass();
                                rm5Var4.L(str5, list);
                                return a(str5, lpzVar4);
                            }
                            lpzVar = lpzVar4;
                            Map map2 = zuc0Var2.g;
                            ytw0Var4.getClass();
                            list2 = ytw0.f(map2).b;
                            arrayList = new ArrayList(q7h.U(list2, 10));
                            it3 = list2.iterator();
                            while (true) {
                                list3 = list2;
                                if (!it3.hasNext()) {
                                    break;
                                    break;
                                }
                                String str12 = ((iyl1) it3.next()).a;
                                avw0 avw0Var8 = avw0Var4;
                                String str13 = cyp0Var2.a;
                                lpz lpzVar7 = lpzVar;
                                String str14 = cyp0Var2.b;
                                avw0Var8.getClass();
                                arrayList.add(avw0.e((str14 + "/" + str13 + "/" + str12).getBytes(nne.a)));
                                list2 = list3;
                                avw0Var4 = avw0Var8;
                                it3 = it3;
                                lpzVar = lpzVar7;
                            }
                            lpzVar2 = lpzVar;
                            str5.getClass();
                            rm5Var4.L(str5, arrayList);
                            arrayList2 = new ArrayList();
                            it4 = list3.iterator();
                            while (it4.hasNext()) {
                                next2 = it4.next();
                                Iterator it7 = it4;
                                if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                    arrayList2.add(next2);
                                }
                                it4 = it7;
                            }
                            yn0 yn0Var2 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                            jxuVar.a = null;
                            jxuVar.b = null;
                            jxuVar.c = null;
                            jxuVar.d = null;
                            jxuVar.e = null;
                            jxuVar.f = null;
                            jxuVar.g = null;
                            jxuVar.h = null;
                            jxuVar.i = str5;
                            jxuVar.t = null;
                            jxuVar.X = null;
                            jxuVar.Y = z2;
                            jxuVar.Z = i2;
                            jxuVar.O0 = 5;
                            objS = smo1.s(yn0Var2, jxuVar);
                            if (objS != d9nVar) {
                                str6 = str5;
                            }
                        }
                    }
                } else {
                    ytw0 ytw0Var9 = ytw0Var3;
                    int i6 = i;
                    cyp0Var2 = cyp0Var;
                    i2 = i6;
                    String str15 = str2;
                    str4 = str3;
                    avw0Var4 = avw0Var3;
                    xaz0Var4 = xaz0Var3;
                    rm5Var4 = rm5Var3;
                    tz01Var4 = tz01Var3;
                    concurrentHashMap4 = concurrentHashMap3;
                    str5 = str15;
                    z2 = z;
                    ytw0Var4 = ytw0Var9;
                    list = list4;
                    wsc0Var2 = wsc0Var;
                    it = wsc0Var2.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        if (u890.j(((zuc0) next).c, str5)) {
                            break;
                            break;
                        }
                        it = it2;
                    }
                    zuc0Var = (zuc0) next;
                    if (zuc0Var == null) {
                        zuc0Var2 = zuc0Var;
                        if (zuc0Var2 == null) {
                            str5.getClass();
                            rm5Var4.L(str5, list);
                            return a(str5, lpzVar4);
                        }
                        lpzVar = lpzVar4;
                        Map map3 = zuc0Var2.g;
                        ytw0Var4.getClass();
                        list2 = ytw0.f(map3).b;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        it3 = list2.iterator();
                        while (true) {
                            list3 = list2;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str16 = ((iyl1) it3.next()).a;
                            avw0 avw0Var9 = avw0Var4;
                            String str17 = cyp0Var2.a;
                            lpz lpzVar8 = lpzVar;
                            String str18 = cyp0Var2.b;
                            avw0Var9.getClass();
                            arrayList.add(avw0.e((str18 + "/" + str17 + "/" + str16).getBytes(nne.a)));
                            list2 = list3;
                            avw0Var4 = avw0Var9;
                            it3 = it3;
                            lpzVar = lpzVar8;
                        }
                        lpzVar2 = lpzVar;
                        str5.getClass();
                        rm5Var4.L(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it8 = it4;
                            if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it8;
                        }
                        yn0 yn0Var3 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                        jxuVar.a = null;
                        jxuVar.b = null;
                        jxuVar.c = null;
                        jxuVar.d = null;
                        jxuVar.e = null;
                        jxuVar.f = null;
                        jxuVar.g = null;
                        jxuVar.h = null;
                        jxuVar.i = str5;
                        jxuVar.t = null;
                        jxuVar.X = null;
                        jxuVar.Y = z2;
                        jxuVar.Z = i2;
                        jxuVar.O0 = 5;
                        objS = smo1.s(yn0Var3, jxuVar);
                        if (objS != d9nVar) {
                            str6 = str5;
                        }
                    } else {
                        zuc0Var2 = zuc0Var;
                        if (zuc0Var2 == null) {
                            str5.getClass();
                            rm5Var4.L(str5, list);
                            return a(str5, lpzVar4);
                        }
                        lpzVar = lpzVar4;
                        Map map4 = zuc0Var2.g;
                        ytw0Var4.getClass();
                        list2 = ytw0.f(map4).b;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        it3 = list2.iterator();
                        while (true) {
                            list3 = list2;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str19 = ((iyl1) it3.next()).a;
                            avw0 avw0Var10 = avw0Var4;
                            String str110 = cyp0Var2.a;
                            lpz lpzVar9 = lpzVar;
                            String str111 = cyp0Var2.b;
                            avw0Var10.getClass();
                            arrayList.add(avw0.e((str111 + "/" + str110 + "/" + str19).getBytes(nne.a)));
                            list2 = list3;
                            avw0Var4 = avw0Var10;
                            it3 = it3;
                            lpzVar = lpzVar9;
                        }
                        lpzVar2 = lpzVar;
                        str5.getClass();
                        rm5Var4.L(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it9 = it4;
                            if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it9;
                        }
                        yn0 yn0Var4 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                        jxuVar.a = null;
                        jxuVar.b = null;
                        jxuVar.c = null;
                        jxuVar.d = null;
                        jxuVar.e = null;
                        jxuVar.f = null;
                        jxuVar.g = null;
                        jxuVar.h = null;
                        jxuVar.i = str5;
                        jxuVar.t = null;
                        jxuVar.X = null;
                        jxuVar.Y = z2;
                        jxuVar.Z = i2;
                        jxuVar.O0 = 5;
                        objS = smo1.s(yn0Var4, jxuVar);
                        if (objS != d9nVar) {
                            str6 = str5;
                        }
                    }
                }
                return d9nVar;
            }
            if (i5 == 3) {
                int i7 = jxuVar.Z;
                z3 = jxuVar.Y;
                cyp0Var3 = jxuVar.X;
                String str20 = jxuVar.t;
                String str21 = jxuVar.i;
                ConcurrentHashMap concurrentHashMap6 = jxuVar.h;
                xaz0 xaz0Var8 = jxuVar.g;
                tz01 tz01Var8 = jxuVar.f;
                avw0 avw0Var11 = jxuVar.d;
                rm5 rm5Var8 = jxuVar.c;
                ytw0Var6 = jxuVar.b;
                xrc0 xrc0Var4 = jxuVar.a;
                hm5.M(objS);
                xrc0Var2 = xrc0Var4;
                obj2 = objS;
                rm5Var5 = rm5Var8;
                avw0Var5 = avw0Var11;
                tz01Var5 = tz01Var8;
                xaz0Var5 = xaz0Var8;
                concurrentHashMap5 = concurrentHashMap6;
                str5 = str21;
                str4 = str20;
                lpzVar4 = lpzVar4;
                i = i7;
                wsc0Var3 = (wsc0) obj2;
                if (wsc0Var3 == null) {
                    str5.getClass();
                    return a(str5, lpzVar5);
                }
                concurrentHashMap5.put(str4, wsc0Var3);
                wsc0Var2 = wsc0Var3;
                ytw0Var4 = ytw0Var6;
                z2 = z3;
                i2 = i;
                cyp0Var2 = cyp0Var3;
                avw0Var4 = avw0Var5;
                tz01Var4 = tz01Var5;
                xaz0Var4 = xaz0Var5;
                concurrentHashMap4 = concurrentHashMap5;
                rm5Var4 = rm5Var5;
                list = list4;
                it = wsc0Var2.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (u890.j(((zuc0) next).c, str5)) {
                        break;
                    }
                    it = it2;
                }
                zuc0Var = (zuc0) next;
                if (zuc0Var == null || i2 == 0) {
                    zuc0Var2 = zuc0Var;
                    if (zuc0Var2 == null) {
                        str5.getClass();
                        rm5Var4.L(str5, list);
                        return a(str5, lpzVar4);
                    }
                    lpzVar = lpzVar4;
                    Map map5 = zuc0Var2.g;
                    ytw0Var4.getClass();
                    list2 = ytw0.f(map5).b;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    it3 = list2.iterator();
                    while (true) {
                        list3 = list2;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str112 = ((iyl1) it3.next()).a;
                        avw0 avw0Var12 = avw0Var4;
                        String str113 = cyp0Var2.a;
                        lpz lpzVar10 = lpzVar;
                        String str114 = cyp0Var2.b;
                        avw0Var12.getClass();
                        arrayList.add(avw0.e((str114 + "/" + str113 + "/" + str112).getBytes(nne.a)));
                        list2 = list3;
                        avw0Var4 = avw0Var12;
                        it3 = it3;
                        lpzVar = lpzVar10;
                    }
                    lpzVar2 = lpzVar;
                    str5.getClass();
                    rm5Var4.L(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it10 = it4;
                        if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it10;
                    }
                    yn0 yn0Var5 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                    jxuVar.a = null;
                    jxuVar.b = null;
                    jxuVar.c = null;
                    jxuVar.d = null;
                    jxuVar.e = null;
                    jxuVar.f = null;
                    jxuVar.g = null;
                    jxuVar.h = null;
                    jxuVar.i = str5;
                    jxuVar.t = null;
                    jxuVar.X = null;
                    jxuVar.Y = z2;
                    jxuVar.Z = i2;
                    jxuVar.O0 = 5;
                    objS = smo1.s(yn0Var5, jxuVar);
                    if (objS != d9nVar) {
                        str6 = str5;
                    }
                } else {
                    jxuVar.a = null;
                    jxuVar.b = ytw0Var4;
                    jxuVar.c = rm5Var4;
                    jxuVar.d = avw0Var4;
                    jxuVar.e = null;
                    jxuVar.f = tz01Var4;
                    jxuVar.g = xaz0Var4;
                    jxuVar.h = concurrentHashMap4;
                    jxuVar.i = str5;
                    jxuVar.t = str4;
                    jxuVar.X = cyp0Var2;
                    jxuVar.Y = z2;
                    jxuVar.Z = i2;
                    jxuVar.O0 = 4;
                    Object objD2 = d(str4, jxuVar, xrc0Var2);
                    if (objD2 != d9nVar) {
                        int i8 = i2;
                        ytw0Var7 = ytw0Var4;
                        obj3 = objD2;
                        i3 = i8;
                        cyp0Var4 = cyp0Var2;
                        wsc0Var4 = (wsc0) obj3;
                        if (wsc0Var4 == null) {
                            str5.getClass();
                            return a(str5, lpzVar5);
                        }
                        concurrentHashMap4.put(str4, wsc0Var4);
                        it5 = wsc0Var4.e.iterator();
                        do {
                            if (it5.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it5.next();
                        } while (!u890.j(((zuc0) next3).c, str5));
                        zuc0Var = (zuc0) next3;
                        ytw0Var4 = ytw0Var7;
                        i2 = i3;
                        cyp0Var2 = cyp0Var4;
                        zuc0Var2 = zuc0Var;
                        if (zuc0Var2 == null) {
                            str5.getClass();
                            rm5Var4.L(str5, list);
                            return a(str5, lpzVar4);
                        }
                        lpzVar = lpzVar4;
                        Map map6 = zuc0Var2.g;
                        ytw0Var4.getClass();
                        list2 = ytw0.f(map6).b;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        it3 = list2.iterator();
                        while (true) {
                            list3 = list2;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str115 = ((iyl1) it3.next()).a;
                            avw0 avw0Var13 = avw0Var4;
                            String str116 = cyp0Var2.a;
                            lpz lpzVar11 = lpzVar;
                            String str117 = cyp0Var2.b;
                            avw0Var13.getClass();
                            arrayList.add(avw0.e((str117 + "/" + str116 + "/" + str115).getBytes(nne.a)));
                            list2 = list3;
                            avw0Var4 = avw0Var13;
                            it3 = it3;
                            lpzVar = lpzVar11;
                        }
                        lpzVar2 = lpzVar;
                        str5.getClass();
                        rm5Var4.L(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it11 = it4;
                            if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it11;
                        }
                        yn0 yn0Var6 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                        jxuVar.a = null;
                        jxuVar.b = null;
                        jxuVar.c = null;
                        jxuVar.d = null;
                        jxuVar.e = null;
                        jxuVar.f = null;
                        jxuVar.g = null;
                        jxuVar.h = null;
                        jxuVar.i = str5;
                        jxuVar.t = null;
                        jxuVar.X = null;
                        jxuVar.Y = z2;
                        jxuVar.Z = i2;
                        jxuVar.O0 = 5;
                        objS = smo1.s(yn0Var6, jxuVar);
                        if (objS != d9nVar) {
                            str6 = str5;
                        }
                    }
                }
                return d9nVar;
            }
            if (i5 == 4) {
                int i9 = jxuVar.Z;
                z2 = jxuVar.Y;
                cyp0Var4 = jxuVar.X;
                str4 = jxuVar.t;
                str5 = jxuVar.i;
                concurrentHashMap4 = jxuVar.h;
                xaz0Var4 = jxuVar.g;
                tz01Var4 = jxuVar.f;
                avw0Var4 = jxuVar.d;
                rm5Var4 = jxuVar.c;
                ytw0 ytw0Var10 = jxuVar.b;
                hm5.M(objS);
                ytw0Var7 = ytw0Var10;
                obj3 = objS;
                list = list4;
                i3 = i9;
                lpzVar4 = lpzVar4;
                wsc0Var4 = (wsc0) obj3;
                if (wsc0Var4 == null) {
                    str5.getClass();
                    return a(str5, lpzVar5);
                }
                concurrentHashMap4.put(str4, wsc0Var4);
                it5 = wsc0Var4.e.iterator();
                do {
                    if (it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!u890.j(((zuc0) next3).c, str5));
                zuc0Var = (zuc0) next3;
                ytw0Var4 = ytw0Var7;
                i2 = i3;
                cyp0Var2 = cyp0Var4;
                zuc0Var2 = zuc0Var;
                if (zuc0Var2 == null) {
                    str5.getClass();
                    rm5Var4.L(str5, list);
                    return a(str5, lpzVar4);
                }
                lpzVar = lpzVar4;
                Map map7 = zuc0Var2.g;
                ytw0Var4.getClass();
                list2 = ytw0.f(map7).b;
                arrayList = new ArrayList(q7h.U(list2, 10));
                it3 = list2.iterator();
                while (true) {
                    list3 = list2;
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str118 = ((iyl1) it3.next()).a;
                    avw0 avw0Var14 = avw0Var4;
                    String str119 = cyp0Var2.a;
                    lpz lpzVar12 = lpzVar;
                    String str1110 = cyp0Var2.b;
                    avw0Var14.getClass();
                    arrayList.add(avw0.e((str1110 + "/" + str119 + "/" + str118).getBytes(nne.a)));
                    list2 = list3;
                    avw0Var4 = avw0Var14;
                    it3 = it3;
                    lpzVar = lpzVar12;
                }
                lpzVar2 = lpzVar;
                str5.getClass();
                rm5Var4.L(str5, arrayList);
                arrayList2 = new ArrayList();
                it4 = list3.iterator();
                while (it4.hasNext()) {
                    next2 = it4.next();
                    Iterator it12 = it4;
                    if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                        arrayList2.add(next2);
                    }
                    it4 = it12;
                }
                yn0 yn0Var7 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                jxuVar.a = null;
                jxuVar.b = null;
                jxuVar.c = null;
                jxuVar.d = null;
                jxuVar.e = null;
                jxuVar.f = null;
                jxuVar.g = null;
                jxuVar.h = null;
                jxuVar.i = str5;
                jxuVar.t = null;
                jxuVar.X = null;
                jxuVar.Y = z2;
                jxuVar.Z = i2;
                jxuVar.O0 = 5;
                objS = smo1.s(yn0Var7, jxuVar);
                if (objS != d9nVar) {
                    str6 = str5;
                }
                return d9nVar;
            }
            if (i5 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = jxuVar.i;
            hm5.M(objS);
            lpzVar2 = lpzVar4;
        }
        zBooleanValue = ((Boolean) objS).booleanValue();
        str6.getClass();
        if (zBooleanValue) {
            lpzVar3 = lpzVar2;
        } else {
            lpzVar3 = lpzVar5;
        }
        return a(str6, lpzVar3);
        List list5 = (List) objB;
        if (list5 == null) {
            str.getClass();
            return a(str, lpzVar5);
        }
        jxuVar.a = xrc0Var2;
        jxuVar.b = ytw0Var2;
        jxuVar.c = rm5Var2;
        jxuVar.d = avw0Var2;
        jxuVar.e = null;
        jxuVar.f = tz01Var2;
        jxuVar.g = xaz0Var2;
        jxuVar.h = concurrentHashMap2;
        jxuVar.i = str;
        jxuVar.O0 = 2;
        Object objE = e(list5, xrc0Var2, m2l1Var2, jxuVar);
        if (objE != d9nVar) {
            ytw0 ytw0Var11 = ytw0Var2;
            rm5Var3 = rm5Var2;
            ytw0Var3 = ytw0Var11;
            xaz0Var3 = xaz0Var2;
            avw0Var3 = avw0Var2;
            tz01Var3 = tz01Var2;
            obj = objE;
            str2 = str;
            concurrentHashMap3 = concurrentHashMap2;
            dzl1 dzl1Var2 = (dzl1) obj;
            bzl1Var = dzl1Var2.a;
            z = dzl1Var2.b;
            if (bzl1Var == null) {
                if (z) {
                    str2.getClass();
                    return a(str2, lpzVar5);
                }
                str2.getClass();
                rm5Var3.L(str2, list4);
                return a(str2, lpzVar4);
            }
            str3 = bzl1Var.a;
            cyp0Var = bzl1Var.b;
            wsc0Var = (wsc0) concurrentHashMap3.get(str3);
            if (wsc0Var != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (wsc0Var == null) {
                jxuVar.a = xrc0Var2;
                jxuVar.b = ytw0Var3;
                jxuVar.c = rm5Var3;
                jxuVar.d = avw0Var3;
                ytw0Var5 = ytw0Var3;
                jxuVar.e = null;
                jxuVar.f = tz01Var3;
                jxuVar.g = xaz0Var3;
                jxuVar.h = concurrentHashMap3;
                jxuVar.i = str2;
                jxuVar.t = str3;
                jxuVar.X = cyp0Var;
                jxuVar.Y = z;
                jxuVar.Z = i;
                jxuVar.O0 = 3;
                objD = d(str3, jxuVar, xrc0Var2);
                if (objD != d9nVar) {
                    z3 = z;
                    obj2 = objD;
                    ytw0Var6 = ytw0Var5;
                    rm5Var5 = rm5Var3;
                    avw0Var5 = avw0Var3;
                    tz01Var5 = tz01Var3;
                    xaz0Var5 = xaz0Var3;
                    concurrentHashMap5 = concurrentHashMap3;
                    str5 = str2;
                    str4 = str3;
                    cyp0Var3 = cyp0Var;
                    wsc0Var3 = (wsc0) obj2;
                    if (wsc0Var3 == null) {
                        str5.getClass();
                        return a(str5, lpzVar5);
                    }
                    concurrentHashMap5.put(str4, wsc0Var3);
                    wsc0Var2 = wsc0Var3;
                    ytw0Var4 = ytw0Var6;
                    z2 = z3;
                    i2 = i;
                    cyp0Var2 = cyp0Var3;
                    avw0Var4 = avw0Var5;
                    tz01Var4 = tz01Var5;
                    xaz0Var4 = xaz0Var5;
                    concurrentHashMap4 = concurrentHashMap5;
                    rm5Var4 = rm5Var5;
                    list = list4;
                    it = wsc0Var2.e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        if (u890.j(((zuc0) next).c, str5)) {
                            break;
                            break;
                        }
                        it = it2;
                    }
                    zuc0Var = (zuc0) next;
                    if (zuc0Var == null) {
                        zuc0Var2 = zuc0Var;
                        if (zuc0Var2 == null) {
                            str5.getClass();
                            rm5Var4.L(str5, list);
                            return a(str5, lpzVar4);
                        }
                        lpzVar = lpzVar4;
                        Map map8 = zuc0Var2.g;
                        ytw0Var4.getClass();
                        list2 = ytw0.f(map8).b;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        it3 = list2.iterator();
                        while (true) {
                            list3 = list2;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str1111 = ((iyl1) it3.next()).a;
                            avw0 avw0Var15 = avw0Var4;
                            String str1112 = cyp0Var2.a;
                            lpz lpzVar13 = lpzVar;
                            String str1113 = cyp0Var2.b;
                            avw0Var15.getClass();
                            arrayList.add(avw0.e((str1113 + "/" + str1112 + "/" + str1111).getBytes(nne.a)));
                            list2 = list3;
                            avw0Var4 = avw0Var15;
                            it3 = it3;
                            lpzVar = lpzVar13;
                        }
                        lpzVar2 = lpzVar;
                        str5.getClass();
                        rm5Var4.L(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it13 = it4;
                            if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it13;
                        }
                        yn0 yn0Var8 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                        jxuVar.a = null;
                        jxuVar.b = null;
                        jxuVar.c = null;
                        jxuVar.d = null;
                        jxuVar.e = null;
                        jxuVar.f = null;
                        jxuVar.g = null;
                        jxuVar.h = null;
                        jxuVar.i = str5;
                        jxuVar.t = null;
                        jxuVar.X = null;
                        jxuVar.Y = z2;
                        jxuVar.Z = i2;
                        jxuVar.O0 = 5;
                        objS = smo1.s(yn0Var8, jxuVar);
                        if (objS != d9nVar) {
                            str6 = str5;
                            zBooleanValue = ((Boolean) objS).booleanValue();
                            str6.getClass();
                            if (zBooleanValue) {
                                lpzVar3 = lpzVar2;
                            } else {
                                lpzVar3 = lpzVar5;
                            }
                            return a(str6, lpzVar3);
                        }
                    } else {
                        zuc0Var2 = zuc0Var;
                        if (zuc0Var2 == null) {
                            str5.getClass();
                            rm5Var4.L(str5, list);
                            return a(str5, lpzVar4);
                        }
                        lpzVar = lpzVar4;
                        Map map9 = zuc0Var2.g;
                        ytw0Var4.getClass();
                        list2 = ytw0.f(map9).b;
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        it3 = list2.iterator();
                        while (true) {
                            list3 = list2;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str1114 = ((iyl1) it3.next()).a;
                            avw0 avw0Var16 = avw0Var4;
                            String str1115 = cyp0Var2.a;
                            lpz lpzVar14 = lpzVar;
                            String str1116 = cyp0Var2.b;
                            avw0Var16.getClass();
                            arrayList.add(avw0.e((str1116 + "/" + str1115 + "/" + str1114).getBytes(nne.a)));
                            list2 = list3;
                            avw0Var4 = avw0Var16;
                            it3 = it3;
                            lpzVar = lpzVar14;
                        }
                        lpzVar2 = lpzVar;
                        str5.getClass();
                        rm5Var4.L(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list3.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it14 = it4;
                            if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it14;
                        }
                        yn0 yn0Var9 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                        jxuVar.a = null;
                        jxuVar.b = null;
                        jxuVar.c = null;
                        jxuVar.d = null;
                        jxuVar.e = null;
                        jxuVar.f = null;
                        jxuVar.g = null;
                        jxuVar.h = null;
                        jxuVar.i = str5;
                        jxuVar.t = null;
                        jxuVar.X = null;
                        jxuVar.Y = z2;
                        jxuVar.Z = i2;
                        jxuVar.O0 = 5;
                        objS = smo1.s(yn0Var9, jxuVar);
                        if (objS != d9nVar) {
                            str6 = str5;
                            zBooleanValue = ((Boolean) objS).booleanValue();
                            str6.getClass();
                            if (zBooleanValue) {
                                lpzVar3 = lpzVar2;
                            } else {
                                lpzVar3 = lpzVar5;
                            }
                            return a(str6, lpzVar3);
                        }
                    }
                }
            } else {
                ytw0 ytw0Var12 = ytw0Var3;
                int i10 = i;
                cyp0Var2 = cyp0Var;
                i2 = i10;
                String str120 = str2;
                str4 = str3;
                avw0Var4 = avw0Var3;
                xaz0Var4 = xaz0Var3;
                rm5Var4 = rm5Var3;
                tz01Var4 = tz01Var3;
                concurrentHashMap4 = concurrentHashMap3;
                str5 = str120;
                z2 = z;
                ytw0Var4 = ytw0Var12;
                list = list4;
                wsc0Var2 = wsc0Var;
                it = wsc0Var2.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (u890.j(((zuc0) next).c, str5)) {
                        break;
                        break;
                    }
                    it = it2;
                }
                zuc0Var = (zuc0) next;
                if (zuc0Var == null) {
                    zuc0Var2 = zuc0Var;
                    if (zuc0Var2 == null) {
                        str5.getClass();
                        rm5Var4.L(str5, list);
                        return a(str5, lpzVar4);
                    }
                    lpzVar = lpzVar4;
                    Map map10 = zuc0Var2.g;
                    ytw0Var4.getClass();
                    list2 = ytw0.f(map10).b;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    it3 = list2.iterator();
                    while (true) {
                        list3 = list2;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str1117 = ((iyl1) it3.next()).a;
                        avw0 avw0Var17 = avw0Var4;
                        String str1118 = cyp0Var2.a;
                        lpz lpzVar15 = lpzVar;
                        String str1119 = cyp0Var2.b;
                        avw0Var17.getClass();
                        arrayList.add(avw0.e((str1119 + "/" + str1118 + "/" + str1117).getBytes(nne.a)));
                        list2 = list3;
                        avw0Var4 = avw0Var17;
                        it3 = it3;
                        lpzVar = lpzVar15;
                    }
                    lpzVar2 = lpzVar;
                    str5.getClass();
                    rm5Var4.L(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it15 = it4;
                        if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it15;
                    }
                    yn0 yn0Var10 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                    jxuVar.a = null;
                    jxuVar.b = null;
                    jxuVar.c = null;
                    jxuVar.d = null;
                    jxuVar.e = null;
                    jxuVar.f = null;
                    jxuVar.g = null;
                    jxuVar.h = null;
                    jxuVar.i = str5;
                    jxuVar.t = null;
                    jxuVar.X = null;
                    jxuVar.Y = z2;
                    jxuVar.Z = i2;
                    jxuVar.O0 = 5;
                    objS = smo1.s(yn0Var10, jxuVar);
                    if (objS != d9nVar) {
                        str6 = str5;
                        zBooleanValue = ((Boolean) objS).booleanValue();
                        str6.getClass();
                        if (zBooleanValue) {
                            lpzVar3 = lpzVar2;
                        } else {
                            lpzVar3 = lpzVar5;
                        }
                        return a(str6, lpzVar3);
                    }
                } else {
                    zuc0Var2 = zuc0Var;
                    if (zuc0Var2 == null) {
                        str5.getClass();
                        rm5Var4.L(str5, list);
                        return a(str5, lpzVar4);
                    }
                    lpzVar = lpzVar4;
                    Map map11 = zuc0Var2.g;
                    ytw0Var4.getClass();
                    list2 = ytw0.f(map11).b;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    it3 = list2.iterator();
                    while (true) {
                        list3 = list2;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str11110 = ((iyl1) it3.next()).a;
                        avw0 avw0Var18 = avw0Var4;
                        String str11111 = cyp0Var2.a;
                        lpz lpzVar16 = lpzVar;
                        String str11112 = cyp0Var2.b;
                        avw0Var18.getClass();
                        arrayList.add(avw0.e((str11112 + "/" + str11111 + "/" + str11110).getBytes(nne.a)));
                        list2 = list3;
                        avw0Var4 = avw0Var18;
                        it3 = it3;
                        lpzVar = lpzVar16;
                    }
                    lpzVar2 = lpzVar;
                    str5.getClass();
                    rm5Var4.L(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list3.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it16 = it4;
                        if (!rm5Var4.n(str5, avw0.e(cy30.p(cyp0Var2.b, "/", cyp0Var2.a, "/", ((iyl1) next2).a).getBytes(nne.a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it16;
                    }
                    yn0 yn0Var11 = new yn0(arrayList2, l261.a(8), cyp0Var2, str5, rm5Var4, tz01Var4, xaz0Var4, (lnm) null);
                    jxuVar.a = null;
                    jxuVar.b = null;
                    jxuVar.c = null;
                    jxuVar.d = null;
                    jxuVar.e = null;
                    jxuVar.f = null;
                    jxuVar.g = null;
                    jxuVar.h = null;
                    jxuVar.i = str5;
                    jxuVar.t = null;
                    jxuVar.X = null;
                    jxuVar.Y = z2;
                    jxuVar.Z = i2;
                    jxuVar.O0 = 5;
                    objS = smo1.s(yn0Var11, jxuVar);
                    if (objS != d9nVar) {
                        str6 = str5;
                        zBooleanValue = ((Boolean) objS).booleanValue();
                        str6.getClass();
                        if (zBooleanValue) {
                            lpzVar3 = lpzVar2;
                        } else {
                            lpzVar3 = lpzVar5;
                        }
                        return a(str6, lpzVar3);
                    }
                }
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(reo reoVar, String str, rm5 rm5Var, tz01 tz01Var, xaz0 xaz0Var, onm onmVar) {
        mxu mxuVar;
        reo reoVar2;
        rm5 rm5Var2;
        if (onmVar instanceof mxu) {
            mxuVar = (mxu) onmVar;
            int i = mxuVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxuVar.f = i - Integer.MIN_VALUE;
            } else {
                mxuVar = new mxu(onmVar);
            }
        } else {
            mxuVar = new mxu(onmVar);
        }
        Object objG = mxuVar.e;
        int i2 = mxuVar.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            String str2 = reoVar.a;
            String str3 = reoVar.b;
            String str4 = reoVar.c;
            mxuVar.a = reoVar;
            mxuVar.b = str;
            mxuVar.c = rm5Var;
            mxuVar.d = xaz0Var;
            mxuVar.f = 1;
            objG = tz01Var.g(str2, str3, str4, mxuVar);
            if (objG != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            xaz0Var = mxuVar.d;
            rm5Var = mxuVar.c;
            str = mxuVar.b;
            reoVar = mxuVar.a;
            hm5.M(objG);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rm5Var2 = mxuVar.c;
            str = mxuVar.b;
            reoVar2 = mxuVar.a;
            hm5.M(objG);
        }
        Object obj2 = rm5Var2.b;
        String strE = avw0.e(cy30.p(reoVar2.c, "/", reoVar2.b, "/", reoVar2.a).getBytes(nne.a));
        rm5Var2.P(str).mkdirs();
        rm5.Q(rm5Var2.n(str, strE), (byte[]) objG);
        return rih1.a;
        mxuVar.a = reoVar;
        mxuVar.b = str;
        mxuVar.c = rm5Var;
        mxuVar.d = null;
        mxuVar.f = 2;
        objG = xaz0Var.c((String) objG, mxuVar);
        if (objG != obj) {
            rm5 rm5Var3 = rm5Var;
            reoVar2 = reoVar;
            rm5Var2 = rm5Var3;
            Object obj3 = rm5Var2.b;
            String strE2 = avw0.e(cy30.p(reoVar2.c, "/", reoVar2.b, "/", reoVar2.a).getBytes(nne.a));
            rm5Var2.P(str).mkdirs();
            rm5.Q(rm5Var2.n(str, strE2), (byte[]) objG);
            return rih1.a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object d(String str, onm onmVar, xrc0 xrc0Var) {
        nxu nxuVar;
        if (onmVar instanceof nxu) {
            nxuVar = (nxu) onmVar;
            int i = nxuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxuVar.b = i - Integer.MIN_VALUE;
            } else {
                nxuVar = new nxu(onmVar);
            }
        } else {
            nxuVar = new nxu(onmVar);
        }
        Object objF = nxuVar.a;
        int i2 = nxuVar.b;
        if (i2 == 0) {
            hm5.M(objF);
            trc0 trc0Var = new trc0(a, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
            nxuVar.b = 1;
            objF = ((rsc0) xrc0Var).f(str, trc0Var, nxuVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        oy21 oy21Var = (py21) objF;
        if (oy21Var instanceof ly21) {
            return null;
        }
        if (oy21Var instanceof oy21) {
            return (wsc0) oy21Var.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(java.util.List r8, p.xrc0 r9, p.m2l1 r10, p.onm r11) {
        /*
            boolean r0 = r11 instanceof p.oxu
            if (r0 == 0) goto L13
            r0 = r11
            p.oxu r0 = (p.oxu) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.oxu r0 = new p.oxu
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f
            int r1 = r0.g
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L31
            int r8 = r0.e
            java.lang.String r9 = r0.d
            java.util.Iterator r10 = r0.c
            p.m2l1 r1 = r0.b
            p.xrc0 r5 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L6d java.util.concurrent.CancellationException -> L97
            goto L67
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L37:
            p.hm5.M(r11)
            java.util.Iterator r8 = r8.iterator()
            r11 = r10
            r10 = r8
            r8 = r3
        L41:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.a = r9     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            r0.b = r11     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            r0.c = r10     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            r0.d = r1     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            r0.e = r8     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            r0.g = r4     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            java.lang.Object r5 = p.ygu0.a(r1, r9, r11, r0)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L97
            p.d9n r6 = p.d9n.a
            if (r5 != r6) goto L62
            return r6
        L62:
            r7 = r5
            r5 = r9
            r9 = r1
            r1 = r11
            r11 = r7
        L67:
            p.ifg r11 = (p.ifg) r11     // Catch: java.lang.Exception -> L6d java.util.concurrent.CancellationException -> L97
            goto L6f
        L6a:
            r5 = r9
            r9 = r1
            r1 = r11
        L6d:
            p.ffg r11 = p.ffg.a
        L6f:
            boolean r6 = r11 instanceof p.hfg
            if (r6 == 0) goto L85
            p.dzl1 r10 = new p.dzl1
            p.bzl1 r0 = new p.bzl1
            p.hfg r11 = (p.hfg) r11
            p.cyp0 r11 = r11.a
            r0.<init>(r9, r11)
            if (r8 == 0) goto L81
            r3 = r4
        L81:
            r10.<init>(r0, r3)
            return r10
        L85:
            boolean r9 = r11 instanceof p.gfg
            if (r9 != 0) goto L95
            boolean r8 = r11 instanceof p.ffg
            if (r8 == 0) goto L91
            r11 = r1
            r8 = r4
        L8f:
            r9 = r5
            goto L41
        L91:
            p.eg.o()
            return r2
        L95:
            r11 = r1
            goto L8f
        L97:
            r8 = move-exception
            throw r8
        L99:
            p.dzl1 r9 = new p.dzl1
            if (r8 == 0) goto L9e
            r3 = r4
        L9e:
            r9.<init>(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qxu.e(java.util.List, p.xrc0, p.m2l1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(kxu kxuVar, onm onmVar) {
        pxu pxuVar;
        if (onmVar instanceof pxu) {
            pxuVar = (pxu) onmVar;
            int i = pxuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pxuVar.c = i - Integer.MIN_VALUE;
            } else {
                pxuVar = new pxu(onmVar);
            }
        } else {
            pxuVar = new pxu(onmVar);
        }
        Object obj = pxuVar.b;
        int i2 = pxuVar.c;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                pxuVar.a = kxuVar;
                pxuVar.c = 1;
                Object objInvoke = kxuVar.invoke(pxuVar);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
            }
            if (i2 == 1) {
                kxu kxuVar2 = pxuVar.a;
                hm5.M(obj);
                return obj;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            pxuVar.a = null;
            pxuVar.c = 2;
            Object objInvoke2 = kxuVar.invoke(pxuVar);
            if (objInvoke2 != d9nVar) {
                return objInvoke2;
            }
        }
    }
}
