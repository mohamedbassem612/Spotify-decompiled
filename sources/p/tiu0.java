package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tiu0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iyc0 a;
    public final /* synthetic */ String b;

    public tiu0(iyc0 iyc0Var, String str) {
        this.a = iyc0Var;
        this.b = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[Catch: Exception -> 0x0082, CancellationException -> 0x0099, TryCatch #0 {CancellationException -> 0x0099, blocks: (B:17:0x0037, B:24:0x0061, B:26:0x0067, B:27:0x006f, B:29:0x0073, B:30:0x007b, B:31:0x0080, B:20:0x0040), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: Exception -> 0x0082, CancellationException -> 0x0099, TryCatch #0 {CancellationException -> 0x0099, blocks: (B:17:0x0037, B:24:0x0061, B:26:0x0067, B:27:0x006f, B:29:0x0073, B:30:0x007b, B:31:0x0080, B:20:0x0040), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: Exception -> 0x0082, CancellationException -> 0x0099, TryCatch #0 {CancellationException -> 0x0099, blocks: (B:17:0x0037, B:24:0x0061, B:26:0x0067, B:27:0x006f, B:29:0x0073, B:30:0x007b, B:31:0x0080, B:20:0x0040), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[Catch: Exception -> 0x0082, CancellationException -> 0x0099, TryCatch #0 {CancellationException -> 0x0099, blocks: (B:17:0x0037, B:24:0x0061, B:26:0x0067, B:27:0x006f, B:29:0x0073, B:30:0x007b, B:31:0x0080, B:20:0x0040), top: B:43:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r13.b(r12, r7) == r10) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) throws kotlin.NoWhenBranchMatchedException {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.siu0
            if (r0 == 0) goto L14
            r0 = r14
            p.siu0 r0 = (p.siu0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.siu0 r0 = new p.siu0
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.a
            int r0 = r7.b
            r8 = 2
            r1 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            p.hm5.M(r14)
            goto L96
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L33:
            p.dju0 r11 = r7.e
            p.r261 r13 = r7.d
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            goto L61
        L3b:
            p.hm5.M(r14)
            p.dju0 r12 = (p.dju0) r12
            p.iyc0 r14 = r11.a     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.lang.String r2 = r12.b     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.lang.String r0 = r12.a     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.util.List r3 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.lang.String r4 = r11.b     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.lang.String r5 = ""
            p.zxc0 r6 = r12.d     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            r7.d = r13     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            r7.e = r12     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            r7.b = r1     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            r1 = r14
            p.xyc0 r1 = (p.xyc0) r1     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            java.lang.Object r14 = r1.d(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L99
            if (r14 != r10) goto L60
            goto L95
        L60:
            r11 = r12
        L61:
            p.py21 r14 = (p.py21) r14     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            boolean r12 = r14 instanceof p.oy21     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            if (r12 == 0) goto L6f
            p.rju0 r12 = new p.rju0     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            int r14 = r11.c     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            r12.<init>(r14)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            goto L89
        L6f:
            boolean r12 = r14 instanceof p.ly21     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            if (r12 == 0) goto L7b
            p.qju0 r12 = new p.qju0     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            int r14 = r11.c     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            r12.<init>(r14)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            goto L89
        L7b:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            r12.<init>()     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
            throw r12     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L99
        L81:
            r11 = r12
        L82:
            p.qju0 r12 = new p.qju0
            int r11 = r11.c
            r12.<init>(r11)
        L89:
            r7.d = r9
            r7.e = r9
            r7.b = r8
            java.lang.Object r11 = r13.b(r12, r7)
            if (r11 != r10) goto L96
        L95:
            return r10
        L96:
            p.rih1 r11 = p.rih1.a
            return r11
        L99:
            r0 = move-exception
            r11 = r0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tiu0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
