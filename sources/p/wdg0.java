package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wdg0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xdg0 a;

    public wdg0(xdg0 xdg0Var) {
        this.a = xdg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r1.b(r5, r2) == r7) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r19, p.r261 r20, p.onm r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof p.vdg0
            if (r2 == 0) goto L17
            r2 = r1
            p.vdg0 r2 = (p.vdg0) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            p.vdg0 r2 = new p.vdg0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L41
            if (r3 == r5) goto L36
            if (r3 != r4) goto L30
            p.hm5.M(r1)
            goto La1
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L36:
            p.r261 r3 = r2.d
            p.hm5.M(r1)     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> La4
            r0 = r1
            r1 = r3
            goto L71
        L3e:
            r0 = move-exception
            r1 = r3
            goto L79
        L41:
            p.hm5.M(r1)
            r1 = r19
            p.sdg0 r1 = (p.sdg0) r1
            p.xdg0 r0 = r0.a
            p.n2b0 r0 = r0.a     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            java.lang.String r3 = r1.d     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            p.ibg0 r8 = r1.e     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            p.tk r9 = new p.tk     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            r16 = 0
            r17 = 111(0x6f, float:1.56E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L76 java.util.concurrent.CancellationException -> La4
            r1 = r20
            r2.d = r1     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> La4
            r2.b = r5     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> La4
            java.lang.Object r0 = r0.b(r3, r8, r9, r2)     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> La4
            if (r0 != r7) goto L71
            goto La0
        L71:
            p.tk r0 = (p.tk) r0     // Catch: java.lang.Throwable -> L74 java.util.concurrent.CancellationException -> La4
            goto L7f
        L74:
            r0 = move-exception
            goto L79
        L76:
            r0 = move-exception
            r1 = r20
        L79:
            p.m231 r3 = new p.m231
            r3.<init>(r0)
            r0 = r3
        L7f:
            java.lang.Throwable r3 = p.e331.a(r0)
            p.ydg0 r5 = p.ydg0.a
            if (r3 != 0) goto L96
            p.tk r0 = (p.tk) r0
            java.lang.Boolean r0 = r0.e
            if (r0 == 0) goto L96
            boolean r0 = r0.booleanValue()
            p.zdg0 r5 = new p.zdg0
            r5.<init>(r0)
        L96:
            r2.d = r6
            r2.b = r4
            java.lang.Object r0 = r1.b(r5, r2)
            if (r0 != r7) goto La1
        La0:
            return r7
        La1:
            p.rih1 r0 = p.rih1.a
            return r0
        La4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wdg0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
