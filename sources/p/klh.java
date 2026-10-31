package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class klh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ llh a;

    public klh(llh llhVar) {
        this.a = llhVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r13.b(r12, r6) == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.jlh
            if (r0 == 0) goto L14
            r0 = r14
            p.jlh r0 = (p.jlh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p.jlh r0 = new p.jlh
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            int r0 = r6.b
            r7 = 2
            r1 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L3f
            if (r0 == r1) goto L34
            if (r0 != r7) goto L2e
            p.hm5.M(r14)
            goto L94
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r8
        L34:
            p.ilh r11 = r6.e
            p.r261 r13 = r6.d
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            goto L66
        L3c:
            r0 = move-exception
            r12 = r0
            goto L7f
        L3f:
            p.hm5.M(r14)
            p.ilh r12 = (p.ilh) r12
            p.llh r11 = r11.a     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            p.ykr0 r11 = r11.a     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            p.lvm r2 = new p.lvm     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            java.lang.String r14 = r12.a     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r2.<init>(r14)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            p.lqm r3 = p.llh.b     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            java.lang.String r5 = r12.b     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r6.d = r13     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r6.e = r12     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r6.b = r1     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r1 = r11
            com.spotify.contribution.repositoryimpl.g r1 = (com.spotify.contribution.repositoryimpl.g) r1     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            r4 = 25
            java.lang.Object r14 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L97
            if (r14 != r9) goto L65
            goto L93
        L65:
            r11 = r12
        L66:
            p.alr0 r14 = (p.alr0) r14     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            p.qlh r12 = new p.qlh     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            java.util.ArrayList r0 = r14.a     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            p.c380 r0 = p.mqo1.A(r0)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            java.lang.String r14 = r14.b     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            int r1 = r11.c     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            r12.<init>(r1, r14, r0)     // Catch: java.lang.Exception -> L3c java.util.concurrent.CancellationException -> L97
            goto L87
        L78:
            r10 = r12
            r12 = r11
            r11 = r10
            goto L7f
        L7c:
            r0 = move-exception
            r11 = r0
            goto L78
        L7f:
            p.olh r14 = new p.olh
            int r11 = r11.c
            r14.<init>(r12, r11)
            r12 = r14
        L87:
            r6.d = r8
            r6.e = r8
            r6.b = r7
            java.lang.Object r11 = r13.b(r12, r6)
            if (r11 != r9) goto L94
        L93:
            return r9
        L94:
            p.rih1 r11 = p.rih1.a
            return r11
        L97:
            r0 = move-exception
            r11 = r0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.klh.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
