package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xnk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hok1 a;

    public xnk1(hok1 hok1Var) {
        this.a = hok1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r8.g(r1) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            p.hok1 r8 = r6.a
            p.ty60 r0 = r8.g
            boolean r1 = r9 instanceof p.wnk1
            if (r1 == 0) goto L17
            r1 = r9
            p.wnk1 r1 = (p.wnk1) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            p.wnk1 r1 = new p.wnk1
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.a
            int r9 = r1.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r9 == 0) goto L3d
            if (r9 == r3) goto L35
            if (r9 != r2) goto L2f
            p.hm5.M(r6)
            goto L65
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L35:
            int r7 = r1.e
            p.jnk1 r9 = r1.d
            p.hm5.M(r6)
            goto L54
        L3d:
            p.hm5.M(r6)
            r9 = r7
            p.jnk1 r9 = (p.jnk1) r9
            r0.b()
            r1.d = r9
            r7 = 0
            r1.e = r7
            r1.b = r3
            java.lang.Object r6 = r0.a(r1)
            if (r6 != r5) goto L54
            goto L64
        L54:
            boolean r6 = r9.a
            if (r6 == 0) goto L65
            r1.d = r4
            r1.e = r7
            r1.b = r2
            java.lang.Object r6 = r8.g(r1)
            if (r6 != r5) goto L65
        L64:
            return r5
        L65:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xnk1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
