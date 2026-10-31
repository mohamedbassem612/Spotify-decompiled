package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o0k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r0k1 a;

    public o0k1(r0k1 r0k1Var) {
        this.a = r0k1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r14.b(r0, r8) == r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [p.o0k1] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [p.r261] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r15, p.r261 r16, p.onm r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof p.n0k1
            if (r1 == 0) goto L16
            r1 = r0
            p.n0k1 r1 = (p.n0k1) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.b = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            p.n0k1 r1 = new p.n0k1
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.a
            int r1 = r8.b
            r10 = 2
            r11 = 1
            r12 = 0
            p.d9n r13 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r11) goto L35
            if (r1 != r10) goto L2f
            p.hm5.M(r0)
            goto L78
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            return r12
        L35:
            p.r261 r14 = r8.d
            p.hm5.M(r0)     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            goto L5f
        L3b:
            p.hm5.M(r0)
            r0 = r15
            p.g0k1 r0 = (p.g0k1) r0
            p.r0k1 r14 = r14.a     // Catch: java.lang.Exception -> L65 java.util.concurrent.CancellationException -> L7b
            p.gj10 r2 = r14.a     // Catch: java.lang.Exception -> L65 java.util.concurrent.CancellationException -> L7b
            java.lang.String r3 = r0.c     // Catch: java.lang.Exception -> L65 java.util.concurrent.CancellationException -> L7b
            boolean r14 = r0.d     // Catch: java.lang.Exception -> L65 java.util.concurrent.CancellationException -> L7b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Exception -> L65 java.util.concurrent.CancellationException -> L7b
            r14 = r16
            r8.d = r14     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            r8.b = r11     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 22
            java.lang.Object r0 = p.gj10.j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            if (r0 != r13) goto L5f
            goto L77
        L5f:
            p.t0k1 r0 = new p.t0k1     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            r0.<init>(r10, r11)     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L7b
            goto L6d
        L65:
            r14 = r16
        L67:
            p.t0k1 r0 = new p.t0k1
            r1 = 0
            r0.<init>(r10, r1)
        L6d:
            r8.d = r12
            r8.b = r10
            java.lang.Object r14 = r14.b(r0, r8)
            if (r14 != r13) goto L78
        L77:
            return r13
        L78:
            p.rih1 r14 = p.rih1.a
            return r14
        L7b:
            r0 = move-exception
            r14 = r0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o0k1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
