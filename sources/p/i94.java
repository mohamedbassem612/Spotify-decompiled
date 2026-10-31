package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i94 implements lxg {
    public final zle1 a;
    public final tif1 b;
    public final ken c;
    public Long d;
    public t45 e;
    public volatile yf f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final CopyOnWriteArraySet i;
    public final Set j;
    public final Set k;
    public String l;
    public final Object m;
    public Boolean n;

    public i94(zle1 zle1Var, f15 f15Var) {
        tif1 tif1VarF = gex0.f();
        ken kenVar = ken.h;
        ken kenVarB = ioo1.B();
        this.a = zle1Var;
        this.b = tif1VarF;
        this.c = kenVarB;
        this.e = ((s45) zle1Var).a("cold_startup");
        this.f = pzh.c;
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new CopyOnWriteArraySet();
        this.j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.k = Collections.newSetFromMap(new ConcurrentHashMap());
        this.m = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7) {
        /*
            r6 = this;
            java.util.Set r0 = r6.k
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L2d
            java.util.concurrent.ConcurrentHashMap r6 = r6.h
            java.lang.Object r0 = r6.get(r7)
            if (r0 != 0) goto L1d
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r6.putIfAbsent(r7, r0)
            if (r1 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r7, r0)
            return
        L2d:
            java.util.Set r1 = r6.j
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto L36
            goto L73
        L36:
            p.tif1 r1 = r6.b
            java.lang.String r2 = "cst"
            r1.f(r7, r2)
            p.t45 r1 = r6.e
            if (r1 == 0) goto L44
            r1.g(r7)
        L44:
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r7)
            if (r1 == 0) goto L73
            java.lang.Long r0 = r6.d
            r1 = 0
            if (r0 == 0) goto L67
            long r2 = r0.longValue()
            p.zle1 r0 = r6.a
            p.s45 r0 = (p.s45) r0
            p.pjm0 r0 = r0.a
            long r4 = r0.a()
            long r4 = r4 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 == 0) goto L73
            long r2 = r0.longValue()
            p.ken r6 = r6.c
            r6.a(r2, r7, r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i94.a(java.lang.String):void");
    }

    public final void b(String str) {
        List listL1;
        Long lValueOf;
        t45 t45Var = this.e;
        if (t45Var != null) {
            t45Var.b("first_component", this.f.k());
        }
        if (t45Var != null) {
            t45Var.b("start_intent", String.valueOf(this.f.getIntent()));
        }
        if (!this.g.isEmpty() && t45Var != null) {
            t45Var.b("duplicate_started_points", o7h.y0(this.g.entrySet(), null, null, null, k74.c, 31));
        }
        if (!this.h.isEmpty() && t45Var != null) {
            t45Var.b("duplicate_ended_points", o7h.y0(this.h.entrySet(), null, null, null, k74.d, 31));
        }
        if (t45Var != null) {
            try {
                t45Var.b("thread_count", String.valueOf(Thread.activeCount()));
            } catch (Throwable unused) {
            }
        }
        if (t45Var != null) {
            t45Var.a("first_component_type", this.f.t());
        }
        if (t45Var != null) {
            t45Var.a("outcome", str);
        }
        if (t45Var != null) {
            t45Var.g("cold_startup");
        }
        this.b.f("cold_startup", "cst");
        if (t45Var != null) {
            Long l = this.d;
            if (l != null) {
                lValueOf = Long.valueOf((((s45) this.a).a.a() - l.longValue()) / 1000);
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                this.c.a(lValueOf.longValue(), "cold_startup", str);
            }
        }
        if (t45Var != null) {
            ((s45) this.a).b(t45Var.e());
            this.e = null;
        }
        synchronized (this.m) {
            this.l = str;
            listL1 = o7h.l1(this.i);
            this.i.clear();
        }
        Iterator it = listL1.iterator();
        while (it.hasNext()) {
            ((jxg) it.next()).onColdStartupCompleted(str);
        }
    }

    public final void c() {
        if (this.d != null) {
            return;
        }
        long jA = ((s45) this.a).a.a();
        tif1.a(this.b, "cold_startup", null, 6);
        t45 t45Var = this.e;
        if (t45Var != null) {
            t45Var.i = Long.valueOf(jA);
            t45Var.k.add(new pod(jA, "cold_startup", null, true));
        }
        this.d = Long.valueOf(jA);
        this.c.d(0L, "cold_startup");
        e("app_init");
    }

    public final void d(jxg jxgVar) {
        String str;
        synchronized (this.m) {
            str = this.l;
            if (str == null) {
                this.i.add(jxgVar);
            }
        }
        if (str != null) {
            jxgVar.onColdStartupCompleted(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Set r0 = r4.j
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L2d
            java.util.concurrent.ConcurrentHashMap r4 = r4.g
            java.lang.Object r0 = r4.get(r5)
            if (r0 != 0) goto L1d
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.putIfAbsent(r5, r0)
            if (r1 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r5, r0)
            return
        L2d:
            p.tif1 r1 = r4.b
            r2 = 6
            r3 = 0
            p.tif1.a(r1, r5, r3, r2)
            p.t45 r1 = r4.e
            if (r1 == 0) goto L3c
            r2 = 2
            p.t45.m(r1, r5, r2)
        L3c:
            java.util.Collection r0 = (java.util.Collection) r0
            r0.add(r5)
            if (r1 == 0) goto L68
            java.lang.Long r0 = r4.d
            if (r0 == 0) goto L5d
            long r0 = r0.longValue()
            p.zle1 r2 = r4.a
            p.s45 r2 = (p.s45) r2
            p.pjm0 r2 = r2.a
            long r2 = r2.a()
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L5d:
            if (r3 == 0) goto L68
            long r0 = r3.longValue()
            p.ken r4 = r4.c
            r4.d(r0, r5)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i94.e(java.lang.String):void");
    }
}
