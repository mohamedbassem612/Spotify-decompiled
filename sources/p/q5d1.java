package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cof0 a;

    public q5d1(cof0 cof0Var) {
        this.a = cof0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r14.b(p.n6d1.a, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.p5d1
            if (r0 == 0) goto L13
            r0 = r15
            p.p5d1 r0 = (p.p5d1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.p5d1 r0 = new p.p5d1
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
            goto L63
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.r261 r14 = r0.d
            p.hm5.M(r15)
            goto L56
        L37:
            p.hm5.M(r15)
            p.e5d1 r13 = (p.e5d1) r13
            p.g7d1 r7 = r13.a
            r10 = 0
            r11 = 12
            p.cof0 r6 = r12.a
            java.lang.String r8 = "event_companion_viewed"
            r9 = 0
            p.cof0.a(r6, r7, r8, r9, r10, r11)
            r0.d = r14
            r0.b = r3
            r12 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = p.hap1.i(r12, r0)
            if (r12 != r5) goto L56
            goto L62
        L56:
            r0.d = r4
            r0.b = r2
            p.n6d1 r12 = p.n6d1.a
            java.lang.Object r12 = r14.b(r12, r0)
            if (r12 != r5) goto L63
        L62:
            return r5
        L63:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q5d1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
