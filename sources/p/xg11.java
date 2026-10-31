package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xg11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zg11 a;

    public xg11(zg11 zg11Var) {
        this.a = zg11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r8.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.wg11
            if (r0 == 0) goto L13
            r0 = r9
            p.wg11 r0 = (p.wg11) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.wg11 r0 = new p.wg11
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L59
            goto L4d
        L37:
            p.hm5.M(r9)
            p.pg11 r7 = (p.pg11) r7
            p.zg11 r6 = r6.a     // Catch: java.lang.Throwable -> L59
            p.gj10 r6 = r6.a     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r7.c     // Catch: java.lang.Throwable -> L59
            r0.d = r8     // Catch: java.lang.Throwable -> L59
            r0.b = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r9 = r6.g(r7, r0)     // Catch: java.lang.Throwable -> L59
            if (r9 != r5) goto L4d
            goto L65
        L4d:
            p.lg11 r9 = (p.lg11) r9     // Catch: java.lang.Throwable -> L59
            p.eh11 r6 = new p.eh11     // Catch: java.lang.Throwable -> L59
            p.hh11 r7 = p.l2p1.p(r9)     // Catch: java.lang.Throwable -> L59
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            p.dh11 r6 = p.dh11.a
        L5b:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xg11.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
