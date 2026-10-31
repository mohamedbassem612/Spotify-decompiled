package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class es20 {
    public final oso a;
    public final i6b b;
    public final sso c;
    public final c9n d;
    public final bpb1 e;
    public final xe01 f;
    public final bpb1 g;
    public final xe01 h;
    public final bpb1 i;
    public final xe01 j;
    public xab1 k;
    public fso l;

    public es20(oso osoVar, i6b i6bVar, sso ssoVar, c9n c9nVar) {
        this.a = osoVar;
        this.b = i6bVar;
        this.c = ssoVar;
        this.d = c9nVar;
        bpb1 bpb1VarB = gio1.b(new gw20(z6x.a, b7x.a, false));
        this.e = bpb1VarB;
        this.f = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b((Object) null);
        this.g = bpb1VarB2;
        this.h = d5p1.h(bpb1VarB2);
        bpb1 bpb1VarB3 = gio1.b((Object) null);
        this.i = bpb1VarB3;
        this.j = d5p1.h(bpb1VarB3);
    }

    public final void a(bs20 bs20Var) {
        gw20 gw20VarA;
        bpb1 bpb1Var = this.e;
        gw20 gw20Var = (gw20) bpb1Var.getValue();
        boolean z = bs20Var instanceof as20;
        if (z) {
            gw20VarA = gw20.a(gw20Var, null, o7h.O0(((as20) bs20Var).a, gw20Var.b), false, 1);
        } else {
            if (!(bs20Var instanceof zr20) && !(bs20Var instanceof yr20)) {
                eg.o();
                return;
            }
            gw20VarA = gw20.a(gw20Var, null, null, false, 3);
        }
        bpb1Var.m((Object) null, gw20VarA);
        if (z) {
            return;
        }
        if (bs20Var instanceof zr20) {
            this.g.l(((zr20) bs20Var).a);
        } else if (!(bs20Var instanceof yr20)) {
            eg.o();
        } else {
            this.i.m((Object) null, ((yr20) bs20Var).a);
        }
    }

    public final void b() {
        bpb1 bpb1Var;
        Object value;
        xab1 xab1Var = this.k;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.k = null;
        do {
            bpb1Var = this.e;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, gw20.a((gw20) value, null, null, false, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(List list, Map map, dw20 dw20Var, onm onmVar) {
        cs20 cs20Var;
        if (onmVar instanceof cs20) {
            cs20Var = (cs20) onmVar;
            int i = cs20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cs20Var.c = i - Integer.MIN_VALUE;
            } else {
                cs20Var = new cs20(this, onmVar);
            }
        } else {
            cs20Var = new cs20(this, onmVar);
        }
        Object objG = cs20Var.a;
        int i2 = cs20Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new jvb1(((evb1) it.next()).a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                jvb1 jvb1Var = (jvb1) obj;
                String str = jvb1Var.a;
                if (!map.containsKey(jvb1Var)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                bhn0.f("Missing results for steps: ".concat(o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, ll20.Y0, 31)));
                return null;
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = ((evb1) it2.next()).a;
                Object obj2 = map.get(new jvb1(str2));
                if (obj2 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                arrayList3.add(new oyh(str2, (mvb1) obj2));
            }
            fso fsoVar = dw20Var.a;
            cs20Var.c = 1;
            objG = this.b.g(fsoVar, arrayList3, cs20Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        return new zr20((nv20) objG);
    }

    public final void d() {
        xab1 xab1Var = this.k;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i.l((Object) null);
        bpb1 bpb1Var = this.e;
        gw20 gw20Var = (gw20) bpb1Var.getValue();
        fso fsoVar = this.l;
        if (fsoVar == null) {
            u890.C("input");
            throw null;
        }
        List<evb1> list = gw20Var.b;
        Map map = gw20Var.a;
        ArrayList arrayList = new ArrayList();
        for (evb1 evb1Var : list) {
            mvb1 mvb1Var = (mvb1) map.get(new jvb1(evb1Var.a));
            oyh oyhVar = mvb1Var != null ? new oyh(evb1Var.a, mvb1Var) : null;
            if (oyhVar != null) {
                arrayList.add(oyhVar);
            }
        }
        dw20 dw20Var = new dw20(fsoVar, arrayList);
        bpb1Var.m((Object) null, gw20.a(gw20Var, null, null, true, 3));
        xab1 xab1VarT = fn31.T(this.d, (o8n) null, 2, new ary(this, gw20Var, dw20Var, (lnm) null, (byte) 5), 1);
        this.k = xab1VarT;
        xab1VarT.start();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r10 == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r7, java.util.Map r8, p.dw20 r9, p.onm r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.ds20
            if (r0 == 0) goto L13
            r0 = r10
            p.ds20 r0 = (p.ds20) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.ds20 r0 = new p.ds20
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.util.List r6 = r0.a
            java.util.List r6 = (java.util.List) r6
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L2f
            goto L83
        L2f:
            r6 = move-exception
            goto L8c
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L37:
            p.dw20 r9 = r0.c
            java.util.Map r8 = r0.b
            java.util.List r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L2f
            goto L5d
        L43:
            p.hm5.M(r10)
            p.oso r10 = r6.a     // Catch: java.lang.Exception -> L2f
            r1 = r7
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L2f
            r0.a = r1     // Catch: java.lang.Exception -> L2f
            r0.b = r8     // Catch: java.lang.Exception -> L2f
            r0.c = r9     // Catch: java.lang.Exception -> L2f
            r0.f = r3     // Catch: java.lang.Exception -> L2f
            r10.getClass()     // Catch: java.lang.Exception -> L2f
            p.dvb1 r10 = p.oso.a(r9)     // Catch: java.lang.Exception -> L2f
            if (r10 != r5) goto L5d
            goto L82
        L5d:
            p.dvb1 r10 = (p.dvb1) r10     // Catch: java.lang.Exception -> L2f
            boolean r1 = r10 instanceof p.cvb1     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L6c
            p.cvb1 r10 = (p.cvb1) r10     // Catch: java.lang.Exception -> L2f
            p.evb1 r8 = r10.a     // Catch: java.lang.Exception -> L2f
            p.as20 r6 = r6.f(r7, r8)     // Catch: java.lang.Exception -> L2f
            return r6
        L6c:
            p.bvb1 r1 = p.bvb1.a     // Catch: java.lang.Exception -> L2f
            boolean r10 = p.u890.j(r10, r1)     // Catch: java.lang.Exception -> L2f
            if (r10 == 0) goto L86
            r0.a = r4     // Catch: java.lang.Exception -> L2f
            r0.b = r4     // Catch: java.lang.Exception -> L2f
            r0.c = r4     // Catch: java.lang.Exception -> L2f
            r0.f = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object r10 = r6.c(r7, r8, r9, r0)     // Catch: java.lang.Exception -> L2f
            if (r10 != r5) goto L83
        L82:
            return r5
        L83:
            p.bs20 r10 = (p.bs20) r10     // Catch: java.lang.Exception -> L2f
            return r10
        L86:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2f
            r6.<init>()     // Catch: java.lang.Exception -> L2f
            throw r6     // Catch: java.lang.Exception -> L2f
        L8c:
            p.o8n r7 = r0.getContext()
            p.op71.x(r7)
            p.yr20 r7 = new p.yr20
            p.qs20 r8 = new p.qs20
            r8.<init>(r6)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.es20.e(java.util.List, java.util.Map, p.dw20, p.onm):java.lang.Object");
    }

    public final as20 f(List list, evb1 evb1Var) {
        g(evb1Var);
        String str = evb1Var.a;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (u890.j(((evb1) it.next()).a, str)) {
                    bhn0.f(l1d.m("Duplicate step key: ", str));
                    return null;
                }
            }
        }
        return new as20(evb1Var);
    }

    public final void g(evb1 evb1Var) {
        String str = evb1Var.a;
        kvb1 kvb1Var = evb1Var.b;
        if (ihc1.y0(str)) {
            eg.m("Step key must not be blank");
            return;
        }
        if (!this.c.a.containsKey(kvb1Var.getClass())) {
            bhn0.f("Unknown step parameters: ".concat(kvb1Var.getClass().getName()));
            return;
        }
        mvb1 mvb1Var = evb1Var.c;
        if (mvb1Var == null || kvb1Var.K0(mvb1Var)) {
            return;
        }
        bhn0.f(gvg.h("Unexpected result ", mvb1Var.getClass().getName(), " for step ", evb1Var.a));
    }
}
