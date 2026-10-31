package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f3m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tn01 a;

    public f3m(tn01 tn01Var) {
        this.a = tn01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r8.b(r6, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.e3m
            if (r0 == 0) goto L13
            r0 = r9
            p.e3m r0 = (p.e3m) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.e3m r0 = new p.e3m
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
            goto L72
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            goto L4b
        L37:
            r6 = move-exception
            goto L59
        L39:
            p.hm5.M(r9)
            p.x1m r7 = (p.x1m) r7
            p.tn01 r6 = r6.a     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            r0.d = r8     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            r0.b = r3     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            java.io.Serializable r9 = r6.b(r0)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            if (r9 != r5) goto L4b
            goto L71
        L4b:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            p.n2m r6 = new p.n2m     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            p.c380 r7 = p.mqo1.A(r9)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            r6.<init>(r7)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L75
            goto L67
        L59:
            java.lang.String r7 = "ChatContentPicker: Failed to load recent searches"
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            com.spotify.base.java.logging.Logger.e(r6, r7, r9)
            p.m2m r7 = new p.m2m
            r7.<init>(r6)
            r6 = r7
        L67:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L72
        L71:
            return r5
        L72:
            p.rih1 r6 = p.rih1.a
            return r6
        L75:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f3m.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
