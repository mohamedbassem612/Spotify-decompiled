package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class np71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lnf a;

    public np71(lnf lnfVar) {
        this.a = lnfVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r12.b(r10, r5) == r9) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.mp71
            if (r0 == 0) goto L14
            r0 = r13
            p.mp71 r0 = (p.mp71) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            p.mp71 r0 = new p.mp71
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.a
            int r0 = r5.b
            r7 = 2
            r1 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r7) goto L2d
            p.hm5.M(r13)
            goto L77
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L33:
            p.r261 r12 = r5.d
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            goto L5a
        L39:
            p.hm5.M(r13)
            p.vo71 r11 = (p.vo71) r11
            p.lnf r10 = r10.a     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            java.util.Set r13 = p.s4b1.f     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            java.lang.String r13 = r11.a     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            p.s4b1 r2 = p.uic.x(r13)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            boolean r3 = r11.b     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            r5.d = r12     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            r5.b = r1     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            p.h971 r1 = r10.a     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            r4 = 0
            r6 = 10
            java.lang.Object r13 = p.h971.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            if (r13 != r9) goto L5a
            goto L76
        L5a:
            p.i971 r13 = (p.i971) r13     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            p.zo71 r10 = new p.zo71     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            p.w4i1 r11 = r13.d     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            java.lang.String r11 = r11.a     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            java.util.List r0 = r13.a     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            boolean r13 = r13.b     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            r10.<init>(r11, r0, r13)     // Catch: java.lang.Exception -> L6a java.util.concurrent.CancellationException -> L7a
            goto L6c
        L6a:
            p.yo71 r10 = p.yo71.a
        L6c:
            r5.d = r8
            r5.b = r7
            java.lang.Object r10 = r12.b(r10, r5)
            if (r10 != r9) goto L77
        L76:
            return r9
        L77:
            p.rih1 r10 = p.rih1.a
            return r10
        L7a:
            r0 = move-exception
            r10 = r0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.np71.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
