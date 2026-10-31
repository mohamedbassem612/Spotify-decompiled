package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ynb0 a;

    public e7f(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r12.b(r10, r0) == r6) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.d7f
            if (r0 == 0) goto L13
            r0 = r13
            p.d7f r0 = (p.d7f) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.d7f r0 = new p.d7f
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.b
            p.jb71 r2 = p.jb71.a
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r13)
            goto L93
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r5
        L33:
            p.ec71 r10 = r0.f
            p.n5f r11 = r0.e
            p.r261 r12 = r0.d
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            goto L6a
        L3d:
            p.hm5.M(r13)
            p.n5f r11 = (p.n5f) r11
            p.ec71 r13 = new p.ec71
            java.lang.String r1 = r11.a
            java.lang.String r7 = r11.b
            r8 = 4
            r13.<init>(r8, r1, r7)
            p.ynb0 r10 = r10.a     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            p.lc71 r10 = (p.lc71) r10     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            java.util.List r1 = java.util.Collections.singletonList(r13)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            r0.d = r12     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            r0.e = r11     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            r0.f = r13     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            r0.b = r4     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            java.lang.Object r10 = r10.a(r1, r0)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            if (r10 != r6) goto L67
            goto L92
        L67:
            r9 = r13
            r13 = r10
            r10 = r9
        L6a:
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            java.lang.Object r10 = r13.get(r10)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            p.bc71 r10 = (p.bc71) r10     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            if (r10 == 0) goto L7b
            p.zb71 r10 = p.wro1.L(r10)     // Catch: java.lang.Exception -> L7b java.util.concurrent.CancellationException -> L96
            if (r10 == 0) goto L7b
            r2 = r10
        L7b:
            p.j6f r10 = new p.j6f
            java.lang.String r13 = r11.a
            java.lang.String r11 = r11.b
            r10.<init>(r13, r11, r2)
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.b = r3
            java.lang.Object r10 = r12.b(r10, r0)
            if (r10 != r6) goto L93
        L92:
            return r6
        L93:
            p.rih1 r10 = p.rih1.a
            return r10
        L96:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e7f.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
