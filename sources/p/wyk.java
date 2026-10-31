package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yyk a;

    public wyk(yyk yykVar) {
        this.a = yykVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r8.b(r9, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.vyk
            if (r0 == 0) goto L13
            r0 = r9
            p.vyk r0 = (p.vyk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.vyk r0 = new p.vyk
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L65
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            goto L50
        L37:
            p.hm5.M(r9)
            p.qvk r7 = (p.qvk) r7
            p.yyk r6 = r6.a     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            p.q8n r7 = r6.f     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            p.byk r9 = new p.byk     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            r9.<init>(r6, r4, r3)     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            r0.d = r8     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            r0.b = r3     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            java.lang.Object r9 = p.fn31.Y(r7, r9, r0)     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            if (r9 != r5) goto L50
            goto L64
        L50:
            p.fxk r9 = (p.fxk) r9     // Catch: java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L68
            goto L5a
        L53:
            p.bwk r9 = new p.bwk
            p.kel r6 = p.kel.a
            r9.<init>(r6)
        L5a:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto L65
        L64:
            return r5
        L65:
            p.rih1 r6 = p.rih1.a
            return r6
        L68:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wyk.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
