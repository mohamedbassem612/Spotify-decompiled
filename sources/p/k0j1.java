package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k0j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l0j1 a;

    public k0j1(l0j1 l0j1Var) {
        this.a = l0j1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r0.b(r1, r2) == r7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r18, p.r261 r19, p.onm r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof p.j0j1
            if (r2 == 0) goto L17
            r2 = r1
            p.j0j1 r2 = (p.j0j1) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            p.j0j1 r2 = new p.j0j1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            p.hm5.M(r1)
            goto L71
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L35:
            p.r261 r0 = r2.d
            p.hm5.M(r1)
            goto L66
        L3b:
            p.hm5.M(r1)
            r1 = r18
            p.c0j1 r1 = (p.c0j1) r1
            java.lang.String r13 = r1.a
            java.lang.String r14 = r1.b
            int r10 = r1.c
            long r11 = r1.d
            r1 = r19
            r2.d = r1
            r2.b = r5
            p.l0j1 r9 = r0.a
            p.q8n r0 = r9.a
            p.f0j1 r8 = new p.f0j1
            r15 = 0
            r8.<init>(r9, r10, r11, r13, r14, r15)
            java.lang.Object r0 = p.fn31.Y(r0, r8, r2)
            if (r0 != r7) goto L61
            goto L70
        L61:
            r16 = r1
            r1 = r0
            r0 = r16
        L66:
            r2.d = r6
            r2.b = r4
            java.lang.Object r0 = r0.b(r1, r2)
            if (r0 != r7) goto L71
        L70:
            return r7
        L71:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k0j1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
