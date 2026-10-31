package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fok1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hok1 a;

    public fok1(hok1 hok1Var) {
        this.a = hok1Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r10.b(r8, r0) == r7) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.eok1
            if (r0 == 0) goto L13
            r0 = r11
            p.eok1 r0 = (p.eok1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.eok1 r0 = new p.eok1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            p.hok1 r8 = r8.a
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L4a
            if (r1 == r5) goto L42
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            p.hm5.M(r11)
            goto La2
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r6
        L38:
            int r8 = r0.f
            p.r261 r10 = r0.d
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            goto L82
        L40:
            r8 = move-exception
            goto L8d
        L42:
            int r9 = r0.e
            p.r261 r10 = r0.d
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            goto L5f
        L4a:
            p.hm5.M(r11)
            p.nnk1 r9 = (p.nnk1) r9
            p.kge r9 = r8.X     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.d = r10     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.e = r4     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.b = r5     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            java.lang.Object r11 = p.b5p1.i(r9, r0)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            if (r11 != r7) goto L5e
            goto La1
        L5e:
            r9 = r4
        L5f:
            com.spotify.player.model.PlayerState r11 = (com.spotify.player.model.PlayerState) r11     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            boolean r1 = r11.isPlaying()     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            if (r1 == 0) goto L6f
            boolean r11 = r11.isPaused()     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            if (r11 != 0) goto L6f
            r11 = r5
            goto L70
        L6f:
            r11 = r4
        L70:
            if (r11 == 0) goto L83
            r0.d = r10     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.e = r9     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.f = r11     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            r0.b = r3     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            java.lang.Object r8 = r8.e(r0)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            if (r8 != r7) goto L81
            goto La1
        L81:
            r8 = r11
        L82:
            r11 = r8
        L83:
            p.zmk1 r8 = new p.zmk1     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            if (r11 == 0) goto L88
            goto L89
        L88:
            r5 = r4
        L89:
            r8.<init>(r5)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> La5
            goto L97
        L8d:
            java.lang.String r9 = "Failed to pause player for recording"
            p.n57.t(r9, r8)
            p.zmk1 r8 = new p.zmk1
            r8.<init>(r4)
        L97:
            r0.d = r6
            r0.b = r2
            java.lang.Object r8 = r10.b(r8, r0)
            if (r8 != r7) goto La2
        La1:
            return r7
        La2:
            p.rih1 r8 = p.rih1.a
            return r8
        La5:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fok1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
