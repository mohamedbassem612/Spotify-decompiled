package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cx71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dx71 a;

    public cx71(dx71 dx71Var) {
        this.a = dx71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r14.b(r6, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.bx71
            if (r0 == 0) goto L13
            r0 = r15
            p.bx71 r0 = (p.bx71) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.bx71 r0 = new p.bx71
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r15)
            goto L7f
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.pw71 r12 = r0.e
            p.r261 r14 = r0.d
            p.hm5.M(r15)     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            goto L54
        L39:
            p.hm5.M(r15)
            p.pw71 r13 = (p.pw71) r13
            p.dx71 r12 = r12.a     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            p.bfd r12 = r12.a     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            p.lw71 r15 = r13.a     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            java.lang.String r1 = r13.b     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            r0.d = r14     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            r0.e = r13     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            r0.b = r3     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            java.lang.Object r15 = p.l4p1.v(r12, r15, r1, r0)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L82
            if (r15 != r5) goto L53
            goto L7e
        L53:
            r12 = r13
        L54:
            p.dju r15 = (p.dju) r15     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            p.tx71 r6 = new p.tx71     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            java.util.List r11 = r15.a     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            java.lang.String r10 = r15.b     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            p.lw71 r13 = r12.a     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            long r8 = r13.d     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            int r7 = r12.c     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Exception -> L67 java.util.concurrent.CancellationException -> L82
            goto L72
        L66:
            r12 = r13
        L67:
            p.sx71 r6 = new p.sx71
            p.lw71 r13 = r12.a
            long r7 = r13.d
            int r12 = r12.c
            r6.<init>(r7, r12)
        L72:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r12 = r14.b(r6, r0)
            if (r12 != r5) goto L7f
        L7e:
            return r5
        L7f:
            p.rih1 r12 = p.rih1.a
            return r12
        L82:
            r0 = move-exception
            r12 = r0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cx71.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
