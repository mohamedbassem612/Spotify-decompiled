package p;

import com.spotify.player.model.PlayerState;
import com.spotify.savetospotify.v1.HttpGetShowResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y7h0 {
    public final ejc1 a;
    public final kv00 b;
    public final iyc0 c;
    public final xrc0 d;
    public final tlu e;
    public final Flowable f;
    public cmh1 g;

    public y7h0(ejc1 ejc1Var, kv00 kv00Var, iyc0 iyc0Var, xrc0 xrc0Var, tlu tluVar, Flowable flowable) {
        this.a = ejc1Var;
        this.b = kv00Var;
        this.c = iyc0Var;
        this.d = xrc0Var;
        this.e = tluVar;
        this.f = flowable;
        jd11 jd11Var = rc11.a;
        w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 1, s4h0.R0, new j4r(s4h0.P0), s4h0.S0), s4h0.Q0);
        w3p1.o(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, s4h0.T0, new j4r(s4h0.V0), s4h0.U0), s4h0.W0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        q7h0 q7h0Var;
        if (onmVar instanceof q7h0) {
            q7h0Var = (q7h0) onmVar;
            int i = q7h0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7h0Var.c = i - Integer.MIN_VALUE;
            } else {
                q7h0Var = new q7h0(this, onmVar);
            }
        } else {
            q7h0Var = new q7h0(this, onmVar);
        }
        Object objJ = q7h0Var.a;
        int i2 = q7h0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleTimeout = this.f.z().timeout(250L, TimeUnit.MILLISECONDS);
                q7h0Var.c = 1;
                objJ = fc11.j(singleTimeout, q7h0Var);
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
            String strO = o4p1.o((PlayerState) objJ);
            if (ihc1.y0(strO)) {
                return null;
            }
            return strO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r0 == r11) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.y7h0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.y7h0] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r13, java.lang.String r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.r7h0
            if (r0 == 0) goto L14
            r0 = r15
            p.r7h0 r0 = (p.r7h0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            p.r7h0 r0 = new p.r7h0
            r0.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.d
            int r1 = r15.f
            r2 = 3
            r3 = 2
            r4 = 1
            r9 = 0
            p.d9n r11 = p.d9n.a
            if (r1 == 0) goto L52
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r12 = r15.c
            p.hm5.M(r0)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L3a:
            java.lang.Object r13 = r15.c
            java.lang.String r14 = r15.b
            p.hm5.M(r0)
            r6 = r12
            r12 = r13
            goto L9c
        L44:
            java.lang.Object r13 = r15.c
            p.y7h0 r13 = (p.y7h0) r13
            java.lang.String r14 = r15.b
            java.lang.String r13 = r15.a
            p.hm5.M(r0)     // Catch: java.lang.Throwable -> L50
            goto L70
        L50:
            r0 = move-exception
            goto L74
        L52:
            p.hm5.M(r0)
            p.ejc1 r0 = r12.a     // Catch: java.lang.Throwable -> L50
            java.util.Set r1 = p.s4b1.f     // Catch: java.lang.Throwable -> L50
            p.s4b1 r1 = p.uic.x(r13)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.h()     // Catch: java.lang.Throwable -> L50
            r15.a = r13     // Catch: java.lang.Throwable -> L50
            r15.b = r14     // Catch: java.lang.Throwable -> L50
            r15.c = r9     // Catch: java.lang.Throwable -> L50
            r15.f = r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.j(r1, r15)     // Catch: java.lang.Throwable -> L50
            if (r0 != r11) goto L70
            goto Lb0
        L70:
            p.rih1 r0 = p.rih1.a     // Catch: java.lang.Throwable -> L50
        L72:
            r7 = r14
            goto L7b
        L74:
            p.m231 r1 = new p.m231
            r1.<init>(r0)
            r0 = r1
            goto L72
        L7b:
            boolean r14 = r0 instanceof p.m231
            if (r14 == 0) goto L80
            return r0
        L80:
            java.util.List r8 = java.util.Collections.singletonList(r13)
            p.t7h0 r5 = new p.t7h0
            r10 = 0
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r15.a = r9
            r15.b = r7
            r15.c = r0
            r15.f = r3
            java.lang.Object r12 = p.smo1.s(r5, r15)
            if (r12 != r11) goto L9a
            goto Lb0
        L9a:
            r12 = r0
            r14 = r7
        L9c:
            p.iyc0 r13 = r6.c     // Catch: java.lang.Throwable -> Lb3
            p.ddd1 r0 = p.ddd1.a     // Catch: java.lang.Throwable -> Lb3
            r15.a = r9     // Catch: java.lang.Throwable -> Lb3
            r15.b = r9     // Catch: java.lang.Throwable -> Lb3
            r15.c = r12     // Catch: java.lang.Throwable -> Lb3
            r15.f = r2     // Catch: java.lang.Throwable -> Lb3
            p.xyc0 r13 = (p.xyc0) r13     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r13.u(r14, r0, r15)     // Catch: java.lang.Throwable -> Lb3
            if (r0 != r11) goto Lb1
        Lb0:
            return r11
        Lb1:
            p.py21 r0 = (p.py21) r0     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y7h0.b(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (p.fc11.i(r11, r0) == r6) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r10, p.onm r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p.u7h0
            if (r0 == 0) goto L13
            r0 = r11
            p.u7h0 r0 = (p.u7h0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.u7h0 r0 = new p.u7h0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r9 = r0.b
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> Laa
            goto La6
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r5
        L37:
            java.lang.Object r10 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L92
            goto L92
        L3f:
            java.lang.Object r10 = r0.b
            p.y7h0 r10 = (p.y7h0) r10
            java.lang.String r10 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L49
            goto L67
        L49:
            r11 = move-exception
            goto L6c
        L4b:
            p.hm5.M(r11)
            p.ejc1 r11 = r9.a     // Catch: java.lang.Throwable -> L49
            java.util.Set r1 = p.s4b1.f     // Catch: java.lang.Throwable -> L49
            p.s4b1 r1 = p.uic.x(r10)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.h()     // Catch: java.lang.Throwable -> L49
            r0.a = r10     // Catch: java.lang.Throwable -> L49
            r0.b = r5     // Catch: java.lang.Throwable -> L49
            r0.e = r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r11 = r11.i(r1, r0)     // Catch: java.lang.Throwable -> L49
            if (r11 != r6) goto L67
            goto La4
        L67:
            p.rih1 r11 = p.rih1.a     // Catch: java.lang.Throwable -> L49
            r1 = r10
            r10 = r11
            goto L74
        L6c:
            p.m231 r1 = new p.m231
            r1.<init>(r11)
            r8 = r1
            r1 = r10
            r10 = r8
        L74:
            boolean r11 = r10 instanceof p.m231
            if (r11 == 0) goto L79
            return r10
        L79:
            p.kv00 r11 = r9.b     // Catch: java.lang.Throwable -> L92
            java.util.List r4 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.Class<p.va81> r7 = p.va81.class
            io.reactivex.rxjava3.core.Completable r11 = r11.a(r7, r4)     // Catch: java.lang.Throwable -> L92
            r0.a = r1     // Catch: java.lang.Throwable -> L92
            r0.b = r10     // Catch: java.lang.Throwable -> L92
            r0.e = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r11 = p.fc11.i(r11, r0)     // Catch: java.lang.Throwable -> L92
            if (r11 != r6) goto L92
            goto La4
        L92:
            p.iyc0 r9 = r9.c     // Catch: java.lang.Throwable -> La9
            p.ddd1 r11 = p.ddd1.a     // Catch: java.lang.Throwable -> La9
            r0.a = r5     // Catch: java.lang.Throwable -> La9
            r0.b = r10     // Catch: java.lang.Throwable -> La9
            r0.e = r2     // Catch: java.lang.Throwable -> La9
            p.xyc0 r9 = (p.xyc0) r9     // Catch: java.lang.Throwable -> La9
            java.lang.Object r11 = r9.u(r1, r11, r0)     // Catch: java.lang.Throwable -> La9
            if (r11 != r6) goto La5
        La4:
            return r6
        La5:
            r9 = r10
        La6:
            p.py21 r11 = (p.py21) r11     // Catch: java.lang.Throwable -> Laa
            goto Laa
        La9:
            r9 = r10
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y7h0.c(java.lang.String, p.onm):java.lang.Object");
    }

    public final void d(String str) {
        jh5 jh5Var = new jh5(new wlu(rc11.a.b(t8p0.class)), str);
        p811 p811Var = new p811();
        p811Var.a = this.e.a.c(new gnf0(p811Var, this, jh5Var, (byte) 8));
        cmh1 cmh1Var = this.g;
        if (cmh1Var != null) {
            cmh1Var.dispose();
        }
        cmh1 cmh1Var2 = (cmh1) p811Var.a;
        this.g = cmh1Var2;
        k3r k3rVar = (k3r) cmh1Var2.a(Collections.singleton(jh5Var)).get(jh5Var);
        if (k3rVar == null || (k3rVar instanceof i3r)) {
            return;
        }
        ((cmh1) p811Var.a).dispose();
        if (this.g == p811Var.a) {
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Set set, onm onmVar) {
        v7h0 v7h0Var;
        if (onmVar instanceof v7h0) {
            v7h0Var = (v7h0) onmVar;
            int i = v7h0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v7h0Var.d = i - Integer.MIN_VALUE;
            } else {
                v7h0Var = new v7h0(this, onmVar);
            }
        } else {
            v7h0Var = new v7h0(this, onmVar);
        }
        Object objA = v7h0Var.b;
        int i2 = v7h0Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            v7h0Var.a = set;
            v7h0Var.d = 1;
            objA = a(v7h0Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = v7h0Var.a;
            hm5.M(objA);
        }
        String str = (String) objA;
        rih1 rih1Var = rih1.a;
        if (str == null || !set.contains(str)) {
            return rih1Var;
        }
        try {
            d(str);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(String str, onm onmVar) {
        w7h0 w7h0Var;
        if (onmVar instanceof w7h0) {
            w7h0Var = (w7h0) onmVar;
            int i = w7h0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7h0Var.c = i - Integer.MIN_VALUE;
            } else {
                w7h0Var = new w7h0(this, onmVar);
            }
        } else {
            w7h0Var = new w7h0(this, onmVar);
        }
        Object objF = w7h0Var.a;
        int i2 = w7h0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                ejc1 ejc1Var = this.a;
                w7h0Var.c = 1;
                objF = ejc1Var.f(strH, w7h0Var);
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
            return z7h0.a[((HttpGetShowResponse) objF).n().ordinal()] == 1 ? swt0.b : swt0.a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[Catch: Exception -> 0x0148, CancellationException -> 0x014f, TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0148, blocks: (B:16:0x0038, B:69:0x0145, B:21:0x0047, B:66:0x0132, B:24:0x0050, B:63:0x0120, B:25:0x0055, B:44:0x00c5, B:46:0x00cb, B:49:0x00d1, B:51:0x00d7, B:52:0x00e8, B:54:0x00ee, B:57:0x00fd, B:58:0x00ff, B:60:0x0108, B:28:0x005b, B:41:0x00a0, B:31:0x0063, B:34:0x0079, B:38:0x0084, B:35:0x007c, B:36:0x0081, B:37:0x0082), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: Exception -> 0x0148, CancellationException -> 0x014f, TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0148, blocks: (B:16:0x0038, B:69:0x0145, B:21:0x0047, B:66:0x0132, B:24:0x0050, B:63:0x0120, B:25:0x0055, B:44:0x00c5, B:46:0x00cb, B:49:0x00d1, B:51:0x00d7, B:52:0x00e8, B:54:0x00ee, B:57:0x00fd, B:58:0x00ff, B:60:0x0108, B:28:0x005b, B:41:0x00a0, B:31:0x0063, B:34:0x0079, B:38:0x0084, B:35:0x007c, B:36:0x0081, B:37:0x0082), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: Exception -> 0x0148, CancellationException -> 0x014f, TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0148, blocks: (B:16:0x0038, B:69:0x0145, B:21:0x0047, B:66:0x0132, B:24:0x0050, B:63:0x0120, B:25:0x0055, B:44:0x00c5, B:46:0x00cb, B:49:0x00d1, B:51:0x00d7, B:52:0x00e8, B:54:0x00ee, B:57:0x00fd, B:58:0x00ff, B:60:0x0108, B:28:0x005b, B:41:0x00a0, B:31:0x0063, B:34:0x0079, B:38:0x0084, B:35:0x007c, B:36:0x0081, B:37:0x0082), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120 A[Catch: Exception -> 0x0148, CancellationException -> 0x014f, PHI: r3
      0x0120: PHI (r3v11 p.z6x) = (r3v8 p.z6x), (r3v16 java.util.List) binds: [B:61:0x011d, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0148, blocks: (B:16:0x0038, B:69:0x0145, B:21:0x0047, B:66:0x0132, B:24:0x0050, B:63:0x0120, B:25:0x0055, B:44:0x00c5, B:46:0x00cb, B:49:0x00d1, B:51:0x00d7, B:52:0x00e8, B:54:0x00ee, B:57:0x00fd, B:58:0x00ff, B:60:0x0108, B:28:0x005b, B:41:0x00a0, B:31:0x0063, B:34:0x0079, B:38:0x0084, B:35:0x007c, B:36:0x0081, B:37:0x0082), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132 A[Catch: Exception -> 0x0148, CancellationException -> 0x014f, PHI: r3
      0x0132: PHI (r3v12 p.z6x) = (r3v11 p.z6x), (r3v18 java.util.List) binds: [B:64:0x012f, B:21:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x014f, Exception -> 0x0148, blocks: (B:16:0x0038, B:69:0x0145, B:21:0x0047, B:66:0x0132, B:24:0x0050, B:63:0x0120, B:25:0x0055, B:44:0x00c5, B:46:0x00cb, B:49:0x00d1, B:51:0x00d7, B:52:0x00e8, B:54:0x00ee, B:57:0x00fd, B:58:0x00ff, B:60:0x0108, B:28:0x005b, B:41:0x00a0, B:31:0x0063, B:34:0x0079, B:38:0x0084, B:35:0x007c, B:36:0x0081, B:37:0x0082), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        if (e(r1, r2) == r10) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r18, p.swt0 r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y7h0.g(java.lang.String, p.swt0, p.onm):java.lang.Object");
    }
}
