package p;

import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g4q0 implements byf0 {
    public final u4q0 a;
    public final u3q0 b;
    public final wgq0 c;
    public final k4q0 d;
    public final ljg e;
    public final prg1 f;
    public final llm g;
    public faa0 h;
    public faa0 i;
    public Boolean t;

    public g4q0(u4q0 u4q0Var, u3q0 u3q0Var, wgq0 wgq0Var, k4q0 k4q0Var, ljg ljgVar, prg1 prg1Var, q8n q8nVar) {
        this.a = u4q0Var;
        this.b = u3q0Var;
        this.c = wgq0Var;
        this.d = k4q0Var;
        this.e = ljgVar;
        this.f = prg1Var;
        this.g = smo1.e(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (((p.ihq0) r5).b(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.b4q0
            if (r0 == 0) goto L13
            r0 = r6
            p.b4q0 r0 = (p.b4q0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.b4q0 r0 = new p.b4q0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            p.wgq0 r5 = r5.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            goto L59
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L33:
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            goto L46
        L37:
            p.hm5.M(r6)
            r0.c = r3     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            r6 = r5
            p.ihq0 r6 = (p.ihq0) r6     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            java.lang.Object r6 = r6.g(r0)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            if (r6 != r4) goto L46
            goto L58
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            if (r6 == 0) goto L59
            r0.c = r2     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            p.ihq0 r5 = (p.ihq0) r5     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L5c
            if (r5 != r4) goto L59
        L58:
            return r4
        L59:
            p.rih1 r5 = p.rih1.a
            return r5
        L5c:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4q0.a(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (a(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.lnm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.c4q0
            if (r0 == 0) goto L13
            r0 = r6
            p.c4q0 r0 = (p.c4q0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.c4q0 r0 = new p.c4q0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L45
        L35:
            p.hm5.M(r6)
            r0.c = r3
            p.wgq0 r6 = r5.c
            p.ihq0 r6 = (p.ihq0) r6
            java.lang.Object r6 = r6.e(r3, r0)
            if (r6 != r4) goto L45
            goto L4d
        L45:
            r0.c = r2
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r4) goto L4e
        L4d:
            return r4
        L4e:
            java.lang.Boolean r6 = p.yah0.m(r3)
            r5.t = r6
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4q0.b(p.lnm):java.lang.Object");
    }

    @Override // p.byf0
    public final void c() {
        wn4 wn4Var = ((ihq0) this.c).b;
        if (wn4Var.c() && wn4Var.d()) {
            faa0 faa0Var = this.i;
            if (faa0Var == null || !faa0Var.isActive()) {
                this.i = c921.y(this.g, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 3), 3);
            }
        }
    }

    @Override // p.byf0
    public final void d() {
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.h = null;
        faa0 faa0Var2 = this.i;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[PHI: r11
      0x0080: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v1 java.lang.Object) binds: [B:31:0x007d, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[PHI: r11
      0x0091: PHI (r11v16 java.lang.Object) = (r11v15 java.lang.Object), (r11v1 java.lang.Object) binds: [B:36:0x008e, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (((p.ihq0) r7).a(r0) == r9) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.lnm r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p.d4q0
            if (r0 == 0) goto L13
            r0 = r11
            p.d4q0 r0 = (p.d4q0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.d4q0 r0 = new p.d4q0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            p.wgq0 r7 = r10.c
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r1 == 0) goto L4e
            if (r1 == r8) goto L4a
            if (r1 == r6) goto L46
            if (r1 == r5) goto L42
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            p.hm5.M(r11)
            goto La4
        L37:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L3e:
            p.hm5.M(r11)
            goto L91
        L42:
            p.hm5.M(r11)
            goto L80
        L46:
            p.hm5.M(r11)
            goto L74
        L4a:
            p.hm5.M(r11)
            goto L5d
        L4e:
            p.hm5.M(r11)
            r0.c = r8
            r11 = r7
            p.ihq0 r11 = (p.ihq0) r11
            java.lang.Object r11 = r11.e(r2, r0)
            if (r11 != r9) goto L5d
            goto La3
        L5d:
            java.lang.Boolean r11 = r10.t
            java.lang.Boolean r1 = p.yah0.m(r8)
            boolean r11 = p.u890.j(r11, r1)
            if (r11 == 0) goto L74
            r0.c = r6
            p.u4q0 r11 = r10.a
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r9) goto L74
            goto La3
        L74:
            r0.c = r5
            r11 = r7
            p.ihq0 r11 = (p.ihq0) r11
            java.lang.Object r11 = r11.h(r0)
            if (r11 != r9) goto L80
            goto La3
        L80:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lab
            r0.c = r4
            java.lang.Object r11 = r10.f(r0)
            if (r11 != r9) goto L91
            goto La3
        L91:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lab
            r0.c = r3
            p.ihq0 r7 = (p.ihq0) r7
            java.lang.Object r11 = r7.a(r0)
            if (r11 != r9) goto La4
        La3:
            return r9
        La4:
            p.prg1 r11 = r10.f
            java.lang.String r0 = "trial-end: cleared stored trial end"
            r11.a(r0)
        Lab:
            java.lang.Boolean r11 = p.yah0.m(r2)
            r10.t = r11
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4q0.e(p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r1 == r11) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.onm r24) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g4q0.f(p.onm):java.lang.Object");
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
        if (this.a.h()) {
            this.h = c921.y(this.g, (o8n) null, 0, new bu(this, (lnm) null, (byte) 27), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[PHI: r1
      0x008e: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:38:0x008b, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(onm onmVar) {
        f4q0 f4q0Var;
        Object objC;
        if (onmVar instanceof f4q0) {
            f4q0Var = (f4q0) onmVar;
            int i = f4q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f4q0Var.c = i - Integer.MIN_VALUE;
            } else {
                f4q0Var = new f4q0(this, onmVar);
            }
        } else {
            f4q0Var = new f4q0(this, onmVar);
        }
        Object objB = f4q0Var.a;
        int i2 = f4q0Var.c;
        rih1 rih1Var = rih1.a;
        u4q0 u4q0Var = this.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            f4q0Var.c = 1;
            objB = u4q0Var.b(f4q0Var);
            if (objB != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(objB);
        } else {
            if (i2 == 2) {
                hm5.M(objB);
                objC = ((e331) objB).a;
                if (u890.j(objC instanceof m231 ? null : objC, yah0.m(true))) {
                    f4q0Var.c = 3;
                    objB = u4q0Var.a(f4q0Var);
                    if (objB != d9nVar) {
                        if (((Boolean) objB).booleanValue()) {
                            f4q0Var.c = 4;
                            if (u4q0Var.i(f4q0Var) != d9nVar) {
                            }
                        }
                    }
                }
            }
            if (i2 == 3) {
                hm5.M(objB);
                if (((Boolean) objB).booleanValue()) {
                    f4q0Var.c = 4;
                    if (u4q0Var.i(f4q0Var) != d9nVar) {
                    }
                }
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(objB);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        Completable completableIgnoreElement = this.e.a("client:trigger:for:opt-in-trial", (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : null, (152 & 8) != 0 ? z6x.a : null, (152 & 16) != 0 ? null : null, (152 & 4) != 0 ? "" : null, (152 & 32) != 0 ? vks.a : null, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : null, (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : null).ignoreElement();
        f4q0Var.c = 5;
        return fc11.i(completableIgnoreElement, f4q0Var) == d9nVar ? d9nVar : rih1Var;
        if (((Boolean) objB).booleanValue()) {
            f4q0Var.c = 2;
            objC = this.d.c(f4q0Var);
            if (objC != d9nVar) {
                if (u890.j(objC instanceof m231 ? null : objC, yah0.m(true))) {
                    f4q0Var.c = 3;
                    objB = u4q0Var.a(f4q0Var);
                    if (objB != d9nVar) {
                        if (((Boolean) objB).booleanValue()) {
                            f4q0Var.c = 4;
                            if (u4q0Var.i(f4q0Var) != d9nVar) {
                                Completable completableIgnoreElement2 = this.e.a("client:trigger:for:opt-in-trial", (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : null, (152 & 8) != 0 ? z6x.a : null, (152 & 16) != 0 ? null : null, (152 & 4) != 0 ? "" : null, (152 & 32) != 0 ? vks.a : null, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : null, (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : null).ignoreElement();
                                f4q0Var.c = 5;
                                if (fc11.i(completableIgnoreElement2, f4q0Var) == d9nVar) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
