package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q7i0 {
    public final d0r a;
    public final onf0 b;
    public final o3r c = w3p1.o(new l4r(pwc0.w, 1, i6i0.Y0, new j4r(i6i0.c1), i6i0.Z0), i6i0.d1);
    public final o3r d = w3p1.o(new l4r(new xv00(rc11.a.b(hll.class)), 1, i6i0.a1, new j4r(i6i0.W0), i6i0.b1), i6i0.X0);

    public q7i0(d0r d0rVar, onf0 onf0Var) {
        this.a = d0rVar;
        this.b = onf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(o3r o3rVar, Object obj, onm onmVar) {
        m7i0 m7i0Var;
        if (onmVar instanceof m7i0) {
            m7i0Var = (m7i0) onmVar;
            int i = m7i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7i0Var.c = i - Integer.MIN_VALUE;
            } else {
                m7i0Var = new m7i0(this, onmVar);
            }
        } else {
            m7i0Var = new m7i0(this, onmVar);
        }
        Object objJ = m7i0Var.a;
        int i2 = m7i0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(this.a, o3rVar, obj);
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 15);
            m7i0Var.c = 1;
            objJ = b5p1.j(ay8VarF, fca0Var, m7i0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (i1rVar instanceof i1r) {
            return i1rVar.a;
        }
        if (i1rVar instanceof h1r) {
            eg.m(((h1r) i1rVar).a.getMessage());
            return null;
        }
        eg.m("Unexpected DataResult state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        n7i0 n7i0Var;
        if (onmVar instanceof n7i0) {
            n7i0Var = (n7i0) onmVar;
            int i = n7i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7i0Var.c = i - Integer.MIN_VALUE;
            } else {
                n7i0Var = new n7i0(this, onmVar);
            }
        } else {
            n7i0Var = new n7i0(this, onmVar);
        }
        Object objA = n7i0Var.a;
        int i2 = n7i0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                o3r o3rVar = this.d;
                n7i0Var.c = 1;
                objA = a(o3rVar, str, n7i0Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            long jU = jfv.u(((hll) objA).a, ngv.d);
            if (jU > 0) {
                return new Long(jU);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r8 == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.o7i0
            if (r0 == 0) goto L13
            r0 = r8
            p.o7i0 r0 = (p.o7i0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.o7i0 r0 = new p.o7i0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 == r2) goto L2f
            if (r1 != r3) goto L29
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            goto L6d
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L2f:
            p.hm5.M(r8)     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            goto L54
        L33:
            p.hm5.M(r8)
            java.util.Set r8 = p.s4b1.f
            p.s4b1 r8 = p.uic.x(r7)
            p.blc0 r8 = r8.c
            p.blc0 r1 = p.blc0.Pg
            p.d9n r5 = p.d9n.a
            if (r8 != r1) goto L5e
            p.o3r r8 = r6.c     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            p.ga01 r1 = new p.ga01     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            r1.<init>(r3, r7, r4, r2)     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            r0.c = r2     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            java.lang.Object r8 = r6.a(r8, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            if (r8 != r5) goto L54
            goto L6c
        L54:
            p.k8g1 r8 = (p.k8g1) r8     // Catch: java.util.concurrent.CancellationException -> L5c java.lang.Exception -> L78
            p.k7i0 r6 = new p.k7i0
            r6.<init>(r8)
            return r6
        L5c:
            r6 = move-exception
            throw r6
        L5e:
            p.onf0 r6 = r6.b     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            io.reactivex.rxjava3.core.Single r6 = r6.b(r7, r4)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            r0.c = r3     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            java.lang.Object r8 = p.fc11.j(r6, r0)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            if (r8 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r8.getClass()     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            p.a9h r8 = (p.a9h) r8     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L79
            p.j7i0 r6 = new p.j7i0
            r6.<init>(r8)
            return r6
        L78:
            return r4
        L79:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q7i0.c(java.lang.String, p.onm):java.lang.Object");
    }
}
