package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vg11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zg11 a;

    public vg11(zg11 zg11Var) {
        this.a = zg11Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r1.b(r0, r8) == r13) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r15, p.r261 r16, p.onm r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof p.ug11
            if (r1 == 0) goto L16
            r1 = r0
            p.ug11 r1 = (p.ug11) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.b = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            p.ug11 r1 = new p.ug11
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.a
            int r1 = r8.b
            r10 = 2
            r11 = 1
            r12 = 0
            p.d9n r13 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r11) goto L35
            if (r1 != r10) goto L2f
            p.hm5.M(r0)
            goto L89
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            return r12
        L35:
            p.rg11 r14 = r8.e
            p.r261 r1 = r8.d
            p.hm5.M(r0)     // Catch: java.lang.Throwable -> L74
            goto L66
        L3d:
            p.hm5.M(r0)
            r0 = r15
            p.rg11 r0 = (p.rg11) r0
            p.zg11 r14 = r14.a     // Catch: java.lang.Throwable -> L71
            p.gj10 r2 = r14.a     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = r0.c     // Catch: java.lang.Throwable -> L71
            boolean r14 = r0.d     // Catch: java.lang.Throwable -> L71
            r14 = r14 ^ r11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L71
            r14 = r16
            r8.d = r14     // Catch: java.lang.Throwable -> L6e
            r8.e = r0     // Catch: java.lang.Throwable -> L6e
            r8.b = r11     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 28
            java.lang.Object r1 = p.gj10.j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6e
            if (r1 != r13) goto L64
            goto L88
        L64:
            r1 = r14
            r14 = r0
        L66:
            p.ah11 r0 = new p.ah11     // Catch: java.lang.Throwable -> L74
            boolean r2 = r14.d     // Catch: java.lang.Throwable -> L74
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L74
            goto L7c
        L6e:
            r1 = r14
            r14 = r0
            goto L74
        L71:
            r14 = r16
            goto L6e
        L74:
            p.ch11 r0 = new p.ch11
            boolean r14 = r14.d
            r14 = r14 ^ r11
            r0.<init>(r14)
        L7c:
            r8.d = r12
            r8.e = r12
            r8.b = r10
            java.lang.Object r14 = r1.b(r0, r8)
            if (r14 != r13) goto L89
        L88:
            return r13
        L89:
            p.rih1 r14 = p.rih1.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vg11.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
