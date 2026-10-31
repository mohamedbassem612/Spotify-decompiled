package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kpf implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lpf a;

    public kpf(lpf lpfVar) {
        this.a = lpfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r9.b(r7, r0) == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.jpf
            if (r0 == 0) goto L13
            r0 = r10
            p.jpf r0 = (p.jpf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.jpf r0 = new p.jpf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L8d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.gpf r7 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L39
            goto L58
        L39:
            r7 = move-exception
            goto L6a
        L3b:
            p.hm5.M(r10)
            p.gpf r8 = (p.gpf) r8
            p.lpf r7 = r7.a
            p.bfd r7 = r7.a     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r8.a     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r8.b     // Catch: java.lang.Throwable -> L39
            byte r6 = r8.c     // Catch: java.lang.Throwable -> L39
            r0.d = r9     // Catch: java.lang.Throwable -> L39
            r0.e = r8     // Catch: java.lang.Throwable -> L39
            r0.b = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r10 = r7.v(r6, r10, r1, r0)     // Catch: java.lang.Throwable -> L39
            if (r10 != r5) goto L57
            goto L8c
        L57:
            r7 = r8
        L58:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L39
            int r8 = r10.size()     // Catch: java.lang.Throwable -> L39
            byte r7 = r7.c     // Catch: java.lang.Throwable -> L39
            if (r8 != r7) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            p.npf r7 = new p.npf     // Catch: java.lang.Throwable -> L39
            r7.<init>(r10, r3)     // Catch: java.lang.Throwable -> L39
            goto L70
        L6a:
            p.m231 r8 = new p.m231
            r8.<init>(r7)
            r7 = r8
        L70:
            java.lang.Throwable r8 = p.e331.a(r7)
            if (r8 != 0) goto L77
            goto L80
        L77:
            p.o8n r7 = r0.getContext()
            p.op71.x(r7)
            p.mpf r7 = p.mpf.a
        L80:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r7, r0)
            if (r7 != r5) goto L8d
        L8c:
            return r5
        L8d:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kpf.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
