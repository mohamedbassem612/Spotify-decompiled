package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d3m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g2z a;

    public d3m(g2z g2zVar) {
        this.a = g2zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r8.b(r6, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.c3m
            if (r0 == 0) goto L13
            r0 = r9
            p.c3m r0 = (p.c3m) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.c3m r0 = new p.c3m
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
            goto L73
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            goto L4b
        L37:
            r6 = move-exception
            goto L59
        L39:
            p.hm5.M(r9)
            p.y1m r7 = (p.y1m) r7
            p.g2z r6 = r6.a     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            r0.d = r8     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            r0.b = r3     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            java.io.Serializable r9 = r6.D(r0)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            if (r9 != r5) goto L4b
            goto L72
        L4b:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            p.o2m r6 = new p.o2m     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            p.c380 r7 = p.mqo1.A(r9)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            r6.<init>(r7)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L76
            goto L68
        L59:
            java.lang.String r7 = "ChatContentPicker: Failed to load recommendations"
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.spotify.base.java.logging.Logger.e(r6, r7, r9)
            p.o2m r6 = new p.o2m
            p.fg91 r7 = p.fg91.b
            r6.<init>(r7)
        L68:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L73
        L72:
            return r5
        L73:
            p.rih1 r6 = p.rih1.a
            return r6
        L76:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d3m.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
