package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wgf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ onf0 a;

    public wgf0(onf0 onf0Var) {
        this.a = onf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r9.b(r8, r0) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.vgf0
            if (r0 == 0) goto L13
            r0 = r10
            p.vgf0 r0 = (p.vgf0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.vgf0 r0 = new p.vgf0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 2
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r10)
            goto L7d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.rkm1 r7 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L80
            goto L56
        L39:
            r8 = move-exception
            goto L64
        L3b:
            p.hm5.M(r10)
            p.rkm1 r8 = (p.rkm1) r8
            p.onf0 r7 = r7.a     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            java.lang.String r10 = r8.a     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            io.reactivex.rxjava3.core.Single r7 = r7.b(r10, r4)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            r0.d = r9     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            r0.e = r8     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            r0.b = r2     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            java.lang.Object r10 = p.fc11.j(r7, r0)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L80
            if (r10 != r5) goto L55
            goto L7c
        L55:
            r7 = r8
        L56:
            p.a9h r10 = (p.a9h) r10     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L80
            p.alm1 r8 = new p.alm1     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L80
            java.lang.String r1 = r7.a     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L80
            r8.<init>(r1, r10)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L80
            goto L70
        L60:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L64:
            p.zkm1 r10 = new p.zkm1
            java.lang.String r7 = r7.a
            java.lang.String r8 = r8.getMessage()
            r10.<init>(r7, r8)
            r8 = r10
        L70:
            r0.d = r4
            r0.e = r4
            r0.b = r3
            java.lang.Object r7 = r9.b(r8, r0)
            if (r7 != r5) goto L7d
        L7c:
            return r5
        L7d:
            p.rih1 r7 = p.rih1.a
            return r7
        L80:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wgf0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
