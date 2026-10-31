package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class afg0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hfg0 a;

    public afg0(hfg0 hfg0Var) {
        this.a = hfg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r12.b(r13, r6) == r9) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.zeg0
            if (r0 == 0) goto L14
            r0 = r13
            p.zeg0 r0 = (p.zeg0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p.zeg0 r0 = new p.zeg0
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.a
            int r0 = r6.b
            r7 = 2
            r1 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r7) goto L2d
            p.hm5.M(r13)
            goto L63
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L33:
            p.r261 r12 = r6.d
            p.hm5.M(r13)
            goto L58
        L39:
            p.hm5.M(r13)
            p.ueg0 r11 = (p.ueg0) r11
            java.lang.String r2 = r11.f
            p.ibg0 r3 = r11.g
            p.tzf0 r5 = new p.tzf0
            r13 = 13
            r5.<init>(r11, r13)
            r6.d = r12
            r6.b = r1
            p.hfg0 r1 = r10.a
            p.w5k1 r4 = p.w5k1.a
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6)
            if (r13 != r9) goto L58
            goto L62
        L58:
            r6.d = r8
            r6.b = r7
            java.lang.Object r10 = r12.b(r13, r6)
            if (r10 != r9) goto L63
        L62:
            return r9
        L63:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.afg0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
