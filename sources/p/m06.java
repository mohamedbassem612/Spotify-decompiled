package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m06 {
    public final wt1 a;
    public final av1 b;
    public final pbq c;

    public /* synthetic */ m06(wt1 wt1Var, av1 av1Var, pbq pbqVar) {
        this.a = wt1Var;
        this.b = av1Var;
        this.c = pbqVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(xo1 xo1Var, onm onmVar) {
        l06 l06Var;
        wt1 wt1Var;
        if (onmVar instanceof l06) {
            l06Var = (l06) onmVar;
            int i = l06Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l06Var.c = i - Integer.MIN_VALUE;
            } else {
                l06Var = new l06(this, onmVar);
            }
        } else {
            l06Var = new l06(this, onmVar);
        }
        l06 l06Var2 = l06Var;
        Object objU = l06Var2.a;
        int i2 = l06Var2.c;
        if (i2 == 0) {
            hm5.M(objU);
            String str = (String) o7h.s0(this.b.d);
            if (str == null) {
                str = "";
            }
            Set set = xo1Var.a;
            int iS = zno1.s(q7h.U(set, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            Iterator it = set.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                wt1Var = this.a;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                linkedHashMap.put(next, wt1Var.a((String) next, str));
            }
            Set set2 = xo1Var.b;
            int iS2 = zno1.s(q7h.U(set2, 10));
            if (iS2 < 16) {
                iS2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
            for (Object obj : set2) {
                linkedHashMap2.put(obj, wt1Var.b((String) obj, str));
            }
            Set set3 = xo1Var.a;
            Set set4 = xo1Var.b;
            l06Var2.c = 1;
            objU = pbq.u(this.c, set3, set4, linkedHashMap, linkedHashMap2, false, l06Var2, 32);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        return new ns1((bum0) objU);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r12 == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r12 == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.yo1 r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.p06
            if (r0 == 0) goto L14
            r0 = r12
            p.p06 r0 = (p.p06) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.p06 r0 = new p.p06
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.b
            int r0 = r7.d
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L34
            if (r0 != r1) goto L2d
            p.yo1 r11 = r7.a
            p.hm5.M(r12)
            goto Lac
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L34:
            p.yo1 r11 = r7.a
            p.hm5.M(r12)
            goto L78
        L3a:
            p.hm5.M(r12)
            boolean r12 = r11.b
            java.lang.String r0 = r11.a
            p.av1 r3 = r10.b
            java.util.List r4 = r3.d
            r5 = r1
            p.pbq r1 = r10.c
            r6 = r2
            p.w7x r2 = p.w7x.a
            java.lang.String r8 = ""
            p.d9n r9 = p.d9n.a
            p.wt1 r10 = r10.a
            if (r12 == 0) goto L82
            java.lang.Object r12 = p.o7h.s0(r4)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L5c
            goto L5d
        L5c:
            r8 = r12
        L5d:
            p.tv80 r10 = r10.b(r0, r8)
            java.util.Set r3 = java.util.Collections.singleton(r0)
            java.util.Map r5 = java.util.Collections.singletonMap(r0, r10)
            r7.a = r11
            r7.d = r6
            r4 = 0
            r6 = 0
            r8 = 40
            java.lang.Object r12 = p.pbq.u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r9) goto L78
            goto Lab
        L78:
            p.bum0 r12 = (p.bum0) r12
            p.rs1 r10 = new p.rs1
            java.lang.String r11 = r11.a
            r10.<init>(r12, r11)
            return r10
        L82:
            java.lang.Object r12 = p.o7h.s0(r4)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L8b
            goto L8c
        L8b:
            r8 = r12
        L8c:
            p.tv80 r10 = r10.a(r0, r8)
            r12 = r3
            r3 = r2
            java.util.Set r2 = java.util.Collections.singleton(r0)
            java.util.Map r4 = java.util.Collections.singletonMap(r0, r10)
            p.gy1 r10 = r12.i
            boolean r6 = r10 instanceof p.ey1
            r7.a = r11
            r7.d = r5
            r5 = 0
            r8 = 16
            java.lang.Object r12 = p.pbq.u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r9) goto Lac
        Lab:
            return r9
        Lac:
            p.bum0 r12 = (p.bum0) r12
            p.rs1 r10 = new p.rs1
            java.lang.String r11 = r11.a
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m06.b(p.yo1, p.onm):java.lang.Object");
    }
}
