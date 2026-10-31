package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kln implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ h971 a;

    public kln(h971 h971Var) {
        this.a = h971Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r14.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.jln
            if (r0 == 0) goto L13
            r0 = r15
            p.jln r0 = (p.jln) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.jln r0 = new p.jln
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r15)
            goto L6c
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.r261 r14 = r0.d
            p.hm5.M(r15)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            goto L4b
        L37:
            p.hm5.M(r15)
            p.mkn r13 = (p.mkn) r13
            p.h971 r12 = r12.a     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            r0.d = r14     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            r0.b = r3     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            p.s971 r12 = (p.s971) r12     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            java.lang.Object r15 = r12.d(r0)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            if (r15 != r5) goto L4b
            goto L6b
        L4b:
            p.uln r15 = (p.uln) r15     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            p.i971 r12 = r15.c     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            p.skn r6 = new p.skn     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            java.lang.String r7 = r15.a     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            java.lang.String r8 = r15.b     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            java.util.List r9 = r12.a     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            p.w4i1 r10 = r12.d     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            boolean r11 = r12.b     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6f
            goto L61
        L5f:
            p.rkn r6 = p.rkn.a
        L61:
            r0.d = r4
            r0.b = r2
            java.lang.Object r12 = r14.b(r6, r0)
            if (r12 != r5) goto L6c
        L6b:
            return r5
        L6c:
            p.rih1 r12 = p.rih1.a
            return r12
        L6f:
            r0 = move-exception
            r12 = r0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kln.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
