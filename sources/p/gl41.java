package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gl41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jl41 a;

    public gl41(jl41 jl41Var) {
        this.a = jl41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r8.b(r9, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.fl41
            if (r0 == 0) goto L13
            r0 = r9
            p.fl41 r0 = (p.fl41) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.fl41 r0 = new p.fl41
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L78
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.zk41 r6 = r0.e
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            goto L57
        L39:
            p.hm5.M(r9)
            p.zk41 r7 = (p.zk41) r7
            p.jl41 r6 = r6.a     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            p.frh1 r6 = r6.a     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            p.bn40 r9 = new p.bn40     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            java.lang.String r1 = r7.a     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            r0.d = r8     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            r0.e = r7     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            r0.b = r3     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            java.lang.Object r9 = r6.a(r9, r0)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L7b
            if (r9 != r5) goto L56
            goto L77
        L56:
            r6 = r7
        L57:
            p.cn40 r9 = (p.cn40) r9     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            p.hm41 r7 = r9.a     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            p.ql41 r9 = new p.ql41     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            java.lang.String r1 = r6.a     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            r9.<init>(r1, r7)     // Catch: java.lang.Throwable -> L64 java.util.concurrent.CancellationException -> L7b
            goto L6b
        L63:
            r6 = r7
        L64:
            p.pl41 r9 = new p.pl41
            java.lang.String r6 = r6.a
            r9.<init>(r6)
        L6b:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto L78
        L77:
            return r5
        L78:
            p.rih1 r6 = p.rih1.a
            return r6
        L7b:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gl41.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
