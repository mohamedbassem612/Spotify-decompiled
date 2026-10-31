package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qmg {
    public final boolean a;
    public final boolean b;
    public final uu00 c;
    public final boolean d;
    public final joo e;

    public qmg(boolean z, boolean z2, uu00 uu00Var, boolean z3, joo jooVar) {
        this.a = z;
        this.b = z2;
        this.c = uu00Var;
        this.d = z3;
        this.e = jooVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9 == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.mmg
            if (r0 == 0) goto L13
            r0 = r9
            p.mmg r0 = (p.mmg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.mmg r0 = new p.mmg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r5) goto L32
            if (r1 != r4) goto L2c
            p.hm5.M(r9)
            goto L74
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L32:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L46
        L38:
            p.hm5.M(r9)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r7.d(r8, r0)
            if (r9 != r6) goto L46
            goto L73
        L46:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L51
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L51:
            java.util.Set r9 = p.s4b1.f
            p.s4b1 r9 = p.uic.x(r8)
            p.blc0 r9 = r9.c
            int r9 = r9.ordinal()
            r1 = 844(0x34c, float:1.183E-42)
            if (r9 == r1) goto L69
            r8 = 926(0x39e, float:1.298E-42)
            if (r9 == r8) goto L66
            goto L81
        L66:
            boolean r3 = r7.b
            goto L81
        L69:
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = r7.c(r8, r0)
            if (r9 != r6) goto L74
        L73:
            return r6
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 != 0) goto L80
            boolean r7 = r7.a
            if (r7 == 0) goto L81
        L80:
            r3 = r5
        L81:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qmg.a(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r12 == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.nmg
            if (r0 == 0) goto L13
            r0 = r12
            p.nmg r0 = (p.nmg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.nmg r0 = new p.nmg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            goto L8a
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L32:
            java.lang.String r11 = r0.a
            p.hm5.M(r12)
            goto L59
        L38:
            p.hm5.M(r12)
            java.util.Set r12 = p.s4b1.f
            p.s4b1 r12 = p.uic.x(r11)
            p.blc0 r12 = r12.c
            p.blc0 r1 = p.blc0.M3
            if (r12 != r1) goto L9a
            boolean r12 = r10.d
            if (r12 != 0) goto L4c
            goto L9a
        L4c:
            r0.a = r11
            r0.d = r4
            p.joo r12 = r10.e
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r6) goto L59
            goto L89
        L59:
            java.lang.String r12 = (java.lang.String) r12
            p.oi r1 = new p.oi     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            java.lang.String r7 = "clipPermissionCheckerImpl"
            p.irf r8 = new p.irf     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            r9 = 4
            r8.<init>(r11, r9)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            r1.<init>(r7, r2, r8)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            p.uu00 r10 = r10.c     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            p.zu00 r10 = (p.zu00) r10     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            io.reactivex.rxjava3.core.Observable r10 = r10.b(r1)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            p.e4y r1 = p.e4y.Q0     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            io.reactivex.rxjava3.core.Observable r10 = r10.filter(r1)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            p.az8 r1 = new p.az8     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            r1.<init>(r11, r12, r4)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            io.reactivex.rxjava3.core.Observable r10 = r10.map(r1)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            r0.a = r5     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            r0.d = r3     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            java.lang.Object r12 = p.fc11.l(r10, r4, r5, r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            if (r12 != r6) goto L8a
        L89:
            return r6
        L8a:
            r12.getClass()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
            boolean r2 = r12.booleanValue()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L98
        L93:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L98:
            r10 = move-exception
            throw r10
        L9a:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qmg.b(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        omg omgVar;
        if (onmVar instanceof omg) {
            omgVar = (omg) onmVar;
            int i = omgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                omgVar.c = i - Integer.MIN_VALUE;
            } else {
                omgVar = new omg(this, onmVar);
            }
        } else {
            omgVar = new omg(this, onmVar);
        }
        Object objL = omgVar.a;
        int i2 = omgVar.c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Observable map = this.c.b(new oi("clipPermissionCheckerImpl", false, new irf(str, (byte) 5))).filter(e4y.Q0).map(new k9p1(str, (byte) 3));
                omgVar.c = 1;
                objL = fc11.l(map, 1, (Object) null, omgVar);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            objL.getClass();
            zBooleanValue = ((Boolean) objL).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        pmg pmgVar;
        if (onmVar instanceof pmg) {
            pmgVar = (pmg) onmVar;
            int i = pmgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmgVar.c = i - Integer.MIN_VALUE;
            } else {
                pmgVar = new pmg(this, onmVar);
            }
        } else {
            pmgVar = new pmg(this, onmVar);
        }
        Object objL = pmgVar.a;
        int i2 = pmgVar.c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Observable map = this.c.b(new oi("clipPermissionCheckerImpl", false, new irf(str, (byte) 6))).filter(e4y.Q0).map(new gap1(str, (byte) 6));
                pmgVar.c = 1;
                objL = fc11.l(map, 1, (Object) null, pmgVar);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objL);
            }
            objL.getClass();
            zBooleanValue = ((Boolean) objL).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
