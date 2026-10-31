package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q0k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ r0k1 a;

    public q0k1(r0k1 r0k1Var) {
        this.a = r0k1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r0.b(r1, r9) == r15) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.q0k1] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.r261] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r17, p.r261 r18, p.onm r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof p.p0k1
            if (r2 == 0) goto L18
            r2 = r1
            p.p0k1 r2 = (p.p0k1) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.b = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            p.p0k1 r2 = new p.p0k1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r9.a
            int r2 = r9.b
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            p.d9n r15 = p.d9n.a
            if (r2 == 0) goto L3e
            if (r2 == r13) goto L38
            if (r2 != r12) goto L32
            p.hm5.M(r1)
            goto L7c
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r14
        L38:
            p.r261 r0 = r9.d
            p.hm5.M(r1)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            goto L63
        L3e:
            p.hm5.M(r1)
            r1 = r17
            p.i0k1 r1 = (p.i0k1) r1
            p.r0k1 r0 = r0.a     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L7f
            p.gj10 r3 = r0.a     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L7f
            java.lang.String r4 = r1.c     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L7f
            boolean r0 = r1.d     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L7f
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L7f
            r0 = r18
            r9.d = r0     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            r9.b = r13     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 14
            java.lang.Object r1 = p.gj10.j(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            if (r1 != r15) goto L63
            goto L7b
        L63:
            p.t0k1 r1 = new p.t0k1     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            r1.<init>(r11, r13)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L7f
            goto L71
        L69:
            r0 = r18
        L6b:
            p.t0k1 r1 = new p.t0k1
            r2 = 0
            r1.<init>(r11, r2)
        L71:
            r9.d = r14
            r9.b = r12
            java.lang.Object r0 = r0.b(r1, r9)
            if (r0 != r15) goto L7c
        L7b:
            return r15
        L7c:
            p.rih1 r0 = p.rih1.a
            return r0
        L7f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q0k1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
