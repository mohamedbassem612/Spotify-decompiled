package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h3m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tn01 a;

    public h3m(tn01 tn01Var) {
        this.a = tn01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r9.b(r7, r0) == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.g3m
            if (r0 == 0) goto L13
            r0 = r10
            p.g3m r0 = (p.g3m) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.g3m r0 = new p.g3m
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            p.fg91 r2 = p.fg91.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r10)
            goto L6b
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L33:
            p.r261 r9 = r0.d
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L39
            goto L4d
        L39:
            r7 = move-exception
            goto L53
        L3b:
            p.hm5.M(r10)
            p.v1m r8 = (p.v1m) r8
            p.tn01 r7 = r7.a     // Catch: java.lang.Exception -> L39
            r0.d = r9     // Catch: java.lang.Exception -> L39
            r0.b = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L39
            if (r7 != r6) goto L4d
            goto L6a
        L4d:
            p.n2m r7 = new p.n2m     // Catch: java.lang.Exception -> L39
            r7.<init>(r2)     // Catch: java.lang.Exception -> L39
            goto L60
        L53:
            java.lang.String r8 = "ChatContentPicker: Failed to clear recent searches"
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.spotify.base.java.logging.Logger.e(r7, r8, r10)
            p.n2m r7 = new p.n2m
            r7.<init>(r2)
        L60:
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r9.b(r7, r0)
            if (r7 != r6) goto L6b
        L6a:
            return r6
        L6b:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h3m.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
