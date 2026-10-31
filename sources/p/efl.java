package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class efl implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bel a;

    public efl(bel belVar) {
        this.a = belVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r8.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.dfl
            if (r0 == 0) goto L13
            r0 = r9
            p.dfl r0 = (p.dfl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.dfl r0 = new p.dfl
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
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            goto L49
        L37:
            p.hm5.M(r9)
            p.gel r7 = (p.gel) r7
            p.bel r6 = r6.a     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            r0.d = r8     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            r0.b = r3     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            java.io.Serializable r9 = r6.a(r0)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            if (r9 != r5) goto L49
            goto L5d
        L49:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            p.lel r6 = new p.lel     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L61
            goto L53
        L51:
            p.kel r6 = p.kel.a
        L53:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L5e
        L5d:
            return r5
        L5e:
            p.rih1 r6 = p.rih1.a
            return r6
        L61:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.efl.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
