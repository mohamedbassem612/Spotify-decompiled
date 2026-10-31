package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ax71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dx71 a;

    public ax71(dx71 dx71Var) {
        this.a = dx71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (p.l4p1.y(r8, r0, r5, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (p.fn31.Y(r10, r0, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r9 = r10 instanceof p.zw71
            if (r9 == 0) goto L13
            r9 = r10
            p.zw71 r9 = (p.zw71) r9
            int r0 = r9.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.b = r0
            goto L18
        L13:
            p.zw71 r9 = new p.zw71
            r9.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r9.a
            int r0 = r9.b
            r1 = 2
            r2 = 1
            p.dx71 r7 = r7.a
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            p.hm5.M(r10)
            goto L6e
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L33:
            int r8 = r9.d
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L71
            goto L6e
        L39:
            p.hm5.M(r10)
            p.sw71 r8 = (p.sw71) r8
            r10 = 0
            java.lang.String r8 = r8.a     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            p.mko r0 = r7.d     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            p.kko r0 = r0.b()     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            p.lm61 r5 = new p.lm61     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            r6 = 20
            r5.<init>(r7, r3, r6)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            r9.d = r10     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            r9.b = r2     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            java.lang.Object r7 = p.l4p1.y(r8, r0, r5, r9)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L71
            if (r7 != r4) goto L6e
            goto L6d
        L59:
            r8 = r10
        L5a:
            p.q8n r10 = r7.f
            p.kdt0 r0 = new p.kdt0
            r2 = 23
            r0.<init>(r7, r3, r2)
            r9.d = r8
            r9.b = r1
            java.lang.Object r7 = p.fn31.Y(r10, r0, r9)
            if (r7 != r4) goto L6e
        L6d:
            return r4
        L6e:
            p.rih1 r7 = p.rih1.a
            return r7
        L71:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ax71.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
