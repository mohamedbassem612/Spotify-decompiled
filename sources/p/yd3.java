package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yd3 {
    public final String a;
    public final uu00 b;
    public final kv00 c;
    public final u9c0 d;
    public final x8c0 e;
    public final q8n f;
    public final bpb1 g;
    public final xe01 h;
    public final dt71 i;
    public final ve01 j;
    public xab1 k;
    public boolean l;

    public yd3(lc3 lc3Var, uu00 uu00Var, kv00 kv00Var, iac0 iac0Var, q8n q8nVar) {
        String str = lc3Var.a;
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        x8c0 lifecycle = iac0Var.getLifecycle();
        this.a = str;
        this.b = uu00Var;
        this.c = kv00Var;
        this.d = u9c0VarQ;
        this.e = lifecycle;
        this.f = q8nVar;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.i = dt71VarE;
        this.j = d5p1.g(dt71VarE);
    }

    public final void a() {
        if (((Boolean) this.g.getValue()).booleanValue()) {
            xab1 xab1Var = this.k;
            if (xab1Var == null || !xab1Var.isActive()) {
                this.k = fn31.T(this.d, this.f, 0, new td3(this, null), 2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r10 == r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.xd3
            if (r0 == 0) goto L13
            r0 = r10
            p.xd3 r0 = (p.xd3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.xd3 r0 = new p.xd3
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 0
            java.lang.String r3 = r9.a
            p.kv00 r4 = r9.c
            r5 = 2
            r6 = 1
            r7 = 3
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r6) goto L3d
            if (r1 == r5) goto L39
            if (r1 != r7) goto L33
            p.hm5.M(r10)
            goto Lb1
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r2
        L39:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            goto L6a
        L3d:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            goto L57
        L41:
            p.hm5.M(r10)
            java.util.List r10 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            java.lang.Class<p.zoy0> r1 = p.zoy0.class
            io.reactivex.rxjava3.core.Completable r10 = r4.a(r1, r10)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            r0.c = r6     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r10 = p.fc11.i(r10, r0)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            if (r10 != r8) goto L57
            goto Lb0
        L57:
            java.util.List r10 = java.util.Collections.singletonList(r3)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            java.lang.Class<p.myv0> r1 = p.myv0.class
            io.reactivex.rxjava3.core.Completable r10 = r4.a(r1, r10)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            r0.c = r5     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r10 = p.fc11.i(r10, r0)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Lbf
            if (r10 != r8) goto L6a
            goto Lb0
        L6a:
            p.oi r10 = new p.oi
            p.jm1 r1 = new p.jm1
            r3 = 28
            r1.<init>(r9, r3)
            java.lang.String r3 = "album-release-transition"
            r4 = 0
            r10.<init>(r3, r4, r1)
            p.uu00 r1 = r9.b
            p.zu00 r1 = (p.zu00) r1
            io.reactivex.rxjava3.core.Observable r10 = r1.b(r10)
            p.ezc r10 = p.yoi1.g(r10)
            p.q8n r1 = r9.f
            p.mr20 r10 = p.o4p1.r(r10, r1)
            p.gk r1 = new p.gk
            r3 = 23
            r1.<init>(r10, r9, r3)
            p.ik r9 = new p.ik
            r10 = 4
            r9.<init>(r1, r10)
            p.ik r10 = new p.ik
            r1 = 5
            r10.<init>(r9, r1)
            p.rf2 r9 = new p.rf2
            r9.<init>(r7, r2, r5)
            p.lt20 r1 = new p.lt20
            r1.<init>(r10, r9, r4)
            r0.c = r7
            java.lang.Object r10 = p.b5p1.k(r1, r0)
            if (r10 != r8) goto Lb1
        Lb0:
            return r8
        Lb1:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r9 = p.u890.j(r10, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Lbc:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        Lbf:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yd3.b(p.onm):java.lang.Object");
    }
}
