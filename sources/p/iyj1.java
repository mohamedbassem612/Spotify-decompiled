package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iyj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jyj1 a;

    public iyj1(jyj1 jyj1Var) {
        this.a = jyj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r11.b(p.myj1.a, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r10, p.r261 r11, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.hyj1
            if (r0 == 0) goto L13
            r0 = r12
            p.hyj1 r0 = (p.hyj1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.hyj1 r0 = new p.hyj1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r12)
            goto L7e
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L31:
            p.r261 r11 = r0.d
            p.hm5.M(r12)
            goto L71
        L37:
            p.hm5.M(r12)
            p.byj1 r10 = (p.byj1) r10
            p.jyj1 r9 = r9.a
            p.r8n0 r12 = r9.c
            java.lang.String r1 = r10.a
            p.p8n0 r12 = r12.a(r1)
            r1 = 0
            if (r12 == 0) goto L4b
            r6 = r3
            goto L4c
        L4b:
            r6 = r1
        L4c:
            java.lang.String r7 = r10.a
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "No download manager for %s"
            p.n57.k(r6, r8, r7)
            if (r12 == 0) goto L71
            p.u9c0 r6 = r9.d
            p.q8n r9 = r9.f
            p.gqj1 r7 = new p.gqj1
            r7.<init>(r12, r10, r4, r3)
            p.xab1 r9 = p.fn31.T(r6, r9, r1, r7, r2)
            r0.d = r11
            r0.b = r3
            java.lang.Object r9 = r9.j(r0)
            if (r9 != r5) goto L71
            goto L7d
        L71:
            r0.d = r4
            r0.b = r2
            p.myj1 r9 = p.myj1.a
            java.lang.Object r9 = r11.b(r9, r0)
            if (r9 != r5) goto L7e
        L7d:
            return r5
        L7e:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.iyj1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
