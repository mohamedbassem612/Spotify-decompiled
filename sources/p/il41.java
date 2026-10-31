package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class il41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jl41 a;

    public il41(jl41 jl41Var) {
        this.a = jl41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r11.b(r10, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r10, p.r261 r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.hl41
            if (r0 == 0) goto L13
            r0 = r12
            p.hl41 r0 = (p.hl41) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.hl41 r0 = new p.hl41
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r12)
            goto L76
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L31:
            p.bl41 r9 = r0.e
            p.r261 r11 = r0.d
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            goto L5f
        L39:
            p.hm5.M(r12)
            p.bl41 r10 = (p.bl41) r10
            p.jl41 r9 = r9.a     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            p.frh1 r9 = r9.a     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            p.fvh1 r12 = new p.fvh1     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            java.lang.String r1 = r10.a     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            java.lang.String r6 = r10.b     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            p.gm41 r7 = r10.c     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            p.xk41 r8 = r7.a     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            java.lang.Boolean r7 = r7.b     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            r12.<init>(r1, r6, r8, r7)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            r0.d = r11     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            r0.e = r10     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            r0.b = r3     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            java.lang.Object r9 = r9.c(r12, r0)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            if (r9 != r5) goto L5e
            goto L75
        L5e:
            r9 = r10
        L5f:
            p.tl41 r10 = new p.tl41     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            p.hm41 r9 = r9.d     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L67 java.util.concurrent.CancellationException -> L79
            goto L69
        L67:
            p.sl41 r10 = p.sl41.a
        L69:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r9 = r11.b(r10, r0)
            if (r9 != r5) goto L76
        L75:
            return r5
        L76:
            p.rih1 r9 = p.rih1.a
            return r9
        L79:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.il41.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
