package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e4j0 {
    public static final long i;
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final j3j0 a;
    public final ynb0 b;
    public final q8n c;
    public final llm d;
    public final idd1 e;
    public final bpb1 f;
    public final bpb1 g;
    public final bpb1 h;

    static {
        new lfb((byte) 16);
        ytw0 ytw0Var = jfv.b;
        i = fdg1.k0(1, ngv.SECONDS);
        j = fdg1.k0(500, ngv.MILLISECONDS);
    }

    public e4j0(j3j0 j3j0Var, caq caqVar, q8n q8nVar, ynb0 ynb0Var, q8n q8nVar2) {
        this.a = j3j0Var;
        this.b = ynb0Var;
        this.c = q8nVar2;
        this.d = smo1.e(ha71.A(op71.f(), q8nVar));
        this.e = new idd1(new dvg0(caqVar, this, (byte) 12));
        z6x z6xVar = z6x.a;
        this.f = gio1.b(z6xVar);
        this.g = gio1.b(z6xVar);
        this.h = gio1.b(t3j0.a);
    }

    public static boolean a(s3j0 s3j0Var, n3j0 n3j0Var) {
        return s3j0Var.c().a().a(n3j0Var, s3j0Var.a());
    }

    public static final void d(List list, e4j0 e4j0Var) {
        Object value;
        List list2;
        ArrayList arrayList;
        List<u3j0> list3 = list;
        for (u3j0 u3j0Var : list3) {
            u3j0Var.b().b().invoke(Boolean.valueOf(u3j0Var.a()));
        }
        bpb1 bpb1Var = e4j0Var.g;
        do {
            value = bpb1Var.getValue();
            list2 = (List) value;
            arrayList = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((u3j0) it.next()).b());
            }
        } while (!bpb1Var.k(value, o7h.K0(list2, arrayList)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(q4j0 q4j0Var, d3j0 d3j0Var, onm onmVar) {
        v3j0 v3j0Var;
        if (onmVar instanceof v3j0) {
            v3j0Var = (v3j0) onmVar;
            int i2 = v3j0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3j0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                v3j0Var = new v3j0(this, onmVar);
            }
        } else {
            v3j0Var = new v3j0(this, onmVar);
        }
        Object objH = v3j0Var.a;
        int i3 = v3j0Var.c;
        if (i3 == 0) {
            hm5.M(objH);
            bpb1 bpb1Var = this.h;
            Object value = bpb1Var.getValue();
            t3j0 t3j0Var = t3j0.a;
            q8n q8nVar = this.c;
            if (value == t3j0Var) {
                bpb1Var.m(null, t3j0.b);
                c921.y(this.d, q8nVar, 0, new uug0(this, (lnm) null, (byte) 5), 2);
            }
            n3j0 n3j0Var = new n3j0(q4j0Var, d3j0Var);
            ((l0n0) this.b.get()).getClass();
            l4f0 l4f0Var = new l4f0(this, n3j0Var, l0n0.a(q4j0Var, d3j0Var), (lnm) null, (byte) 8);
            v3j0Var.c = 1;
            objH = c921.H(q8nVar, l4f0Var, v3j0Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        return yah0.m(((Boolean) objH).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    public final boolean c(n3j0 n3j0Var, m3j0 m3j0Var, List list) {
        boolean z;
        ArrayList arrayListB = lfb.b(list);
        Iterable iterable = (Iterable) this.g.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!a((s3j0) it.next(), n3j0Var)) {
                    }
                } else if (m3j0Var.a().a(arrayListB)) {
                    z = true;
                }
                z = false;
            }
        } else if (m3j0Var.a().a(arrayListB)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tgg tggVar = new tgg(new x3j0(m3j0Var, list, n3j0Var, this, (lnm) null), this, n3j0Var, (lnm) null, (byte) 1);
            bpb1 bpb1Var = this.h;
            bpb1Var.getClass();
            bpb1Var.m(null, t3j0.c);
            c921.y(this.d, (o8n) null, 0, new d7i0(tggVar, this, (lnm) null, (byte) 5), 3);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r4 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.bpb1 r5, p.n3j0 r6, p.q3j0 r7, p.onm r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p.z3j0
            if (r0 == 0) goto L13
            r0 = r8
            p.z3j0 r0 = (p.z3j0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.z3j0 r0 = new p.z3j0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.c
            int r8 = r0.e
            r1 = 1
            if (r8 == 0) goto L36
            if (r8 != r1) goto L2f
            p.s3j0 r5 = r0.b
            p.bpb1 r6 = r0.a
            p.hm5.M(r4)     // Catch: java.lang.Throwable -> L2b
            r8 = r5
            r5 = r6
            goto L69
        L2b:
            r4 = move-exception
            r8 = r5
            r5 = r6
            goto L88
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L36:
            p.hm5.M(r4)
            p.ayh r4 = p.sap1.a()
            p.s3j0 r8 = new p.s3j0
            p.m3t r2 = new p.m3t
            r2.<init>(r4, r1)
            r8.<init>(r6, r7, r2)
        L47:
            java.lang.Object r6 = r5.getValue()
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r7 = p.o7h.O0(r8, r7)
            boolean r6 = r5.k(r6, r7)
            if (r6 == 0) goto L47
            r0.a = r5     // Catch: java.lang.Throwable -> L87
            r0.b = r8     // Catch: java.lang.Throwable -> L87
            r0.e = r1     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r4.Q(r0)     // Catch: java.lang.Throwable -> L87
            p.d9n r6 = p.d9n.a
            if (r4 != r6) goto L69
            return r6
        L69:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L87
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L87
        L6f:
            java.lang.Object r6 = r5.getValue()
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = p.o7h.J0(r7, r8)
            boolean r6 = r5.k(r6, r7)
            if (r6 == 0) goto L6f
            java.lang.Boolean r4 = p.yah0.m(r4)
            return r4
        L87:
            r4 = move-exception
        L88:
            java.lang.Object r6 = r5.getValue()
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = p.o7h.J0(r7, r8)
            boolean r6 = r5.k(r6, r7)
            if (r6 != 0) goto L9c
            goto L88
        L9c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e4j0.e(p.bpb1, p.n3j0, p.q3j0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (p.xpn1.H(r0) == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.k6w0 r5, p.onm r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p.d4j0
            if (r0 == 0) goto L13
            r0 = r6
            p.d4j0 r0 = (p.d4j0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.d4j0 r0 = new p.d4j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.c
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r6 == 0) goto L35
            if (r6 == r2) goto L31
            if (r6 != r1) goto L2a
            p.hm5.M(r4)     // Catch: java.lang.Exception -> L56
            goto L5c
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L31:
            p.hm5.M(r4)     // Catch: java.lang.Exception -> L56
            goto L45
        L35:
            p.hm5.M(r4)
            p.iu30 r4 = r5.b()     // Catch: java.lang.Exception -> L56
            r0.c = r2     // Catch: java.lang.Exception -> L56
            java.lang.Object r4 = r4.invoke(r0)     // Catch: java.lang.Exception -> L56
            if (r4 != r3) goto L45
            goto L55
        L45:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L56
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L5c
            r0.c = r1     // Catch: java.lang.Exception -> L56
            java.lang.Object r4 = p.xpn1.H(r0)     // Catch: java.lang.Exception -> L56
            if (r4 != r3) goto L5c
        L55:
            return r3
        L56:
            r4 = move-exception
            java.lang.String r5 = "Exception while dismissing message"
            p.n57.g(r5, r4)
        L5c:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e4j0.f(p.k6w0, p.onm):java.lang.Object");
    }
}
