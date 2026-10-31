package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f7c {
    public final xrc0 a;
    public final iyc0 b;
    public final cua c;
    public final trc0 d;

    public f7c(xrc0 xrc0Var, iyc0 iyc0Var, l7c l7cVar, cua cuaVar) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = cuaVar;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.d0();
        sku0VarP.R();
        sku0VarP.C();
        sku0VarP.G();
        sku0VarP.t();
        hru0VarS.w(sku0VarP.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        this.d = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.d7c
            if (r0 == 0) goto L13
            r0 = r8
            p.d7c r0 = (p.d7c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.d7c r0 = new p.d7c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.a
            p.hm5.M(r8)
            goto L4b
        L37:
            p.hm5.M(r8)
            r0.a = r7
            r0.d = r4
            p.iyc0 r8 = r6.b
            p.xyc0 r8 = (p.xyc0) r8
            p.ddd1 r1 = p.ddd1.e1
            java.lang.Object r8 = r8.u(r7, r1, r0)
            if (r8 != r5) goto L4b
            goto L5b
        L4b:
            r0.a = r2
            r0.d = r3
            p.xrc0 r8 = r6.a
            p.rsc0 r8 = (p.rsc0) r8
            p.trc0 r1 = r6.d
            java.lang.Object r8 = r8.f(r7, r1, r0)
            if (r8 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.py21 r8 = (p.py21) r8
            p.rs7 r7 = new p.rs7
            r0 = 16
            r7.<init>(r6, r0)
            r8.getClass()
            boolean r6 = r8 instanceof p.ly21
            if (r6 == 0) goto L76
            p.ly21 r8 = (p.ly21) r8
            p.jy21 r6 = r8.a
            p.ly21 r7 = new p.ly21
            r7.<init>(r6)
            return r7
        L76:
            boolean r6 = r8 instanceof p.oy21
            if (r6 == 0) goto L83
            p.oy21 r8 = (p.oy21) r8
            java.lang.Object r6 = r8.a
            java.lang.Object r6 = r7.invoke(r6)
            return r6
        L83:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7c.a(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00dc, please report this as an issue */
    public Object b(ArrayList arrayList, q8c q8cVar, onm onmVar) {
        e7c e7cVar;
        List list;
        List list2;
        q8c q8cVar2;
        Map map;
        ArrayList arrayList2;
        ly21 ly21Var;
        zf51 zf51VarJ;
        if (onmVar instanceof e7c) {
            e7cVar = (e7c) onmVar;
            int i = e7cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7cVar.e = i - Integer.MIN_VALUE;
            } else {
                e7cVar = new e7c(this, onmVar);
            }
        } else {
            e7cVar = new e7c(this, onmVar);
        }
        Object objG = e7cVar.c;
        int i2 = e7cVar.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            e7cVar.a = arrayList;
            e7cVar.b = q8cVar;
            e7cVar.e = 1;
            xyc0 xyc0Var = this.b;
            if (c921.H(xyc0Var.c, new ss90(xyc0Var, arrayList, (lnm) null, (byte) 28), e7cVar) != d9nVar) {
            }
            list = arrayList;
            return d9nVar;
        }
        if (i2 == 1) {
            q8cVar = e7cVar.b;
            List list3 = e7cVar.a;
            hm5.M(objG);
            list = list3;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q8cVar2 = e7cVar.b;
            List list4 = e7cVar.a;
            hm5.M(objG);
            list2 = list4;
        }
        map = (Map) objG;
        List<String> list5 = list2;
        arrayList2 = new ArrayList(q7h.U(list5, 10));
        for (String str : list5) {
            ly21Var = (py21) map.get(str);
            if (ly21Var != null) {
                zf51VarJ = null;
            } else if (ly21Var instanceof ly21) {
                n57.e("BrowseDestination: Error fetching multiget for uri " + str + ". Message: " + ly21Var.a);
                zf51VarJ = null;
            } else {
                if (ly21Var instanceof oy21) {
                    eg.o();
                    return null;
                }
                zf51VarJ = this.c.j((wsc0) ((oy21) ly21Var).a, str, q8cVar2);
            }
            arrayList2.add(zf51VarJ);
        }
        ArrayList arrayListO0 = o7h.o0(arrayList2);
        return (arrayListO0.isEmpty() || list2.isEmpty()) ? new oy21(arrayListO0) : new ly21(new fy21("Failed to load any sections"));
        list = arrayList;
        List list6 = list;
        int iS = zno1.s(q7h.U(list6, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list6) {
            linkedHashMap.put(obj, new wrc0((String) obj, this.d));
        }
        Integer num = new Integer(20);
        e7cVar.a = list;
        e7cVar.b = q8cVar;
        e7cVar.e = 2;
        objG = this.a.g(linkedHashMap, num, e7cVar);
        if (objG != d9nVar) {
            q8c q8cVar3 = q8cVar;
            list2 = list;
            q8cVar2 = q8cVar3;
            map = (Map) objG;
            List<String> list7 = list2;
            arrayList2 = new ArrayList(q7h.U(list7, 10));
            while (r0.hasNext()) {
                ly21Var = (py21) map.get(str);
                if (ly21Var != null) {
                    zf51VarJ = null;
                } else if (ly21Var instanceof ly21) {
                    n57.e("BrowseDestination: Error fetching multiget for uri " + str + ". Message: " + ly21Var.a);
                    zf51VarJ = null;
                } else {
                    if (ly21Var instanceof oy21) {
                        eg.o();
                        return null;
                    }
                    zf51VarJ = this.c.j((wsc0) ((oy21) ly21Var).a, str, q8cVar2);
                }
                arrayList2.add(zf51VarJ);
            }
            ArrayList arrayListO1 = o7h.o0(arrayList2);
            if (arrayListO1.isEmpty()) {
            }
        }
        list = arrayList;
        return d9nVar;
    }

    public f7c(xrc0 xrc0Var, iyc0 iyc0Var, cua cuaVar) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = cuaVar;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.d0();
        sku0VarP.G();
        sku0VarP.t();
        hru0VarS.w(sku0VarP.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        this.d = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
    }
}
