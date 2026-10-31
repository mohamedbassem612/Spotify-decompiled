package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ty80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public ty80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r0.G(r1) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            p.bz80 r8 = r6.a
            p.yo2 r0 = r8.i
            boolean r1 = r9 instanceof p.sy80
            if (r1 == 0) goto L17
            r1 = r9
            p.sy80 r1 = (p.sy80) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            p.sy80 r1 = new p.sy80
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.a
            int r9 = r1.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r9 == 0) goto L3d
            if (r9 == r3) goto L37
            if (r9 != r2) goto L31
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            goto L8b
        L2f:
            r6 = move-exception
            goto L7a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L37:
            int r7 = r1.d
            p.hm5.M(r6)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            goto L52
        L3d:
            p.hm5.M(r6)
            p.sx80 r7 = (p.sx80) r7
            p.joe r6 = r8.c     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L8e
            r8 = 0
            r1.d = r8     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L8e
            r1.b = r3     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L8e
            java.lang.Object r6 = r6.a(r4, r1)     // Catch: java.lang.Exception -> L78 java.util.concurrent.CancellationException -> L8e
            if (r6 != r5) goto L50
            goto L77
        L50:
            r4 = r7
            r7 = r8
        L52:
            p.noe r6 = (p.noe) r6     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            boolean r6 = r6 instanceof p.loe     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            if (r6 != 0) goto L8b
            r6 = r0
            p.fq2 r6 = (p.fq2) r6     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            p.xe01 r6 = r6.u     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            p.zob1 r6 = r6.a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            boolean r6 = p.ihc1.y0(r6)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            if (r6 == 0) goto L8b
            r1.d = r7     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            r1.b = r2     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            p.fq2 r0 = (p.fq2) r0     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            java.lang.Object r6 = r0.G(r1)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L8e
            if (r6 != r5) goto L8b
        L77:
            return r5
        L78:
            r6 = move-exception
            r4 = r7
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Effect handling failed for "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            p.n57.t(r7, r6)
        L8b:
            p.rih1 r6 = p.rih1.a
            return r6
        L8e:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ty80.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
